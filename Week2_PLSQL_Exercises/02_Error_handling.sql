-- Scenario 1: SafeTransferFunds
CREATE OR REPLACE PROCEDURE SafeTransferFunds(p_from IN NUMBER, p_to IN NUMBER, p_amount IN NUMBER) IS
BEGIN
  UPDATE Accounts SET Balance = Balance - p_amount WHERE AccountID = p_from;
  UPDATE Accounts SET Balance = Balance + p_amount WHERE AccountID = p_to;
  COMMIT;
EXCEPTION
  WHEN OTHERS THEN
    ROLLBACK;
    DBMS_OUTPUT.PUT_LINE('Transfer failed: ' || SQLERRM);
END;
/

-- Scenario 2: UpdateSalary
CREATE OR REPLACE PROCEDURE UpdateSalary(p_emp_id IN NUMBER, p_percent IN NUMBER) IS
BEGIN
  UPDATE Employees SET Salary = Salary + (Salary * p_percent / 100)
  WHERE EmployeeID = p_emp_id;
  IF SQL%ROWCOUNT = 0 THEN
    RAISE_APPLICATION_ERROR(-20001, 'Employee ID not found');
  END IF;
EXCEPTION
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
/

-- Scenario 3: AddNewCustomer
CREATE OR REPLACE PROCEDURE AddNewCustomer(p_id IN NUMBER, p_name IN VARCHAR2, p_dob IN DATE, p_balance IN NUMBER) IS
BEGIN
  INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified)
  VALUES (p_id, p_name, p_dob, p_balance, SYSDATE);
EXCEPTION
  WHEN DUP_VAL_ON_INDEX THEN
    DBMS_OUTPUT.PUT_LINE('Customer already exists');
END;
/
