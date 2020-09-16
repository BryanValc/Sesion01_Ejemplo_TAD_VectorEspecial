import java.util.Arrays;
import java.util.Scanner;

class VectorEspecial{
	
	private int edades[];
	int tamaño=0;
	Scanner input = new Scanner(System.in);
	
	public VectorEspecial() {
		
	}
	public VectorEspecial(int tamaño) {
		this.edades = new int[tamaño];
		this.tamaño=tamaño;
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
	public void mostrarVector() {
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
	public void aumentarTamañoDelArreglo(int magnitud) {
		int[] newArray = Arrays.copyOf(edades, edades.length + magnitud);
		/*for (int i = edades.length; i < newArray.length+magnitud; i++) {
			newArray[i] = 0;
		}*/
		this.setEdades(newArray);
	}
	public void disminuirTamañoDelArreglo(int magnitud) {
		int[] newArray = Arrays.copyOf(edades, edades.length - magnitud);
		this.setEdades(newArray);
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
		/*
		VectorEspecial ve = new VectorEspecial();
		System.out.println(ve);
		System.out.println(ve.getEdades());
		
		VectorEspecial ve2 = new VectorEspecial(5);
		System.out.println(ve2.getEdades());
		//System.out.println(ve2.getEdades().toString());
		
		VectorEspecial ve3 = new VectorEspecial(3);
		ve3.llenarVector();
		ve3.mostrarVectorr();
		*/
		
		VectorEspecial ve0 = new VectorEspecial(5);
		ve0.llenarVector();
		ve0.mostrarVector();
		System.out.println("posicion inicial: "+ve0.obtenerPosicionInicio());
		System.out.println("posicion final: "+ve0.obtenerPosicionFin());
		System.out.println("cantidad de elementos: "+ve0.obtenerCantidadElementos());
		ve0.mostrarElementoInicio();
		ve0.mostrarElementoFin();
		
		ve0.aumentarTamañoDelArreglo(3);
		ve0.mostrarVector();
		System.out.println("cantidad de elementos: "+ve0.obtenerCantidadElementos());
		
		ve0.disminuirTamañoDelArreglo(3);
		ve0.mostrarVector();
		System.out.println("cantidad de elementos: "+ve0.obtenerCantidadElementos());
		
	}

}
