package loja.util;

import loja.controller.LojaController;
import loja.model.ProdutoFisico;

import java.util.Scanner;

public class MenuServicos {
    LojaController produto = new LojaController();

    Scanner scanner = new Scanner(System.in);

    public void cadastrarProduto(){
        System.out.println("Cadastrar produto: ");
        System.out.println("Digite o nome id do produto : ");
        int id = scanner.nextInt();
        System.out.println("Digite o nome do produto:");
        String nome_produto = scanner.next();
        System.out.println("Digite o valor do produto: ");
        float preco = scanner.nextFloat();
        System.out.println("Digite o a quantidade: ");
        int qtd = scanner.nextInt();

        produto.cadastrar(new ProdutoFisico(id,qtd,nome_produto,preco));

    }

    public void listar(){
        System.out.println("Listar produtos:");
        produto.listarTodas();
    }

    public void buscarProduto(){
        System.out.println("Buscar produto");
        System.out.println("Digite o número do produto: ");
        int id = scanner.nextInt();

        produto.pesquisarPorId(id);
    }

    public void atualizarDados(){
        System.out.println("Atualizar dados dos produtos");
        System.out.println("Digite o código do produto:");
        int id = scanner.nextInt();

        var buscaProduto = produto.buscarNaCollection(id);

        if (buscaProduto != null) {
            System.out.println("O que você deseja atualizar?\n" +
                    "1- Nome do produto\n" +
                    "2- Valor\n" +
                    "3- Quantidade");
            int seletor = scanner.nextInt();

            switch (seletor) {
                case 1:
                    System.out.println("Digite o nome do produto:");
                    String nome_produto = scanner.next();

                    System.out.println("Nome atualizado com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o valor do produto:");
                    float preco = scanner.nextFloat();

                    System.out.println("Valor atualizado com sucesso!");
                    break;
                case 3:
                    System.out.println("Digite a quantidade: ");
                    int qtd = scanner.nextInt();

                    System.out.println("Quantidade atualizada com sucesso!");
                    break;
                default:
                    System.out.println("Opção inválidade!");
            }
        }else
            System.out.println("Produto não encontrado!");
    }

    public void apagarProduto(){
        System.out.println("Apagar produto");
        System.out.println("Digite o código do produto: ");
        int id = scanner.nextInt();

        produto.deletar(id);
    }
}
