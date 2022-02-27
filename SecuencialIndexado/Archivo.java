import java.io.*;
import java.util.*;
public class Archivo
{
    
    public static void setEscritura(ListaLigada indice,RandomAccessFile raf) throws IOException{
        
        String[] n={"dana","hall","elias","jose","juan","pedro","carlos","maria"};
        int[] e={8,9,10,12,15,20,25,30};
        String[] aP={"Cruz","Gomez","Garcia","Altamirano","Perez","Lopez","Martinez","Sanchez"};
        String[] aM={"Cruz","Gomez","Garcia","Altamirano","Perez","Lopez","Martinez","Sanchez"};
        for(int i=0;i<100;i++){
            String name=String.format("%-15s",n[(int)(Math.random()*8)]);
            String apeP=String.format("%-18s",aP[(int)(Math.random()*8)]);
            String apeM=String.format("%-18s",aM[(int)(Math.random()*8)]);
            String edad=String.format("%-2s",e[(int)(Math.random()*8)]);
            Persona per=new Persona(name,apeP,apeM,edad);
            indice.insertarfinal(per.getnombre().substring(0,2)+per.getapellidoP().substring(0,1)+per.getapellidoM().substring(0,1)+i,i);
            indice.verfin();
            raf.writeUTF(name); 
            raf.writeUTF(apeP);
            raf.writeUTF(apeM);
            raf.writeUTF(edad);
        }
        System.out.println(raf.length());
    }
    public static Persona getLectura(RandomAccessFile raf,int numero) throws ClassNotFoundException,IOException{
        int num=numero*61;
        raf.seek(num);
        Persona p=new Persona(raf.readUTF(),raf.readUTF(),raf.readUTF(),raf.readUTF());
        return p;
    }
}
