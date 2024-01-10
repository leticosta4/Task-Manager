import items.*;

public class Main {
    public static void main(String[] args){
        Menu start = new Menu();
        Ambiente here = new Ambiente(); //  TESTE COM OBJETOS

        Academical t01 = new Academical("Documentacao ED1", "17/01/24", "Academical", 1, "To be done", "ED1", "documentation");
        Work t02 = new Work("Clean my room", "03/01/24", "Work", 2, "Done", 1);
        Finance t03 = new Finance("Investimentos", "30/05/23", "Finance", 3, "Past due", 0, "None", "Mine");
        Leisure t04 = new Leisure("Beach day", "06/01/24", "Leisure", 2, "To be done", "Guarajuba", 5, "Family");

        here.addingTaskList(t01);
        here.addingTaskList(t02);
        here.addingTaskList(t03);
        here.addingTaskList(t04);

        start.exibirMenu(); //menu inicial por enquanto que depois vai ser adaptado com a interface


//        System.out.println("Testando so");
//        System.out.println(t01.toString());
//        System.out.println(t02.toString());
//        System.out.println(t03.toString());
//        System.out.println(t04.toString());




    }
}
