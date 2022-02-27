public class Arbol
{
    Nodo raiz=null;
    int salto;
    int num=1;
    boolean banner1=false;
    public Arbol(int salto){
        this.salto=salto;
    }
    public boolean insertar (int x){
        if (raiz==null){ 
            raiz=new Nodo(x,null,null); 
            return true;
        }
        Nodo aux=raiz,ant=null;
        while (aux!=null && aux.getdato()!=x){
            ant=aux;
            if (aux.getdato()>x)
                aux=aux.getizq();
            else 
                aux=aux.getder();
        }
        if (aux!=null)  
            return false;
        Nodo n=new Nodo(x,null,null);
        if  (n==null) 
            return false;
        if (ant.getdato()>x)
            ant.setizq(n);
        else 
            ant.setder(n);
        return true;
    }
    public Nodo borrarNodo(Nodo n){
        if(n.getizq()==null){
            return n.getder();
        }else{
            if(n.getder()==null){
                return n.getizq();
            }else{
                Nodo aux=n.getder(),ante =null;
                while(aux.getizq()!=null){
                    ante=aux;
                    aux=aux.getizq();
                }
                n.setdato(aux.getdato());
                if(ante!=null){
                    ante.setizq(aux.getder());
                }else{
                    n.setder(aux.getder());
                }
                return n;
            }
        }
    }
    //por si acaso
    public Nodo borrarNodo2(Nodo n){
        if(n.getizq()==null){
            return n.getder();
        }else{
            if(n.getder()==null){
                return n.getizq();
            }else{
                Nodo aux=n.getizq(),ante =null;
                while(aux.getder()!=null){
                    ante=aux;
                    aux=aux.getder();
                }
                n.setdato(aux.getdato());
                if(ante!=null){
                    ante.setder(aux.getizq());
                }else{
                    n.setizq(aux.getizq());
                }
                return n;
            }
        }
    }
    public void inorden(){ 
        ayudainorden(raiz);
    }
    private void ayudainorden(Nodo aux){ 
        if (aux!=null){
            ayudainorden(aux.getizq());
            System.out.println(aux.getdato());
            ayudainorden(aux.getder());
        }
    }
    public void posorden(){ 
        ayudaposorden(raiz);
    }
    private void ayudaposorden( Nodo aux){ 
        if (aux!=null){
            ayudaposorden(aux.getizq());
            ayudaposorden(aux.getder());
            System.out.println(aux.getdato());
        }
    } 
    public void preorden(){ 
        ayudapreorden(raiz);
    }
    private void ayudapreorden( Nodo aux){ 
        if (aux!=null){
            System.out.println(aux.getdato());
            ayudapreorden(aux.getizq());
            ayudapreorden(aux.getder());
            
        }
    }
    /* funciona de cierta manera
    public void eliminarinorden(Nodo aux,Nodo ant){ 
        if (aux!=null){
            eliminarinorden(aux.getizq(),aux);
            if(num%salto==0){
                if(raiz==aux){
                    raiz=borrarNodo(aux);
                    aux=raiz;
                    if(banner1==false){
                        num++;
                    }
                }else{
                    if(ant.getizq()==aux){
                        ant.setizq(borrarNodo(aux));
                        aux=ant.getizq();
                        if(banner1==false && ant.getizq()!=null){
                            num++;
                            
                        }
                    }else{
                        ant.setder(borrarNodo(aux));
                        aux=ant.getder();
                        if(banner1==false && ant.getder()!=null){
                            num++;
                                                    
                        }
                    }
                }
                banner1=false;
            }
            num++;
            if(aux!=null)
            eliminarinorden(aux.getder(),aux);
        }
    }
    public void eliminarposorden(Nodo aux,Nodo ant){ 
        if (aux!=null){
            eliminarposorden(aux.getizq(),aux);
            eliminarposorden(aux.getder(),aux);
            if(num%salto==0){
                if(raiz==aux){
                    raiz=borrarNodo(aux);
                    aux=raiz;
                    if(banner1==false){
                        num++;
                    }
                }else{
                    if(ant.getizq()==aux){
                        ant.setizq(borrarNodo(aux));
                        aux=ant.getizq();
                        if(banner1==false && ant.getizq()!=null){
                            num++;
                            
                        }
                    }else{
                        ant.setder(borrarNodo(aux));
                        aux=ant.getder();
                        if(banner1==false && ant.getder()!=null){
                            num++;
                                                    
                        }
                    }
                }
                banner1=false;
            }
            num++;
        }
    }
    public void eliminarpreorden(Nodo aux,Nodo ant){ 
        if (aux!=null){
            if(num%salto==0){
                if(raiz==aux){
                    raiz=borrarNodo2(aux);
                    aux=raiz;
                    if(banner1==false){
                        num++;
                    }
                }else{
                    if(ant.getizq()==aux){
                        ant.setizq(borrarNodo2(aux));
                        aux=ant.getizq();
                        if(banner1==false){
                            num++;
                            
                        }
                    }else{
                        ant.setder(borrarNodo2(aux));
                        aux=ant.getder();
                        if(banner1==false){
                            num++;
                                                    
                        }
                    }
                }
                banner1=false;
            }
            num++;
            if(aux!=null){
                eliminarpreorden(aux.getizq(),aux);
                eliminarpreorden(aux.getder(),aux);
            }
        }
    }
    public void ayuda(Nodo aux,Nodo ant){
        if(num%salto==0){
                if(raiz==aux){
                    raiz=borrarNodo(aux);
                    if(banner1==false){
                        num++;
                    }
                }else{
                    if(ant.getizq()==aux){
                        ant.setizq(borrarNodo(aux));
                        if(banner1==false && ant.getizq()!=null){
                            num++;
                            System.out.println(ant.getdato()+"ahora a punta la izquierda a "+ant.getizq().getdato()+" "+num);
                        }
                    }else{
                        ant.setder(borrarNodo(aux));
                        if(banner1==false && ant.getder()!=null){
                            num++;
                            System.out.println(ant.getdato()+"ahora a punta la derecha a "+ant.getder().getdato()+" "+num);
                        
                        }
                    }
                }
                banner1=false;
        }
        num++;
    }*/
    //terminar mañana al mayor de ellos y hacer metodo de busqueda para que como es el arbol
    public int masderecha(Nodo n){
        if(n.getder()==null){
            return n.getdato();
        }
        return masderecha(n.getder()); 
    }
    public boolean buscar(Nodo n,int a){
        if(n!=null){
            if(n.getdato()==a){
                return true;
            }
            buscar(n.getder(),a);
        }
        return false;
    }
    public void eliminarinorden(Nodo aux,Nodo ant){ 
        if (aux!=null){
            eliminarinorden(aux.getizq(),aux);            
            if(num%salto==0){
                aux.setdato(0);          
            }
            num++;
            eliminarinorden(aux.getder(),aux);
        }
    }
    public void eliminarposorden(Nodo aux,Nodo ant){ 
        if (aux!=null){
            eliminarposorden(aux.getizq(),aux);
            eliminarposorden(aux.getder(),aux);
            if(num%salto==0){
                aux.setdato(0);          
            }
            num++;
        }
    }
    public void eliminarpreorden(Nodo aux,Nodo ant){ 
        if (aux!=null){
            if(num%salto==0){
                aux.setdato(0);          
            }
            num++;
            eliminarpreorden(aux.getizq(),aux);
            eliminarpreorden(aux.getder(),aux);
            
        }
    }
    public void busqueda0(Nodo aux,Nodo ant){
        if (aux!=null){
            busqueda0(aux.getizq(),aux);
            if(aux.getdato()==0){
                if(raiz==aux){
                    raiz=borrarNodo(aux);
                    aux=raiz;
                    if(aux!=null && aux.getdato()==0){
                            if(raiz==aux){
                                raiz=borrarNodo(aux);
                                aux=raiz;
                            }else{
                                if(ant.getizq()==aux){
                                    ant.setizq(borrarNodo(aux));
                                    aux=ant.getizq();
                        
                                }else{
                                    ant.setder(borrarNodo(aux));
                                    aux=ant.getder();
                                }
                            }
                        }
                }else{
                    if(ant.getizq()==aux){
                        ant.setizq(borrarNodo(aux));
                        aux=ant.getizq();
                        if(aux!=null && aux.getdato()==0){
                            if(raiz==aux){
                                raiz=borrarNodo(aux);
                                aux=raiz;
                            }else{
                                if(ant.getizq()==aux){
                                    ant.setizq(borrarNodo(aux));
                                    aux=ant.getizq();
                        
                                }else{
                                    ant.setder(borrarNodo(aux));
                                    aux=ant.getder();
                                }
                            }
                        }
                    }else{
                        ant.setder(borrarNodo(aux));
                        aux=ant.getder();
                        if(aux!=null && aux.getdato()==0){
                            if(raiz==aux){
                                raiz=borrarNodo(aux);
                                aux=raiz;
                            }else{
                                if(ant.getizq()==aux){
                                    ant.setizq(borrarNodo(aux));
                                    aux=ant.getizq();
                        
                                }else{
                                    ant.setder(borrarNodo(aux));
                                    aux=ant.getder();
                                }
                            }
                        }
                    }
                }
            }
            if(aux!=null)
            busqueda0(aux.getder(),aux);
        }
    }
    
    public Nodo getraiz(){
        return raiz;
    }
    public int getnum(){
        return num;
    }
    public void setnum(int num){
        this.num=num;
    }
}
