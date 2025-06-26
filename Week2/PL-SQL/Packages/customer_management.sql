-- ========================================
-- CustomerManagement Package (Oracle PL/SQL)
-- ========================================

-- Package Specification
CREATE OR REPLACE PACKAGE CustomerManagement AS
  PROCEDURE AddCustomer(
    p_id NUMBER,
    p_name VARCHAR2,
    p_age NUMBER,
    p_balance NUMBER
  );

  PROCEDURE UpdateCustomerDetails(
    p_id NUMBER,
    p_name VARCHAR2,
    p_age NUMBER,
    p_balance NUMBER
  );

  FUNCTION GetCustomerBalance(
    p_id NUMBER
  ) RETURN NUMBER;
END CustomerManagement;
/
-- ========================================

-- Package Body
CREATE OR REPLACE PACKAGE BODY CustomerManagement AS

  PROCEDURE AddCustomer(
    p_id NUMBER,
    p_name VARCHAR2,
    p_age NUMBER,
    p_balance NUMBER
  ) IS
  BEGIN
    INSERT INTO Customers (CustomerID, Name, Age, Balance)
    VALUES (p_id, p_name, p_age, p_balance);
    COMMIT;
  END AddCustomer;

  PROCEDURE UpdateCustomerDetails(
    p_id NUMBER,
    p_name VARCHAR2,
    p_age NUMBER,
    p_balance NUMBER
  ) IS
  BEGIN
    UPDATE Customers
    SET Name = p_name,
        Age = p_age,
        Balance = p_balance
    WHERE CustomerID = p_id;
    COMMIT;
  END UpdateCustomerDetails;

  FUNCTION GetCustomerBalance(
    p_id NUMBER
  ) RETURN NUMBER IS
    v_balance NUMBER;
  BEGIN
    SELECT Balance INTO v_balance
    FROM Customers
    WHERE CustomerID = p_id;
    RETURN v_balance;
  EXCEPTION
    WHEN NO_DATA_FOUND THEN
      RETURN NULL;
  END GetCustomerBalance;

END CustomerManagement;
/
