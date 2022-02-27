public class Persona
{
    private String nombre;
    private String apellidoM;
    private String apellidoP;
    private int edad;
    public Persona(String nombre,String apellidoM,String apellidoP,int edad){
        setnombre(nombre);
        setapellidoM(apellidoM);
        setapellidoP(apellidoP);
        setedad(edad);
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public void setapellidoM(String apellidoM){
        this.apellidoM=apellidoM;
    }
    public void setapellidoP(String apellidoP){
        this.apellidoP=apellidoP;
    }
    public void setedad(int edad){
        this.edad=edad;
    }
    public String getnombre(){
        return nombre;
    }
    public String getapellidoM(){
        return apellidoM;
    }
    public String getapellidoP(){
        return apellidoP;
    }
    public int getedad(){
        return edad;
    }
}
