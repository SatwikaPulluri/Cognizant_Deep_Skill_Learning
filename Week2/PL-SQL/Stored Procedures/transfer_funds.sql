CREATE OR REPLACE PROCEDURE TransferFunds (
  p_from_account IN NUMBER,
  p_to_account IN NUMBER,
  p_amount IN NUMBER
) IS
  v_balance NUMBER;
BEGIN
  -- Get sender's balance
  SELECT Balance INTO v_balance FROM Accounts WHERE AccountID = p_from_account;

  IF v_balance < p_amount THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds for transfer');
  END IF;

  -- Deduct from sender
  UPDATE Accounts
  SET Balance = Balance - p_amount
  WHERE AccountID = p_from_account;

  -- Add to receiver
  UPDATE Accounts
  SET Balance = Balance + p_amount
  WHERE AccountID = p_to_account;

  COMMIT;
  DBMS_OUTPUT.PUT_LINE('Transfer of ' || p_amount || ' completed from Account ' ||
                       p_from_account || ' to Account ' || p_to_account);
EXCEPTION
  WHEN OTHERS THEN
    ROLLBACK;
    DBMS_OUTPUT.PUT_LINE('Error during transfer: ' || SQLERRM);
END;
/
