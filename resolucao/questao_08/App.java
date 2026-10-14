package resolucao.questao_08;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.print("Digite um número inteiro ou 'sair': ");
      String entrada = sc.next();

      if (entrada.equalsIgnoreCase("sair")) {
        break;
      }

      try {
        int numero = Integer.parseInt(entrada);
        System.out.println("Número: " + numero);
      } catch (NumberFormatException e) {
        System.out.println("Erro: digite um número inteiro válido!");
      }
    }
  }
}
