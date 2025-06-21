public class FinancialForecast {

    // Recursive method to calculate future value
    // FV = PV * (1 + rate)^years
    public static double calculateFutureValue(double principal, double rate, int years) {
        if (years == 0) {
            return principal;
        } else {
            return (1 + rate) * calculateFutureValue(principal, rate, years - 1);
        }
    }

    // Optimized version using memoization (optional)
    public static double calculateFutureValueMemo(double principal, double rate, int years, double[] memo) {
        if (years == 0) {
            return principal;
        }
        if (memo[years] != 0) {
            return memo[years];
        }
        memo[years] = (1 + rate) * calculateFutureValueMemo(principal, rate, years - 1, memo);
        return memo[years];
    }
}
