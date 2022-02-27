public class Palindrome
{
    public static void Pali(){
        Pila p=new Pila(20);
        String cad="reconocer";
        for(int x=0;x<cad.length();x++){
            p.push(cad.charAt(x));
        }
        Pila pila2=new Pila(20);
        for(int x=0;x<p.gettope();x++){
            pila2.push(p.pop());
        }
        if(pila2.gettope()!=p.gettope()){
            p.pop();
        }
        char a= (char)p.vertope();
        char b= (char)p.vertope();
        while(!p.empty() && a==b){
            a=(char)p.pop();
            b=(char)pila2.pop();
        }
        if(a==b){
            System.out.println("si es palindrome");
        }else{
            System.out.println("no es palindrome");
        }
    }
}
