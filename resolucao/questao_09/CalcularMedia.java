package resolucao.questao_09;

import java.util.List;

public class CalcularMedia {

  public static double calcularMedia(List<String> numeros) {
    try {
      if (numeros.isEmpty()) {
        throw new Exception("Lista vazia!");
      }

      double soma = 0;

      for (String n : numeros) {
        soma += Double.parseDouble(n);
      }

      return soma / numeros.size();

    } catch (Exception e) {
      System.out.println("Erro: " + e.getMessage());
      return 0;
    }
  }
}
