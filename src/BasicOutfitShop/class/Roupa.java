package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.classes;

public class Roupa {
    public String tipo;
    public String cor;
    public String marca;
    public double preco;

    public Roupa(String tipo, String cor, String marca, double preco){
        this.tipo = tipo;
        this.cor = cor;
        this.marca = marca;
        this.preco = preco;
    }

    public String descricaoRoupa(){
        return "Tipo: "+tipo+", Cor: "+cor+", Marca: "+marca+", Preço: "+preco;
    }
}
