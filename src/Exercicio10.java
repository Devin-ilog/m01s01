import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        // perguntando a idade
        System.out.print("Qual seu ano de nascimento? ");
        // caputando a resposta
        Scanner scanner = new Scanner(System.in);
        int anoDeNascimento = scanner.nextInt();
        // criar data atual para fazer a conta
        LocalDate hoje = LocalDate.now();
        int anoAtual = hoje.getYear();  // extrai o ano
        int idadeCalculada = anoAtual - anoDeNascimento;
        // imprimindo resultado na tela
        System.out.println("\u001B[33m A idade calculada é: \u001B[0m" + idadeCalculada);

    }

}
