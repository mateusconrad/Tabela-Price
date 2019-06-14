import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;


@Named(value = "calculoBean")
@RequestScoped
public class calculoBean {

    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }

    public double getI() {
        return i;
    }

    public void setI(double i) {
        this.i = i;
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public double getVp() {
            
        return vp;
    }

    public void setVp(double vp) {
        this.vp = vp;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public double getPV() {
        return PV;
    }

    public void setPV(double PV) {
        this.PV = PV;
    }
    private double v;  // = valor a financiar        (entrada)
    private double i;  // = taxa (2%a.a)             (entrada)
    private double n;  // = número de parcelas       (entrada) 
    private double vp; // = valor parcela (formula )
    private double t;  // = tempo (meses)
    private double pv; // = presente valor
     
    
    public calculoBean() {
    }
    
    private double getValorParcela(){
        vp = pv* ( Math.pow((1+i),n)   *i) /(Math.pow((1+i),n-1));
        
        
        return vp;   
    }
    private double getPresenteValor(){
        pv = v - vp;
        return pv;
        
    }
    
}
