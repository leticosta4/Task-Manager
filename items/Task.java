package items;

public abstract class Task{
    private String name;
    private String dueDate; //receber em string e depois parsear p o java.time
    private  String category; //1:academical, 2: work, 3: finance, 4:leisure
    private int priorityLevel; //1: not that important, 2: important, 3: urgent - tentar relacionar com alguma etiqueta de cor para o 2 e 3
    private String status; //1: to be done (yellow), 2: done (green), 3:past due (red)

    public Task(String name, String dueDate, String category, int priorityLevel, String status){
        this.name = name;
        this.dueDate = dueDate;
        this.category = category;
        this.priorityLevel = priorityLevel;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public int getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    } //vai ser so para o ticar como done ou chamada no metodo que verifica se ta atrasada tambem?

    @Override
    public String toString(){ //vai ser o exibir da interface grafica - ou provavelmente a parte que esta sempre presente
        return String.format("""
                    Task: %s
                    Due date: %s
                    Category: %s
                    Priority level: %d
                    Status: %s
                """, this.name, this.dueDate, this.category, this.priorityLevel, this.status);
    }
}
