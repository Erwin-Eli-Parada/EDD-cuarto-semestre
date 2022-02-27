import java.io.*;
public class Test1
{
    public static void main(String[]args){
        personas();
        personasconformato();
    }
    public static void personas(){
        File archivo =new File("personas.txt");
        Persona[] arre=new Persona[10];
        String []datos=new String[arre.length];
        arre[0]=new Persona("ana","perez","lopez",24);
        arre[1]=new Persona("juan","sanchez","sanchez",14);
        arre[2]=new Persona("carlos","hernadez","lopez",24);
        arre[3]=new Persona("francisco","gonzalez","fuentes",25);
        arre[4]=new Persona("jose","matias","martinez",28);
        arre[5]=new Persona("angel","gomez","gomez",18);
        arre[6]=new Persona("ricardo","zarete","molina",20);
        arre[7]=new Persona("maria de la luz","carmona","martinez",19);
        arre[8]=new Persona("gabriela","santiago","morales",26);
        arre[9]=new Persona("ruben","matinez","hernandez",20);
        for(int i=0;i<arre.length;i++){
            datos[i]=arre[i].getnombre()+arre[i].getapellidoM()+arre[i].getapellidoP()+arre[i].getedad();
        }
        System.out.println("personas sin formato");
        for(int i=0;i<arre.length;i++){
            Archivo.escribirarchivo("personas",datos[i]);
            System.out.println(archivo.length());
        }
    }
    public static void personasconformato(){
        File archivo =new File("personas1.txt");
        Persona[] arre=new Persona[10];
        String []datos=new String[arre.length];
        arre[0]=new Persona("ana","perez","lopez",24);
        arre[1]=new Persona("juan","sanchez","sanchez",14);
        arre[2]=new Persona("carlos","hernadez","lopez",24);
        arre[3]=new Persona("francisco","gonzalez","fuentes",25);
        arre[4]=new Persona("jose","matias","martinez",28);
        arre[5]=new Persona("angel","gomez","gomez",18);
        arre[6]=new Persona("ricardo","zarete","molina",20);
        arre[7]=new Persona("maria de la luz","carmona","martinez",19);
        arre[8]=new Persona("gabriela","santiago","morales",26);
        arre[9]=new Persona("ruben","matinez","hernandez",20);
        for(int i=0;i<arre.length;i++){
            datos[i]=String.format("%-15s%-18s%-18s%-2s",arre[i].getnombre(),arre[i].getapellidoM(),arre[i].getapellidoP(),arre[i].getedad()).trim();
        }
        System.out.println("personas con formato");
        for(int i=0;i<arre.length;i++){
            Archivo.escribirarchivo("personas1",datos[i]);
            System.out.println(archivo.length());
        }
    }
}
