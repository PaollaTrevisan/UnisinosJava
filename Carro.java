public class Carro {
    ///atributos
    private String marca ;
    private String modelo;
    private int ano;

    ///construtor
    public Carro (String marca, String modelo, int ano){
        ///usando this para distinguir os parametros dos atributos da classe
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    ///metodo para imprimir 
    public void imprimirDetalhes(){
        System.out.println("marca:  " + marca);
        System.out.println("modelo: " + modelo);
        System.out.println("ano: " + ano);
    }

    /**
     * @param args
     */
    public static void main(String[] args){
        ///Objeto
        Carro carro1 = new Carro( "VW", "Gol", 2015);
        Carro carro2 = new Carro("BMW", "522", 2022);

        carro1.imprimirDetalhes();
        carro2.imprimirDetalhes();
    }
}