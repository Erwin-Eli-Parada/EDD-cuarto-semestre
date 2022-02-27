public class Celular
{
    private String marca;
    private double resolucion;
    private double pantalla;
    private int memoria;
    private String procesador;
    public Celular(String marca,double resolucion,double pantalla,int memoria,String procesador){
        setmarca(marca);
        setresolucion(resolucion);
        setpantalla(pantalla);
        setmemoria(memoria);
        setprocesador(procesador);
    }
    public void setmarca(String marca){
        this.marca=marca;
    }
    public void setresolucion(double resolucion){
        this.resolucion=resolucion;
    }
    public void setpantalla(double pantalla){
        this.pantalla=pantalla;
    }
    public void setmemoria(int memoria){
        this.memoria=memoria;
    }
    public void setprocesador(String procesador){
        this.procesador=procesador;
    }
    public String getmarca(){
        return marca;
    }
    public double getresolucion(){
        return resolucion;
    }
    public double getpantalla(){
        return pantalla;
    }
    public int getmemoria(){
        return memoria;
    }
    public String getprocesador(){
        return procesador;
    }
    public String toString(){
        return marca+" "+resolucion+" Megapixeles "+pantalla+" Pulgadas "+memoria+"G "+procesador;
    }
}
