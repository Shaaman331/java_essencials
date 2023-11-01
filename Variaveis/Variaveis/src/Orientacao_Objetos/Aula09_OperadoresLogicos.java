package Orientacao_Objetos;

public class Aula09_OperadoresLogicos {
    public static void main(String[] args) {
        int valor1 = 1;
        int valor2 = 2;
        boolean resultado1 = (valor1 == 1) && (valor2 == 2);
        System.out.println("Resultado do operador AND: " +resultado1);

        boolean resultado2 = (valor1 ==1) || (valor2 ==2);
        System.out.println("Resultado do operador OR: "+resultado2);

        boolean verdadeiro = true;
        boolean falso = false;  
        System.out.println(verdadeiro && falso);
        System.out.println(verdadeiro || falso);
        System.out.println(verdadeiro ^ falso);
        System.out.println(!verdadeiro && falso);
        

    }
}
