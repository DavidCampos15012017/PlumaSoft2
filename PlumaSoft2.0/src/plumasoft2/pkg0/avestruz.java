
package plumasoft2.pkg0;

public class avestruz 
{
    /* 
    Estos atributos definen las cantidades de cada tipo de ave y
    se utilizarán en los métodos sett para calcular los costos
    */ 
   private int cantidadPolluelo;// 
   private int cantidadJoven;// 
   private int cantidadAdulto;
  
   // Publicación de la cantidad de Polluelo
    public int getCantidadPolluelo() {
        return cantidadPolluelo;
    }

    public int setCantidadPolluelo(int cantidadPolluelo) // En el main se invoca este método para tener acceso a la variable cantidadPolluelo que es privada
    {
        this.cantidadPolluelo = cantidadPolluelo;
        return polluelo(cantidadPolluelo);// Invocamos al método polluelo, el cual realiza los cálculos de costos de los sacos para este tipo de Ave
    
    }
    public int setCantidadJoven(int cantidadJoven) // En el main se invoca este método para tener acceso a la variable cantidadPolluelo que es privada
    {
        this.cantidadJoven = cantidadJoven;
        return joven(cantidadJoven);// Invocamos al método polluelo, el cual realiza los cálculos de costos de los sacos para este tipo de Ave
    
    }
   public int setCantidadAdulto(int cantidadAdulto) // En el main se invoca este método para tener acceso a la variable cantidadPolluelo que es privada
    {
        this.cantidadAdulto = cantidadAdulto;
        return adulto(cantidadAdulto);// Invocamos al método polluelo, el cual realiza los cálculos de costos de los sacos para este tipo de Ave
    
    }
  
    
    private int  polluelo(int cantPolluelo) // método del tipo seeter
    {

        return avestruz.cantidadSacos(cantPolluelo);

    }// fin del método polluelo
    
      private int  joven(int cantJoven) // método del tipo seeter
    {

        return avestruz.cantidadSacos(cantJoven);

    }// fin del método polluelo
    private int  adulto(int cantadulto) // método del tipo seeter
    {

        return avestruz.cantidadSacos(cantadulto);

    }// fin del método polluelo
    
    private static int cantidadSacos(int cantAve) // Este método calcula en base a la cantidad de polluelos la cantidad de sacos correspondientes
    {
       int cantSacos=1;
       
        if (cantAve%2==0)// Si la cantidad es par, la cantidad de sacos es la mitad ya que cada ave come medio saco
        {
            cantSacos=cantAve/2;
        }
        if (cantAve%2!=0)
        {
          
           cantSacos=(cantAve/2)+1;// Si la cantidad es impar, se debe agregar un saco
        }
        return cantSacos;
    }// Fin del método sacos
}
