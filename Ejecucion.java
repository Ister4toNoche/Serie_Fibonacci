import java.util.Scanner;	
	public class Ejecucion{
        
	 public static void main(String[] args) {
	int tama�o;
        Scanner lee=new Scanner(System.in);
	System.out.println("\n\nIngrese tama�o de la serie Fibonacci: ");
	tama�o=lee.nextInt();
        Fibonacci f1 = new Fibonacci("fibonacci 1",tama�o); 
        f1.mostrarSerie();
        
        
        
    }
}