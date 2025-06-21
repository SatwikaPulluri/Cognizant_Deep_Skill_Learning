public class Main {
    public static void main(String[] args) {
        double principal = 10000.0;     // Initial amount
        double rate = 0.10;             // 10% annual growth rate
        int years = 5;

        System.out.println("🔁 Recursive Calculation:");
        double futureValue = FinancialForecast.calculateFutureValue(principal, rate, years);
        System.out.printf("Future value after %d years: ₹%.2f\n", years, futureValue);

        System.out.println("\n💡 Optimized Recursive Calculation (with memoization):");
        double[] memo = new double[years + 1];
        double optimizedValue = FinancialForecast.calculateFutureValueMemo(principal, rate, years, memo);
        System.out.printf("Future value after %d years: ₹%.2f\n", years, optimizedValue);
    }
}
