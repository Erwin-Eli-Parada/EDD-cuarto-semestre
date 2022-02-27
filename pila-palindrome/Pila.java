public class Pila
{
    private Object[] datos;
    private int tope,max;
    public Pila(int max){
        datos=new Object[max];
        this.max=max;
        tope=-1;
    }
    public boolean empty(){
        return tope==-1;
    }
    public boolean full(){
        return tope==max-1;
    }
    public boolean push(Object x){
        if(!full()){
            tope++;
            datos[tope]=x;
            return true;
        }
        return false;
    }
    public Object pop(){
        if(!empty()){
            Object aux=datos[tope];
            tope--;
            return aux;
        }
        return null;
    }
    public Object vertope(){
        if(!empty()){
            return datos[tope];
        }
        return null;
    }
    public int gettope(){
        return tope;
    }
}
