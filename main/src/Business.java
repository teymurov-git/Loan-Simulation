public class Business extends Loan{
    public Business(double amount, double interestRate, double duration) {
        super(amount, interestRate, duration);
    }
        @Override
        public double calculateTotalPayment() {
            // Super metoddan istifadə edərək əsas faizlə hesablayırıq
            double basePayment = super.calculateTotalPayment();
            // BusinessLoan üçün 1% əlavə commission əlavə edirik
            double commission = getAmount() * 0.01; // 1% komissiya
            return (basePayment + commission);
        }
    }