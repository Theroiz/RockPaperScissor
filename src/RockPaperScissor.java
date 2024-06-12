import javax.swing.JOptionPane;
import java.util.Random;
public class RockPaperScissor {

    public static void main(String[] args) {
        Random rNumber = new Random();
        String opcaoJogador = JOptionPane.showInputDialog("Escolha um!","pedra   papel  tesoura");
        System.out.println(opcaoJogador);
        int numeroGerado = rNumber.nextInt(0,2);
        int opcaoJogadorInt = 0;
        boolean erro = true;
        if(opcaoJogador.equals("pedra"))
            {
                opcaoJogadorInt = 0;
                erro = false;
            }else if(opcaoJogador.equals("papel"))
            {
                opcaoJogadorInt = 1;
                erro = false;
            }else if(opcaoJogador.equals("tesoura"))
            {
            opcaoJogadorInt = 2;
            erro = false;
            }else
            {
                System.out.println("Insira uma opcao valida!");
        
        System.out.println(opcaoJogadorInt);

    }
}
