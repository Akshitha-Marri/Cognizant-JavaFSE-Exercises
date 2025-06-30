-- Scenario 1: GenerateMonthlyStatements
DECLARE
  CURSOR c_txns IS
    SELECT AccountID, Amount, TransactionType, TransactionDate
    FROM Transactions
    WHERE TransactionDate BETWEEN TRUNC(SYSDATE, 'MM') AND LAST_DAY(SYSDATE);

BEGIN
  FOR txn IN c_txns LOOP
    DBMS_OUTPUT.PUT_LINE('Account: ' || txn.AccountID || ', Amount: ' || txn.Amount || ', Type: ' || txn.TransactionType);
  END LOOP;
END;
/

-- Scenario 2: ApplyAnnualFee
DECLARE
  CURSOR c_accounts IS SELECT AccountID FROM Accounts;
BEGIN
  FOR acc IN c_accounts LOOP
    UPDATE Accounts SET Balance = Balance - 100 WHERE AccountID = acc.AccountID;
  END LOOP;
END;
/

-- Scenario 3: UpdateLoanInterestRates
DECLARE
  CURSOR c_loans IS SELECT LoanID, InterestRate FROM Loans;
BEGIN
  FOR loan IN c_loans LOOP
    UPDATE Loans
    SET InterestRate = loan.InterestRate + 0.5
    WHERE LoanID = loan.LoanID;
  END LOOP;
END;
/
