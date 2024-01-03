package items;
public class Finance extends Task{
    private float value;
    private String transaction;
    private String account;

    public Finance(String name, String dueDate, String category, int priorityLevel, String status, float value, String transaction, String account){
        super(name, dueDate, category, priorityLevel, status);
        this.value = value;
        this.transaction = transaction;
        this.account = account;
    }
    public float getValue() {
        return value;
    }

    public void setValue(float value) {
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
        return (super.toString() +
                "Transaction value:" +  getValue() +
                "Transaction type:" + getTransaction() +
                "Account:" + getAccount());
    }
}
