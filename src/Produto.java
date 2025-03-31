import java.util.Scanner;

class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.println("Quantidade em estoque: " + quantidade);
    }

    public void vender(int quantidadeVendida) {
        if (quantidadeVendida > quantidade) {
            System.out.println("Estoque insuficiente para realizar a venda.");
        } else {
            quantidade -= quantidadeVendida;
            System.out.println("Venda realizada com sucesso!");
        }
    }
}

