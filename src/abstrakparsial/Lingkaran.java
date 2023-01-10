/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstrakparsial;

public class Lingkaran extends Geometri{
    private double jejari;

         public void setJejari(double r){
                  jejari=r;
         }

         public double getJejari(){
            return(jejari);
        }

       public double getLuas(){
            return(jejari*jejari*Math.PI);
       }
}
