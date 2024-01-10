package items;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.time.LocalDate; //sera usado p ver se a task esta atrasada

public class Ambiente {
    public ArrayList <Task> conjunct = new ArrayList<Task>();
    private ArrayList <Task> doneTasks = new ArrayList<Task>(); //talvez depois preceiise de um getter

    private ArrayList <Task> pastDueTasks = new ArrayList<Task>(); //talvez ainda precisse de um getter
    public ArrayList<Task> getConjunct() { //e so o getter basico mesmo
        return conjunct;
    }

//    public ArrayList<Task> getDoneTasks(){ return doneTasks; }
//    public ArrayList<Task> getPastDueTasks(){ return pastDueTasks; }

    public int whichTaskType(String category){
        //identificando qual o tipo de task para instaciar a subclasse certa
        if(category.equalsIgnoreCase("Academical")){
            return 1;
        } else if(category.equalsIgnoreCase("Work")){
            return 2;
        }else if(category.equalsIgnoreCase("Finance")){
            return 3;
        } else{
            return 4;
        }
    } //usado na criaçao e ediçao de objetos

    //teste mudando p public por um momento
    public void addingTaskList(Task t){
        this.conjunct.add(t);
    } //chamado no final do metodo de criaçao p adiçao no arraylist

    public void listExibition(){
        System.out.println("entrou na exibiçao da lista"); //TESTE
        for(Task tasks: this.conjunct){
            System.out.println(tasks.toString());
        }
    }  //exibiçao geral da lista de tasks

    //criando os objetos e adicionando os na lista geral com a chamada do outro metodo
    public void createTask(String name, String dueDate, String category, int priorityLevel, String status, String subject, String activityType, int workType, double value, String transaction, String account, String place, int duration, String company){
        if(whichTaskType(category) == 1){
            Academical task = new Academical(name, dueDate, category, priorityLevel, status, subject, activityType);
            addingTaskList(task);
        } else if (whichTaskType(category) == 2) {
            Work task = new Work(name, dueDate, category, priorityLevel, status, workType);
            addingTaskList(task);
        } else if (whichTaskType(category) == 3) {
            Finance task = new Finance(name, dueDate, category, priorityLevel, status, value, transaction, account);
            addingTaskList(task);
        } else{
            Leisure task = new Leisure(name, dueDate, category, priorityLevel, status, place, duration, company);
            addingTaskList(task);
        }

    }
    public void deleteTask(Task tbDeleted){
        this.conjunct.remove(tbDeleted);
    }

    public void editTask(Task tbEdited, String name, String dueDate, String category, int priorityLevel, String status, String subject, String activityType, int workType, double value, String transaction, String account, String place, int duration, String company){
        tbEdited.setName(name);
        tbEdited.setDueDate(dueDate);
        tbEdited.setCategory(category);
        tbEdited.setPriorityLevel(priorityLevel);
        tbEdited.setStatus(status);

        if(tbEdited instanceof Academical){
            ((Academical) tbEdited).setSubject(subject);
            ((Academical) tbEdited).setActivityType(activityType);
        } else if (tbEdited instanceof Work) {
            ((Work) tbEdited).setWorkType(workType);
        } else if (tbEdited instanceof Finance) {
            ((Finance) tbEdited).setValue(value);
            ((Finance) tbEdited).setTransaction(transaction);
            ((Finance) tbEdited).setAccount(account);
        } else {
            ((Leisure)tbEdited).setPlace(place);
            ((Leisure)tbEdited).setDuration(duration);
            ((Leisure)tbEdited).setCompany(company);
        }
    }

    //esses metodos de tempo talvez devessem ficar na classe abstrata Task, mas tem a questao dos arrayslist
    public void itsAdoneTask(Task isNowDone){
        isNowDone.setStatus("Done");
        doneTasks.add(isNowDone); //adicionando a uma lista de tasks so feitas
        //talvez ver alguma coisa p mudar a cor na lista geral para verde
    } //ainda vai ser adaptado para a parte da interface

    public void doneTasksExibition(){
        for(Task done: this.doneTasks){
            System.out.println(done.toString());
        }
    }

    public void runningLate(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate currentDate = LocalDate.now();
        System.out.println("data atual segundo o java time: " + currentDate); //teste
        LocalDate deadline;
        for(int ind = 0; ind < this.conjunct.size(); ind++){
            deadline = LocalDate.parse(this.conjunct.get(ind).getDueDate(), format);
            if(deadline.isBefore(currentDate)){ //se for true
                this.conjunct.get(ind).setStatus("Past due");
                pastDueTasks.add(this.conjunct.get(ind));
                //talvez ver alguma coisa p mudar a cor na lista geral para vermelho
            }
        }
    }
    public void pastDueTasksExibition(){
        for(Task pastDue: this.pastDueTasks){
            System.out.println(pastDue.toString());
        }
    }

//            colocar o running late --> tbm vou usar o setar syytatus mas vou ter criar um metodo dedicado usando o java.time
}
