DECLARE
  CURSOR cur_accounts IS
    SELECT AccountID, Balance FROM Accounts;

  v_acc_id Accounts.AccountID%TYPE;
  v_balance Accounts.Balance%TYPE;
  v_fee CONSTANT NUMBER := 500;
BEGIN
  OPEN cur_accounts;
  LOOP
    FETCH cur_accounts INTO v_acc_id, v_balance;
    EXIT WHEN cur_accounts%NOTFOUND;

    UPDATE Accounts
    SET Balance = Balance - v_fee
    WHERE AccountID = v_acc_id;

    DBMS_OUTPUT.PUT_LINE('₹' || v_fee || ' fee applied to Account ID: ' || v_acc_id);
  END LOOP;
  CLOSE cur_accounts;
  COMMIT;
END;
/
