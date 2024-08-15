package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio;
import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.classes.Cliente;
import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.classes.Roupa;
import java.util.Scanner;
import java.util.ArrayList;

public class LojaTest01 {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ArrayList<Roupa> roupas = new ArrayList<Roupa>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Seja bem-vindo a lojinha de esquina.");
        boolean primeiroLaco = true;
        while (primeiroLaco){
            System.out.println("Selecione o que deseja cadastrar: [1-Clientes  2-Roupas  3-Encerrar]");
            int opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Ala Clientes: [1-Cadastrar um cliente  2-Ver clientes cadastrados  3-Voltar]");
                    int choiceClient = sc.nextInt();
                    sc.nextLine();
                    switch (choiceClient) {
                        case 1:
                            boolean segundoLaco = true;
                            while (segundoLaco){
                                System.out.println("Adicione os dados do cliente que deseja cadastrar.");
                                System.out.println("Nome do cliente: ");
                                String nome = sc.nextLine();
                                System.out.println("CPF do cliente: ");
                                int cpf = sc.nextInt();
                                sc.nextLine();
                                Cliente cliente = new Cliente(nome, cpf);
                                clientes.add(cliente);
                                boolean terceiroLaco = true;
                                while (terceiroLaco){
                                    System.out.println("Deseja adicionar outro cliente? [1-Sim 2-Não]");
                                    int choiceEnd = sc.nextInt();
                                    sc.nextLine();
                                    switch (choiceEnd){
                                        case 1:
                                            segundoLaco = true;
                                            terceiroLaco = false;
                                            break;
                                        case 2:
                                            segundoLaco = false;
                                            terceiroLaco = false;
                                            break;
                                        default:
                                            System.out.println("Selecione uma opção válida.");
                                            terceiroLaco = true;
                                            break;
                                    }
                                }
                            }
                            break;
                        case 2: // ver clientes cadastrados
                            boolean quartoLaco = true;
                            while (quartoLaco) {
                                for (int i = 0; i < clientes.size(); i++) {
                                    System.out.println("Cliente " + (i + 1) + "-> " + clientes.get(i).descricaoCliente());
                                }
                                System.out.println("Deseja deletar algum cliente? [1-Sim 2-Não]");
                                int deleteCliente = sc.nextInt();
                                sc.nextLine();
                                switch (deleteCliente) {
                                    case 1: // quer deletar cliente
                                        System.out.println("Qual cliente deseja deletar, digite o número: ");
                                        int indexDelete = sc.nextInt();
                                        sc.nextLine();
                                        clientes.remove(indexDelete - 1);
                                        System.out.println("O cliente de nº " + indexDelete + " foi deletado.");
                                        System.out.println("A lista de clientes agora é: ");
                                        for (int i = 0; i < clientes.size(); i++) {
                                            System.out.println("Cliente " + (i + 1) + "-> " + clientes.get(i).descricaoCliente());
                                        }
                                        break;
                                    default: // não digitou nada das opções
                                        System.out.println("Voltando ao menu inicial..");
                                        quartoLaco = false;
                                        break;
                                }
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                case 2: // roupas //switch cadastrar roupa , ver roupa cadastrada // opcao nao predita
                    System.out.println("Ala Roupas: [1-Cadastrar uma roupa  2-Ver roupas cadastradas  3-Voltar");
                    int choiceOutfit = sc.nextInt();
                    sc.nextLine();
                    switch (choiceOutfit){
                        case 1:// cadastrar uma roupa
                            boolean quintoLaco = true;
                            while (quintoLaco){
                                System.out.println("Adicione os dados da roupa que deseja cadastrar.");
                                System.out.println("Digite o tipo de roupa: ");
                                String tipo = sc.nextLine();
                                System.out.println("Digite a cor da roupa: ");
                                String cor = sc.nextLine();
                                System.out.println("Digite a marca da roupa: ");
                                String marca = sc.nextLine();
                                System.out.println("Digite o preço da roupa: ");
                                double preco = sc.nextDouble();
                                sc.nextLine();
                                Roupa roupa = new Roupa(tipo, cor, marca, preco);
                                roupas.add(roupa);
                                boolean sextoLaco = true;
                                while (sextoLaco){
                                    System.out.println("Deseja adicionar outra roupa? [1-Sim 2-Não 3-Voltar]");
                                    int choiceEndOutfit = sc.nextInt();
                                    sc.nextLine();
                                    switch (choiceEndOutfit){
                                        case 1:
                                            quintoLaco = true;
                                            sextoLaco = false;
                                            break;
                                        case 2:
                                            quintoLaco = false;
                                            sextoLaco = false;
                                            break;
                                        default:
                                            System.out.println("Selecione uma opção válida.");
                                            sextoLaco = true;
                                            break;
                                    }
                                }
                            }
                            break;
                        case 2: // ver roupas cadastradas SWITCH PARA DELETAR
                            boolean setimoLaco = true;
                            while (setimoLaco) {
                                for (int i = 0; i < roupas.size(); i++) {
                                    System.out.println("Roupa " + (i + 1) + "-> " + roupas.get(i).descricaoRoupa());
                                }
                                System.out.println("Deseja deletar alguma roupa? [1-Sim 2-Não 3-Voltar]");
                                int deleteOutfit = sc.nextInt();
                                sc.nextLine();
                                switch (deleteOutfit) {
                                    case 1: // quer deletar roupa
                                        System.out.println("Qual roupa deseja deletar, digite o número: ");
                                        int indexDeleteOutfit = sc.nextInt();
                                        sc.nextLine();
                                        clientes.remove(indexDeleteOutfit - 1);
                                        System.out.println("A roupa de nº " + indexDeleteOutfit + " foi deletado.");
                                        System.out.println("A lista de roupas agora é: ");
                                        for (int i = 0; i < roupas.size(); i++) {
                                            System.out.println("Roupa " + (i + 1) + "-> " + roupas.get(i).descricaoRoupa());
                                        }
                                        break;
                                    default: // não digitou nada das opções
                                        System.out.println("Voltando ao menu inicial..");
                                        setimoLaco = false;
                                        break;
                                }
                            }
                            break;
                        default: //voltar
                            break;
                    }
                    break;
                default:
                    System.out.println("Programa encerrado.");
                    primeiroLaco = false;
                    break; // encerrar o programa
            }
        }

    }
}