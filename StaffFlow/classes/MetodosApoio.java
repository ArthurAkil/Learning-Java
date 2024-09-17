package StaffFlow.classes;

import java.util.Scanner;

public class MetodosApoio {
    Scanner sc = new Scanner(System.in);

    public int escolhasInicio(){
        System.out.println("[1] - Manegamento de funcionários"+"\""+"[2] - Futuramente Gerência"+"\""+"[3] - Sair");
        int a = sc.nextInt();
        sc.nextLine();
        return a;
    }

    public int manegamentoFuncionario(){
        System.out.println("Bem vindo ao Manegamento de funcionários.");
        System.out.println("[1] - Listar funcionários"+"\""+"[2] - Cadastrar funcionário"+"\""+"[3] - Deletar funcionário"+"\"");
        int b = sc.nextInt();
        sc.nextLine();
        return b;
    }


    public String [] criacaoFuncionario(){
        System.out.println("Preencha com as informações do funcionário: ");
        System.out.println("Digite o nome do funcionário: ");
        String name = sc.nextLine();
        System.out.println("Digite o CPF: ");
        String cpf = sc.nextLine();
        System.out.println("Digite o telefone: ");
        String telefone = sc.nextLine();
        String pattern = "-=";
        System.out.println(pattern.repeat(20));
        String[] dados = {name, cpf, telefone};
        return dados;
    }

    public Endereco criacaoEndereco(){
        System.out.println("Informações da residência do funcionário:");
        System.out.println("O funcionário mora em Casa ou Apartamento: ");
        String casaOuAp = sc.nextLine();
        System.out.println("Qual o número da casa ou apartamento do funcionário: ");
        int numero = sc. nextInt();
        sc.nextLine();
        System.out.println("Qual a rua da casa: ");
        String rua = sc.nextLine();
        System.out.println("Qual o bairro: ");
        String bairro = sc.nextLine();
        System.out.println("Qual a cidade: ");
        String cidade = sc.nextLine();
        System.out.println("Qual o estado (Digite apenas as siglas): ");
        String estado = sc.nextLine();
        Endereco endereco = new Endereco(casaOuAp, numero,rua,bairro,cidade,estado);
        return endereco;
    }
}
