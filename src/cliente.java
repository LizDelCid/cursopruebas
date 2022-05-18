import java.util.Date;

public class  cliente extends persona {

    //Atributos

    private int IdCliente;

    private Date FechadeRegistro;

    //Constructor
    public cliente (int pIdCliente, int pIdPersona, String pNombre, String pApellido, int pEdad){
        super(pIdPersona, pNombre, pApellido, pEdad);
        this.IdCliente = pIdCliente;
       // this.FechadeRegistro = pFechadeRegistro;

    }

    //Metodo

    public int getIdCliente() {
        return IdCliente;
    }

    public Date getFechadeRegistro() {
        return FechadeRegistro;
    }

    public void setFechadeRegistro(Date pfechadeRegistro) {
        FechadeRegistro = pfechadeRegistro;
    }

    @Override
    public String toString() {
        return super.toString() + " - Cliente{" +
                "idCliente=" + IdCliente +
                ", fechaRegistro=" + FechadeRegistro +
                '}';

    }
}
