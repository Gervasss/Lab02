import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner teclado = new Scanner(System.in);
        int op;
        
        System.out.println("Escolha: (1) Celular  (2) Livro\n");
        op = teclado.nextInt();
        
        Celular celular = new Celular();
        Livro livro = new Livro();
        
        if(op == 1) { 
            System.out.println("Marca do celular: \n");
            celular.marca = teclado.nextLine();
           
            System.out.println("Nº de cameras: ");
            celular.numCamera = teclado.nextInt();
           
            System.out.println("Cor: ");
            celular.cor = teclado.next();
           
            System.out.println("Modelo: ");
            celular.modelo = teclado.next();
           
            System.out.println("\nMarca: " + celular.marca + "\n\nCameras: " + celular.numCamera + "\n\nCor: " + celular.cor + "\n\nModelo: " + celular.modelo);
        }

        if(op == 2) {  
            System.out.println("Gênero do livro: \n");
            livro.genero = teclado.next();
            
            System.out.println("Tipo de Capa: ");
            livro.capa = teclado.next();
            
            System.out.println("Nome da Editora: ");
            livro.editora = teclado.next();
            
            System.out.println("Nome do Autor: ");
            livro.autor = teclado.next();
           
            System.out.println("\nGênero do livro: " + livro.genero + "\n\nTipo de Capa: " + livro.capa +"\n\nNome da Editora: " +  livro.editora +"\n\nNome do Autor:" + livro.autor);
        }
    }
}