package StaffFlow.classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Salario {
    private ArrayList<Double> salarios = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public void adicionarSalario(double salarioAdicionado){
        salarios.add(salarioAdicionado);
    }

    public void listarSalarios() {
        if(salarios.isEmpty()) {
            System.out.println("Não há nenhum salário cadastrado ainda.");
        } else {
            for (int i = 0; i < salarios.size(); i++){
                System.out.println((i+1)+"º Salario: "+salarios.get(i));
            }
        }

    }

    public void removerSalario() {
        if(salarios.isEmpty()) {
            System.out.println("Não há nenhum salário cadastrado ainda.");
        } else{
            for (int i = 0; i < salarios.size(); i++){
                System.out.println((i+1)+"º Salario: "+salarios.get(i));
            }
            System.out.println("Qual salário deseja apagar? ");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 0 || choice > salarios.size()) { //pode ser >=
                System.out.println("Não existe esse salário.");
            } else {
                salarios.remove(choice - 1);
                System.out.println("Salario "+choice+" removido com sucesso.");
            }
        }
    }

    public double mediaSalarial() {
        double media = 0;
        for (int m = 0; m < salarios.size(); m++) {
            media += salarios.get(m);
        }
        media /= salarios.size();
        return media;
    }
}
