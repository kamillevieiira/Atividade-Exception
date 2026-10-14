package resolucao.questao_01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    try{
      System.out.println("Digite um número inteiro:  ");
      int n1 = sc.nextInt();

      System.out.println("Digite outro número:  ");
      int n2 = sc.nextInt();

      float divisao = n1 / n2;
      System.out.println(divisao);
    } catch (ArithmeticException e){
      System.out.println("Não é permitido divisão por zero.");

    } catch (InputMismatchException e) {
      System.out.println("Digite apenas número inteiro.");
      
    } 
    


  }
}
