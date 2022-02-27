import javax.swing.JOptionPane;// importacion del paqute JOptionPane de swing
public class Vista//incio de la clase vista
{
    public static int leerentero(String s,int x){//metodo para solo enteros en un rango      
        boolean banner1= true;//declaracion de la variable bandera
        int menu=0;//declaracion de la variable menu
        while(banner1==true)//inicio del ciclo while
            try{//try para excepciones
                menu=Integer.parseInt(JOptionPane.showInputDialog(s));//lectura desde el teclado
                if(menu<=0 || menu>x)//condicion del rango
                    throw new Exception(); //lanzar una excepcion en caso de salirse
                banner1=false;//cambio del interruptor    
            }catch(NumberFormatException miException){//cachar la excepcion de formato
                JOptionPane.showMessageDialog(null,"dije numero");//mensaje de error
                    banner1=true;                       //cambio del interruptor
            }catch(Exception Exception2){//cachar la excepcion de fuera de rango 
                JOptionPane.showMessageDialog(null,"dije opcion de las que dije");//mensaje de error
                banner1=true;           //cambio del interruptor
            }  
        return menu;        //retorno del string
    }
    public static int leerentero2(String s){//metodo para solo enteros a partir de 0      
        boolean banner1= true;//declaracion de la variable bandera
        int menu=0;//declaracion de la variable menu
        while(banner1==true)//inicio del ciclo while
            try{//try para excepciones
                menu=Integer.parseInt(JOptionPane.showInputDialog(s));//lectura desde el teclado
                if(menu<=0)//condicion del rango arriba de cero
                    throw new Exception(); //lanzar una excepcion en caso de salirse
                banner1=false;//cambio del interruptor    
            }catch(NumberFormatException miException){//cachar la excepcion de formato
                JOptionPane.showMessageDialog(null,"dije numero");//mensaje de error
                    banner1=true;                       //cambio del interruptor
            }catch(Exception Exception2){//cachar la excepcion de fuera de rango 
                JOptionPane.showMessageDialog(null,"dije opcion de las que dije");//mensaje de error
                banner1=true;           //cambio del interruptor
            }  
        return menu;        //retorno del string
    }
    public static String leersololetras(String s){//metodo para leer solo letras
        boolean interruptor=true;//declaracion del interruptor 
        String b=" ";//declaracion de una variable string b
        char a= '0';//declaracion de una variable char a
        do{//inicio del do while
            try{//try para excepciones
                b=JOptionPane.showInputDialog(null,s);//leer desde el teclado
                for(int i=0;i<b.length();i++){//ciclo for para revisar el string
                    a=b.charAt(i);//hacer caracteres el string
                    if(Character.isLetter(a)){//if de revision de solo letras
                        
                    }else{//else para lanzar excepcion
                        throw new Exception();//lanzar excepcion
                    }
                }
                
                interruptor=false;//cambio del interruptor
            
            }catch(Exception Exception2){//cachar la expcepcion de no ser solo letras
                interruptor=true;//cambio del interruptor
                JOptionPane.showMessageDialog(null,"solo letras");//mensaje de error
            }
        }while(interruptor==true);//fin del ciclo do while
        return b;//retorno del String 
    }
}//fin de la clase
