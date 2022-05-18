public class empleado extends  persona{
    //Atributos
    private long IdEmpleado;

    private int Sueldo;

    //Constructor
    public empleado(long pIdEmpleado, int pSueldo, int pIdPersona, String pNombre, String pApellido, int pEdad){
        super(pIdPersona, pNombre, pApellido, pEdad);
        this.IdEmpleado= pIdEmpleado;
        this.Sueldo= pSueldo;
    }

    //Metodos

    public long getIdEmpleado() {
        return IdEmpleado;
    }

    public int getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int psueldo) {
        Sueldo = psueldo;
    }

    @Override
    public String toString() {
        return super.toString() +
                " - Empleado{" +
                "idEmpleado=" + IdEmpleado +
                ", sueldo=" + Sueldo +
                '}';
    }

}


