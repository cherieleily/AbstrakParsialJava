/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstrakparsial;

public class pPanjang extends Geometri{
    private double panjang,lebar;

         public void setPanjang(double p){
                  panjang=p;
         }
         public void setLebar(double l){
                  lebar=l;
         }

         public double getPanjang(){
            return(panjang);
         }
         public double getLebar(){
            return(lebar);
         }

       public double getLuas(){

            return(panjang*lebar);
}
}
