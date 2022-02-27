public class ListaLigada
{
    private Nodo cab;
    private Nodo fin;
    public ListaLigada(){
        cab=null;
    }
    public boolean insertarfinal(String o,int num){
        if (o==null) return false;
        if(cab==null)
            fin=cab=new Nodo(o,num,null);
        else{  
            Nodo n=new Nodo(o,fin.getnumero()+1,null);
            fin.setsiguiente(n);
            fin=n;
        }
        return true;
    }
    public Object eliminarfinal(){
        Object o=null;
        if (cab==null) return null;
        if  (cab.getsiguiente()==null)
        { o=cab.getDato(); cab=fin=null;return o;}
        Nodo aux =cab;
        while (aux.getsiguiente()!=fin)             
            aux=aux.getsiguiente();
        o= fin.getDato();
        fin=aux;
        fin.setsiguiente(null);
        return o;
    }
    public void verfin(){
        System.out.println(fin.getDato());
    }
    public int encontrartexto(String s){
        for(Nodo n=cab;  n!=null; n=n.getsiguiente()){
            if(n.getDato().equalsIgnoreCase(s)){
                return n.getnumero();
            }
        }
        return -1;
    }
}
