package resolucao.questao_13;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[][] numeros = {
        { 10, 20, 30 },
        { 40, 50, 60 }
    };

    try {
      System.out.print("Digite a linha: ");
      int linha = sc.nextInt();

      System.out.print("Digite a coluna: ");
      int coluna = sc.nextInt();

      System.out.println("Valor: " + numeros[linha][coluna]);

    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Erro: índice inválido ou dimensão inexistente!");
    }

    sc.close();
  }
}