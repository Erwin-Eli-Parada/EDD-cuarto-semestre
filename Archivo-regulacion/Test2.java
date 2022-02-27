import java.util.*;
import java.io.*;
import javax.swing.*;
public class Test2
{
    public static void main(String[]args){
        Vector v=leerpersonas();
        personas(v);
        personasconformato(v);
    }
    public static Vector leerpersonas(){
        Vector v=new Vector();
        int menu;
        do{
            menu=Integer.parseInt(JOptionPane.showInputDialog("1.-agregar persona\n2.-salir"));
            if(menu==1){
                Persona p=new Persona(JOptionPane.showInputDialog("nombre"),JOptionPane.showInputDialog("apellido P"),JOptionPane.showInputDialog("apellido M"),Integer.parseInt(JOptionPane.showInputDialog("edad")));
                v.add(p);
            }
        }while(menu!=2);
        return v;
    }
    public static void personas(Vector leerpersonas){
        File archivo =new File("personas.txt");
        String []datos=new String[leerpersonas.size()];
        for(int i=0;i<leerpersonas.size();i++){
            datos[i]=((Persona)(leerpersonas.elementAt(i))).getnombre()+((Persona)(leerpersonas.elementAt(i))).getapellidoM()+((Persona)(leerpersonas.elementAt(i))).getapellidoP()+((Persona)(leerpersonas.elementAt(i))).getedad();
        }
        System.out.println("personas sin formato");
        for(int i=0;i<leerpersonas.size();i++){
            Archivo.escribirarchivo("personas",datos[i]);
            System.out.println(archivo.length());
        }
    }
    public static void personasconformato(Vector leerpersonas){
        File archivo =new File("personas1.txt");
        String []datos=new String[leerpersonas.size()];
        for(int i=0;i<leerpersonas.size();i++){
            datos[i]=String.format("%-15s%-18s%-18s%-2s",((Persona)(leerpersonas.elementAt(i))).getnombre(),((Persona)(leerpersonas.elementAt(i))).getapellidoM(),((Persona)(leerpersonas.elementAt(i))).getapellidoP(),((Persona)(leerpersonas.elementAt(i))).getedad()).trim();
        }
        System.out.println("personas con formato");
        for(int i=0;i<leerpersonas.size();i++){
            Archivo.escribirarchivo("personas1",datos[i]);
            System.out.println(archivo.length());
        }
    }
}
