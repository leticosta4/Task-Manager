package items;
public class Academical extends Task{
    private String subject;
    private String activityType;

    public Academical(String name, String dueDate, String category, int priorityLevel, String status, String subject, String activityType){
        super(name, dueDate, category, priorityLevel, status); //o super chama o construtor da classe pai
        this.subject = subject;
        this.activityType = activityType;
    }
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    @Override
    public String toString(){
        return (super.toString() +
                "Subject:" + getSubject() +
                "Activity type:" + getActivityType());
    }
}
