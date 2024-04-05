import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        // declaração de variáveis
        double valor_compra, representante, impostos, valor_venda;

        // criação do objeto da classe Scanner
        Scanner scanner = new Scanner(System.in);

        // entradas
        System.out.print("Digite o valor de compra da mercadoria: ");
        valor_compra = scanner.nextDouble();

        // processamento
        representante = (valor_compra * 20) / 100;
        impostos = (valor_compra * 30) / 100;
        valor_venda = valor_compra + representante + impostos;

        // saída
        System.out.printf("Valor de venda: R$%.2f" +
                "\nRepresentante: R$%.2f" +
                "\nImpostos: R$%.2f", valor_venda, representante, impostos);


    }
}
