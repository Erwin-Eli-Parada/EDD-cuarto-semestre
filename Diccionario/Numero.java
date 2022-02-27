public class Numero //incio de la clase
{
    private int entero; //declaracion de atributo entero
    private String texto;//declaracion de atributo texto
    private String ingles;//declaracion de atributo ingles
    private String japones;//declaracion de atributo japones
    public Numero(int entero,String texto,String ingles,String japones){//constructor de la clase Numero
        this.entero=entero;//asignacion del valor entero
        this.texto=texto;//asignacion del valor texto
        this.ingles=ingles;//asignacion de valor ingles
        this.japones=japones;//asignacion del valor japones
    }
    public int getentero(){//metodo get entero
        return entero;//retorno del valor entero
    }
    public String gettexto(){//metodo get texto
        return texto;//retorno del texto en español
    }
    public String getingles(){//metodo get ingles
        return ingles;//retorno del texto en ingles
    }
    public String getjapones(){//metodo get japones
        return japones;//retorno del texto en japones
    }
    public String toString(){//metodo toString
        return entero+" "+texto+" "+ingles+" "+japones;//retorno de un string con los valores de todas las variables de la clase
    }
}//fin de la clase
