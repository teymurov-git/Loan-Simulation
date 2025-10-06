public class Loan {
    double amount;
    double interestRate;
    double duration;

    public Loan(double amount, double interestRate, double duration){
        this.amount = amount;
        this.interestRate = interestRate;
        this.duration = duration;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double calculateTotalPayment(){
        return amount + (amount * interestRate * duration / 100);
    };
}
