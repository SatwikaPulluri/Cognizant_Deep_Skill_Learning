SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
  FOR acc IN (
    SELECT AccountID, Balance
    FROM Accounts
    WHERE AccountType = 'SAVINGS'
  ) LOOP
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01)
    WHERE AccountID = acc.AccountID;
  END LOOP;

  COMMIT;
  DBMS_OUTPUT.PUT_LINE('1% interest applied to all savings accounts.');
END;
/
