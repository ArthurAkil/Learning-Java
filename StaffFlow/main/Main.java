package StaffFlow.main;

import StaffFlow.classes.Funcionario;
import StaffFlow.classes.ListaFuncionarios;
import StaffFlow.classes.MetodosApoio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaFuncionarios funcionarios = new ListaFuncionarios();
        MetodosApoio metodos = new MetodosApoio();
        Scanner sc = new Scanner(System.in);
        boolean entry = true;

        while (entry){
            switch (metodos.escolhasInicio()){
                case 1:
                    switch (metodos.manegamentoFuncionario()){
                        case 1: //listar funcionários
                            funcionarios.listarFuncionarios();
                            break;
                        case 2: //cadastrar funcionários
                            String[] dados = metodos.criacaoFuncionario();
                            Funcionario funcionario = new Funcionario(dados[0],dados[1],dados[2]);
                            funcionario.setEndereco(metodos.criacaoEndereco());
                            funcionarios.addFuncionario(funcionario);
                            break;
                        case 3: //deletar funcionarios
                            funcionarios.delFuncionario();
                            break;
                        default:
                            System.out.println("Nenhum funcionário cadastrado.");
                            break;
                    }
                    break;
                case 2: //Gerencia
                    entry = false;
                    break;
                default:
                    entry = false;
                    break;
            }
        }
    }
}
