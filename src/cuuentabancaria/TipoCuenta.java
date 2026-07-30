
package cuuentabancaria;

public class TipoCuenta {
    public static final TipoCuenta ahorro=new TipoCuenta("AHORRO",0.03);
    public static final TipoCuenta cheques=new TipoCuenta("CHEQUES",0.00);
    public static final TipoCuenta plazo=new TipoCuenta("PLAZO",0.05);
    private final String name;
    private final double tasa;
    
    
    

    public TipoCuenta(String name, double tasa) {
        this.name = name;
        this.tasa= tasa;
        
    }

    public String getName() {
        return name;
    }

    public double tasa(){
        return tasa;
    }

    @Override
    public String toString() {
        return "TipoCuenta{" + "name=" + name + '}';
    }
    
    
   
   
    
    
    
}
