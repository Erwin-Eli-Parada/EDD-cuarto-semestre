public class Test2
{
    public static void main(String []args){
        int []arre1={1,2,3,4,5,6,7,8,9};
        int []arre2={2,3,9,1,8,4,6,3,5};
        int []arre3={9,8,7,6,5,4,3,2,1};
        int []arre4=new int[10];
        int []arre5=new int[100];
        int []arre6=new int[1000];
        int []arre7=new int[10000];
        //Test.rellenar(arre7);
        bubble(arre2);
        for(int i=0;i<arre2.length;i++){
            System.out.println(arre2[i]);
        }
    }
    public static void bubble(int []a){
        int aux;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    aux=a[i];
                    a[i]=a[j];
                    a[j]=aux;
                }
            }
        }
    }
    public static void prueba(){
        int a=5/2;
        System.out.println(a);
    }
}
