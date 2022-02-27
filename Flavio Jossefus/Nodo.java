public class Nodo
{
    Nodo izq;
    Nodo der;
    int dato;
    public Nodo(int dato,Nodo izq,Nodo der){
        this.izq=izq;
        this.dato=dato;
        this.der=der;
    }
    public void setizq(Nodo izq){
        this.izq=izq;
    }
    public void setder(Nodo der){
        this.der=der;
    }
    public void setdato(int dato){
        this.dato=dato;
    }
    public Nodo getizq(){
        return izq;
    }
    public Nodo getder(){
        return der;
    }
    public int getdato(){
        return dato;
    }
}
