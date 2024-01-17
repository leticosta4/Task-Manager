package Interface;

import items.*;
import javax.swing.*;
import java.awt.*; //talvwz tirar depois
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class firstMenu extends JFrame implements ActionListener{
    private JLabel title;
    private JLabel message;
    private JButton exitButton;
    private Environment there = new Environment();
    private JPanel firstScreen;
    private JButton pastDueTasksButton;
    private JButton generalListExibitonButton; //pq ta com essa notificaçao oxe
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
        //chamar a inicializaçao dos componenetes graficos visuais e dentro desse colocar a chamada dos botoes - inicio da logica do programa

    }

    public void initializingTheComponents(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //o padrao p fechar a janela
        this.setVisible(true);
        this.setContentPane(firstScreen);
        this.firstScreen.setSize(560,640);
        this.setLocationRelativeTo(null);

        //configurando os JLabels: - provavel que da p tirar pq eu ja mexi pelo .form
//        this.title.setFont((new Font("Deja Vu Serif", Font.BOLD, 26)));
//        this.message.setFont((new Font("Bitstream Charter", Font.ITALIC, 14)));

        buttons();

        this.firstScreen.add(generalListExibitonButton);
        this.firstScreen.add(doneTasksButton);
        this.firstScreen.add(pastDueTasksButton);
        this.firstScreen.add(exitButton);
    }
    public void buttons(){  //adicionando actionListeners p os botoes
        generalListExibitonButton.addActionListener(this);
        doneTasksButton.addActionListener(this);
        pastDueTasksButton.addActionListener(this);
        addTaskButton.addActionListener(this);
        exitButton.addActionListener(this);
        this.pack();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //esses menus especificos vao ter que ter seus construtores com o this.environment e com seus metodos especificos de adicionar os componentes ao painel
        // o listingTasksMenu provavelmente vai ser usado p os 3 tipos de listas, e ai so vou usar um identificador p saber qual ativar na hora


        if(e.getSource() == generalListExibitonButton){
            //chamar o menu de listar geral com uma instancia, e colocar as cores especificas p o status
        } else if (e.getSource() == doneTasksButton) {
            //chamar o menu de listar as tasks feitas
        } else if (e.getSource() == pastDueTasksButton) {
            //chamar o menu de listar as tasks atrasadas
        } else if (e.getSource() == addTaskButton) {
            //chamar o menu de criar tasks
        } else if (e.getSource() == exitButton){
            dispose();
        }
    } //setando o que vai ocorrer quando botoes especificos forem apertados
}
