-- Scenario 1: Apply 1% discount to customers above 60
BEGIN
  FOR cust IN (SELECT CustomerID, DOB FROM Customers) LOOP
    IF MONTHS_BETWEEN(SYSDATE, cust.DOB)/12 > 60 THEN
      UPDATE Loans
      SET InterestRate = InterestRate - 1
      WHERE CustomerID = cust.CustomerID;
    END IF;
  END LOOP;
END;
/

-- Scenario 2: Promote to VIP
BEGIN
  UPDATE Customers
  SET IsVIP = 'TRUE'
  WHERE Balance > 10000;
END;
/

-- Scenario 3: Loan reminders
BEGIN
  FOR rec IN (
    SELECT CustomerID, LoanID FROM Loans
    WHERE EndDate <= SYSDATE + 30
  ) LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: Loan ' || rec.LoanID || ' for customer ' || rec.CustomerID || ' is due soon.');
  END LOOP;
END;
/
