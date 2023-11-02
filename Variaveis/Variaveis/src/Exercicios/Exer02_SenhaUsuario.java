package Exercicios;
import java.util.Scanner;
public class Exer02_SenhaUsuario{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean InfoValidas = false;
        String userName;
        String password;
        do {
            System.out.println("Entre com o nome do usuario: ");
                userName = sc.next();
            System.out.println("Digite a senha do usuario: ");
                password = sc.next();
            if (userName.equalsIgnoreCase(password)){
                //infoValidas = false;
                System.out.println("Senha igual a usuário, digite novamente.");
                } else {
                    InfoValidas = true;
                    System.out.println("Senha e usuarios válidos ");
                    }   
                    } while (!InfoValidas);
                    }}  

        