package items;
public class Leisure extends Task{
    private String place; //se aplicavel
    private int duration;
    private String company; //se aplicavel

    public Leisure(String name, String dueDate, String category, int priorityLevel, String status, String place, int duration, String company){
        super(name, dueDate, category, priorityLevel, status);
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

    @Override
    public String toString() {
        return (super.toString() +
                "Place:" + getPlace() +
                "Duration:" +  getDuration() +
                "Company:" + getCompany()); //talvez mudar depois para o caso de ser apicavel ou nao place e company
    }
}
