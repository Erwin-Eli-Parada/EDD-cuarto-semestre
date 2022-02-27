public class Nodo//inicio de la clase 
{
    Numero dato;//declaracion del atributo dato de tipo numero
    Nodo siguiente;//declaracion del atributo siguiente
    public Nodo(Numero entrada, Nodo sig){ //constructor de la clase
        dato = entrada;//asignacion de valor al dato
        siguiente= sig;//asignacion de valor a siguiente
    }
    public Numero getDato()//metodo get dato
    { return dato; }//retorno del dato
    public Nodo getsiguiente()//metodo get siguiente
    { return siguiente; }//retorno del siguiente
    public void setsiguiente(Nodo sig)//metodo set siguiente
    { this.siguiente = sig; }//asignacion del valor a siguiente
}
