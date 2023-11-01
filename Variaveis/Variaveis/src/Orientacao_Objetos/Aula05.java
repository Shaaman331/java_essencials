package Orientacao_Objetos;
public class Aula05 {
    public static void main(String[] args) throws Exception {
        String nomeCompleto; //Declarando a variável
        nomeCompleto = "Uzumaki Naruto"; //Inicializando a variável
        System.out.println(nomeCompleto); //Usando a variável

        String filme = "Vingadores";
        int anoLancamento = 2015;
        int duracao = 120;
        float notaCritica = 8.7f;
        char letraInicial = 'V';
        boolean foiSucesso= true;

        System.out.println(filme);
        System.out.println(anoLancamento);
        System.out.println(duracao);
        System.out.println(notaCritica);
        System.out.println(letraInicial);
        System.out.println(foiSucesso);

       //O filme <filme> lançado em <anos> tem uma duração de <duração> min.
        System.out.println("O filme" + filme + "lançado em " + anoLancamento + "tem uma duração de" + duracao + "minutos.");
        System.out.format("O filme %s lançado em %d tem uma duração de %d minutos \n", filme, anoLancamento, duracao);

        String texto = "O filme" + filme + "lançado em" + anoLancamento + "tem uma duração de" + duracao + "minutos.";
        String texto2 = String.format("O filme %s lançado em %d tem uma duração de %d minutos \n", filme, anoLancamento, duracao);

        System.out.println(texto);
        System.out.println(texto2);

        System.out.println("\n");

        System.out.println("Programa 02");
        String mensagem01 = "Olá, como está ?";
        String mensagem02 = "Espero que esteja bem";
        String mensagem03 = "Beijos até mais :D";

        String mensagemFinal =  String.format("%s %s. %s", mensagem01, mensagem02, mensagem03);
        System.out.println(mensagemFinal);


    }

}
