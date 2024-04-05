import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        // declaração de variáveis
        double qtd_atual, qtd_max, qtd_min, qtd_media;

        // criação do objeto da classe Scanner
        Scanner scanner = new Scanner(System.in);

        // entradas
        System.out.print("Digite a quantidade atual de produtos no estoque: ");
        qtd_atual = scanner.nextInt();

        System.out.print("Digite a quantidade máxima de produtos no estoque: ");
        qtd_max = scanner.nextInt();

        System.out.print("Digite a quantidade mínima de produtos no estoque: ");
        qtd_min = scanner.nextInt();

        // processamento
        qtd_media = (qtd_max + qtd_min) / 2;

         if (qtd_atual >= qtd_media){
             System.out.println("Não efetuar compra");
         } else {
             System.out.println("Efetuar compra");
         }


    }
}
