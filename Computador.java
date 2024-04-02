///Exercício 2. Crie uma classe chamada Computador, que possui 4 atributos, sendo eles a marca, a velocidade, o ano de fabricação e um atributo que indica se o computador é novo.
public class Computador {
    private String marca;
    private double velocidade;
    private int anoFabricacao;
    private boolean novo;
///Exercicio 5. Criar o método construtor para cada uma das classes    
    public Computador(String marca, double velocidade, int anoFabricacao, boolean novo){
        this.marca = marca;
        this.velocidade = velocidade;
        this.anoFabricacao = anoFabricacao;
        this.novo = novo;

    }
    
}
