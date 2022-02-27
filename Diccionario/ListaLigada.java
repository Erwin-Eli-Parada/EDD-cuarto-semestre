public class ListaLigada//incio de la clase Lista Ligada
{
    private Nodo cab;//declaracion del nodo inicial
    private Nodo fin;//declaracion del nodo final
    public ListaLigada(){//constructor de la clase
        cab=null;//asignacion de valor nulo al primer nodo
    }
    public boolean agregarinicio(Numero o){//metodo agregar al inicio
        if(o!=null){//verificacion de que no reciva valores nulos
            if(cab==null)//chechar si es el primer nodo
                cab=fin=new Nodo(o,null);//creacion del primer nodo
            else//else si no es el primer nodo
                cab=new Nodo(o,cab);//poner el primero y enlazarlo al anterior primero
            return true;//retornar true 
        }else return false;//retorno de falso
    }
    public Numero eliminaralinicio(){//metodo eliminar al inicio
        Numero o=null;//declaracion de variable auxiliar
        if(cab!=null){//verificar que la lista no esta vacia
            o=cab.getDato();//asignacion de valor a la variable o
            cab=cab.getsiguiente();//movimiento del primer elemento
            if (cab==null) fin=null;//si quedo vacia asigna como fin null
       }
       return o;//retorno de o
    }
    public boolean insertarfinal(Numero o){//metodo para insertar al final
        if (o==null) return false;//verificacion de no recibir un valor nulo
        if(cab==null)//si esta vacia
            fin=cab=new Nodo(o,null);//cabeza y fin seran el nuevo nodo
        else{  //else tenga algo
            Nodo n=new Nodo(o,null);//n sera el nuevo nodo
            fin.setsiguiente(n);//fin apuntara a n
            fin=n;//n sera el nuevo fin
        }
        return true;//retorna true
    }
    public Numero eliminarfinal(){//metodo eliminar al final
        Numero o=null;//declaracion de una variable auxiliar o
        if (cab==null) return null;//verificacion de que no este vacia
        if  (cab.getsiguiente()==null)//si es un solo valor
        { o=cab.getDato(); cab=fin=null;return o;}//cabeza y fin seran nulos y asigna valor a o y retorna o
        Nodo aux =cab;//declaracion de una segunda variable auxiliar aux
        while (aux.getsiguiente()!=fin)//ciclo while para terminar uno antes del final             
            aux=aux.getsiguiente();//recorrimiento del auxiliar
        o= fin.getDato();//asignacion de valor a o
        fin=aux;//asignacion del nuevo fin
        fin.setsiguiente(null);//quitar apuntador al anterior fin
        return o;//retorno de o
    }
    public boolean insertarpos(int pos,Numero o){//metodo para insertar en una posicion 
        int cont=1;//inicio de contador en uno
        boolean quepaso=false;//verificador booleano
        if(o!=null){//verificador que no se agreguen valores nulos
            for(Nodo n=cab;n!=null;n=n.getsiguiente()){//ciclo for desde la cabeza hasta el final
                if(cont==pos-1){//paro en el nodo anterior a la posicion
                    Nodo nuevo=new Nodo(o,n.getsiguiente());//creacion del nuevo nodo
                    n.setsiguiente(nuevo);//apuntador al nuevo nodo
                    quepaso=true;//retorno true
                }
                cont++; //aumento de contador
            }
        }//fin del ciclo
        return quepaso; //retorno del booleano
    }
    public boolean agregardespuesde(Numero o,Numero oo){//metodo agregar despues
        for(Nodo n=cab;n!=null;n=n.getsiguiente()){//ciclo for desde el principio hasta el final
            if(n.getDato().toString().compareTo(o.toString())==0){//donde se agregara
                Nodo aux=n.getsiguiente();////declaracion de nodo siguiente
                n.setsiguiente(new Nodo(oo,aux));  //creacion de nuevo nodo
                return true; //retorno verdadero
            }
        }//Final del ciclo
        return false;//retorno falso
    }
    public boolean agregarantesde(Numero o,Numero agregar){//metodo agregar antes de
        for(Nodo n=cab;  n!=null; n=n.getsiguiente()){//ciclo desde principio hasta el final
            if(n.getsiguiente().getDato().toString().compareTo(o.toString())==0) {//donde se va a agregar
                Nodo aux=n.getsiguiente();//declaracion del nodo siguiente
                n.setsiguiente(new Nodo(agregar,aux));//creacion del nuevo nodo
                return true;    //retorno true
            }
        }//fin del ciclo
        return false;//retorno de falso
    }
    public Numero eliminardespuesde(Numero o){//metodo eliminar despues de 
        Numero aux=null;//declaracion del auxiliar
        for(Nodo n=cab;n!=null;n=n.getsiguiente()){//ciclo for desde el principo hasta el fin de la lista
            if(n.getDato().toString().equalsIgnoreCase(o.toString())){//lugar donde se va a eliminar
                if (n.getsiguiente()==null) //si es despues del ultimo
                    return null;//retorna null
                else{ //si no es  despues del ultimo
                    aux= n.getsiguiente().getDato();//asignacion de valor a aux
                    n.setsiguiente(n.getsiguiente().getsiguiente());//cambio del apuntador anterior al siguiente
                }
            }     
        }//fin del ciclo
        return aux;//retorno del auxiliar
    }
    public Numero eliminarenpos(int pos){//metodo eliminar en posicion 
        if (pos<1) return null; //si es menor que uno retorna nulo
        if (pos==1)   return eliminaralinicio();//si es uno ejecuta el metodo eliminar al inicio
        int cont=1;//inicia un contador en 1
        Numero aux=null;//inicia una variable auxiliar
        for(Nodo n=cab;n!=null;n=n.getsiguiente()){//ciclo for de principio a fin
           if(cont==pos-1){//posicion anterior a la indicada
                aux=n.getsiguiente().getDato();//dar valor al auxiliar de la posicion indicada
                if (n.getsiguiente().getsiguiente()!=null) //si no es el ultimo
                    n.setsiguiente(n.getsiguiente().getsiguiente());//apunta al siguiente
                else{ //si es el ultimo
                    return eliminarfinal();//ejecuta el metodo eliminar final
                }
           }
           cont++;//aumenta el contador
        }//fin del ciclo for
        return aux;//retorna el auxiliar
    }
    public Nodo getcab(){//metodo get cabeza
        return cab;   //retorna el primer nodo
    }
    public Nodo getfin(){//metodo get fin
        return fin;   //retorna el ultimo nodo
    }
    public boolean encontrar(int x){//metodo encontrar valores repetidos
        for(Nodo n=cab;  n!=null; n=n.getsiguiente()){//ciclo for de principio a fin
            if(n.getDato().getentero()==x) {//si coincide con la busqueda
                return false;//retorna falso
            }
        }
        return true;//retorna verdadero
    }
    public Numero encontrarnumero(int x){//metodo encontrar por numero
        for(Nodo n=cab;  n!=null; n=n.getsiguiente()){//ciclo de principio a fin
            if(n.getDato().getentero()==x) {//condicion de que si lo encuentra
                return n.getDato();//retorna el valor del nodo
            }
        }
        return null;//retorna nulo
    }
    public Numero encontrartexto(String s){//metodo encontrar por texto
        for(Nodo n=cab;  n!=null; n=n.getsiguiente()){//ciclo for de principio a fin
            if(n.getDato().gettexto().equalsIgnoreCase(s)) {//condicion de si encuentra el texto
                return n.getDato();//retorna el numero del nodo
            }
        }
        return null;//retorna nulo
    }
    public Numero encontraringles(String s){//metodo encontrar el texto en ingles
        for(Nodo n=cab;  n!=null; n=n.getsiguiente()){//ciclo for de princpio a fin
            if(n.getDato().getingles().equalsIgnoreCase(s)) {//condicion de si encuentra el texto en ingles
                return n.getDato();//retorna el numero del nodo
            }
        }
        return null;//retorna nulo
    }
}//fin de la clase
