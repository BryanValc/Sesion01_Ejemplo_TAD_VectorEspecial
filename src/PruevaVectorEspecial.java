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
		return this.edades;
	}
	public void setEdades(int[] edades){
		this.edades = edades;
	}
	
	public void llenarVector() {
		int err=0;
		for (int i = 0; i < edades.length; i++) {
			System.out.println("ingresa la edad "+(i+1)+": ");
			if(err>0) {
				input.nextLine();
			}
			try {
				edades[i]=input.nextInt();
			} catch (java.util.InputMismatchException e) {
				System.out.println("solo se pueden ingresar numeros enteros");
				err++;
				i--;
			}
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
		while (magnitud<1) {
			System.out.println("la magnitud para aumentar el tamaño debe ser positiva, ingresela de nuevo: ");
			magnitud = input.nextInt();
		}
		int[] newArray = Arrays.copyOf(edades, edades.length + magnitud);
		this.setEdades(newArray);
		System.out.println("el vector se aumentó éxitosamete en "+magnitud);
	}
	public void disminuirTamañoDelArreglo(int magnitud) {
		while (magnitud<1) {
			System.out.println("la magnitud para disminuir el tamaño debe ser positiva, ingresela de nuevo: ");
			magnitud = input.nextInt();
		}
		try {
			int[] newArray = Arrays.copyOf(edades, edades.length - magnitud);
			this.setEdades(newArray);
		} catch (NegativeArraySizeException e) {
			System.out.println("la magnitud no puede ser igual o superior a la longitud original");
		}
		System.out.println("el vector se disminuyó éxitosamete en "+magnitud);
	}
	public void insertarElementoPosicionEspecifica(int posicion, int elemento) {
		try {
			this.getEdades()[posicion-1]=elemento;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("solo se puede tener de 1 a n posiciones, no se puede exceder o ser inferior o igual a 0");
		} catch (java.util.InputMismatchException e) {
			System.out.println("solo se pueden ingresar numeros enteros");	
		}
	}
	public void eliminarElementoPosicionEspecifica(int posicion) {
		try {
			this.getEdades()[posicion-1]=0;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("solo se puede tener de 1 a n posiciones, no se puede exceder o ser inferior o igual a 0");
		} catch (java.util.InputMismatchException e) {
			System.out.println("solo se pueden ingresar numeros enteros");	
		}
	}
	public void invertirElVector() {
		int[] newArray = Arrays.copyOf(edades, edades.length);
		int edades[]=this.getEdades();
		for (int i = 0; i < newArray.length; i++) {
			newArray[i]=edades[edades.length-1-i];
		}
		this.setEdades(newArray);
	}

}

public class PruevaVectorEspecial {

	public static void main(String[] args) {

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
		
		ve0.insertarElementoPosicionEspecifica(3, 5);
		ve0.mostrarVector();
		ve0.eliminarElementoPosicionEspecifica(3);
		ve0.mostrarVector();
		ve0.invertirElVector();
		ve0.mostrarVector();
		
	}

}
