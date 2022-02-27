public class ListaDoblementeLigada
{
    Nodo head=null;
    Nodo fin=null;
    public Nodo buscar(Object o){
        if(head==null){
            return null;
        }
        Nodo n=head;
        while(n.getsig()!=null){
            if(n.getdato()==o){
                return n;
            }
            n=n.getsig();
        }
        return null;
    }
    public boolean agregarantesdex(Object o,Object x){
        Nodo busqueda=buscar(x);
        if(o==null || x==null|| busqueda==null ){
            return false;
        }
        if(x==head.getdato()){
            return agregarinicio(o);
        }
        Nodo n=new Nodo(busqueda,busqueda.getant(),o);
        if(n==null){
            return false;
        }
        busqueda.getant().setsig(n);
        busqueda.setant(n);
        return true;
    }
    public boolean agregadespuesdex(Object o,Object x){
        Nodo busqueda=buscar(x);
        if(o==null || x==null|| busqueda==null ){
            return false;
        }
        if(x==fin.getdato()){
            return insetarfinal(o);
        }
        Nodo n=new Nodo(busqueda.getsig(),busqueda,o);
        if(n==null){
            return false;
        }
        busqueda.getsig().setant(n);
        busqueda.setsig(n);
        return true;
    }
    public Object elminardespuesdex(Object x){
        Nodo busqueda=buscar(x);
        if(x==null|| busqueda==null || x==fin.getdato()){
            return null;
        }
        if(x==fin.getant()){
            return eliminarfinal();
        }
        Object o=busqueda.getsig().getdato();
        busqueda.getsig().getsig().setant(busqueda);
        busqueda.setsig(busqueda.getsig().getsig());
        return o;
    }
    public Object eliminarfinal(){
        if(head==null){
            return null;
        }
        Object o=fin.getdato();
        if(head==fin){
            fin=head=null;
            return o;
        }
        fin=fin.getant();
        fin.setsig(null);
        return o;
    }
    public Object eliminarinicio(){
        if(head==null){
            return null;
        }
        Object o=head.getdato();
        if(head==fin){
            fin=head=null;
            return o;
        }
        head=head.getsig();
        head.setant(null);
        return o;
    }
}
