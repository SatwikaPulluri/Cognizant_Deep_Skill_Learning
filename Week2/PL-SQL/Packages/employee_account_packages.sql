CREATE OR REPLACE PACKAGE EmployeeManagement AS
  PROCEDURE HireEmployee(
    p_id NUMBER,
    p_name VARCHAR2,
    p_dept NUMBER,
    p_salary NUMBER
  );

  PROCEDURE UpdateEmployeeDetails(
    p_id NUMBER,
    p_name VARCHAR2,
    p_dept NUMBER,
    p_salary NUMBER
  );

  FUNCTION CalculateAnnualSalary(
    p_id NUMBER
  ) RETURN NUMBER;
END EmployeeManagement;
/
-- ========================================

-- Package Body
CREATE OR REPLACE PACKAGE BODY EmployeeManagement AS

  PROCEDURE HireEmployee(
    p_id NUMBER,
    p_name VARCHAR2,
    p_dept NUMBER,
    p_salary NUMBER
  ) IS
  BEGIN
    INSERT INTO Employees (EmployeeID, Name, DepartmentID, Salary)
    VALUES (p_id, p_name, p_dept, p_salary);
    COMMIT;
  END HireEmployee;

  PROCEDURE UpdateEmployeeDetails(
    p_id NUMBER,
    p_name VARCHAR2,
    p_dept NUMBER,
    p_salary NUMBER
  ) IS
  BEGIN
    UPDATE Employees
    SET Name = p_name,
        DepartmentID = p_dept,
        Salary = p_salary
    WHERE EmployeeID = p_id;
    COMMIT;
  END UpdateEmployeeDetails;

  FUNCTION CalculateAnnualSalary(
    p_id NUMBER
  ) RETURN NUMBER IS
    v_salary NUMBER;
  BEGIN
    SELECT Salary INTO v_salary
    FROM Employees
    WHERE EmployeeID = p_id;
    RETURN v_salary * 12;
  EXCEPTION
    WHEN NO_DATA_FOUND THEN
      RETURN NULL;
  END CalculateAnnualSalary;

END EmployeeManagement;
/