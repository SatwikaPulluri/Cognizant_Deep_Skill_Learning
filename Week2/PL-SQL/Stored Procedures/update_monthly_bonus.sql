CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
  p_dept_id IN NUMBER,
  p_bonus_percent IN NUMBER
) IS
BEGIN
  UPDATE Employees
  SET Salary = Salary + (Salary * p_bonus_percent / 100)
  WHERE DepartmentID = p_dept_id;

  COMMIT;
  DBMS_OUTPUT.PUT_LINE('Bonus of ' || p_bonus_percent || '% applied to department ' || p_dept_id);
END;
/
