package Orientacao_Objetos;

public class Aula10_Curtocircuito {
        // Curto-Circuito (AND, OR)
    public static void main(String[] args) {
        boolean verdadeiro = true;
        boolean falso = false;  
        boolean resultado1 = false & 
        verdadeiro;  // AND - retorna o valor do operando da esquerda se ele for FALSE e o operador da
        boolean resultado2 = falso && 
        verdadeiro;     // direita é TRUE. Se os dois valores forem TRUE, o resultado será TRUE.
        
        System.out.println("Resultado 1: " +resultado1);
        System.out.println("Resultado 2: " +resultado2);
        
        int resultado = 1 + 1 - 1 + 1 * 1 / 1;
        System.out.println("Resultado: "+resultado);
        
    }
}
    

