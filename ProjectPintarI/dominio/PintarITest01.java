package ProjectPintarI.dominio;
import ProjectPintarI.classes.Objects;
import ProjectPintarI.classes.Wall;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.ArrayList;

public class PintarITest01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> medidasFinais = new ArrayList<Double>();
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Seja bem-vindo ao PintarI.");
        System.out.println("\nQuantas paredes deseja pintar? ");
        int qntdParedes = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < qntdParedes; i++){
            // Dados paredes:
            System.out.println("Digite a altura da parede "+(i+1)+": ");
            double alturaParede = sc.nextDouble();
            sc.nextLine();
            System.out.println("Digite o comprimento da parede "+(i+1)+": ");
            double comprimentoParede = sc.nextDouble();
            sc.nextLine();
            Wall parede = new Wall(alturaParede, comprimentoParede);
            double areaTotalParede  = parede.AreaTotalParede();

            // Dados objetos da parede:
            System.out.println("Existem quantos objetos na parede "+(i+1)+": ");
            int qntdObjetos = sc.nextInt();
            sc.nextLine();
            if (qntdObjetos <= 0) {
                medidasFinais.add(areaTotalParede);
            } else {
                for(int j = 0; j < qntdObjetos; j++){
                    System.out.println("Digite a altura do "+(j+1)+"º objeto  da "+i+"ª parede: ");
                    double alturaObjeto = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Digite o comprimento do "+(j+1)+"º objeto  da "+i+"ª parede: ");
                    double comprimentoObjeto = sc.nextDouble();
                    sc.nextLine();
                    Objects objeto = new Objects(alturaObjeto, comprimentoObjeto);
                    double areaTotalObjeto = objeto.AreaTotalObjetos();
                    medidasFinais.add(areaTotalParede-areaTotalObjeto);
                }
            }
        }
        double somaTotal = 0;
        for(int a = 0; a < medidasFinais.size(); a++){
            somaTotal += medidasFinais.get(a);
        }
        System.out.println("A área total que terá que pintar será de "+somaTotal);
        System.out.print("Digite a quantidade demãos necessárias (recomendado pelo menos 2): ");
        int demaos = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o rendimento da tinta escolhida em m²: ");
        double rendimentoTinta = sc.nextDouble();
        sc.nextLine();
        double rendimentoReal = rendimentoTinta/demaos;
        double quantidadeTinta = somaTotal/rendimentoReal;
        System.out.println("Você precisará de "+quantidadeTinta+" tintas com esse rendimento informado (Obs: Caso dê um número quebrado opte por comprar a mais da quantidade mostrada).");
    }
}
