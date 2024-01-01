package items;
public class Leisure extends Task{
    private String place; //se aplicavel
    private int duration;
    private String company; //se aplicavel

    public Leisure(String name, String dueDate, int category, int priority, int status, String place, int duration, String company){
        super(name, dueDate, category, priority, status);
        this.place = place;
        this.duration = duration;
        this.company = company;
    }
    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
    public int getDuration(){
        return duration;
    }
    public void setDuration(int duration){
        this.duration = duration;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
