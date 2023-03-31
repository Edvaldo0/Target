import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        double[] faturamentoDiario = {22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 26742.6612, 0.0, 42889.2258,
                46251.174, 11191.4722, 0.0, 0.0, 3847.4823, 373.7838, 2659.7563, 48924.2448, 18419.2614, 0.0, 0.0,
                35240.1826, 43829.1667, 18235.6852, 4355.0662, 13327.1025, 0.0, 0.0, 25681.8318, 1718.1221, 13220.495,
                8414.61};

        double menorValor = faturamentoDiario[0];
        double maiorValor = faturamentoDiario[0];
        double somaFaturamento = 0.0;
        int diasAcimaMedia = 0;

        for (double faturamento : faturamentoDiario) {
            
            if (faturamento > 0.0) {
            
            if (faturamento < menorValor) {
                menorValor = faturamento;
            }

            if (faturamento > maiorValor) {
                maiorValor = faturamento;
            }

            somaFaturamento += faturamento;
            }
        }

        double mediaMensal = somaFaturamento / faturamentoDiario.length;
        for (double faturamento : faturamentoDiario) {
            if (faturamento > mediaMensal && faturamento > 0) {
                diasAcimaMedia++;
            }
        }

        System.out.println("Menor valor de faturamento diário: R$" + menorValor);
        System.out.println("Maior valor de faturamento diário: R$" + maiorValor);
        System.out.println("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal: "
                + diasAcimaMedia);
    }
}
