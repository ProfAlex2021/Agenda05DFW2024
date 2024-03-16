import java.util.Scanner;

public class IfAninhado {
    public static void main(String[] args) {
        int idade;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Entre com sua idade");
        idade = leitor.nextInt();
        if (idade >= 18) {
            if (idade == 18) {
                System.out.println("Igual a 18");
            }else{
                System.out.println("Maior de Idade");
            }
        }else{
            System.out.println("Menor de Idade");
        }
    }
}
