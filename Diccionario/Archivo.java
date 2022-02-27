import java.io.*;//importar el paque para entrada y salida de datos
public class Archivo//inicio de la clase
{
    public static void leerarchivo(String s,ListaLigada ll){//metodo para leer el archivo
      String []a=new String[4];//arreglo de apoyo
      try {//try para evitar errores en tiempo de ejecucion
         File archivo = new File (s+".txt");//seleccionar un archivo
         FileReader fr = new FileReader (archivo);//crear un lector de ese archivo
         BufferedReader br = new BufferedReader(fr);//crear un buffer de ese lector
         String linea;//string de cada linea
         while((linea=br.readLine())!=null){//ciclo para leer las lineas y separarlas
             a=linea.split(" ");//divir el string de las lineas cada espacio
             ll.insertarfinal(new Numero(Integer.parseInt(a[0]),a[1],a[2],a[3]));//crear un nuevo nodo a partir de los datos en el string de apoyo
         }//fin del ciclo while
      }
      catch(Exception e){//cachar la excepcion en caso de no haber podido leer
         e.printStackTrace();//imprimir el error
      }
    }//Fin del metodo
    public static void escribirarchivo(String s,ListaLigada ll){//metodo para escribir en el archivo
        try{//try para evitar los errores
            FileWriter fichero = new FileWriter(s+".txt");//asignar al fichero al cual se va a escribir  
            BufferedWriter bw= new BufferedWriter(fichero);//crear un buffer para ese fichero
            PrintWriter wr=new PrintWriter(bw);//crear un escritor con los datos del buffer
            for(Nodo a=ll.getcab();a!=null;a=a.getsiguiente())//ciclo for para escribir los datos de toda la lsita ligada
                wr.println(a.getDato().toString());//escritura de los datos en el archivo
            wr.close();//cerrar el escritor
            bw.close();//cerrar el buffer
        } catch (Exception e) {//cachar cualquier error que se pueda generar en la escritura
            e.printStackTrace();//impresion del error 
        } 
    }//fin del metodo 
}//fin de la clase

