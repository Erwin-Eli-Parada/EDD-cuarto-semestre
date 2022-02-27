public class ListaCD
{
    Nodo fin;
    Nodo cab;
    public boolean agregarencabecera(Object dato){
        Nodo nuevo=new Nodo(dato,fin,cab);
        if (nuevo==null || dato==null ) return false;
        if (cab==null){ 
            nuevo.setsig(nuevo);
            nuevo.setant(nuevo);
            cab=fin=nuevo;
        }else{
            cab.setant(nuevo);
            fin.setsig(nuevo);
            cab=nuevo;
        }
        return true;
    }
    public boolean agregarfinal(Object dato){
        Nodo nuevo=new Nodo(dato,fin,cab);
        if(nuevo==null || dato==null) return false;
        if (cab==null){ 
            return agregarencabecera(dato);
        }else{
            cab.setant(nuevo);
            fin.setsig(nuevo);
            fin=nuevo;
        }
        return true;
    }
    public boolean agregarantesdex(Object dato,Object x){
        if(dato==null || x==null || cab==null){ return false;}
        Nodo aux=cab;
        do{
            if(aux.getdato()==x){
                Nodo nuevo=new Nodo(dato,aux.getant(),aux);
                if(nuevo==null){return false;}
                aux.getant().setsig(nuevo);
                aux.setant(nuevo);
                return true;
            }
            aux=aux.getsig();
        }while(aux!=cab);
        return false;
    }
    public boolean agregardespuesdex(Object dato,Object x){
        if(dato==null || x==null || cab==null){ return false;}
        Nodo aux=cab;
        do{
            if(aux.getdato()==x){
                Nodo nuevo=new Nodo(dato,aux,aux.getsig());
                if(nuevo==null){return false;}
                aux.getsig().setant(nuevo);
                aux.setsig(nuevo);
                return true;
            }
            aux=aux.getsig();
        }while(aux!=cab);
        return false;
    }
    public void mostrarlista(){
        if(cab!=null){
            Nodo aux=cab;
            do{
                System.out.println(aux.getdato().toString());
                aux=aux.getsig();
            }while(aux!=cab);
        }else{
            System.out.println("está vacia");
        }
    }
    public Object eliminarcabecera(){
        if(cab==null){return null;}
        Object aux=cab.getdato();
        if(aux==fin){
            cab=fin=null;
        }else{
            cab.getsig().setant(fin);
            fin.setsig(cab.getsig());
            cab=cab.getsig();
        }
        return aux;
    }
    public Object eliminarfinal(){
        if(cab==null){return null;}
        Object aux=fin.getdato();
        if(aux==fin){
            cab=fin=null;
        }else{
            fin.getant().setsig(cab);
            cab.setant(fin.getant());
            fin=fin.getant();
        }
        return aux;
    }
    public Object eliminarantesdex(Object x){
        if(cab!=null || x!=null){
            if(cab==fin){return eliminarcabecera();}
            Nodo aux=cab;
            Object o;
            do{
                if(aux.getdato()==x){
                    if(aux==cab.getsig()){return eliminarcabecera();}
                    if(aux==cab){return eliminarfinal();}
                    o=aux.getant().getdato();
                    aux.getant().getant().setsig(aux);
                    aux.setant(aux.getant().getant());
                    return o;
                }
                aux=aux.getsig();
            }while(aux!=cab);
        }
        return null;
    }
    public Object eliminardespuesdex(Object x){
        if(cab!=null || x!=null){
            if(cab==fin){return eliminarcabecera();}
            Nodo aux=cab;
            Object o;
            do{
                if(aux.getdato()==x){
                    if(aux==fin.getant()){return eliminarfinal();}
                    if(aux==fin){return eliminarcabecera();}
                    o=aux.getsig().getdato();
                    aux.getsig().getsig().setant(aux);
                    aux.setsig(aux.getsig().getsig());
                    return o;
                }
                aux=aux.getsig();
            }while(aux!=cab);
        }
        return null;
    }
}
