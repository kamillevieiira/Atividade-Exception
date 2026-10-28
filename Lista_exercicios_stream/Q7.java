package Lista_exercicios_stream;

import java.util.List;

public class Q7 {
  public static void main(String[] args) {
    List<String> palavras = List.of("Kami", "Kayth", "Kassia", "Katia", "Kataline", "Kelly", "Kargian");

    long quantidade = palavras.stream()
      .filter(n -> n.length() > 5)
      .count();

    System.out.println(quantidade);
    
  }
}
