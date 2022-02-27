import java.io.*;
import java.util.*;
public class Archivo
{
    public static File f;
    public Archivo(String x){
        f=new File(x+".obj");
    }
    public static void setEscritura(ArrePer per) throws IOException{
        FileOutputStream fos=new FileOutputStream(f);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        for(int i=0;i<per.tamaño();i++){
            oos.writeObject(per.posicion(i));
        }
    }
    public static void setEscritura2() throws IOException{
        FileOutputStream fos=new FileOutputStream(f);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        String[] n={"dana","hall","elias","jose","juan","pedro","carlos","maria"};
        int[] e={8,9,10,12,15,20,25,30};
        double[] p={50.3,38.6,54.7,68.0,35.6,65.3};
        for(int i=0;i<100;i++){
            String name=n[(int)(Math.random()*8)];
            char s;
            if(name.equals("dana")||name.equals("maria")){
                s='M';
            }else{
                s='H';
            }
            Persona per=new Persona(name,e[(int)(Math.random()*8)],s,p[(int)(Math.random()*6)]);
            oos.writeObject(per);  
        }
    }
    public static void getLectura(ArrePer per) throws ClassNotFoundException,IOException{
        ObjectInputStream ois=null;
        try{
            FileInputStream fis=new FileInputStream(f);
            ois=new ObjectInputStream(fis);
            for(int i=0;i<per.tamaño();i++){
                per.agregar((Persona) ois.readObject());
            }
        }catch(IOException io){ }
        finally{
            ois.close();
        }
    }
}
