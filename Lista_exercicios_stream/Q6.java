package Lista_exercicios_stream;

import java.util.List;

public class Q6 {
  public static void main(String[] args) {
    List<Integer> numeros = List.of(1,4 ,7,5,46, 8);

    int max = numeros.stream().max(Integer::compareTo)
      .get();

    System.out.println(max);
  }
}
