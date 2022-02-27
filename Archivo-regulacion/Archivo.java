import java.io.*;
public class Archivo
{
    public static void leerarchivo(String s){
      try {
         File archivo = new File (s+".txt");
         FileReader fr = new FileReader (archivo);
         BufferedReader br = new BufferedReader(fr);
         String linea;
         while((linea=br.readLine())!=null){
             System.out.println(linea);
         }
      }
      catch(Exception e){
         e.printStackTrace();
      }
    }
    public static void escribirarchivo(String s,String a){
        try{
            FileWriter fichero = new FileWriter(s+".txt",true);
            BufferedWriter bw= new BufferedWriter(fichero);
            PrintWriter wr=new PrintWriter(bw);
            wr.println(a);
            wr.close();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}
