import items.*;

public class Main {
    public static void main(String[] args){
        Menu start = new Menu();

        start.env.createTask("Java project", "2024/02/01", "Academical", 1, "To be done", "OOP", "Programming project", 0, 0.0, null, null, null, 0, null);
        start.env.createTask("Clean my room", "2024/01/10", "Work", 2, "To  be done", null, null, 2, 0.0, null, null, null, 0, null);
        start.env.createTask("Get the credit card", "2024/04/30", "Finance", 2, "To be done", null, null, 0, 0.0, "None", "Mine", null, 0, null);
        start.env.createTask("Read 'Torto Arado'", "2024/01/31", "Leisure", 3, "To be done", null, null, 0, 0.0, null, null, "-", 72, "-");

        start.exibirMenu(); //menu inicial por enquanto que depois vai ser adaptado com a interface

        //problemas noidentify task depois que da o input do nome da task
        //nao ta falando se a lista de tasks feitas e atrasadas ta vazia, mesmo quando ta
        //ta com algum problema no running late ue??????

    }
}
