import java.io.*;
public class Persona implements Serializable
{
    private String nombre;
    private String edad;
    private String apellidoP;
    private String apellidoM;
    public Persona(String nombre,String apellidoP,String apellidoM,String edad){
        setnombre(nombre);
        setedad(edad);
        setapellidoP(apellidoP);
        setapellidoM(apellidoM);
    }
    public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public String getedad(){
        return edad;
    }
    public void setedad(String edad){
        this.edad=edad;
    }
    public String getapellidoP(){
        return apellidoP;
    }
    public void setapellidoP(String apellidoP){
        this.apellidoP=apellidoP;
    }
    public String getapellidoM(){
        return apellidoM;
    }
    public void setapellidoM(String apellidoM){
        this.apellidoM=apellidoM;
    }
}