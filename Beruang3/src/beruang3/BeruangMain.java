
package beruang3;
import java.util.Scanner;

public class BeruangMain {

  
    public static void main(String[] args) {
    //Animal	p = new Animal();		
    Beruang	b = new Beruang();		
    Scanner	sc = new Scanner(System.in);		
    int inp	= 0;		
do {
System.out.println("Masukkan: 0	untuk	memberi air, 1 untuk memberi Ikan, 999 untuk keluar");
    inp = sc.nextInt(); 
    switch(inp){
       case 0: b.beriMinum(); break;
       case 1: b.beriMakanan(); break;
    }
    b.displayBeruang();
  }while (inp!=999);
   
 }
}
