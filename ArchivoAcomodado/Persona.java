import java.io.*;
public class Persona implements Serializable
{
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    public Persona(String nombre,int edad,char sexo,double peso){
        setnombre(nombre);
        setedad(edad);
        setsexo(sexo);
        setpeso(peso);
    }
    public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public int getedad(){
        return edad;
    }
    public void setedad(int edad){
        this.edad=edad;
    }
    public char getsexo(){
        return sexo;
    }
    public void setsexo(char sexo){
        this.sexo=sexo;
    }
    public double getpeso(){
        return peso;
    }
    public void setpeso(double peso){
        this.peso=peso;
    }
    public String toString(){
        return nombre+" "+edad+" "+sexo+" "+peso;
    }
    public int comparar(int x,Persona per){
        if(x==1){
            return (getnombre().compareTo(per.getnombre()));
        }else if(x==2){
            return (((Integer)getedad()).compareTo((Integer)per.getedad()));
        }else if(x==3){
            return (((Character)getsexo()).compareTo((Character)per.getsexo()));
        }else if(x==4){
            return (((Double)getpeso()).compareTo((Double)per.getpeso()));
        }
        return 0;
    }
}
