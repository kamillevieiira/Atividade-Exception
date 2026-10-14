package resolucao.questao_14;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o telefone (9 dígitos): ");
    String telefone = sc.nextLine();

    try {
      if (telefone.length() != 9) {
        throw new Exception("O telefone deve ter 9 dígitos!");
      }

      for (int i = 0; i < telefone.length(); i++) {
        if (!Character.isDigit(telefone.charAt(i))) {
          throw new Exception("O telefone deve conter apenas dígitos!");
        }
      }

      System.out.println("Telefone válido!");

    } catch (Exception e) {
      System.out.println("Erro: " + e.getMessage());
    }

    sc.close();
  }
}