package Lista_exercicios_stream;

import java.util.List;

public class Q3 {
  public static void main(String[] args) {
    List<Integer> numeros = List.of(1, 2, 3, 4, 5);

    List<Integer> resultado = numeros.stream()
        .map(n -> n *10)
        .toList();

    System.out.println(resultado);
  }
}
