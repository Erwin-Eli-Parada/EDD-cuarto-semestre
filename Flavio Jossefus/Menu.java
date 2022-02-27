import javax.swing.JOptionPane;
public class Menu
{
    public static void main(String []args){
        int a=Vista.leerentero("tamaño");
        int salto=Vista.leerentero3("salto",2);
        Arbol arbol;
        int menu;
        do{
            arbol=new Arbol(salto);
            agregar(0,a+1,arbol);
            menu=Vista.leerentero2("1.-in orden \n 2.-pos orden \n 3.-pre orden \n 4.-salir",5);
            switch(menu){
                case 1:
                    arbol.inorden();     
                    while(arbol.getraiz().getder()!=null || arbol.getraiz().getizq()!=null){
                         System.out.println("vuelta");
                         arbol.eliminarinorden(arbol.getraiz(),null);
                         arbol.busqueda0(arbol.getraiz(),null);
                         
                         System.out.println("\n");
                         arbol.inorden();
                    } 
                     System.out.println("la posicion segura inorden es:"+arbol.getraiz().getdato());
                break;
                case 2:
                    arbol.posorden();     
                    while(arbol.getraiz().getder()!=null || arbol.getraiz().getizq()!=null){
                         System.out.println("vuelta");
                         arbol.eliminarposorden(arbol.getraiz(),null);
                         arbol.busqueda0(arbol.getraiz(),null);
                         
                         System.out.println("\n");
                         arbol.posorden();
                    } 
                    System.out.println("la posicion segura posorden es:"+arbol.getraiz().getdato());
                break;
                case 3:
                    arbol.preorden();     
                    while(arbol.getraiz().getder()!=null || arbol.getraiz().getizq()!=null){
                         System.out.println("vuelta");
                         arbol.eliminarpreorden(arbol.getraiz(),null);
                         arbol.busqueda0(arbol.getraiz(),null);
                         /*int x=arbol.masderecha(arbol.getraiz());
                         arbol.eliminarinorden(arbol.getraiz(),null);
                         if(arbol.buscar(arbol.raiz,x)){
                             arbol.banner1=true;
                         }else{
                             arbol.setnum(1);
                         }*/
                         //arbol.setnum(arbol.getnum()+1);
                         //arbol.busqueda0(arbol.getraiz(),null);
                         System.out.println("\n");
                         arbol.preorden();
                    } 
                    System.out.println("la posicion segura preorden es:"+arbol.getraiz().getdato());
                break;
            }
        }while(menu!=4);
        
        /*no llego a funcionar del todo eliminar al mismo tiempo que recorre
         *actualiacion:funciona pero en saltos de 6 y 8 se no arroja el deseado corregir
        do{
            arbol=new Arbol(salto);
            agregar(0,a+1,arbol);
            menu=Vista.leerentero2("1.-in orden \n 2.-pos orden \n 3.-pre orden \n 4.-salir",5);
            switch(menu){
                case 1:
                    arbol.inorden();    
                    if(salto==2){
                        while(arbol.getraiz().getder()!=null || arbol.getraiz().getizq()!=null){
                            System.out.println("vuelta");
                            int x=arbol.masderecha(arbol.getraiz());
                            arbol.eliminarinorden(arbol.getraiz(),null);
                            if(arbol.buscar(arbol.raiz,x)==true){
                                arbol.banner1=true;
                            }else{
                                arbol.banner1=true;
                            }
                            arbol.inorden();
                        }   
                        System.out.println("la posicion segura inorden es:"+arbol.getraiz().getdato());
                    }else{
                        if(salto%2!=0){
                            while(arbol.getraiz().getder()!=null || arbol.getraiz().getizq()!=null){
                                System.out.println("vuelta");
                                
                                int x=arbol.masderecha(arbol.getraiz());
                                arbol.eliminarinorden(arbol.getraiz(),null);
                                if(arbol.buscar(arbol.raiz,x)==true){
                                    arbol.banner1=true;                        
                                }else{
                                    arbol.banner1=false;
                                }
                                arbol.inorden();
                            }   
                            System.out.println("la posicion segura inorden es:"+arbol.getraiz().getdato());
                        }else{
                            while(arbol.getraiz().getder()!=null || arbol.getraiz().getizq().getizq()!=null && arbol.getraiz().getizq().getder()!=null){
                                System.out.println("vuelta");
                                
                                int x=arbol.masderecha(arbol.getraiz());
                                arbol.eliminarinorden(arbol.getraiz(),null);
                                if(arbol.buscar(arbol.raiz,x)==true){
                                    arbol.banner1=false;
                                }else{
                                    arbol.banner1=false;
                                }
                                arbol.inorden();
                            }   
                            System.out.println("la posicion segura inorden es:"+arbol.getraiz().getdato());
                        }
                    }
                break;
                case 2:
                    arbol.posorden();    
                    if(salto==2){
                        while(arbol.getraiz().getder()!=null || arbol.getraiz().getizq()!=null){
                            System.out.println("vuelta");
                            int x=arbol.getraiz().getdato();
                            arbol.eliminarposorden(arbol.getraiz(),null);
                            if(arbol.buscar(arbol.raiz,x)==true){
                                arbol.banner1=true;
                            }else{
                                arbol.banner1=true;
                            }
                            arbol.posorden();
                        }   
                        System.out.println("la posicion segura posorden es:"+arbol.getraiz().getdato());
                    }else{
                        if(salto%2!=0){
                            while(arbol.getraiz().getder()!=null || arbol.getraiz().getizq()!=null){
                                System.out.println("vuelta");
                                
                                int x=arbol.getraiz().getdato();
                                arbol.eliminarposorden(arbol.getraiz(),null);
                                if(arbol.buscar(arbol.raiz,x)==true){
                                    arbol.banner1=true;                        
                                }else{
                                    arbol.banner1=false;
                                }
                                arbol.posorden();
                            }   
                            System.out.println("la posicion segura posorden es:"+arbol.getraiz().getdato());
                        }else{
                            while(arbol.getraiz().getder()!=null || arbol.getraiz().getizq().getizq()!=null ){
                                System.out.println("vuelta");
                                
                                int x=arbol.getraiz().getdato();
                                arbol.eliminarposorden(arbol.getraiz(),null);
                                if(arbol.buscar(arbol.raiz,x)==true){
                                    arbol.banner1=false;
                                }else{
                                    arbol.banner1=false;
                                }
                                arbol.posorden();
                            }   
                            System.out.println("la posicion segura posorden es:"+arbol.getraiz().getdato());
                        }
                    }
                break;
                case 3:
                    arbol.preorden();    
                    if(salto==2){
                        while(arbol.getraiz().getder()!=null || arbol.getraiz().getizq()!=null){
                            System.out.println("vuelta");
                            int x=arbol.masderecha(arbol.getraiz());
                            arbol.eliminarpreorden(arbol.getraiz(),null);
                            if(arbol.buscar(arbol.raiz,x)==true){
                                arbol.banner1=true;
                            }else{
                                arbol.banner1=true;
                            }
                            arbol.preorden();
                        }   
                        System.out.println("la posicion segura preorden es:"+arbol.getraiz().getdato());
                    }else{
                        if(salto%2!=0){
                            while(arbol.getraiz().getder()!=null || arbol.getraiz().getizq()!=null){
                                System.out.println("vuelta");
                                
                                int x=arbol.masderecha(arbol.getraiz());
                                arbol.eliminarpreorden(arbol.getraiz(),null);
                                if(arbol.buscar(arbol.raiz,x)==true){
                                    arbol.banner1=true;                        
                                }else{
                                    arbol.banner1=false;
                                }
                                arbol.preorden();
                            }   
                            System.out.println("la posicion segura preorden es:"+arbol.getraiz().getdato());
                        }else{
                            while(arbol.getraiz().getder()!=null || arbol.getraiz().getizq().getizq()!=null ){
                                System.out.println("vuelta");
                                
                                int x=arbol.masderecha(arbol.getraiz());
                                arbol.eliminarpreorden(arbol.getraiz(),null);
                                if(arbol.buscar(arbol.raiz,x)==true){
                                    arbol.banner1=false;
                                }else{
                                    arbol.banner1=false;
                                }
                                arbol.preorden();
                            }   
                            System.out.println("la posicion segura preorden es:"+arbol.getraiz().getdato());
                        }
                    }
                break;
            }    
        }while(menu!=4);*/ 
    }
    //agregar para que tenga forma de arbol :v
    public static void agregar(int inf,int sup,Arbol arbol){
        int a=(inf+sup)/2;
        if(a>inf && a<sup){
            arbol.insertar(a);
            agregar(inf,a,arbol);
            agregar(a,sup,arbol);
        }
    }
}
