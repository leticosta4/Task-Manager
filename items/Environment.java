package items;

import items.*;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.time.LocalDate; //sera usado p ver se a task esta atrasada

public class Environment {
    public ArrayList <Task> conjunct = new ArrayList<Task>();
    private ArrayList <Task> doneTasks = new ArrayList<Task>();
    private ArrayList <Task> pastDueTasks = new ArrayList<Task>();
    //talvez esses arrayslist de task feita e atrasada precisem de getters ainda
    public ArrayList<Task> getConjunct() { //e so o getter basico mesmo
        return conjunct;
    }

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

    private void addingTaskList(Task t){
        this.conjunct.add(t);
    } //chamado no final do metodo de criaçao p adiçao no arraylist

    public void listExibition(){
        runningLate(); //verificando sempre que a lista e requisitada
        if(this.conjunct != null){
            for(Task tasks: this.conjunct){
              System.out.println(tasks.toString());
            }
        } else{
            System.out.println("A lista de tasks esta vazia");
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

    public void editTask(Task tbEdited, String name, String dueDate, int priorityLevel, String subject, String activityType, int workType, double value, String transaction, String account, String place, int duration, String company){
        tbEdited.setName(name);
        tbEdited.setDueDate(dueDate);
        tbEdited.setPriorityLevel(priorityLevel);
        //tbEdited.setStatus("To be done");

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

    public void itsAdoneTask(Task isNowDone){
        isNowDone.setStatus("Done");
        doneTasks.add(isNowDone); //adicionando a uma lista de tasks so feitas
        //talvez ver alguma coisa p mudar a cor na lista geral para verde
    } //ainda vai ser adaptado para a parte da interface

    public void doneTasksExibition(){
        if(!this.doneTasks.isEmpty()){
            for(Task done: this.doneTasks){
                System.out.println(done.toString());
            }
        } else{
            System.out.println("The done tasks list is still empty");
        }

    }

    private void runningLate(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate currentDate = LocalDate.now();
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
        if(!this.pastDueTasks.isEmpty()){
            for(Task pastDue: this.pastDueTasks){
                System.out.println(pastDue.toString());
            }
        } else {
            System.out.println("The running late tasks list is still empty");
        }
    }
}
