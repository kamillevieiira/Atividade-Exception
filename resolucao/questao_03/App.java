package resolucao.questao_03;

public class App {
  public static void main(String[] args) {
    String[] elementos = {"Kamille", "Vieira", "da", "Silva"};

    try{
     System.out.println(elementos[5]);  
    } catch (ArrayIndexOutOfBoundsException e){
      System.out.println("Posição inválida");
    }
   
  }
}
