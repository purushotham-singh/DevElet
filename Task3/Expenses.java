package Task3;

class Expense {
    String date;
    double amount;

    public Expense(String date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Date: " + date + " | Amount: $" + amount;
    }
}

