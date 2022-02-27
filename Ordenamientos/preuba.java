public class preuba
{
    public static void main(String []args){
        String [] nombre1={"ale","jose","angel","melvin"};
        String [] nombre2={"martin","pedro","pablo"};
        String [] apellidos={"perez","hernadez","martinez"};
        String [] nombreAlumno=new String [100];
        for(int i=0;i<100;i++){
            nombreAlumno[i]=nombre1[(int)(Math.random()*4)]+" "+nombre2[(int)(Math.random()*3)]+ 
            " "+apellidos[(int)(Math.random()*3)]+" "+apellidos[(int)(Math.random()*3)];
        }
        for(int i=0;i<100;i++){
            System.out.println(nombreAlumno[i]);
        }
    }
}
