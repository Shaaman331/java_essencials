import java.util.Scanner;
 //importa a clase Scanner

public class Aula06_Scanner {
    
    public static void main(String[] args) throws Exception {
        String jogo;
        //Scaner -> classe
        Scanner leitor = new Scanner(System.in);
        //Configurando (separadores é :OU \r ou \n)
        leitor.useDelimiter("[\r\n]");
        
        System.out.println("Qual seu jogo favorito ? ");
          
        jogo = leitor.next();
        System.out.println("O jogo é " + jogo);

    }



}
