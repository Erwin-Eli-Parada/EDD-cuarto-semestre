import java.time.*;
public class Test
{
    
    public static void main(String []args){
        int []arre1={1,2,3,4,5,6,7,8,9};
        int []arre2={2,3,9,1,8,4,6,3,5};
        int []arre3={9,8,7,6,5,4,3,2,1};
        int []arre4=new int[10];
        int []arre5=new int[100];
        int []arre6=new int[1000000];
        int []arrex=new int[100000000];
        int []arre7=new int[100000000];
        rellenar(arre7);
        for(int i=0;i<arre7.length;i++){
            arrex[i]=arre7[i];
        }
        //for(int i=0;i<arre7.length;i++){
        //    System.out.println(arre7[i]);
        //}
        //
        LocalTime empieza= LocalTime.now();
        quicksort(arre7,0,arre7.length-1);
        LocalTime termina= LocalTime.now();
        System.out.printf("el quicksort tardo: %d horas con %d minutos %d segundos %d nanosegundos",(termina.getHour()-empieza.getHour()),(termina.getMinute()-empieza.getMinute()),(termina.getSecond()-empieza.getSecond()),(termina.getNano()-empieza.getNano()));
        //for(int i=0;i<arre7.length;i++){
        //    System.out.println(arre7[i]);
        //}
        System.out.println("\n");
        LocalTime empieza2= LocalTime.now();
        quicksort2(arrex,0,arrex.length-1);
        LocalTime termina2= LocalTime.now();
        System.out.printf("el quicksort arreglado tardo: %d horas con %d minutos %d segundos %d nanosegundos",(termina2.getHour()-empieza2.getHour()),(termina2.getMinute()-empieza2.getMinute()),(termina2.getSecond()-empieza2.getSecond()),(termina2.getNano()-empieza2.getNano()));
        
    }
    public static void rellenar(int []arre){
        for(int i=0;i<arre.length;i++){
            arre[i]=(int)(Math.random()*arre.length);
        }
    }
    private static void quicksort(int a[],int izq,int der){
      int pivote=izq,i=izq,j=der,aux,p;
      pivote = a[izq];
        while(i<j){
            while(a[i]<=pivote&&i<j) i++;
            while(a[j]>pivote)j--;
            if(i<j){
                aux=a[i];
                a[i]=a[j];
                a[j]=aux;
            }
        }
        //System.out.println(a[i] + " " + a[j]+" "+ pivote);
        a[izq]=a[j];
        a[j]=pivote;
        if(izq<j-1)
            quicksort(a,izq,j-1);
        if(der>j+1)
            quicksort(a,j+1,der);

    }
    private static void quicksort2(int a[],int izq,int der){
      int pivote=izq,i=izq,j=der,aux,p;
      pivote = a[(der-izq)/2];
        while(i<j){
            while(a[i]<=pivote&&i<j) i++;
            while(a[j]>pivote)j--;
            if(i<j){
                aux=a[i];
                a[i]=a[j];
                a[j]=aux;
            }
        }
        //System.out.println(a[i] + " " + a[j]+" "+ pivote);
        a[izq]=a[j];
        a[j]=pivote;
        if(izq<j-1)
            quicksort(a,izq,j-1);
        if(der>j+1)
            quicksort(a,j+1,der);

    }
}
