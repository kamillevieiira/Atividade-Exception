package resolucao.questao_07;

public class App {
  public static void main(String[] args) {
    String[] valores = { "10.5", "20.3", "abc", "15.7" };

    for (int i = 0; i < valores.length; i++) {
      try {
        double numero = Double.parseDouble(valores[i]);
        System.out.println(numero);
      } catch (NumberFormatException e) {
        System.out.println("Erro: valor inválido " + valores[i]);
      }
    }
  }
}
