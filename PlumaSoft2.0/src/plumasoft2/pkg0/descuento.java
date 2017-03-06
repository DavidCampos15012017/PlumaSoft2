
package plumasoft2.pkg0;

public class descuento
/*
Utilizamos la cantidad reportada 
*/

{
    int totalConDescuento;
    public int AplicarDescuento(int cantHuevos, int total)
    {
        
        if (cantHuevos >= 30)
        {
           total-=(total*0.3);
           totalConDescuento= total;
        }
        
        if (cantHuevos < 30)
        {
            totalConDescuento= total -=(total*0.1);
        }
    return totalConDescuento;
    }
    
}
