package Exercicios;
import java.util.Scanner;
public class Exer01_Contador{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        boolean notaValida = false;
        System.out.println("Entre com uma nota: ");
        double nota = sc.nextDouble();
        if (nota >=0 && nota <=10){
                        notaValida=true;
                        System.out.println("Você digitou: " + nota);
            }else {
                System.out.println("Nota inválida, tente novamente.");
                }
                while (!notaValida);
            }
            
        }

      