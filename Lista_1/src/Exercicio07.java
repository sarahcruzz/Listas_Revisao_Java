import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        // declaração de variáveis
        double salario = 1500, comissao = 350, porc_valor = 0.001, salario_final, valor_total_vendas;
        int num_carros;
        String nome_vendedor, mes;

        // criação do objeto da clsse Scanner
        Scanner scanner = new Scanner(System.in);

        // entradas
        System.out.print("Digite o nome do vendedor: ");
        nome_vendedor = scanner.next();

        System.out.print("Digite o mês da venda: ");
        mes = scanner.next();

        System.out.print("Digite a quantidade carros vendidos: ");
        num_carros = scanner.nextInt();

        System.out.print("Digite o valor total das vendas: ");
        valor_total_vendas = scanner.nextDouble();

        // processamento
        salario_final = salario + (num_carros * comissao) + ((valor_total_vendas * porc_valor) / 100);

        // saída
        System.out.printf("Vendedor: %s" +
                "\nMês da venda: %s" +
                "\nQuantidade de carros vendidos: %d" +
                "\nValor total das vendas: %.2f" +
                "\nSalário: R$%.2f", nome_vendedor, mes, num_carros, valor_total_vendas, salario_final);


    }
}
