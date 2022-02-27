import javax.swing.JOptionPane;//importacion del paquete JOptionPane
public class Diccionario//incio de la clase Dicccionario
{
    public static void main(String []args){//inicio de la clase main
        ListaLigada ll=new ListaLigada();//creacion de la lista ligada
        Archivo.leerarchivo("numeros",ll);//lectura del archivo
        int x;//declaracion de la variable para el menu x
        do{//inicio del do while
            x=Vista.leerentero("elije una opcion: \n 1.-agregar en orden \n 2.-numero a escritura \n 3.-numero a ingles \n 4.-numero a japones"+
            "\n 5.-escritura a numeros \n 6.-escritura a ingles \n 7.-escritura a japones \n 8.-ingles a numeros \n 9.-ingles a escritura"+
            "\n 10.-ingles a japones \n 11.-salir",11);//lectura desde el teclado de los valores del menu usando el metodo leer entero de la clase vista
            switch(x){//inicio de la switch case
                case 1://caso 1
                int a=Vista.leerentero2("numero a introducir");//leer desde el teclado el numero a introducir
                if(ll.getfin().getDato().getentero()+1!=a){//condicion de que vaya en orden 
                    System.out.println("en orden dije, el ultimo agregado es "+ll.getfin().getDato().getentero());//mensaje de que no esta en orden
                }else{
                    ll.insertarfinal(new Numero(a,Vista.leersololetras("escritura del número"),Vista.leersololetras("escritura del número en ingles"),JOptionPane.showInputDialog("escritura del número en japones")));
                    //introduccion del resto de datos del numero
                }
                break;//fin del caso 1
                case 2://caso 2
                int y1=Vista.leerentero2("numero a introducir");//numero a buscar desde teclado
                Numero n1=ll.encontrarnumero(y1);//asignacion a n1 del numero buscado
                if(n1!=null){//condicion de si lo encontro
                    System.out.println(y1+" se escribe en español como "+n1.gettexto());//mensaje de resultado
                }else{//else de no encontrado
                    System.out.println("no se encuentró el numero");//mensaje de no encontrado
                }
                break;//fin del caso 2
                case 3://caso 3
                int y2=Vista.leerentero2("numero a introducir");//numero a buscar desde teclado
                Numero n2=ll.encontrarnumero(y2);//asignacion a n2 del numero buscado
                if(n2!=null){//condicion de si lo encontro
                    System.out.println(y2+" se escribe en ingles como "+n2.getingles());//mensaje de resultado
                }else{//else de no encontrado
                    System.out.println("no se encuentró el numero");//mensaje de no encontrado
                }
                break;//Fin del caso 3
                case 4://caso 4
                int y3=Vista.leerentero2("numero a introducir");//numero a buscar desde teclado
                Numero n3=ll.encontrarnumero(y3);//asignacion a n3 del numero buscado
                if(n3!=null){//condicion de si lo encontro
                    System.out.println(y3+" se escribe en japones como "+n3.getjapones());//mensaje de resultado
                }else{//else de no encontrado
                    System.out.println("no se encuentró el numero");//mensaje de no encontrado
                }
                break;//fin del caso 4
                case 5://Caso 5
                String y4=Vista.leersololetras("numero en letras a introducir");//numero en letras a buscar desde teclado
                Numero n4=ll.encontrartexto(y4);//asignacion a n4 del texto del numero buscado
                if(n4!=null){//condicion de si lo encontro
                    System.out.println(y4+" se representa como "+n4.getentero());//mensaje de resultado
                }else{//else de no encontrado
                    System.out.println("no se encuentró el numero");//mensaje de no encontrado
                }
                break;//Fin del caso 5
                case 6://caso 6
                String y5=Vista.leersololetras("numero en letras a introducir");//numero en letras a buscar desde teclado
                Numero n5=ll.encontrartexto(y5);//asignacion a n5 del texto del numero buscado
                if(n5!=null){//condicion de que si lo encontro
                    System.out.println(y5+" se escribe en ingles como "+n5.getingles());//mensaje de resultado
                }else{//else de no encontrado
                    System.out.println("no se encuentró el numero");//mensaje de no encontrado
                }
                break;//Fin del caso 6
                case 7://Caso 7
                String y6=Vista.leersololetras("numero en letras a introducir");//numero en letras a buscar desde teclado
                Numero n6=ll.encontrartexto(y6);//asignacion a n6 del texto del numero buscado
                if(n6!=null){//condicion de que si lo encontro
                    System.out.println(y6+" se escribe en japones como "+n6.getjapones());;//mensaje de resultado
                }else{//else de no encontrado
                    System.out.println("no se encuentró el numero");//mensaje de no encontrado
                }
                break;//fin del caso 7
                case 8://caso 8
                String y7=Vista.leersololetras("numero en ingles a introducir");//numero en ingles a buscar desde teclado
                Numero n7=ll.encontraringles(y7);//asignacion a n7 del texto en ingles del numero buscado
                if(n7!=null){//condicion de que si lo encontro
                    System.out.println(y7+" se representa como "+n7.getentero());//mensaje de resultado
                }else{//else de no encontrado
                    System.out.println("no se encuentró el numero");//mensaje de no encontrado
                }
                break;//fin del caso 8
                case 9://caso 9
                String y8=Vista.leersololetras("numero en ingles a introducir");//numero en ingles a buscar desde teclado
                Numero n8=ll.encontraringles(y8);//asignacion a n8 del texto en ingles del numero buscado
                if(n8!=null){//condicion de que si lo encontro
                    System.out.println(y8+" se escribe en español como "+n8.gettexto());//mensaje de resultado
                }else{//else de no encontrado
                    System.out.println("no se encuentró el numero");//mensaje de no encontrado
                }
                break;//fin del caso 9
                case 10://Caso 10
                String y9=Vista.leersololetras("numero en ingles a introducir");//numero en ingles a buscar desde teclado
                Numero n9=ll.encontraringles(y9);//asignacion a n9 del texto en ingles del numero buscado
                if(n9!=null){//mensaje de resultado
                    System.out.println(y9+" se escribe en japones como "+n9.getjapones());//mensaje de resultado
                }else{//else de no encontrado
                    System.out.println("no se encuentró el numero");//mensaje de no encontrado
                }
                break;//Fin del caso 10
            }   
        }while(x!=11);//fin del ciclo do while cuando x sea 11
        Archivo.escribirarchivo("numeros",ll);//reescritura del archivo con los nuevos datos
    }//fin del main
}//fin de la clase
