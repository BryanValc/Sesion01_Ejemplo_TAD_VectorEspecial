import java.util.Arrays;
import java.util.Scanner;

class VectorEspecial{
	
	private int edades[];
	Scanner input = new Scanner(System.in);
	
	public VectorEspecial() {
		
	}
	public VectorEspecial(int tamaño) {
		this.edades = new int[tamaño];
	}
	
	public int[] getEdades(){
		return null;
	}
	public void setEdades(int[] edades){
		this.edades = edades;
	}
	
	public void llenarVector() {
		for (int i = 0; i < edades.length; i++) {
			System.out.println("ingresa la edad "+(i+1)+": ");
			edades[i]=input.nextInt();
		}
	}
	public void MostrarVectorr() {
		System.out.println(Arrays.toString(edades));
	}
	
}

public class PruevaVectorEspecial {

	public static void main(String[] args) {
		
		VectorEspecial ve = new VectorEspecial();
		System.out.println(ve);
		System.out.println(ve.getEdades());
		
		VectorEspecial ve2 = new VectorEspecial(5);
		System.out.println(ve2.getEdades());
		//System.out.println(ve2.getEdades().toString());
		
		VectorEspecial ve3 = new VectorEspecial(3);
		ve3.llenarVector();
		ve3.MostrarVectorr();
	}

}
