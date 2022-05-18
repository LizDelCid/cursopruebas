import java.nio.channels.UnresolvedAddressException;

public class persona {
    //Atributos
    private int IdPersona, Edad;
    private String Nombre, Apellido;
    private static int contadorPersonas = 0;

    //Constructor
    public persona(int pIdPersona, String pNombre, String pApellido, int pEdad) {
        this.IdPersona = pIdPersona;
        this.Nombre = pNombre;
        this.Apellido = pApellido;
        this.Edad = pEdad;
        this.contadorPersonas = 0;
    }

    public int getIdPersona() {
        return IdPersona;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String pnombre) {
        Nombre = pnombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String papellido) {
        Apellido = papellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int pedad) {
        Edad = pedad;
    }

    public int getContadorPersonas(){
        return contadorPersonas;
    }

    @Override
    public String toString() {
        return "Persona{"+IdPersona +
                "Nombre" + Nombre +
                "Apellido" + Apellido +
                "Edad" + Edad + "}";
    }
}