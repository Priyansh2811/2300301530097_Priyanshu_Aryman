divide two numbers without using the division operator
class div_two_no {
    public int divide(int dividend, int divisor) {
        // Handle edge cases
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero");
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; // Handle overflow case
        }

        // Determine the sign of the result
        boolean isNegative = (dividend < 0) ^ (divisor < 0);
        
        // Convert both numbers to positive
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        int quotient = 0;
        
        // Subtract the divisor from the dividend until it is less than the divisor
        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }

        return isNegative ? -quotient : quotient;
    }
}