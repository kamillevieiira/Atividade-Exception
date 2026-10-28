package Lista_exercicios_stream;

import java.util.List;

public class Q10 {
  public static void main(String[] args) {
    List<Pedido> pedidos = List.of(
      new Pedido("1", 100.0),
      new Pedido("2", 140.0),
      new Pedido("3", 110.0)
    );

    double total = pedidos.stream()
      .mapToDouble(pedido -> pedido.getValor())
      .sum();

    System.out.println("Total:  " + total);
  }
}
