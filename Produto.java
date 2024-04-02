///Exercício 4. Crie uma classe chamada Produto, que possui um nome, um valor, uma descrição (tipo String) e uma quantidade em estoque.
public class Produto {
    private String nome, descrição;
    private double valor;
    private int quantidadeEstoque;
///Exercicio 5. Criar o método construtor para cada uma das classes
    public Produto(String nome, double valor, int quantidadeEstoque){
        this.nome = nome;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
