package Orientacao_Objetos;

import java.util.Scanner;
 //importa a clase Scanner

public class Aula04_Scanner {
    
    public static void main(String[] args) throws Exception {
        //String jogo;
        //Scaner -> classe
        Scanner leitor = new Scanner(System.in);
        //Configurando (separadores é :OU \r ou \n)
        /*leitor.useDelimiter("[\r\n]");
        
        System.out.println("Qual seu jogo favorito ? ");
          
        jogo = leitor.next();
        System.out.println("O jogo é " + jogo);/* */

        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = leitor.nextLine();    
        System.out.println("Seu nome completo é: "+nomeCompleto);
        
        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = leitor.next();
        System.out.println("Seu primeiro nome é: "+primeiroNome);   

        System.out.println("Ditite sua idade: ");
        int idade = leitor.nextInt();   
        System.out.println("Sua idade eh: "+idade); 

        System.out.println("Digite sua altura: "); 
        double altura = leitor.nextDouble();    
        System.out.println("Sua altura é: "+altura); 
        
        System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura, tem pet: ");
        String primeiroNome2 = leitor.next();
        int idade2 = leitor.nextInt();
        int qtdFilho = leitor.nextByte();
        double altura2 = leitor.nextFloat();
        boolean temPet = leitor.hasNextBoolean();

        System.out.println("Você digitou os seguintes valores: ");
        System.out.println("Primeiro Nome: "+primeiroNome2);
        System.out.println("Idade: "+idade2);   
        System.out.println("Quantidade de Filhos: "+qtdFilho);  
        System.out.println("Altura do Pet: "+altura2);    
        System.out.println("Nome do Pet: " + temPet);    



    }



}
