package Lista_exercicios_stream;

import java.util.List;
import java.util.stream.Collector;

public class Q2 {
  public static void main(String[] args) {
    List<String> nomes = List.of("Kamille", "Nicole", "Clara", "Matheus", "Lara");

    List<String> maiusculas = nomes.stream()
      .map(n -> n.toUpperCase())
      .toList();

    System.out.println(maiusculas);
  }
}
