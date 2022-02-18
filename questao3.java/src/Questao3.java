import static java.lang.System.out;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
        Aluno aluno = new Aluno();
        
        System.out.println("Digite a os dados do aluno\n\nMatrícula: ");
        aluno.matricula = teclado.next();

        System.out.println("\n\nNome: ");
        aluno.nome = teclado.next();

        System.out.println("\n\nNota da 1ª prova: ");
        aluno.nota1 = teclado.nextDouble();

        System.out.println("\n\nNota da 2ª prova: ");
        aluno.nota2 = teclado.nextDouble();

        System.out.println("\n\nNota do trabalho: ");
        aluno.notat = teclado.nextDouble();

        
        out.println("\nmedia: " + aluno.calcularMedia() + "\n\nMedia Final: " + aluno.medFinal());
    }
}

