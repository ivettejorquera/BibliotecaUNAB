package bibliotecaunab;

public class Devolucion {
        private String Fecha_Devolucion;
//CONSTRUCTOR   
public Devolucion (String Fecha_Devolucion){
    this.Fecha_Devolucion = Fecha_Devolucion;
}

    public Devolucion() {
        this.Fecha_Devolucion ="";
    }

//MUTADORES

public void setFecha_Devolucion(String Fecha_Devolucion){
    this.Fecha_Devolucion = Fecha_Devolucion;
}
//ACCESADORES

    public String getFecha_Devolucion(){
        return Fecha_Devolucion;
    }   
    //Recuperar estado del objeto
    @Override //Indica que voy a sobreescribir un método de otroa clase
    public String toString(){
        return "DEVOLUCIÓN{"+ ", FECHA="+getFecha_Devolucion()+'}';
    }  
/*Customer Devolución
    public boolean devolverVehiculo(Arriendo arr){
        arr.getVec_arr().setCondicion('D');
                return true;
    ¨*/
}
