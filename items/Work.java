package items;
public class Work extends Task{
    private int workType; //1: job, 2: home

    public Work(String name, String dueDate, String category, int priorityLevel, String status, int workType){
        super(name, dueDate, category, priorityLevel, status);
        this.setWorkType(workType);
    }

    public int getWorkType() {
        return workType;
    }

    public void setWorkType(int workType) {
        this.workType = workType;
    }

    @Override
    public String toString(){
        return String.format(super.toString() + """
                            Work type: %d
                        
                        """, this.workType);
    }
}
