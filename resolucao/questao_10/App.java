package resolucao.questao_10;

import java.util.Scanner;
import java.text.SimpleDateFormat;

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    formato.setLenient(false);

    System.out.print("Digite uma data (dd/MM/yyyy): ");
    String data = sc.nextLine();

    try {
      formato.parse(data);
      System.out.println("Data válida!");
    } catch (Exception e) {
      System.out.println("Data inválida!");
    }

    sc.close();
  }
}