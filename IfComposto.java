
import java.util.Scanner;

public class IfComposto {

    public static void main(String[] args) {
        //declaraçao de variáveis
        int idade; // armazena a idade
        Scanner leitor = new Scanner(System.in);
        //entrada de dados
        System.out.println("Entre com a sua idade");
        idade = leitor.nextInt();
        //Decisão
        if (idade >= 18) {
            //comandos se a condição for verdadeira
            System.out.println("Maior de Idade");
        } else {
            //comandos se a condição for falsa
            System.out.println("Menor de Idade");
        } // fim do if
    }//fim do main
}//fim da classe
