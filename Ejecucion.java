import java.util.Scanner;	
	public class Ejecucion{
        
	 public static void main(String[] args) {
	int tamaño;
        Scanner lee=new Scanner(System.in);
	System.out.println("\n\nIngrese tamaño de la serie Fibonacci: ");
	tamaño=lee.nextInt();
        Fibonacci f1 = new Fibonacci("fibonacci 1",tamaño); 
        f1.mostrarSerie();
        
        
        
    }
}