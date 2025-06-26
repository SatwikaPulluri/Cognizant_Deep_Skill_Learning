SET SERVEROUTPUT ON;

DECLARE
  v_salary Employees.Salary%TYPE;
BEGIN
  -- Check if employee exists
  SELECT Salary INTO v_salary FROM Employees WHERE EmployeeID = 101;

  -- Increase salary by 10%
  UPDATE Employees
  SET Salary = Salary + (v_salary * 0.10)
  WHERE EmployeeID = 101;

  COMMIT;
  DBMS_OUTPUT.PUT_LINE('Salary updated.');

EXCEPTION
  WHEN NO_DATA_FOUND THEN
    DBMS_OUTPUT.PUT_LINE('Error: Employee not found.');
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('Other error: ' || SQLERRM);
END;
/
