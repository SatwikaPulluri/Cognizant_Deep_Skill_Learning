SET SERVEROUTPUT ON;

BEGIN
  FOR cust IN (
    SELECT CustomerID, Age
    FROM Customers
    WHERE Age > 60
  ) LOOP
    UPDATE Customers
    SET LoanInterestRate = LoanInterestRate - 1
    WHERE CustomerID = cust.CustomerID;
  END LOOP;

  COMMIT;
  DBMS_OUTPUT.PUT_LINE('1% interest discount applied to customers above 60.');
END;
/
