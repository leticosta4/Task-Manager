package Interface;

//import items.*
import com.sun.source.tree.LambdaExpressionTree;
import items.Ambiente;

import javax.swing.*;
import java.awt.*; //talvez depois usar o color p um dos menus - provavelmente o de listar
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class firstMenu extends JFrame implements ActionListener{
    private JLabel title;
    private JLabel message;
    private JPanel firstScreen;
    private JButton exitButton;
    //linkar essas listas abaixo comm seus respectivos arrayslists
    private JButton generalListButton;
    private JButton doneListButton;
    private JButton pastDueListButton;

    private Ambiente there = new Ambiente();

    //ver depois pq que esse create tassk ta dando erro assim oxe
//      there.createTask("le le", "2024/02/01", "Academical", 1, "To be done", "OOP", "Programming project", 0, 0.0, null, null, null, 0, null);
//      there.createTask("bbb", "2024/01/10", "Work", 2, "To  be done", null, null, 2, 0.0, null, null, null, 0, null);
//      there.createTask("ccc", "2024/04/30", "Finance", 2, "To be done", null, null, 0, 0.0, "None", "Mine", null, 0, null);
//      there.createTask("ddd", "2024/01/31", "Leisure", 3, "To be done", null, null, 0, 0.0, null, null, "-", 72, "-");

    //adaptar algumas coisas da main aqui
    //criaçao de objetos
    //ainda to vendo se deixar ainda uma boa pt da clase menu ou se vou passar ela p interface
    @Override
    public void actionPerformed(ActionEvent e) {
        //ainda sera implementado de acordo com as açoes que devera ocorrer quando botoes especificos forem criados

    }
}
