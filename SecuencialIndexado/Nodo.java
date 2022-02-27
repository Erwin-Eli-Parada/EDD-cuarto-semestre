public class Nodo
{
     String dato;
     int numero;
     Nodo siguiente;
     public Nodo(String entrada,int numero, Nodo sig){ 
         dato = entrada;
         siguiente= sig;
         this.numero=numero;
     }
     public String getDato()
     { return dato; }
     public int getnumero(){
         return numero;
     }
     public void setnumero(int numero){
         this.numero=numero;
     }
     public Nodo getsiguiente()
     { return siguiente; }
     public void setsiguiente(Nodo sig)
     { this.siguiente = sig; }
}
