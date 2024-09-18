package StaffFlow.classes;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaFuncionarios {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public void addFuncionario(Funcionario funcionarioAdd){
        funcionarios.add(funcionarioAdd);
    }

    public Funcionario selecionarFuncionario(int i){
        i -= 1;
        return funcionarios.get(i);
    }

    public void listarFuncionarios(){
        if(this.funcionarios.isEmpty()){
            System.out.println("Não há nenhum funcionario cadastrado.");
        } else{
            for (int i = 0; i <this.funcionarios.size() ; i++) {
                System.out.println((i+1) + " º Funcionário:");
                funcionarios.get(i).infoFuncionario();
            }
        }
    }

    public void delFuncionario(){
        if(this.funcionarios.isEmpty()){
            System.out.println("Não há nenhum funcionario cadastrado.");
        } else{
            for(int f = 0; f<this.funcionarios.size(); f++){
                System.out.println((f+1)+"º funcionário: "+funcionarios.get(f));
            }
            System.out.println("Qual funcionário deseja deletar: ");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 0 || choice > this.funcionarios.size()) { //pode ser >=
                System.out.println("Não existe esse funcionário.");
            } else {
                this.funcionarios.remove(choice - 1);
                System.out.println("Funcionário "+choice+" removido com sucesso.");
            }
        }
    }
}
