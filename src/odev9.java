import java.util.Scanner;

public class odev9 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
			
              int dogumyili,sonuc;
              
              System.out.print("dogum yılını giriniz : ");
              dogumyili = input.nextInt();
              
              sonuc = dogumyili%12;
              switch (sonuc) {
              case 0:
            	  System.out.print("maymun : ");
            	  break ;
              case 1:
            	  System.out.print("horoz : ");
            	  break ;
              case 2:
            	  System.out.print("köpek : ");
            	  break ;
              case 3:
            	  System.out.print("domuz : ");
            	  break ;
              case 4:
            	  System.out.print("fare : ");
            	  break ;
              case 5:
            	  System.out.print("öküz : ");
            	  break ;
              case 6:
            	  System.out.print("kaplan : ");
            	  break ;
              case 7:
            	  System.out.print("tavşan: ");
            	  break ;
              case 8:
            	  System.out.print("ejderha : ");
            	  break ;
              case 9:
            	  System.out.print("yılan : ");
            	  break ;
              case 10:
            	  System.out.print("at : ");
            	  break ;
              case 11:
            	  System.out.print("koyun : ");
            	  break ;
              
              }
             
	}
}
