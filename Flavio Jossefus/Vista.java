import javax.swing.JOptionPane;
public class Vista
{
    public static int leerentero(String s){      
        boolean banner1= true;
        int menu=0;
        while(banner1==true)
            try{
                menu=Integer.parseInt(JOptionPane.showInputDialog(s));
                if(menu<=0)
                    throw new Exception();
                banner1=false;    
            }catch(NumberFormatException miException){
                JOptionPane.showMessageDialog(null,"dije numero");
                    banner1=true;                       
            }catch(Exception Exception2){
                JOptionPane.showMessageDialog(null,"dije opcion de las que dije");
                banner1=true;           
            }  
        return menu;        
 }
 public static int leerentero2(String s,int x){      
        boolean banner1= true;
        int menu=0;
        while(banner1==true)
            try{
                menu=Integer.parseInt(JOptionPane.showInputDialog(s));
                if(menu<0 || menu>=x)
                    throw new Exception();
                banner1=false;    
            }catch(NumberFormatException miException){
                JOptionPane.showMessageDialog(null,"dije numero");
                    banner1=true;                       
            }catch(Exception Exception2){
                JOptionPane.showMessageDialog(null,"dije opcion de las que dije");
                banner1=true;           
            }  
        return menu;        
 }
 public static int leerentero3(String s,int x){      
        boolean banner1= true;
        int menu=0;
        while(banner1==true)
            try{
                menu=Integer.parseInt(JOptionPane.showInputDialog(s));
                if(menu<x)
                    throw new Exception();
                banner1=false;    
            }catch(NumberFormatException miException){
                JOptionPane.showMessageDialog(null,"dije numero");
                    banner1=true;                       
            }catch(Exception Exception2){
                JOptionPane.showMessageDialog(null,"dije un salto mayor o igual a 2");
                banner1=true;           
            }  
        return menu;        
 }
}
