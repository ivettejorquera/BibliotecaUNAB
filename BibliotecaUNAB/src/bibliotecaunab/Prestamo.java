
package bibliotecaunab;

public class Prestamo {
    private int numPrestamo;
    private Libro libroRef;
    private Usuario usrRef;
    private Devolucion Dearr;//Relacion compuesta
//CONSTRUCTOR
    public Prestamo(int numPrestamo, Usuario usrRef, String fecDev) {
        this.numPrestamo = numPrestamo;
        this.usrRef = usrRef;
        this.Dearr = new Devolucion(fecDev);
    }

    public void setNumPrestamo(int numPrestamo) {
        this.numPrestamo = numPrestamo;
    }

    public void setLibroRef(Libro libroRef) {
        this.libroRef = libroRef;
    }

    public void setUsrRef(Usuario usrRef) {
        this.usrRef = usrRef;
    }

    public void setDearr(Devolucion Dearr) {
        this.Dearr = Dearr;
    }
    
    
    
    public int getNumPrestamo() {
        return numPrestamo;
    }

    public Libro getLibroRef() {
        return libroRef;
    }

    public Usuario getUsrRef() {
        return usrRef;
    }

    public Devolucion getDearr() {
        return Dearr;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "numPrestamo=" + numPrestamo + ", libroRef=" + libroRef + ", usrRef=" + usrRef + ", Dearr=" + Dearr + '}';
    }

    
}
