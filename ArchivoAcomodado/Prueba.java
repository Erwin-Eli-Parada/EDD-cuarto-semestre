import java.io.*;
public class Prueba
{
    public static void main(String []args)throws ClassNotFoundException,IOException{
        try{
        Archivo f=new Archivo("desordenado");
        f.setEscritura2();
        ArrePer arre=new ArrePer();
        f.getLectura(arre);
        System.out.println("desordenado: \n");
        for(int i=0;i<arre.tamaño();i++){
            System.out.println(arre.posicion(i).toString());
        }
        System.out.println("\n");
        arre.ordenar(1);
        Archivo z=new Archivo("ordenado");
        z.setEscritura(arre);
         System.out.println("ordenado: \n");
        for(int i=0;i<arre.tamaño();i++){
            System.out.println(arre.posicion(i).toString());
        }
        } catch(IOException io){  }
    }
}
