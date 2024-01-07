package items;

import java.util.ArrayList;

public class Ambiente {
    ArrayList <Task> conjunct = new ArrayList<Task>();

    int i;
    public ArrayList<Task> getConjunct() { //e so o getter basico mesmo
        return conjunct;
    }
    public int whichTaskType(String category){
        //identificando qual o tipo de task para instaciar a subclasse certa
        if(category == "Academical"){
            return 1;
        } else if(category == "Work"){
            return 2;
        }else if(category == "Finance"){
            return 3;
        } else{
            return 4;
        }
    }

//    private Task identifyObject(String nome){
//        for(i = 0; i < conjunct.size(); i++){
//            if(conjunct.get(i).getName().equalsIgnoreCase(nome)) {
//                Task selected =  conjunct.get(i);
//                break;
//            }
//        }
//        return selected;
//    }
    private void addingTaskList(Task t){
        this.conjunct.add(t);
    }

    //exibiçao geral da lista de tasks
    public void listExibition(){
        for(Task tasks: this.conjunct){
            System.out.println(tasks.toString());
        }
    }

    //criando os objeto e adicionando os na lista geral com a chamada do outro metodo
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
    public void deleteTask(String tbDeleted){
        for(i = 0; i < this.conjunct.size(); i++){
            if(this.conjunct.get(i).getName().equalsIgnoreCase(tbDeleted)){ //esse ignores case e p letra maiuscula
                this.conjunct.remove(i);
                break;
            }
        }
    }

    //o alterar esta em produçao

//    public void editTask(String tbEdited){
//        for(i = 0; i < this.conjunct.size(); i++){
//            if(this.conjunct.get(i).getName().equalsIgnoreCase(tbEdited)) {
//                this.conjunct.get(i);
//            }
//        }
//    }

//  fazer o alterar: perguntar o nome da task, achar o objeto em questao, talvez conseguui o nome da sua classe
//    preciso dar um jeito de criar um novo objeto p ser o novo selecionado e mandar para o metodo especifico da classe ambiente
//    juntando isso ainda com os novos atributos do objeto que provavelmente vou emendar com o metodo de criaçao da task e colocar uma condicional

    //      coisas p ver se faço aqui ou na pt de interface caso eu va adicionar uma:
//            setar como feito -> provavelmente vou o usar o proprio metodo de set.status de um jeito mais simples
//            colocar o running late --> tbm vou usar o setar syytatus mas vou ter criar um metodo dedicado usando o java.time
}
