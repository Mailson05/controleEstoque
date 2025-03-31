import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Quantidade inicial em estoque: ");
        int quantidade = scanner.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);

        System.out.println("\nInformações do produto antes da venda:");
        produto.exibirInformacoes();

        System.out.print("\nQuantidade vendida: ");
        int quantidadeVendida = scanner.nextInt();
        produto.vender(quantidadeVendida);

        System.out.println("\nInformações do produto após a venda");
        produto.exibirInformacoes();

        scanner.close();
    }
}