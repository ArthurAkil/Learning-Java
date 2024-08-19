package ProjectPintarI.classes;

public class Wall {
    public double ParedeAltura;
    public double ParedeComprimento;

    public Wall(double altura, double comprimento){
        this.ParedeAltura = altura;
        this.ParedeComprimento = comprimento;
    }

    public double AreaTotalParede(){
        return ParedeAltura * ParedeComprimento;
    }
}
