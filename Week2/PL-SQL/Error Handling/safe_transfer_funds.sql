SET SERVEROUTPUT ON;

DECLARE
  v_balance NUMBER;
BEGIN
  -- Get sender balance
  SELECT Balance INTO v_balance FROM Accounts WHERE AccountID = 1;

  IF v_balance < 500 THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds');
  END IF;

  -- Start transaction (implicitly in PL/SQL block)
  UPDATE Accounts SET Balance = Balance - 500 WHERE AccountID = 1;
  UPDATE Accounts SET Balance = Balance + 500 WHERE AccountID = 2;

  COMMIT;
  DBMS_OUTPUT.PUT_LINE('Transfer successful.');

EXCEPTION
  WHEN OTHERS THEN
    ROLLBACK;
    DBMS_OUTPUT.PUT_LINE('Error during transfer: ' || SQLERRM);
END;
/
