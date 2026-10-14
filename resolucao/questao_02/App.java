package resolucao.questao_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um número:  ");
    String n1 = sc.next();
    try{
      int convertido = Integer.parseInt(n1);
      System.out.println("Número:  " + convertido);
    } catch (NumberFormatException e) {
      System.out.println("Inválido.");
      
    } 
  }
}
