CREATE OR REPLACE PACKAGE AccountOperations AS
  PROCEDURE OpenAccount(
    p_acc_id NUMBER,
    p_cust_id NUMBER,
    p_type VARCHAR2,
    p_balance NUMBER
  );

  PROCEDURE CloseAccount(
    p_acc_id NUMBER
  );

  FUNCTION GetTotalBalance(
    p_cust_id NUMBER
  ) RETURN NUMBER;
END AccountOperations;
/
-- ========================================

-- Package Body
CREATE OR REPLACE PACKAGE BODY AccountOperations AS

  PROCEDURE OpenAccount(
    p_acc_id NUMBER,
    p_cust_id NUMBER,
    p_type VARCHAR2,
    p_balance NUMBER
  ) IS
  BEGIN
    INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance)
    VALUES (p_acc_id, p_cust_id, p_type, p_balance);
    COMMIT;
  END OpenAccount;

  PROCEDURE CloseAccount(
    p_acc_id NUMBER
  ) IS
  BEGIN
    DELETE FROM Accounts
    WHERE AccountID = p_acc_id;
    COMMIT;
  END CloseAccount;

  FUNCTION GetTotalBalance(
    p_cust_id NUMBER
  ) RETURN NUMBER IS
    v_total NUMBER;
  BEGIN
    SELECT SUM(Balance)
    INTO v_total
    FROM Accounts
    WHERE CustomerID = p_cust_id;
    RETURN NVL(v_total, 0);
  EXCEPTION
    WHEN NO_DATA_FOUND THEN
      RETURN 0;
  END GetTotalBalance;

END AccountOperations;
/