SET SERVEROUTPUT ON;

DECLARE
  CURSOR cur_transactions IS
    SELECT CustomerID, TransactionID, Amount, Type, TransactionDate
    FROM Transactions
    WHERE TRUNC(TransactionDate, 'MM') = TRUNC(SYSDATE, 'MM')
    ORDER BY CustomerID;

  v_cust_id Transactions.CustomerID%TYPE;
  v_trans_id Transactions.TransactionID%TYPE;
  v_amt Transactions.Amount%TYPE;
  v_type Transactions.Type%TYPE;
  v_date Transactions.TransactionDate%TYPE;
BEGIN
  OPEN cur_transactions;
  LOOP
    FETCH cur_transactions INTO v_cust_id, v_trans_id, v_amt, v_type, v_date;
    EXIT WHEN cur_transactions%NOTFOUND;

    DBMS_OUTPUT.PUT_LINE('Customer ID: ' || v_cust_id ||
                         ' | Transaction ID: ' || v_trans_id ||
                         ' | Type: ' || v_type ||
                         ' | Amount: ' || v_amt ||
                         ' | Date: ' || TO_CHAR(v_date, 'DD-MON-YYYY'));
  END LOOP;
  CLOSE cur_transactions;
END;
/
