public class Aula07_OperadoresAritimeticos {
    public static void main(String[] args) {
        int  resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1 ;
        System.out.println(resultado);
        
        resultado = resultado * 2;
        System.out.println(resultado);  

        resultado = resultado / 2;
        System.out.println(resultado);  

        resultado = resultado + 8;
        System.out.println(resultado);  

        resultado = resultado % 7;
        System.out.println(resultado);  

        String primeiroNome = "Esta é ";
        String segundoNome = "uma String concatenada";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);

        resultado = resultado + 1;
        System.out.println("O valor de 'resultado' agora é: "+resultado);   

        resultado ++;
        System.out.println("Depois do incremento, o valor de 'resultado' é: "+resultado);   
        //mesma coisa que
        System.out.println(resultado);
        resultado = resultado + 1;
        resultado += 1;
        System.out.println("Depois dos dois incrementos, o valor de 'resultado' é: "+resultado);    

        System.out.println(++resultado);
        //mesma coisa que 
        System.out.println(resultado+=1);

        resultado--;
        System.out.println("Depois da decremento, o valor de 'resultado' é: "+resultado);
        System.out.println(resultado --);
        //mesma coisa que   
        System.out.println(--resultado);

    }
}
