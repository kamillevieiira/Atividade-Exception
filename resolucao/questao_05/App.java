package resolucao.questao_05;

public class App {
  public static void main(String[] args) {

    String[] nomes = { "kamille", null, "java", "programacao" };

    for (int i = 0; i < nomes.length; i++) {
      try {
        nomes[i] = nomes[i].toUpperCase();
      } catch (NullPointerException e) {
        System.out.println("Erro: elemento nulo encontrado!");
      }
    }

    for (int i = 0; i < nomes.length; i++) {
      System.out.println(nomes[i]);
    }
  }
}
