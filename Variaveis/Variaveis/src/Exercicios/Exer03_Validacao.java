package Exercicios;
import java.util.Scanner;
public class Exer03_Validacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean infoValida = false;
        String nome, sexo, estadoCivil;
        int idade;
        double salario;
        
        do{
            System.out.println("Digite o seu Nome: ");
            nome=sc.nextLine();
            if(nome.length() >= 3){
                infoValida = true;
                }else{
                    System.out.println("Nome precisa no minimo 3 caracteres");
                    }
        }   while(!infoValida);

        infoValida = false;
        do{
            System.out.println("Digite sua idade: ");
            idade=sc.nextInt();
            if(idade >= 0 && idade <= 150){
                infoValida = true;
                }else{
                    System.out.println("Idade precisa ser entre 0 e 150");
                    }
        }   while(!infoValida);

        infoValida = false; 
        do{
            System.out.println("Entre com o salario");
            salario = sc.nextDouble();
            if(salario > 0){
                infoValida = true;
            } else{
                System.out.println("Salário precisa ser maior que zero!");
            }
            }while (!infoValida);

        infoValida = false; 
        do{
            System.out.println("Entre com o sexo");
            sexo = sc.next();
            
            if(sexo.equalsIgnoreCase("f") || 
            sexo.equalsIgnoreCase("m")){
                infoValida = true;
            } else{
                System.out.println("Sexo precisa ser 'f' ou 'm'");
                }
            }while (!infoValida);
            infoValida = false; 
        do{
            System.out.println("Entre com o Estado civil: ");
            
            estadoCivil = sc.next();
            
            if(estadoCivil.equalsIgnoreCase("s") ||
            estadoCivil.equalsIgnoreCase("c") ||
            estadoCivil.equalsIgnoreCase("v") ||
            estadoCivil.equalsIgnoreCase("d")){
                infoValida = true;
        
            } else{
                System.out.println("Estado civil precisa ser 's', 'c', 'v' ou 'd'!");
                }
            }while (!infoValida);        
        //
        System.out.println();
        System.out.println("Imprimindo os dados"); 
        System.out.println("Nome: " + nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Salario: R$" + salario);    
        System.out.println("Sexo: " + sexo);    
        System.out.println("Estado Civil: " + estadoCivil);

        sc.close();
    }   
}
