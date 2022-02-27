import javax.swing.JOptionPane;
public class Menu
{
    public static void main(String []args){
        Lista l=new Lista();
        int a;
        String s;
        do{
            a=Vista.leerentero("introduzca un numero\n1.-agregar celular\n2.-eliminar celular en una posicion\n3.-eliminar el primer celular"+
            "\n4.-eliminar el ultimo celular\n5.-listar los celulares de una marca\n6.-listar los celulares de una resolucion\n7.-listar celulares de un tamaño"+
            "\n8.-listar celulares de una memoria\n9.-listar celulares de un procesador\n10.-listar celulares de una marca y memoria"+
            "\n11.-listar celulares de una marca y resolucion menor\n12.-listar celulares de una marca y pantalla\n13.-listar celulares de pantalla y resolucion mayor"+
            "\n14.-salir");
            switch(a){
                case 1:
                    l.agregar_posicion(new Celular(JOptionPane.showInputDialog("Marca"),Vista.leerdobles("resolucion"),
                    Vista.leerdobles("pantalla"),Vista.leerentero("memoria"),
                    JOptionPane.showInputDialog("procesador")),Vista.leerentero("posicion"));        
                break;
                case 2:
                    l.eliminar_posicion(Vista.leerentero("posicion a eliminar"));
                break;
                case 3:
                    l.eliminar_principio();
                break;
                case 4:
                    l.eliminar_final();
                break;
                case 5:
                    String s1=JOptionPane.showInputDialog("marca a listar");
                    String s2="";
                    Celular c1;
                    for(int i=0;i<=l.getlast();i++){
                        c1=(Celular)l.verPosicion(i);
                        if(c1.getmarca().equalsIgnoreCase(s1)){
                            s2+=c1.toString()+"\n";
                        }
                    }
                    System.out.println(s2);
                break;
                case 6:
                    double s3=Vista.leerdobles("resolucion de camara a listar");
                    String s4="";
                    Celular c2;
                    for(int i=0;i<=l.getlast();i++){
                        c2=(Celular)l.verPosicion(i);
                        if(c2.getresolucion()==s3){
                            s4+=c2.toString()+"\n";
                        }
                    }
                    System.out.println(s4);
                break;
                case 7:
                    double s5=Vista.leerdobles("tamaño de la pantalla");
                    String s6="";
                    Celular c3;
                    for(int i=0;i<=l.getlast();i++){
                        c3=(Celular)l.verPosicion(i);
                        if(c3.getpantalla()==s5){
                            s6+=c3.toString()+"\n";
                        }
                    }
                    System.out.println(s6);
                break;
                case 8:
                    int s7=Vista.leerentero("memoria a listar");
                    String s8="";
                    Celular c4;
                    for(int i=0;i<=l.getlast();i++){
                        c4=(Celular)l.verPosicion(i);
                        if(c4.getmemoria()==s7){
                            s8+=c4.toString()+"\n";
                        }
                    }
                    System.out.println(s8);
                break;
                case 9:
                    String s9=JOptionPane.showInputDialog("procesador a listar");
                    String s10="";
                    Celular c5;
                    for(int i=0;i<=l.getlast();i++){
                        c5=(Celular)l.verPosicion(i);
                        if(c5.getprocesador().equalsIgnoreCase(s9)){
                            s10+=c5.toString()+"\n";
                        }
                    }
                    System.out.println(s10);
                break;
                case 10:
                    String s11=JOptionPane.showInputDialog("marca a listar");
                    String s12="";
                    int x1=Vista.leerentero("Tamaño de memoria");
                    Celular c6;
                    for(int i=0;i<=l.getlast();i++){
                        c6=(Celular)l.verPosicion(i);
                        if(c6.getmarca().equalsIgnoreCase(s11) && c6.getmemoria()>x1){
                            s12+=c6.toString()+"\n";
                        }
                    }
                    System.out.println(s12);
                break;
                case 11:
                    String s13=JOptionPane.showInputDialog("marca a listar");
                    String s14="";
                    double x2=Vista.leerdobles("Resolucion");
                    Celular c7;
                    for(int i=0;i<=l.getlast();i++){
                        c7=(Celular)l.verPosicion(i);
                        if(c7.getmarca().equalsIgnoreCase(s13) && c7.getresolucion()<x2){
                            s14+=c7.toString()+"\n";
                        }
                    }
                    System.out.println(s14);
                break;
                case 12:
                    String s15=JOptionPane.showInputDialog("marca a listar");
                    String s16="";
                    double x3=Vista.leerdobles("Tamaño de pantalla");
                    Celular c8;
                    for(int i=0;i<=l.getlast();i++){
                        c8=(Celular)l.verPosicion(i);
                        if(c8.getmarca().equalsIgnoreCase(s15) && c8.getpantalla()==x3){
                            s16+=c8.toString()+"\n";
                        }
                    }
                    System.out.println(s16);
                break;
                case 13:
                    double x4=Vista.leerdobles("resolucion a listar");
                    String s17="";
                    int x5=Vista.leerentero("Tamaño de memoria");
                    Celular c9;
                    for(int i=0;i<=l.getlast();i++){
                        c9=(Celular)l.verPosicion(i);
                        if(c9.getresolucion()==x4 && c9.getmemoria()>x5){
                            s17+=c9.toString()+"\n";
                        }
                    }
                    System.out.println(s17);
                break;
            }
        }while(a!=14);
    }
}
