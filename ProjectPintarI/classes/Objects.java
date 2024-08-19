package ProjectPintarI.classes;

public class Objects {
    public double alturaObjeto;
    public double ComprimentoObjeto;

    public Objects(double AreaObjeto, double ComprimentoObjeto){
        this.alturaObjeto = AreaObjeto;
        this.ComprimentoObjeto = ComprimentoObjeto;
    }

    public double AreaTotalObjetos(){
        return alturaObjeto *ComprimentoObjeto;
    }

}
