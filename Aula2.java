import java.util.Scanner;

public class CadastroPessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String repetir;

        do {
            // Captura nome e idade
            System.out.print("Informe o nome: ");
            String nome = sc.nextLine();
            System.out.print("Informe a idade: ");
            int idade = sc.nextInt();
            sc.nextLine(); // Limpar buffer do scanner

            // Exibe os dados
            System.out.println("\nCadastro:");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);

            // Pergunta se deseja repetir o cadastro
            System.out.print("Deseja inserir outro cadastro? (Digite 'S' ou 'N'): ");
            repetir = sc.nextLine();

            if (!repetir.equalsIgnoreCase("S") && !repetir.equalsIgnoreCase("N")) {
                System.out.println("Comando inválido.");
                System.out.print("Deseja repetir? (Digite 'S' ou 'N'): ");
                repetir = sc.nextLine();
            }

        } while (repetir.equalsIgnoreCase("S"));

        System.out.println("Encerrando cadastro.");
        sc.close();
    }
}
/////////////////////////////////////////////////////



import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Informe a matrícula do funcionário: ");
        String matricula = sc.nextLine();
        System.out.print("Informe o nome completo do funcionário: ");
        String nome = sc.nextLine();
        System.out.print("Informe o salário bruto do funcionário: ");
        double salarioBruto = sc.nextDouble();

        // Processamento dos dados
        double descontoINSS = salarioBruto * 0.15; // 15% de desconto
        double salarioLiquido = salarioBruto - descontoINSS;

        // Exibição do contracheque
        System.out.println("\nContracheque:");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome completo: " + nome);
        System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Dedução INSS: R$ %.2f%n", descontoINSS);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);

        sc.close();
    }
}
////////////////////////////////////////////////////



import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double somaNotas = 0;
        int quantidadeNotas = 0;
        String repetir;

        System.out.println("Bem-vindo ao calculador de média do aluno!");

        do {
            // Solicita a inserção da nota
            System.out.print("Insira uma nota do aluno: ");
            double nota = sc.nextDouble();

            // Soma as notas e incrementa a quantidade
            somaNotas += nota;
            quantidadeNotas++;

            // Pergunta se o usuário deseja inserir outra nota
            System.out.print("Deseja inserir outra nota? (Digite 'S' para Sim ou 'N' para Não): ");
            repetir = sc.next();

            // Se a resposta for inválida, solicita novamente
            if (!repetir.equalsIgnoreCase("S") && !repetir.equalsIgnoreCase("N")) {
                System.out.println("Comando inválido.");
                System.out.print("Deseja inserir outra nota? (Digite 'S' para Sim ou 'N' para Não): ");
                repetir = sc.next();
            }

        } while (repetir.equalsIgnoreCase("S"));

        // Calcula a média das notas
        double media = somaNotas / quantidadeNotas;

        // Exibe a média das notas com duas casas decimais
        System.out.printf("Média das notas: %.2f%n", media);
        System.out.println("Obrigado por usar o programa!");

        sc.close();
    }
}
