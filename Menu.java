import items.Ambiente;
import items.Task;

import java.util.Scanner;
public class Menu {
    Scanner input = new Scanner(System.in);
    int ans = 1;
    String name, dueDate, category, subject, activityType, transaction, account, chosen, status;
    int priorityLevel; //the lower the most urgent [1-3] - ver coisa com etiqueta de cor tambem
    int workType, duration;
    double value;
    String place, company; //se aplicaveis

    Ambiente env = new Ambiente();

    //ATENÇAOO: O METODO DE RUNNIG LATE TEM QUE SER CHAMADO SEMPRE NO INICIO DO PROGRAMA
    public void exibirMenu(){
        System.out.println("task manager");
        do{
            System.out.println("o que gostaria de fazer?");
            System.out.println(String.format("""
                1 - criar nova task
                2 - editar
                3 - exibir lista geral de tasks
                4 - excluir
                5 - ticar como feita alguma task
                6 - ver lista de tasks ja feitas (completas)
                7 - ver lista de tasks atrasadas 
                8 - sair
                
                """));
            ans = input.nextInt();
            switch (ans){
                case 1 -> {
                    taskAttributes(1, null); //quando for 1 e p criar task, e 0 e p editar
                    break;
                }
                case 2 -> {
                    identifyTheTask(1);
                    break;
                }
                case 3 -> {
                    env.listExibition();
                    break;
                }
                case 4 -> {
                    identifyTheTask(2);
                    break;
                }
                case 5 -> {
                    identifyTheTask(0);
                    break;
                }
                case 6 -> {
                    env.doneTasksExibition();
                    break;
                }
                case 7 -> {
                    env.pastDueTasksExibition();
                    break;
                }
                //so ta faltando a parte de sair do menu quando aperta 8
            }
        }while(ans > 1 || ans < 7);

    } //esse menu geral depois vai ser adaptado com a interface e a opçao de listar vai ser segunda a pg inicial
    private void taskAttributes(int num, Task objt){ //serve tanto para criaçao quanto para ediçao
        env.runningLate(); //verificando sempre que uma task e criada ou editada se as outras estao ok ou n
        if(num == 0){ //quando e ediçao ele tbm manda o objeto a ser editado para que se use os setters
            System.out.println("Type the new attributes for this task");
        }
        System.out.println("Task name?");
        name = input.next();
        System.out.println("Due date? (yyyy/MM/dd)");
        dueDate = input.next();
        System.out.print("Category?");
        category = input.next();
        System.out.println("Priority level [1-3]? (the lower the most urgent)");
        priorityLevel = input.nextInt();
        if(num == 0){ //so se for na ediçao pq o de criaçao e sempre como "to be done"
            System.out.println("Status?");
            status = input.next();
        }
        switch (env.whichTaskType(category)){
            case 1->{
                System.out.println("Subject?");
                subject = input.next();
                System.out.println("Activity type?");
                activityType = input.next();
                if(num == 1){
                    env.createTask(name, dueDate, category, priorityLevel, "to be done", subject, activityType, 0, 0.0, null, null, null, 0, null);
                } else{
                    env.editTask(objt, name, dueDate, category, priorityLevel, status, subject, activityType, 0, 0.0, null, null, null, 0, null);
                }
                break;
            }
            case 2->{
                System.out.print("Work type?\n1 - Job related\n2 - Home related\n");
                workType = input.nextInt();
                if(num == 1){
                    env.createTask(name, dueDate, category, priorityLevel, "to be done", null, null, workType, 0.0, null, null, null, 0, null);
                } else{
                    env.editTask(objt, name, dueDate, category, priorityLevel, status, null, null, workType, 0.0, null, null, null, 0, null);
                }
                break;
            }
            case 3->{
                System.out.println("Transaction value?");
                value = input.nextDouble();
                System.out.println("Transaction name?");
                transaction = input.next();
                System.out.println("Account?");
                account = input.next();
                if(num == 1){
                    env.createTask(name, dueDate, category, priorityLevel, "to be done", null, null, 0, value, transaction, account, null, 0, null);
                } else{
                    env.editTask(objt, name, dueDate, category, priorityLevel, status, null, null, 0, value, transaction, account, null, 0, null);
                }
                break;
            }
            case 4->{
                System.out.println("Place? (if not applicable, just type '-')");
                place = input.next();
                System.out.println("Duration? (in hours)");
                duration = input.nextInt();
                System.out.println("Company? (if not applicable, just type '-')");
                account = input.next();
                if(num == 1){
                    env.createTask(name, dueDate, category, priorityLevel, "to be done", null, null, 0, 0.0, null, null, place, duration, company);
                } else{
                    env.editTask(objt, name, dueDate, category, priorityLevel, status, null, null, 0, 0.0, null, null, place, duration, company);
                }
                break;
            }
        }
    } //depois vai ser adaptado com a interface

    private void identifyTheTask(int n){ //0 p ticar como feita, 1 p ediçao geral e 2 p apagar
        System.out.println("digite o nome da task");
        chosen = input.next();
        for(int j = 0; j < env.getConjunct().size(); j++){
            if(env.getConjunct().get(j).getName().equalsIgnoreCase(chosen)){
                if(n == 1){
                    taskAttributes(0, env.getConjunct().get(j)); //mandando o objeto certo a ser editado
                } else if(n == 2){
                    env.deleteTask(env.getConjunct().get(j));
                } else{
                    env.itsAdoneTask(env.getConjunct().get(j));
                }
                break;
            }
        }
    } //identifica o objeto especifico a ser editado a partir do input do seu nome, servindo para ediçao geral ou ticar como feita(depois vai ser adaptado para interface com os action listeners e botoes de clique e ver ainda se vou mudar tudo ou n)
    //talvez esse metodo de identificaçao do obejto ficaria melhor na classse de ambiente, mas da um problema para o caso de ediçao da task
}
