import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String produto = "Teclado Mecânico";
        int quantidade = 50;

       Scanner reader = new Scanner(System.in);
        System.out.println("""
                Consultar quantidade em estoque.
                Adicionar produtos ao estoque.
                Retirar produtos do estoque.
                Alterar nome do produto.
                Sair.
                """);
        String input = "";
        while(!Objects.equals(input, "sair")) {
            input = reader.nextLine();
            if (Objects.equals(input, "consultar")) {
                System.out.printf("""
                Produto: %s
                Quantidade: %d
                """, produto, quantidade);
            } else if (input.equals("adicionar")) {
                System.out.print("Quantidade a adicionar: ");
                quantidade += reader.nextInt();
            } else if(input.equals("retirar")) {
                System.out.print("Quantidade a retirar: ");
                quantidade -= reader.nextInt();
            } else if(input.equals("alterar")) {
                System.out.print("Novo nome do produto: ");
                produto = reader.nextLine();;
            }
        }
    }
}
