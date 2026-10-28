package Lista_exercicios_stream;

import java.util.List;

public class Q5 {
  public static void main(String[] args) {
    List<String> nomes = List.of("Pedro", "Ana", "José", "Maria", "Antonia", "Augusto", "Carlos", "Francisco");

    nomes.stream()
      .filter(n -> n.startsWith("A"))
      .map(nome -> nome.toUpperCase())
      .sorted()
      .forEach(nome -> System.out.println(nome));

  }
}
