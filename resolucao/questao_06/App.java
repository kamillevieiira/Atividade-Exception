package resolucao.questao_06;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
    double n1 = sc.nextDouble();

    System.out.print("Digite o segundo número: ");
    double n2 = sc.nextDouble();

    System.out.print("Digite a operação (+, -, *, /): ");
    String op = sc.next();

    try {
      switch (op) {
        case "+":
          System.out.println(n1 + n2);
          break;
        case "-":
          System.out.println(n1 - n2);
          break;
        case "*":
          System.out.println(n1 * n2);
          break;
        case "/":
          System.out.println(n1 / n2);
          break;
        default:
          throw new Exception("Operação inválida!");
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    sc.close();
  }

}
