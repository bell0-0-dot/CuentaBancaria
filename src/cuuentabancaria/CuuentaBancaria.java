
package cuuentabancaria;

import java.util.Calendar;
import java.util.Locale;


public class CuuentaBancaria {
    
    protected int numero;
    protected double saldoo;
    protected String cliente, moneda;
    protected Calendar apertura;
    
    public static void main(String[] args) {
        /*Calendar hoy = Calendar.getInstance();
        System.out.println("fecha actual" + hoy.getTime() + "ms :");
        
        //editar date
        //custom.setTimeInMillis();
         Calendar custom = Calendar.getInstance();
        System.out.println("La primer fecha de calendar: "+custom.getTime());
        custom.setTimeInMillis(Long.MAX_VALUE);
        System.out.println("La ultima fecha "+custom.getTime());
        custom.set(2006, Calendar.FEBRUARY, 3);
        System.out.println("Cumpleaños: "+custom.getTime());
        //comparar
        
        if(custom.before(hoy)){
            System.out.println("Si paso antes ");
        }if(hoy.after(custom)){
            System.out.println("Si hoy es despues de bday de alex");
        }if(hoy.getTimeInMillis()>=custom.getTimeInMillis()){
            System.out.println("Si hoy es despues del bday de alex ");
        }
        System.out.println("Día "+custom.get(Calendar.WEEK_OF_YEAR));
        int month=custom.get(Calendar.MONTH);
        System.out.println(month);
        custom.add(Calendar.YEAR, 5);
        System.out.println("Custom mas 5 años "+custom.getTime());
        String mestxt=custom.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.forLanguageTag());
        System.out.println("Mes= "+mestxt);*/

        
        
    }

    public CuuentaBancaria(int numero, double saldoo, String cliente, String moneda, Calendar apertura) {
        this.numero = numero;
        this.saldoo = 0;
        this.cliente = cliente;
        this.moneda = moneda;
        this.apertura = Calendar.getInstance();
    }
    
    public int getNumero(){
        return numero;
    }

    public double getSaldoo() {
        return saldoo;
    }

    public String getCliente() {
        return cliente;
    }

    public String getMoneda() {
        return moneda;
    }

    public Calendar getApertura() {
        return apertura;
    }
    
    
    public void depositar(double monto){
        if(monto>0){
            saldoo+=monto;
        
        }else{
            System.out.println("ERROR. MONTO NO PUEDE SER NEGATIVO");
        }
    }
    public boolean retirar(double monto){
        
        if(monto<=0){
            System.out.println("Error. Monto negativo");
            return false;
        } 
        if (monto>0 && monto<=saldoo){
            saldoo-=monto;
            return true;
        }else{
            System.out.println("Eror: SALDO INSUFICIENTE");
            return false;}
          
        
    }
}
