
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    /**
     * Método que prueba si el funcionamiento de isPrime es correcto.
     */
    public void testIsPrime()
    {
        Calculadora calculadora = new Calculadora();
        boolean esCorrecto = true;
        if (calculadora.isPrime(2)){
            System.out.println("Comprobamos isPrime(2)... resultado correcto true / resultado metodo " + calculadora.isPrime(2) + " ... Valido");
        }
        else{
            System.out.println("Comprobando isPrime(2)... resultado correcto true / resultado metodo " + calculadora.isPrime(2) + " ... Error");
            esCorrecto = false;
        }
        if (calculadora.isPrime(3)){
             System.out.println("Comprobando isPrime(3)... resultado correcto false / resultado metodo " + calculadora.isPrime(3) + " ... Valido");
           
        }
        else{
             System.out.println("Comprobando isPrime(3)... resultado correcto true / resultado metodo " + calculadora.isPrime(3) + " ... Error");
             esCorrecto = false;
        }
        if (calculadora.isPrime(5)){
            System.out.println("Comprobando isPrime(5)... resultado correcto true / resultado metodo " + calculadora.isPrime(5) + " ... Valido");
        }
        else{
            System.out.println("Comprobando isPrime(5)... resultado correcto true / resultado metodo " + calculadora.isPrime(5) + " ... Error");
            esCorrecto = false;
        }
        if (calculadora.isPrime(7)){
            System.out.println("Comprobando isPrime(7)... resultado correcto false / resultado metodo " + calculadora.isPrime(7) + " ... Valido");
            
        }
        else{
             System.out.println("Comprobando isPrime(7)... resultado correcto true / resultado metodo " + calculadora.isPrime(7) + " ... Error");
             esCorrecto = false;
        }
        if (calculadora.isPrime(15)){
            System.out.println("Comprobando isPrime(15)... resultado correcto true / resultado metodo " + calculadora.isPrime(15) + " ... Error");
            esCorrecto = false;            
        }
        else{
            System.out.println("Comprobando isPrime(15)... resultado correcto true / resultado metodo " + calculadora.isPrime(15) + " ... Valido");
        }
        if (calculadora.isPrime(111)){
            System.out.println("Comprobando isPrime(111)... resultado correcto true / resultado metodo " + calculadora.isPrime(111) + " ... Error");
            esCorrecto = false;            
        }
        else{
            System.out.println("Comprobando isPrime(111)... resultado correcto true / resultado metodo " + calculadora.isPrime(111) + " ... Valido");
        }
        if (esCorrecto){
            System.out.println("El método SI funciona correctamente");
        }
        else{
            System.out.println("El método NO funciona correctamente");
        }
    }
    /**
     * Método que prueba si el funcionamiento de sumValuesInterval es correcto.
     */
    public void testSumValuesInterval()
    {
        Calculadora calculadora = new Calculadora();
        boolean esCorrecto = true;
        if (calculadora.sumValuesInterval(-1,10) == -1){
            System.out.println("Comprobando sumValuesInterval(-1,10)...resultado correcto -1 / resultado metodo " + calculadora.sumValuesInterval(-1,10) + " ... Valido");
        }
        else{
            System.out.println("Comprobando sumValuesInterval(-1,10)...resultado correcto -1 / resultado metodo " + calculadora.sumValuesInterval(-1,10) + " ... Error");
            esCorrecto = false;
        }
        if (calculadora.sumValuesInterval(1,10) == 54){
            System.out.println("Comprobando sumValuesInterval(1,10)...resultado correcto 54 / resultado metodo " + calculadora.sumValuesInterval(1,10) + " ... Valido");
        }
        else{
            System.out.println("Comprobando sumValuesInterval(1,10)...resultado correcto 54 / resultado metodo " + calculadora.sumValuesInterval(1,10) + " ... Error");
            esCorrecto = false;
        }
        if (calculadora.sumValuesInterval(1,-10) == -1){
            System.out.println("Comprobando sumValuesInterval(1,-10)...resultado correcto -1 / resultado metodo " + calculadora.sumValuesInterval(1,-10) + " ... Valido");
        }
        else{
            System.out.println("Comprobando sumValuesInterval(1,-10)...resultado correcto -1 / resultado metodo " + calculadora.sumValuesInterval(1,-10) + " ... Error");
            esCorrecto = false;
        }
        if (calculadora.sumValuesInterval(10,1) == 54){
            System.out.println("Comprobando sumValuesInterval(10,1)...resultado correcto 54 / resultado metodo " + calculadora.sumValuesInterval(10,1) + " ... Valido");
        }
        else{
            System.out.println("Comprobando sumValuesInterval(10,1)...resultado correcto 54 / resultado metodo " + calculadora.sumValuesInterval(10,1) + " ... Error");
            esCorrecto = false;
        }
        if (calculadora.sumValuesInterval(-1,-10) == -1){
            System.out.println("Comprobando sumValuesInterval(-1,-10)...resultado correcto -1 / resultado metodo " + calculadora.sumValuesInterval(-1,-10) +  " ... Valido");
        }
        else{
            System.out.println("Comprobando sumValuesInterval(-1,-10)...resultado correcto -1 / resultado metodo " + calculadora.sumValuesInterval(-1,-10) +  " ... Error");
            esCorrecto = false;
        }
        if (calculadora.sumValuesInterval(2,37) == 702){
            System.out.println("Comprobando sumValuesInterval(2,37)...resultado correcto 702 / resultado metodo " + calculadora.sumValuesInterval(2,37) + " ... Valido");
        }
        else{
            System.out.println("Comprobando sumValuesInterval(2,37)...resultado correcto 702 / resultado metodo " + calculadora.sumValuesInterval(2,37) + " ... Error");
            esCorrecto = false;
        }
        if (esCorrecto){
            System.out.println("El método SI funciona correctamente");
        }
        else{
            System.out.println("El método NO funciona correctamente");
        }
    }
}
