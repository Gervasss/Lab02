public class Produto {
    String codigo, nome;
    int quantidade;
    double valor, preco, precoFinal;
   

    Produto(){}
    Produto(String codigo, String nome, int quantidade, double valor, double preco){
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
        this.preco = preco;
    }

   private double calcularPreco(){ //preco
        preco = valor * 1.2;

       return preco;

    }
    
    public double calcularVenda() {
        calcularPreco();
        precoFinal = preco * quantidade;
        return precoFinal;
    }
}