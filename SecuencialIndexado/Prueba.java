import java.io.*;
import javax.swing.JOptionPane;
public class Prueba
{
    public static void main(String []args)throws ClassNotFoundException,IOException{
        ListaLigada ll=new ListaLigada();
        int menu;
        try{
            RandomAccessFile raf=new RandomAccessFile("prueba.txt","rw");
            Archivo.setEscritura(ll,raf);
            do{
                menu=Integer.parseInt(JOptionPane.showInputDialog("1.-buscar,2.-salir"));
                if(menu==1){
                    String s=JOptionPane.showInputDialog("introduce clave");
                    int num=ll.encontrartexto(s);
                    if(num==-1){System.out.println("no existe");}
                    Persona p=Archivo.getLectura(raf,num);
                    System.out.println(p.getnombre()+p.getapellidoP()+p.getapellidoM()+p.getedad());
                    
                }
            }while(menu==1);
        }catch(IOException io){
            
        }
    }
}