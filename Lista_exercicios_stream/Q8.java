package Lista_exercicios_stream;

import java.util.List;

public class Q8 {
  public static void main(String[] args) {
    List<Pessoa> pessoas = List.of(
      new Pessoa("Kamille", 22),
      new Pessoa("Kayth", 3),
      new Pessoa("Kassia", 12),
      new Pessoa("Lucia", 45)
    );

    pessoas.stream()
      .filter(n -> n.getIdade() >= 18)
      .map(pessoa -> pessoa.getNome())
      .forEach(nome -> System.out.println("Nome >18: " + nome));
  }
}
