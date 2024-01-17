package Interface;
import items.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent; //entender melhor depois

public class ListingMenu extends JFrame implements ActionListener{
    private Environment env = new Environment();
    private int listId;
    private JPanel listingScreen;
    private JComboBox <String> taskTypes; //para a busca
    private JList <String> generalTasksList; //eu deveria criar as outras 2 p os outros tipos tbm?
    private JScrollPane listPanel;
    private JScrollPane infoPanel;
    private JLabel info;
    private JLabel searchMessage;
    private JTextField searching;
    private JScrollPane listingPanel;
    private JButton deleteButton;
    private JButton editButton;
    private JButton goBackButton;
    private JButton doneButton;
    private JList generalList;


    public ListingMenu(Environment environment, int whichList){ //1 p geral, 2 p done e 3 p pastDue
        this.env = environment;
        this.listId = whichList;
        initializingTheComponents();
        //colocar depois aqui o metodo que adiciona c=os ocmponentes
    } //talvez depois precise de um outro construtor por causa dos diferentes modelos de lista

    public void initializingTheComponents(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //o padrao p fechar a janela
        this.setVisible(true);
        this.setContentPane(listingScreen);
        this.listingScreen.setSize(800,800);
        this.setLocationRelativeTo(null);
        opButtons();
    }

    public void opButtons(){
        deleteButton.addActionListener(this);
        editButton.addActionListener(this);
        doneButton.addActionListener(this);
        goBackButton.addActionListener(this);
        this.pack();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //colocar depois as açoes de acordo com o que vai ocorrer
        if(e.getSource() == goBackButton){
            dispose();
        } else if (e.getSource() == searching){
            //criar algum metodo de especificar as opçoes que devem aparecer p a lista
        } else if (e.getSource() == taskTypes) {
            //pensar ainda na logica p o comboBox
        } else if (e.getSource() == deleteButton) {
            JOptionPane.showMessageDialog(deleteButton, "Task deleted");
            //pensar na logica
        } else if (e.getSource() == editButton) {
            //boa sorte com a manipulaçao da mesma classe de criaçao
        } else if (e.getSource() == doneButton) {
            JOptionPane.showMessageDialog(doneButton, "This task is now done! Congrats");
            //pensar na logica geral de chamar o metodo la e deixar a task em si como verde
        }

    }

}
