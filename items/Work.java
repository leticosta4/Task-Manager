package items;
public class Work extends Task{
    private int workType; //1: job, 2: home

    public Work(String name, String dueDate, int category, int priority, int status, int workType){
        super(name, dueDate, category, priority, status);
        this.setWorkType(workType);
    }

    public int getWorkType() {
        return workType;
    }

    public void setWorkType(int workType) {
        this.workType = workType;
    }
}
