import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        // declaração de variáveis
        double val_unit, val_total;
        int  quant_compra;

        // criação do objeto da classe scanner
        Scanner scanner = new Scanner(System.in);

        // entradas
        System.out.print("Digite o valor unitário do produto: ");
        val_unit = scanner.nextDouble();

        System.out.print("Digite a quantidade de produtos a comprar: ");
        quant_compra = scanner.nextInt();

        // processamento

        if (quant_compra <= 12){
            val_total = val_unit * quant_compra;
            System.out.printf("Valor unitário: R$%.2f" +
                    "\nQuantidade: %d" +
                    "\nValor total da compra: R$%.2f", val_unit, quant_compra, val_total);
        } else {
            val_total = (val_unit - ((val_unit * 10) / 100)) * quant_compra;
            System.out.printf("Valor unitário: R$%.2f" +
                    "\nQuantidade: %d" +
                    "\nValor total da compra: R$%.2f", val_unit, quant_compra, val_total);
        }

    }
}
