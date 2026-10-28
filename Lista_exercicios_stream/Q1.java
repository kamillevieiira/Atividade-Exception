package Lista_exercicios_stream;

import java.util.ArrayList;
import java.util.List;

public class Q1 {
  public static void main(String[] args) {
    List<Integer> numeros = List.of(4,25,32,78,45,13,10,77,58,61,52);

    List<Integer> pares = numeros.stream()
      .filter(n -> n % 2 == 0)
      .toList();

    System.out.println(pares);
  }
}
