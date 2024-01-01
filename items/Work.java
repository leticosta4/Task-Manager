public class Work extends Task{
    private int type; //1: job, 2: home

    public Work(String name, String dueDate, int category, int priority, int status, int type){
        super(name, dueDate, category, priority, status);
        this.setType(type);
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
