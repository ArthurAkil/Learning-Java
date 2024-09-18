package StaffFlow.classes;

public class Endereco {
    private String casaOuAP;
    private int numero;
    private String rua;
    private String bairro;
    private String cidade;
    private String estadoSigla;

    public Endereco(String casaOuAP,int numero, String rua, String bairro, String cidade, String estadoSigla) {
        this.casaOuAP = casaOuAP;
        this.numero = numero;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estadoSigla = estadoSigla;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstadoSigla() {
        return estadoSigla;
    }

    public void setEstadoSigla(String estadoSigla) {
        this.estadoSigla = estadoSigla;
    }

    public void exibirEndereco() {
        System.out.println("Endereço:");
        System.out.println(casaOuAP + ", " + numero);
        System.out.println("Rua: " + rua);
        System.out.println("Bairro: " + bairro);
        System.out.println("Cidade: " + cidade + " - " + estadoSigla);
    }
}
