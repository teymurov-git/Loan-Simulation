public class ConsumerLoan extends Loan{
    public ConsumerLoan(double amount, double interestRate, double duration) {
        super(amount, interestRate, duration);
    }
        @Override
        public double calculateTotalPayment() {
            double basePayment = super.calculateTotalPayment();
            return basePayment;
    }
}
