public class Nodo
{
    private Nodo sig;
    private Nodo ant;
    private Object dato;
    public Nodo(Object o,Nodo ant,Nodo sig){
        setsig(sig);
        setant(ant);
        setdato(o);
    }
    public void setsig(Nodo n){
        sig=n;
    }
    public void setant(Nodo n){
        ant=n;
    }
    public void setdato(Object o){
        dato=o;
    }
    public Nodo getsig(){
        return sig;
    }
    public Nodo getant(){
        return ant;
    }
    public Object getdato(){
        return dato;
    }
}
