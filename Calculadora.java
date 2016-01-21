
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
        while (sumando >=0 && sumando <= 10)
       {
           sumando = sumando + 1;
           suma = suma + sumando;           
  
        }
        System.out.println("La suma de los numeros de 0 a 10 " + suma);
    }
}

