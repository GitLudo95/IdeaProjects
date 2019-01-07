import java.util.List;

public class Loan {
    private int amount;
    private boolean approved;
    private int duration;
    private List<String> messages;
    private double yearlyInterestRate;
    private int yearlyRepayment;

    public Loan() {
    }

    public Loan(int amount, int duration, double yearlyInterestRate) {
        this.amount = amount;
        this.duration = duration;
        this.yearlyInterestRate = yearlyInterestRate;
    }
    public enum StatusType {
        ACCEPTED, REJECTED, REFERRED;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public double getYearlyInterestRate() {
        return yearlyInterestRate;
    }

    public void setYearlyInterestRate(double yearlyInterestRate) {
        this.yearlyInterestRate = yearlyInterestRate;
    }

    public int getYearlyRepayment() {
        return yearlyRepayment;
    }

    public void setYearlyRepayment(int yearlyRepayment) {
        this.yearlyRepayment = yearlyRepayment;
    }

    public void addToMessages(String message) {
            messages.add(message);
    }
    public void reject() {
        approved = false;
    }
    public void removeFromMessages(String message) {
        messages.remove(message);
    }
}

