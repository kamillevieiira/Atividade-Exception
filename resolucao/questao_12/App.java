package resolucao.questao_12;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o CPF (somente números): ");
    String cpf = sc.nextLine();

    try {
      if (cpf.length() != 11) {
        throw new Exception("CPF deve ter 11 dígitos!");
      }

      for (int i = 0; i < cpf.length(); i++) {
        if (!Character.isDigit(cpf.charAt(i))) {
          throw new Exception("CPF deve conter apenas números!");
        }
      }

      System.out.println("Formato válido!");

    } catch (Exception e) {
      System.out.println("Erro: " + e.getMessage());
    }

    sc.close();
  }
}
