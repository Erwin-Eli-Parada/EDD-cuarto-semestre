import java.io.*;
public class Archivo
{
    public static String leerarchivo(String s){
      String []a=new String[100];
      int b=0;
      int x=0;
      try {
         File archivo = new File (s+".txt");
         FileReader fr = new FileReader (archivo);
         BufferedReader br = new BufferedReader(fr);
         String linea;
         while((linea=br.readLine())!=null){
             a[b]=linea;
             //System.out.println(a[b]);
             b++;
         }
         x=(int)(Math.random()*b);
      }
      catch(Exception e){
         e.printStackTrace();
      }
      finally{
          return a[x];
      }
    }
}
