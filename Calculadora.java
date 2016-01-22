
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculadora
{
    // instance variables - replace the example below with your own


    /**
     * Constructor for objects of class Calculadora
     */
    public Calculadora()
    {
        
    }

    /**
     * multiplos de 5 
     */
    public void multiplesOfFive()
    {
         int multiplo = 15 ;
       while (multiplo > 10 && multiplo < 90)
       {
           multiplo = multiplo + 5;
           System.out.println("Los multiplo de 5: " + multiplo);
  
        }
    }
    
    /**
     * suma valores
     */
    public void sumValues()
    {
        int sumando = 0;
        int suma = 0;
        while ( sumando < 10)
       {
           sumando = sumando + 1;
           suma = suma + sumando;           
  
        }
        System.out.println("La suma de los numeros de 0 a 10: " + suma);
    }
    
     /**
     * suma valores intervalo
     */
    public int sumValuesInterval(int a, int b)
    {
       
        int suma = 0;
        if( a < 0 || b < 0) 
        {
             System.out.println("Error tienen que ser numeros positivos");
             suma = -1;
        }      
       else if (b < a )
       {
          int c = b;           
           b = a;
           a = c;
         
        }
        
        else
        {
            while (a < b)
         {
           a = a + 1;
           suma = suma + a;           
  
         }
        }
      
        return (suma);
    }
    
    /**
     * metodo que dice sobre el numero si es primo o no
     */
    public boolean isPrime (int n)
    {
        boolean esPrimo = true;
        if (n>1)
        {
            int numero = 0;
            while (2 <=(n-(numero+1)))
            {
                numero = numero + 1;
                int division = (n % (n - numero));
                if (division == 0)
                {
                    esPrimo = false;
                }
            }
        }
        else
        {
            System.out.println("Valor no valido tiene que ser mallor de uno");
            esPrimo = false;
        }
        return (esPrimo);
    }
}

