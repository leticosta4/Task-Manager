import items.*;

public class Main {
    public static void main(String[] args){
        Menu start = new Menu();

        start.env.createTask("le le", "2024/02/01", "Academical", 1, "To be done", "OOP", "Programming project", 0, 0.0, null, null, null, 0, null);
        start.env.createTask("bbb", "2024/01/10", "Work", 2, "To  be done", null, null, 2, 0.0, null, null, null, 0, null);
        start.env.createTask("ccc", "2024/04/30", "Finance", 2, "To be done", null, null, 0, 0.0, "None", "Mine", null, 0, null);
        start.env.createTask("ddd", "2024/01/31", "Leisure", 3, "To be done", null, null, 0, 0.0, null, null, "-", 72, "-");

        start.exibirMenu(); //menu inicial por enquanto que depois vai ser adaptado com a interface

        //tentar depois tirar o replaceAll
    }
}
