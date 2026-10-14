package resolucao.questao_04;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um texto:  ");
    String texto = sc.nextLine();
    
    if (texto.isEmpty()) {
      texto = null;
    }
    try {
      int tamanho = texto.length();
      System.out.println("Tamanho: " + tamanho);
    } catch (NullPointerException e) {
      System.out.println("Erro: A string é null!");
    }
  }
}
