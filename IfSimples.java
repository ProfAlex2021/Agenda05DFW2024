
import java.util.Scanner;

public class IfSimples {

    public static void main(String[] args) {
        int idade;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Entre com sua idade");
        idade = leitor.nextInt();
        if (idade >= 18) {
            System.out.println("Maior de Idade");
        }
    }
}
