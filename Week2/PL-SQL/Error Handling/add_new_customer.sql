SET SERVEROUTPUT ON;

BEGIN
  -- Check if customer exists
  DECLARE
    v_exists NUMBER;
  BEGIN
    SELECT COUNT(*) INTO v_exists FROM Customers WHERE CustomerID = 10;

    IF v_exists > 0 THEN
      RAISE_APPLICATION_ERROR(-20002, 'Customer already exists');
    END IF;

    INSERT INTO Customers (CustomerID, Name, Age, Balance, IsVIP)
    VALUES (10, 'NewCustomer', 30, 5000, 'FALSE');

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Customer added.');
  END;

EXCEPTION
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
/
