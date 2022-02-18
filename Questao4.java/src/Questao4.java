import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        Produto produto = new Produto();
        
        System.out.println("Digite a os dados do produto\n\nCódigo: ");
        produto.codigo = teclado.next();

        System.out.println("\n\nNome: ");
        produto.nome = teclado.next();

        System.out.println("\n\nQuantidade: ");
        produto.quantidade = teclado.nextInt();
        
        System.out.println("\n\nPreço: ");
        produto.valor = teclado.nextDouble();

        
        System.out.println("\nValor da venda: " + produto.calcularVenda());
    }
}
