import items.Ambiente;

import java.util.Scanner;
public class Menu {
    Scanner input = new Scanner(System.in);
    int ans;
    String name, dueDate, category, subject, activityType, transaction, account, tbDeleted, edited;
    int priorityLevel; //the lower the most urgent [1-3] - ver coisa com etiqueta de cor tambem
    int workType, duration;
    double value;
    String place, company; //se aplicaveis

    Ambiente env = new Ambiente();

    //esse menu geral depois vai ser adaptado com a interface e a opçao de listar vai ser segunda a pg inicial
    public void exibirMenu(){
        System.out.println("o que gostaria de fazer?");
        System.out.println(String.format("""
                1 - criar nova task
                2 - editar
                3 - exibir lista geral de tasks
                4 - excluir
                5 - ticar como feita alguma task
                //talvez: 5 - ver tasks atrasads
                """));
        ans = input.nextInt();
        switch (ans){
            case 1 -> {
                criarTask();
                break;
            }
            case 2 -> {
                break;
            }
            case 3 -> {
                env.listExibition();
                break;
            }
            case 4 -> {
                apagarQual();
                break;
            }
        }
    }
    private void criarTask(){
        System.out.println("Task name?");
        name = input.next();
        System.out.println("Due date? (DD/MM/YYYY)");
        dueDate = input.next();
        System.out.print("Category?");
        category = input.next();
        System.out.println("Priority level [1-3]? (the lower the most urgent)");
        priorityLevel = input.nextInt();

        switch (env.whichTaskType(category)){
            case 1->{
                System.out.println("Subject?");
                subject = input.next();
                System.out.println("Activity type?");
                activityType = input.next();
                env.createTask(name, dueDate, category, priorityLevel, "to be done", subject, activityType, 0, 0.0, null, null, null, 0, null);
                break;
            }
            case 2->{
                System.out.print("Work type?\n1 - Job related\n2 - Home related\n");
                workType = input.nextInt();
                env.createTask(name, dueDate, category, priorityLevel, "to be done", null, null, workType, 0.0, null, null, null, 0, null);
                break;
            }
            case 3->{
                System.out.println("Transaction value?");
                value = input.nextDouble();
                System.out.println("Transaction name?");
                transaction = input.next();
                System.out.println("Account?");
                account = input.next();
                env.createTask(name, dueDate, category, priorityLevel, "to be done", null, null, 0, value, transaction, account, null, 0, null);
                break;
            }
            case 4->{
                System.out.println("Place? (if not applicable, just type '-')");
                place = input.next();
                System.out.println("Duration? (in hours)");
                duration = input.nextInt();
                System.out.println("Company? (if not applicable, just type '-')");
                account = input.next();
                env.createTask(name, dueDate, category, priorityLevel, "to be done", null, null, 0, 0.0, null, null, place, duration, company);
                break;
            }
        }
    } //depois vai ser adaptado com a interface
    private void apagarQual(){
        System.out.println("digite o nome da task");
        tbDeleted = input.next();
        env.deleteTask(tbDeleted);
    } //depois vai ser adaptado para interface com os action listeners e botoes

    //esse de ediçao esta emproduçao

//    private void editarQual(){
//        System.out.println("digite o nome da task para editar ");
//        edited = input.next();
//       //mandar o nome p um metodo que acha o seu objeto equivalente e retorna esse objeto p um outro metodo que faz a ediçao
//
//    } //depois vai ser adaptado para interface com os action listeners e botoes de clique e ver ainda se vou mudar tudo ou n

}
