DECLARE
  CURSOR cur_loans IS
    SELECT LoanID, Amount FROM Loans;

  v_loan_id Loans.LoanID%TYPE;
  v_amount Loans.Amount%TYPE;
  v_new_rate NUMBER;
BEGIN
  OPEN cur_loans;
  LOOP
    FETCH cur_loans INTO v_loan_id, v_amount;
    EXIT WHEN cur_loans%NOTFOUND;

    IF v_amount > 100000 THEN
      v_new_rate := 8;
    ELSE
      v_new_rate := 9.5;
    END IF;

    UPDATE Loans
    SET InterestRate = v_new_rate
    WHERE LoanID = v_loan_id;

    DBMS_OUTPUT.PUT_LINE('Loan ID: ' || v_loan_id || ' | New Interest Rate: ' || v_new_rate || '%');
  END LOOP;
  CLOSE cur_loans;
  COMMIT;
END;
/
