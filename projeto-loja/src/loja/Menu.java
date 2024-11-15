package loja;

import loja.controller.LojaController;
import loja.model.ProdutoFisico;
import loja.util.MenuSelecao;
import loja.util.MenuServicos;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        MenuSelecao menu = new MenuSelecao();
        MenuServicos servico = new MenuServicos();
        Scanner scanner = new Scanner(System.in);

        int seletor;

        while (true) {
            menu.menu();

            seletor = scanner.nextInt();

            switch (seletor) {
                case 1:
                    servico.cadastrarProduto();

                    keyPress();
                    break;
                case 2:
                    servico.listar();

                    keyPress();
                    break;
                case 3:
                    servico.buscarProduto();

                    keyPress();
                    break;
                case 4:
                    servico.atualizarDados();

                    keyPress();
                    break;

                case 5:
                   servico.apagarProduto();

                case 7:
                    System.out.println("Programa finalizado!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida!\n Tente novamente!");

            }

        }

    }

    public static void keyPress() {

        try {

            System.out.println("\nPressione Enter para Continuar...");
            System.in.read();

        } catch (IOException e) {

            System.out.println("Você pressionou uma tecla diferente de enter!");

        }
    }
}