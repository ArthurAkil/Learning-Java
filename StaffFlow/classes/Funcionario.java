package StaffFlow.classes;

public class Funcionario extends Dados {
    private Salario salario;
    private Endereco endereco;

    public Funcionario(String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
        this.salario = new Salario();
    }

    public Salario getSalario() {
        return this.salario;
    }

    public Endereco getEndereco(){
        return this.endereco;
    }
    public Endereco setEndereco(Endereco enderecoNovo){
        return this.endereco = enderecoNovo;
    }

    public void infoFuncionario() {
        super.exibirDados();
    }
}
