package resolucao.questao_09;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<String> numeros = Arrays.asList("10", "20", "30");

        System.out.println("Média: " + CalcularMedia.calcularMedia(numeros));
    }
}