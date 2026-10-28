package Lista_exercicios_stream;

import java.util.Comparator;
import java.util.List;


public class Q11 {
  public static void main(String[] args) {
    List<String> lista = List.of("Kamille", "K", "Kayth", "Lara", "Clarao");

    lista.stream()
      .sorted(Comparator.comparingInt(palavra -> palavra.length()))
      .forEach(System.out::println);


    
  }
}
