-- Scenario 1: ProcessMonthlyInterest
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
  UPDATE Accounts
  SET Balance = Balance + (Balance * 0.01)
  WHERE AccountType = 'Savings';
END;
/

-- Scenario 2: UpdateEmployeeBonus
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(p_dept IN VARCHAR2, p_bonus_percent IN NUMBER) IS
BEGIN
  UPDATE Employees
  SET Salary = Salary + (Salary * p_bonus_percent / 100)
  WHERE Department = p_dept;
END;
/

-- Scenario 3: TransferFunds
CREATE OR REPLACE PROCEDURE TransferFunds(p_from IN NUMBER, p_to IN NUMBER, p_amount IN NUMBER) IS
  v_balance NUMBER;
BEGIN
  SELECT Balance INTO v_balance FROM Accounts WHERE AccountID = p_from;

  IF v_balance >= p_amount THEN
    UPDATE Accounts SET Balance = Balance - p_amount WHERE AccountID = p_from;
    UPDATE Accounts SET Balance = Balance + p_amount WHERE AccountID = p_to;
  ELSE
    DBMS_OUTPUT.PUT_LINE('Insufficient funds.');
  END IF;
END;
/
-- Expected DBMS Output:
-- Txn ID: 1, Date: 2025-06-26, Amount: 200, Type: Deposit
-- Txn ID: 2, Date: 2025-06-26, Amount: 100, Type: Withdrawal
