/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstrakparsial;

public class Abstrakparsial {

    public static void main(String[] args) {
         
               Lingkaran l=new Lingkaran();
               l.setNama("Objek Lingkaran");
               l.setJejari(3.5);
               
               Segitiga s=new Segitiga();
               s.setNama("Objek Segitiga");
               s.setAlas(2.5);
               s.setTinggi(5.5);
               
               pPanjang pp=new pPanjang();
               pp.setNama("Objek Persegi Panjang");
               pp.setPanjang(8);
               pp.setLebar(5.5);

               System.out.println(l.getNama());
               System.out.println(l.getJejari());
               System.out.println(l.getLuas());

               System.out.println(s.getNama());
               System.out.println(s.getAlas());
               System.out.println(s.getTinggi());
               System.out.println(s.getLuas());
               
               System.out.println(pp.getNama());
               System.out.println(pp.getPanjang());
               System.out.println(pp.getLebar());
               System.out.println(pp.getLuas());
    }
    
}
