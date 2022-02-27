import javax.swing.JOptionPane;
public class MetodosOrdenamiento
{
    public static void main(String arg[]){
        int tamaño=Integer.parseInt(JOptionPane.showInputDialog("numero"));
        int arr[] = new int[tamaño];
        for(int i=0;i<tamaño;i++){
            arr[i]=(int)(Math.random()*tamaño);
        }
        double time_start,time_end;
        time_start =System.currentTimeMillis();
        //burbuja(arr);
        //quicksort(arr,0,tamaño-1);
        //seleccion(arr);
        //insercion(arr,arr.length);
        //shell(arr);
        //Monticulo(arr);
        //radixsort(arr,arr.length);
        //mergesort(arr,0,tamaño-1);
        time_end=System.currentTimeMillis();
        System.out.println("tomo:"+(time_end-time_start)/1000+"segundos");
        for(int i=0;i<tamaño;i++){
            System.out.println(arr[i]);
        }
    }
    public static void burbuja(int [] a)
    {
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
    public static void quicksort(int A[], int izq, int der) {
        int pivote=A[izq];
        int i=izq; 
        int j=der; 
        int aux;
        while(i<j){           
            while(A[i]<=pivote && i<j) i++; 
            while(A[j]>pivote) j--;         
            if (i<j) {                                           
                aux= A[i];                 
                A[i]=A[j];
                A[j]=aux;
            }
        }
        A[izq]=A[j]; 
        A[j]=pivote; 
        if(izq<j-1)
            quicksort(A,izq,j-1); 
        if(j+1 <der)
            quicksort(A,j+1,der);
    }
    public static void seleccion(int A[]) {
        int i, j, menor, pos, tmp;
        for (i = 0; i < A.length - 1; i++) { 
            menor = A[i]; 
            pos = i; 
            for (j = i + 1; j < A.length; j++){ 
                if (A[j] < menor) { 
                    menor = A[j]; 
                    pos = j;
                }
            }
            if (pos != i){ 
                tmp = A[i];
                A[i] = A[pos];
                A[pos] = tmp;
            }
        }
    }
    public static void insercion(int numbers[],int array_size){
        int i,a,index;
        for(i=1;i<array_size;i++){
            index=numbers[i];
            a=i-1;
            while(a>-1 && numbers[a]>index){
                numbers[a+1]=numbers[a];
                a--;
            }
            numbers[a+1]=index;
        }
    }
    public static void shell(int A[]){
        int salto, aux, i;
        boolean cambios;
        for(salto=A.length/2; salto!=0; salto/=2){
            cambios=true;
            while(cambios){ 
                cambios=false;
                for(i=salto; i< A.length; i++) 
                    if(A[i-salto]>A[i]){ 
                        aux=A[i]; 
                        A[i]=A[i-salto];
                        A[i-salto]=aux;
                        cambios=true; 
                    }
            }
        }
    }
    public static void Monticulo(int[] v) {
        final int N = v.length;
        for(int nodo = N/2; nodo>=0; nodo--) hacerMonticulo(v, nodo, N-1);
        for(int nodo = N-1; nodo>=0; nodo--) {
            int tmp = v[0];
            v[0]    = v[nodo];
            v[nodo] = tmp;
            hacerMonticulo(v, 0, nodo-1);
        }
    }
    public static void hacerMonticulo(int[] v, int nodo, int fin) {
        int izq = 2*nodo+1;
        int der = izq+1;
        int may;
        if(izq>fin) return;
        if(der>fin) may=izq;
        else may= v[izq]>v[der]?izq:der;
        if(v[nodo] < v[may]) {
            int tmp = v[nodo];
            v[nodo] = v[may];
            v[may]  = tmp;
            hacerMonticulo(v, may, fin);
        }
    }
    public static int getMax(int arr[], int n) 
    { 
        int mx = arr[0]; 
        for (int i = 1; i < n; i++) 
            if (arr[i] > mx) 
                mx = arr[i]; 
        return mx; 
    } 
    public static void radixsort(int[] a, int n){
        int bucket[][]=new int[a.length][a.length];  
        int bucket_count[]=new int[a.length];  
        int i, j, k, remainder, NOP=0, divisor=1, larger, pass;  
        larger = getMax(a,n);  
        while(larger>0)  
        {  
            NOP++;  
            larger/=a.length;  
        }  
        for(pass=0;pass<NOP;pass++) 
        {  
            for(i=0;i<a.length;i++)  
            bucket_count[i]=0;  
            for(i=0;i<a.length;i++)  
            {            
                remainder = (a[i]/divisor)%a.length;  
                bucket[remainder][bucket_count[remainder]] = a[i];  
                bucket_count[remainder] += 1;  
            }  
            i=0;  
            for(k=0;k<a.length;k++)  
            {  
                for(j=0;j<bucket_count[k];j++)  
                {  
                    a[i] = bucket[k][j];  
                    i++;  
                }  
            }  
            divisor *= a.length;  
        }
    }
    public static void merge(int arr[], int l, int m, int r) { 
        int n1 = m - l + 1; 
        int n2 = r - m; 
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
        int i = 0, j = 0;   
        int k = l; 
        while (i < n1 && j < n2) { 
            if (L[i] <= R[j]) { 
                arr[k] = L[i]; 
                i++; 
            } else{ 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
        while (i < n1){ 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
        while (j < n2){ 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
    public static void mergesort(int arr[], int l, int r) { 
        if (l < r) { 
            int m = (l+r)/2; 
            mergesort(arr, l, m); 
            mergesort(arr , m+1, r); 
            merge(arr, l, m, r); 
        } 
    }
}
