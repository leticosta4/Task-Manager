package items;

import java.lang.invoke.StringConcatFactory;

public class Finance extends Task{
    private double value;
    private String transaction;
    private String account;

    public Finance(String name, String dueDate, String category, int priorityLevel, String status, double value, String transaction, String account){
        super(name, dueDate, category, priorityLevel, status);
        this.value = value;
        this.transaction = transaction;
        this.account = account;
    }
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    public String getTransaction(){
        return transaction;
    }
    public void setTransaction(String transaction){
        this.transaction = transaction;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + """
                    Transaction value: %f
                    Transaction type: %s
                    Account: %s
                    
                """, this.value, this.transaction, this.account);
    }
}
