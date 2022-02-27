public class Lista
{
    private Object []arre;
    private int last;
    public Lista(){
        arre=new Object [100];
        for(int i=0;i<10;i++){
            arre[i]=new Celular(Archivo.leerarchivo("Marca"),Double.parseDouble(Archivo.leerarchivo("Resolucion")),Double.parseDouble(Archivo.leerarchivo("tamaño_pantalla")),Integer.parseInt(Archivo.leerarchivo("memoria")),Archivo.leerarchivo("Procesador"));
            last=i;
        }
        /*for(int i=0;i<=last;i++){
            Celular a=(Celular)arre[i];
            System.out.println(a.getmarca()+" "+a.getmemoria());
        }**/
    }
    public Object verPosicion(int x){
        return arre[x];
    }
    public void agregar_final(Object o){
        if(last<arre.length){
            arre[last+1]=o;
            last++;
        }else{
            System.out.println("ya esta lleno");
        }
    }
    public void agregar_posicion(Object o,int x){
        if(x<arre.length){
        if(last<arre.length){
            for(int i=last;i>=x;i--){
                arre[i+1]=arre[i];
            }
            arre[x]=o;
            last++;
        }else{
            System.out.println("ya esta lleno");
        }
        }else{
            System.out.println("no existe la posicion, por lo tanto no se agregó");
        }
    }
    public void agregar_principio(Object o){
        if(last<arre.length){
            for(int i=last;i>=0;i--){
                arre[i+1]=arre[i];
            }
            arre[0]=o;
            last++;
        }else{
            System.out.println("ya esta lleno");
        }
    }
    public void eliminar_final(){
        if(last>=0){
            arre[last]=null;
            last--;
        }else{
            System.out.println("ya esta vacio");
        }
    }
    public void eliminar_principio(){
        if(last>=0){
            for(int i=1;i<=last;i++){
                arre[i-1]=arre[i];
            }
            arre[last]=null;
            last--;
        }else{
            System.out.println("ya esta vacio");
        }
    }
    public void eliminar_posicion(int x){
        if(last>=0){
            for(int i=x;i<=last;i++){
                arre[i]=arre[i+1];
            }
            arre[last]=null;
            last--;
        }else{
            System.out.println("ya esta vacio");
        }
    }
    public Object[] regresararreglo(){
        return arre;
    }
    public int getlast(){
        return last;
    }
}
