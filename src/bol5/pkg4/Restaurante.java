package bol5.pkg4;

/**
 *
 * @author manu
 */
public class Restaurante {
    //Atributos
    private double pulpo;
    private double patatas;
    
    //Constructores
    public Restaurante (){
        
    }
    public Restaurante (double pu, double pa){
        pulpo = pu;
        patatas = pa;
    }
    //Metodos
    public void setPulpo(double pu){
        pulpo = pu;
    }
    public void setPatatas(double pa){
        patatas = pa;
    }
    public double getPatatas (){
        return patatas;
    }
    public double getPulpo(){
        return pulpo;
    }
    
}
