import java.util.*;
public class ArrePer 
{
    private Persona[] per=new Persona[100];
    private int a=0;
    public ArrePer(){ }
    public void agregar(Persona p){
        per[a]=p;
        a++;
    }
    public int tamaño(){
        return per.length;
    }
    public Persona posicion(int x){
        return per[x];
    }
    public void ordenar(int x){
        Persona aux;
        for(int i=0;i<per.length-1;i++){
            for(int j=i+1;j<per.length;j++){
                if(per[i].comparar(x,per[j])>0){
                    aux=per[i];
                    per[i]=per[j];
                    per[j]=aux;
                }
            }
        }
    }
}
