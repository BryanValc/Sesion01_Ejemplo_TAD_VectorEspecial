import java.util.Arrays;
import java.util.Scanner;

class VectorEspecial{
	
	private int edades[];
	Scanner input = new Scanner(System.in);
	
	public VectorEspecial() {
		
	}
	public VectorEspecial(int tamaņo) {
		this.edades = new int[tamaņo];
	}
	
	public int[] getEdades(){
		return this.edades;
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
	public void mostrarVectorr() {
		System.out.println(Arrays.toString(edades));
	}
	public int obtenerPosicionInicio() {
		return this.edades[0];
	}
	public int obtenerPosicionFin() {
		return this.edades[this.edades.length-1];
	}
	public int obtenerCantidadElementos() {
		return this.edades.length;
	}
	public void mostrarElementoInicio() {
		System.out.println(this.edades[0]);
	}
	public void mostrarElementoFin() {
		System.out.println(this.edades[this.edades.length-1]);
	}
	public void aumentarTamaņoDelArreglo(int magnitud) {
	}
	public void disminuirTamaņoDelArreglo(int magnitud) {
	}
	
	public void insertarElementoPosicionEspecifica(int posicion) {
	}
	public void eliminarElementoPosicionEspecifica(int posicion) {
	}
	public void invertirElVector() {
		
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
		ve3.mostrarVectorr();
	}

}
