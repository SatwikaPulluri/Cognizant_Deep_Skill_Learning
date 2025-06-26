BEGIN
  FOR cust IN (
    SELECT CustomerID, Balance
    FROM Customers
    WHERE Balance > 10000
  ) LOOP
    UPDATE Customers
    SET IsVIP = 'TRUE'
    WHERE CustomerID = cust.CustomerID;
  END LOOP;

  COMMIT;
  DBMS_OUTPUT.PUT_LINE('VIP status granted to customers with balance over $10,000.');
END;
/
