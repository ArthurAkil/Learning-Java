package BasicOutfitShop.class;

public class Cliente {
    public String nome;
    public int cpf;

    public Cliente(String nome,int cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String descricaoCliente(){
        return "Nome: " + nome + ", CPF: " + cpf;
    }
}
