import java.util.Random;
/**
 *    
 */
public class PracticaBucles {
    private final char ESPACIO = ' ';
    private final char CARACTER = '\u0040';
    private Random generador;

    /**
     * Constructor  
     */
    public PracticaBucles()    {
        generador = new Random();
    }

    /**
     *  El método  genera  números aleatorios  entre -1000 y 5000 (inclusive)
     *  y calcula y escribe:
     *      - la media de todos los números
     *      - la suma de los impares
     *      - el máximo de los pares
     *        
     *  El proceso termina cuando sale un 0 o bien se han escrito n nºs
     *  
     *  Los números se escriben  en filas de 5 columnas 
     *  Cada nº aleatorio se muestra en un espacio de 12 posiciones en la pantalla  
     *  y al lado de cada nº se muestra otro nº con las mismas cifras y 
     *  en el mismo orden pero sin ceros (en 5 posiciones)
     *  
     *   Utiliza solo bucles while
     */
    public void generarNumeros(int n)   {
        int numero = generador.nextInt(6001) - 1000;
        int i = 0;
        int j = 0;
        double media = 0;
        int sumaImpares = 0;
        int maximoPar = numero;
        System.out.println("Nº maximo de aleatorios a generar" + n + "\no hasta que salga el 0\n");
        while(numero != 0 && n != i)  {
            System.out.printf("%12d:%6d", numero, obtenerNumeroSinCeros(numero));
            i++;
            if(i % 5 == 0)   {
                System.out.println();
            }
            
            if (esImpar(numero))  {
                sumaImpares = sumaImpares + numero;
            }
            else {
                if (numero >= maximoPar) {
                    maximoPar = numero;
                }
            }
            media = media + numero;
            j++;
            numero = generador.nextInt(6001) - 1000;
        }

        if (n == i)  {
            media = (media + numero) / n;
        }

        else {
            media = (media + numero) / j;
        }

        System.out.printf("\n%25s%10.2f","Media: ", media);
        System.out.printf("\n%25s%10d","Suma impares: ", sumaImpares);
        System.out.printf("\n%25s%10d","Maximo pares: ", maximoPar);
    }

    /**
     *  Devuelve true si numero es impar, false en otro caso
     *  Hazlo sin utilizar if
     */
    public boolean esImpar(int numero)   {        
        return  numero % 2 != 0;
    }

    /**
     *  Dado un nº genera y devuelve otro nuevo 
     *  con las mismas cifras y en el mismo orden pero sin 
     *  los 0
     *  Ej - si numero = 2040 devuelve  24, si numero = 1009 devuelve  19
     *  si numero = 3000 devuelve 3
     *   
     *   
     */
    public int obtenerNumeroSinCeros(int numero)   {
        int i = 0;
        int sinCeros = 0;
        while (numero != 0) {
            int resto = numero % 10;
            int divisor = numero / 10;
            if(resto == 0)  {
                resto = divisor % 10;
            }

            else{
                int potencia = (int) Math.pow(10, i);
                sinCeros = sinCeros + (potencia * resto);
                i++;
            }

            numero /= 10;
        }

        return sinCeros;
    }

    /**
     *  Borrar la pantalla
     *
     */
    public void borrarPantalla()    {
        System.out.println('\u000C');
    }

    /**
     *  
     *  Dibuja la letra N (ver figura en el enunciado)
     *  Con bucles for
     *  
     *  Hay que usar el método escribirCaracter()
     *  
     *  
     *   
     */
    public void escribirLetraN(int altura)    {
        //TODO

    }

    /**
     *  escribe n veces el caracter  indicado en la misma línea
     *  con bucles for
     */
    private void escribirCaracter(char caracter, int n)    {
        //TODO

    }
}
