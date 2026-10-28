package Lista_exercicios_stream;

import java.util.List;

public class Q9 {
  public static void main(String[] args) {
    List<Integer> numeros = List.of(-1, 8, -9, 5,4);

    boolean positivos = numeros.stream()
      .allMatch(n -> n>0);

    System.out.println(positivos);
  }
}
