/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstrakparsial;

public class Segitiga extends Geometri{
    private double alas,tinggi;

         public void setAlas(double a){
                  alas=a;
         }
         public void setTinggi(double t){
                  tinggi=t;
         }

         public double getAlas(){
            return(alas);
         }
         public double getTinggi(){
            return(tinggi);
         }

       public double getLuas(){

            return(0.5*alas*tinggi);

       }
}
