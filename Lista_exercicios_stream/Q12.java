package Lista_exercicios_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Q12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Autonomo> autonomos = new ArrayList<>();

    int opcao;

    do {
      System.out.println("\n1 - Cadastrar autonomo");
      System.out.println("2 - Cadastrar servico");
      System.out.println("3 - Consultar servicos por CPF");
      System.out.println("0 - Sair");
      System.out.print("Opcao: ");
      opcao = sc.nextInt();
      sc.nextLine();

      switch (opcao) {
        case 1:
          System.out.print("Nome: ");
          String nome = sc.nextLine();

          System.out.print("CPF: ");
          String cpf = sc.nextLine();

          autonomos.add(new Autonomo(nome, cpf));

          System.out.println("Autonomo cadastrado!");
          break;

        case 2:
          System.out.print("CPF do autonomo: ");
          String cpfServico = sc.nextLine();

          Autonomo encontrado = null;

          for (Autonomo a : autonomos) {
            if (a.getCpf().equals(cpfServico)) {
              encontrado = a;
              break;
            }
          }

          if (encontrado != null) {
            System.out.println("0 - ELETRICO");
            System.out.println("1 - HIDRAULICO");
            System.out.println("2 - ALVENARIA");
            System.out.print("Tipo de servico: ");
            int tipo = sc.nextInt();

            TipoServico tipoServico = TipoServico.values()[tipo];

            System.out.print("Valor: ");
            double valor = sc.nextDouble();
            sc.nextLine();

            Servico servico = new Servico(tipoServico, valor);
            encontrado.adicionarServico(servico);

            System.out.println("Servico cadastrado!");
          } else {
            System.out.println("Autonomo nao encontrado!");
          }
          break;

        case 3:
          System.out.print("CPF para consulta: ");
          String cpfConsulta = sc.nextLine();

          Autonomo consulta = null;

          for (Autonomo a : autonomos) {
            if (a.getCpf().equals(cpfConsulta)) {
              consulta = a;
              break;
            }
          }

          if (consulta != null) {
            System.out.println("Nome: " + consulta.getNome());

            Map<TipoServico, List<Servico>> grupos = consulta.getServicos().stream()
                .collect(Collectors.groupingBy(
                    servico -> servico.getTipoServico()));

            grupos.forEach((tipo, lista) -> {
              System.out.println(tipo + ":");

              lista.forEach(servico -> System.out.println("R$ " + servico.getValor()));
            });

            double total = consulta.getServicos().stream()
                .mapToDouble(servico -> servico.getValor())
                .sum();

            System.out.println("Total: R$ " + total);
          } else {
            System.out.println("Autonomo nao encontrado!");
          }
          break;

        case 0:
          System.out.println("Sistema encerrado.");
          break;

        default:
          System.out.println("Opcao invalida!");
      }

    } while (opcao != 0);

    sc.close();
  }
}
