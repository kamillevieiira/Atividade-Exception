package resolucao.questao_11;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> nomes = new ArrayList<>();

    int opcao;

    do {
      System.out.println("\n1 - Adicionar nome");
      System.out.println("2 - Remover nome");
      System.out.println("3 - Acessar nome");
      System.out.println("4 - Sair");
      System.out.print("Escolha: ");
      opcao = sc.nextInt();
      sc.nextLine();

      try {
        switch (opcao) {
          case 1:
            System.out.print("Digite o nome: ");
            nomes.add(sc.nextLine());
            break;

          case 2:
            System.out.print("Digite o índice para remover: ");
            int remover = sc.nextInt();
            nomes.remove(remover);
            break;

          case 3:
            System.out.print("Digite o índice para acessar: ");
            int acessar = sc.nextInt();
            System.out.println(nomes.get(acessar));
            break;

          case 4:
            System.out.println("Programa encerrado!");
            break;

          default:
            System.out.println("Opção inválida!");
        }
      } catch (IndexOutOfBoundsException e) {
        System.out.println("Erro: índice inválido!");
      }
    } while (opcao != 4);

    sc.close();
  }
}
