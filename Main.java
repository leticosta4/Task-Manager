import Interface.FirstMenu;

//import javax.swing.*; //so usar talvez
//EU TO TESTANDO O USO DE GIT

public class Main {
    public static void main(String[] args){
//      lookAndFeel();  //talvez mudar depois o look and feel
        FirstMenu start = new FirstMenu();

        //   start.exibirMenu(); //menu inicial por enquanto que depois vai ser adaptado com a interface


//        observaçoes importantes:

//        CLASSE MENU:
//        o taskAttributes vai ser desmanchado e destrinchado ao longo das interfaces implementado para creation and edition
//        o taskAttributes talvez perca um dos seus parametros (o num que identifica ediçao ou criaçao) - ou isso provavelmente vai ser logo implementado p interface
//        creation appears in the 1st screen and edition as a button on the 2nd screen
//                criar e ditar vai ser o mesmo menu basicamente, mas a pt da ediçao recebe o objeto em si - lembrabdo que a categoria do objeto nao muda de inicio
//        o exibir menu vai ser destrinchado entre o package interface
//        metodo identifyTheTask que e mt importante (serve p excluir, ticar como feita e editar)
//            link com pt do taskAttributes p ediçao
//            tem que ser tirado p outro lugar, mantendo aquela identificaçao por nome da task, comparaçao no if e mandar para o metodo certo


//        CLASSE ENVIRONMENT:
//        ver a questao de ir para o pacote padrao em vez de ser do pacote items
//                o create task ta snedo chamado p a criaçao dos objetos automaticos
//                botoes de listas especificas sao todos ligados a metodos dessa classe
//                o de deletar, editar e ticar como feita estao todos ligados ao identifyTask, ver aina como vou fazer
//                associar coisas de cor aos metodos de itsAdoneTask e runningLate
//
//                POSSIVEL IDEIA: talvez a pergunat to tipo de task deveria ser primeiro, o que poderia ser implmenetado com um JComboBox
//                - vai ser um pouco dificil de fazer o menu de ediçaoe criaçao por causa dessas perguntas


    }
//    public static void lookAndFeel(){
//        try {
//            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) { //verificaçao se o design ta disponivel
//                if ("GTK+".equalsIgnoreCase(info.getName())) {
//                    UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) { //exceçoes que podem dar problema p o look and feel
//            e.printStackTrace();
//        }
//    }

}
