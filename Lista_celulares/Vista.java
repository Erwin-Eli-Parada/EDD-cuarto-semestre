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
 public static double leerdobles(String s){      
        boolean banner1= true;
        double menu=0;
        while(banner1==true)
            try{
                menu=Double.parseDouble(JOptionPane.showInputDialog(s));
                banner1=false;    
            }catch(NumberFormatException miException){
                JOptionPane.showMessageDialog(null,"dije numero");
                    banner1=true;                             
            }
        return menu;        
 }
}
