package bibliotecaunab;

public class Usuario implements java.io.Serializable{

    private String Nombre, Run;
    private char Genero;
    private int prestamo;
    //Constructor
    public Usuario(String Nombre, String Run, char Genero) {
        this.Nombre = Nombre;
        this.Run = Run;
        this.Genero = Genero;
        this.prestamo = 0;
    }
    //El constructor sin parámetros sirve para cuando se creal el objeto y los datos los setea con el set.
    public Usuario() {
        this.Nombre = "";
        this.Run = "";
        this.Genero=' ';
        this.prestamo= 0;
    }
    //MUTADORES

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setRut(String Run) {
        if(validarcedula(Run)==true)
        this.Run = Run;
    }

    public void setGenero(char Genero) {
        if (validarGenero(Genero))
        this.Genero = Genero;
    }

    public void setPrestamo(int prestamo) {
        if (validarPrestamo(prestamo));
        this.prestamo = prestamo;
    }
    //ACCESADORES

    public String getNombre() {
        return Nombre;
    }

    public String getRut() {
        return Run;
    }

    public char getGenero() {
        return Genero;
    }

    public int getPrestamo() {
        return prestamo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Nombre=" + Nombre + ", Rut=" + Run + ", Genero=" + Genero + ", prestamo=" + prestamo + '}';
    }
    //VALIDACIONES
    //VALIDAR RUT ejecutadas por set
    public boolean validarcedula (String ced){
        ced = ced.toUpperCase();
        char pen, ult;
        pen = ced.charAt(8);
        ult = ced.charAt(9);
        
        if(ced.length()!=10){
            System.out.println("Error... El largo del cedula es incorrecta");
            return false;
        }else{
            if(pen!='-'){
            System.out.println("Error... Favor ingrese el guión");
            return false;
            }else{
                if(ult =='0' || ult=='1'|| ult=='2'|| ult=='3'|| ult=='4'
                        || ult=='5'|| ult=='6'|| ult=='7'|| ult=='8'|| ult=='9'
                        || ult=='K')
                    return true;
                else{
                System.out.println("Error...El DV es incorrecto");
                return false;
                }
            }
        }
    }
    public boolean validarGenero(char gen){
        if ((gen== 'F')|| (gen=='M'))
            return true;
        else{
        System.out.println("El genero ingresado no es correcto");
        return false;
        }
    }
    
        public boolean validarPrestamo (int numP){
        boolean retVal = true;
        if (numP!=0){
            retVal = false;
            System.out.println("Este usuario ya tiene asignado un libro");
        }
        return retVal;
    }
        public boolean ValidarExisRun(String numRun){
        boolean retVal = true;
        if(getRut()== numRun){
            System.out.println("El numero de rut que ingreso ya existe!!!, registre uno nuevo");
        }else{
        retVal = false;
            System.out.println("Nuevo rut ingresado!!!");
        }
        return retVal;
    }
}
