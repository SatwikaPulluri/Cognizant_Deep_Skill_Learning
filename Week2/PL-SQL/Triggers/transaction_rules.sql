CREATE OR REPLACE TRIGGER CheckTransactionRules
BEFORE INSERT ON Transactions
FOR EACH ROW
DECLARE
  v_balance NUMBER;
BEGIN
  -- Get account balance
  SELECT Balance INTO v_balance
  FROM Accounts
  WHERE AccountID = :NEW.AccountID;

  IF :NEW.Type = 'WITHDRAW' THEN
    IF :NEW.Amount > v_balance THEN
      RAISE_APPLICATION_ERROR(-20001, 'Withdrawal exceeds available balance.');
    END IF;
  ELSIF :NEW.Type = 'DEPOSIT' THEN
    IF :NEW.Amount <= 0 THEN
      RAISE_APPLICATION_ERROR(-20002, 'Deposit amount must be positive.');
    END IF;
  END IF;
END;
/
