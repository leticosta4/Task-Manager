public class Finance extends Task{
    private float value;
    private String transaction;
    private String account;

    public Finance(String name, String dueDate, int category, int priority, int status, float value, String transaction, String account){
        super(name, dueDate, category, priority, status);
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
}