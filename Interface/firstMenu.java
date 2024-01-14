package Interface;

import items.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class firstMenu extends JFrame implements ActionListener{
    private JLabel title;
    private JLabel message;
    private JButton exitButton;
    //linkar essas listas abaixo comm seus respectivos arrayslists

    private Environment there = new Environment();
    private JPanel firstScreen;
    private JButton pastDueTasksButton;
    private JButton generalListExibiton;
    private JButton doneTasksButton;
    private JButton addTaskButton;

    //construtor com os objetos para inicializaçao
    public firstMenu(){
        //eu n to bem criando um objeto aqui
        this.there.createTask("le le", "2024/02/01", "Academical", 1, "To be done", "OOP", "Programming project", 0, 0.0, null, null, null, 0, null);
        this.there.createTask("bbb", "2024/01/10", "Work", 2, "To  be done", null, null, 2, 0.0, null, null, null, 0, null);
        this.there.createTask("ccc", "2024/04/30", "Finance", 2, "To be done", null, null, 0, 0.0, "None", "Mine", null, 0, null);
        this.there.createTask("ddd", "2024/01/31", "Leisure", 3, "To be done", null, null, 0, 0.0, null, null, "-", 72, "-");

        initializingTheComponents();
        //chamar a inicialiçao dos componenetes graficos visuais e dentro desse colocar a chamada dos botoes - inicio da logica do programa

    }

    public void initializingTheComponents(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //o padrao p fechar a janela
        this.setVisible(true);
        this.setContentPane(firstScreen);
        this.setLocationRelativeTo(null);

        //configurando os JLabels:
        this.title.setFont((new Font("Deja Vu Serif", Font.BOLD, 26)));
        this.title.setBackground(Color.BLUE);
        this.message.setFont((new Font("Bitstream Charter", Font.ITALIC, 14)));

//        //adicionando algumas coisas no painel: - talvezz isso seja denecessario
//        this.firstScreen.add(title);
//        this.firstScreen.add(message);
//        this.firstScreen.add(generalListExibiton);
//        this.firstScreen.add(doneTasksButton);
//        this.firstScreen.add(pastDueTasksButton);
//        this.firstScreen.add(exitButton);

        //finalizando:
        buttons();
    }
    public void buttons(){
        generalListExibiton.addActionListener(this);
        doneTasksButton.addActionListener(this);
        pastDueTasksButton.addActionListener(this);
        addTaskButton.addActionListener(this);
        exitButton.addActionListener(this);
        this.pack();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //setando o que vai ocorrer quando botoes especificos forem apertados

//        lista geral
//        lista de feitos
//        lista de atrasados
//        criar nova
//        sair

    }
}
