package atividade;
import java.util.ArrayList;
import java.util.Scanner;

class Produto {
    private String codigoDeBarras;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String codigoDeBarras, String nome, double preco, int quantidade) {
        this.codigoDeBarras = codigoDeBarras;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Código de Barras: " + codigoDeBarras + ", Nome: " + nome + ", Preço: R$" + preco + ", Quantidade: " + quantidade;
    }
}

public class CadastroProdutos {
    private static ArrayList<Produto> produtos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void cadastrarProduto() {
        System.out.print("Digite o código de barras: ");
        String codigo = scanner.nextLine();

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o preço: ");
        double preco = scanner.nextDouble();

        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); 

        Produto produto = new Produto(codigo, nome, preco, quantidade);
        produtos.add(produto);

        System.out.println("Produto cadastrado com sucesso!");
    }

    private static void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            System.out.println("\nLista de Produtos:");
            for (Produto p : produtos) {
                System.out.println(p);
            }
        }
    }
}