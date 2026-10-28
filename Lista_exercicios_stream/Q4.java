package Lista_exercicios_stream;

import java.util.List;

public class Q4 {
  public static void main(String[] args) {
    List<Integer> numeros = List.of(4,25,32,5,45,13,8,77,58,2,52);

    long quantidadeNumerosMaiores = numeros.stream()
      .filter(n -> n > 10)
      .count();

    System.out.println("Tem: " + quantidadeNumerosMaiores + " números maiores que 10");
  }
}
