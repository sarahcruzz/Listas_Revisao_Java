import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        // declaração de variáveis
        int idade;
        
        // criação do objeto da classe scanner
        Scanner scanner = new Scanner(System.in);
        
        // entradas
        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();
        
        // processamento e saída
        
        if (idade <= 14){
            System.out.print("Classificação: Criança");
        } else if (idade >= 15 && idade <= 17) {
            System.out.print("Classificação: Adolescente");            
        } else if (idade >= 18 && idade <= 30) {
            System.out.print("Classificação: Adulto jovem");
        } else if (idade >= 30) {
            System.out.print("Classificação: Adulto");
        }

    }
}