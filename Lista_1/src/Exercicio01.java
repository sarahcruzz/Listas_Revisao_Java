import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        // declaração de variáveis
        String nome, sobrenome, cnh, cargo_pretendido, data_nasc, grau_ins = "";
        int mes_nasc, ano_nasc, escolha;
        double pretensao_sal;

        // objeto da classe scanner
        Scanner scanner = new Scanner(System.in);

        // entradas
        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Digite seu sobrenome: ");
        sobrenome = scanner.nextLine();

        System.out.print("Digite a data de seu nascimento (DD/MM/AAAA): ");
        data_nasc = scanner.nextLine();

        System.out.print("Digite o cargo pretendido: ");
        cargo_pretendido = scanner.nextLine();

        System.out.print("Possui CNH do tipo B (sim/não): ");
        cnh = scanner.nextLine();

        System.out.print("Digite sua pretensão salarial: ");
        pretensao_sal = scanner.nextDouble();

        System.out.print("Digite seu grau de instrução" +
                "\n1 - ensino médio" +
                "\n2 - ensino técnico" +
                "\n3 - ensino superior" +
                "\nR: ");
        escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                grau_ins = "ensino médio";
                break;
            case 2:
                grau_ins = "ensino técnico";
                break;
            case 3:
                grau_ins = "ensino superior";
                break;
            default:
                System.out.println("Você digitou uma opção inválida, tente novamente.");
                break;
        }

        // saídas
        System.out.println("\nSeu cadastro foi confirmado com sucesso!");
        System.out.printf("Nome do candidato: %s %s" +
                "\nData de Nascimento: %s" +
                "\nPretensão Salarial: R$%f" +
                "\nGrau de Instrução: %s" +
                "\nCargo Pretendido: %s", nome, sobrenome, data_nasc, pretensao_sal, grau_ins, cargo_pretendido);


    }
}