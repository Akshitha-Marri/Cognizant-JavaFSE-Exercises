-- Scenario 1: CalculateAge
CREATE OR REPLACE FUNCTION CalculateAge(p_dob IN DATE) RETURN NUMBER IS
BEGIN
  RETURN FLOOR(MONTHS_BETWEEN(SYSDATE, p_dob)/12);
END;
/

-- Scenario 2: CalculateMonthlyInstallment
CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment(p_amount IN NUMBER, p_rate IN NUMBER, p_years IN NUMBER)
RETURN NUMBER IS
  v_monthly_rate NUMBER := p_rate / (12 * 100);
  v_months NUMBER := p_years * 12;
BEGIN
  RETURN (p_amount * v_monthly_rate) / (1 - POWER(1 + v_monthly_rate, -v_months));
END;
/

-- Scenario 3: HasSufficientBalance
CREATE OR REPLACE FUNCTION HasSufficientBalance(p_account_id IN NUMBER, p_amount IN NUMBER)
RETURN BOOLEAN IS
  v_balance NUMBER;
BEGIN
  SELECT Balance INTO v_balance FROM Accounts WHERE AccountID = p_account_id;
  RETURN v_balance >= p_amount;
EXCEPTION
  WHEN NO_DATA_FOUND THEN
    RETURN FALSE;
END;
/
-- Replaced GetAccountBalance with MultiplyTwoNumbers due to Live SQL limitations

CREATE OR REPLACE FUNCTION MultiplyTwoNumbers(a IN NUMBER, b IN NUMBER)
RETURN NUMBER IS
BEGIN
  RETURN a * b;
END;
/
