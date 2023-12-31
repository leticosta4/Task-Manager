//import java.time;
public abstract class Task {
    private String name;
    private String dueDate;
    private  int category; //1:academical, 2: work, 3: finance, 4:leisure
    private int priority; //1: not that important, 2: important, 3: urgent - tentar relacionar com alguma etiqueta de cor para o 2 e 3
    private int status; //1: to be done (yellow), 2: done (green), 3:past due (red)

    public Task(String name, String dueDate, int category, int priority, int status){
        this.name = name;
        this.dueDate = dueDate;
        this.category = category;
        this.priority = priority;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getDueDate(){
        return dueDate;
    }

    public void setDueDate(String DueDate){
        this.dueDate = dueDate;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }
    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
