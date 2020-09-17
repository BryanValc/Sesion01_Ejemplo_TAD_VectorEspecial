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

	public int validacionEntero() {
		int ret = 0;
		boolean err = false;
		do {
			try {
				ret = input.nextInt();
			} catch (java.util.InputMismatchException e) {
				System.out.println("entrada no valida, intente de nuevo:");
				input.nextLine();
				err=true;
				continue;
			}
			if (ret>0) {
				err=false;
			}else {
				System.out.println("solo números positivos");
				err=true;
			}
		}while(err);
		return ret;
	}
}

public class PruevaVectorEspecial {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		boolean salir = false;
		byte opc = 0;
		VectorEspecial ve0 = new VectorEspecial();
		
		do {
			System.out.println("tamaño del vector:");
			VectorEspecial ve1 = new VectorEspecial(ve0.validacionEntero());
			
			System.out.println("1)llenar vector \n 2)mostrar vector \n 3)obtener posicion inicio \n 4)obtener posicion final \n 5)obtener cantidad elementos \n 6)mostrar elemento inicio"
					+ " \n 7)mostrar elemento final \n 8)aumentar tamaño del arreglo \n 9)disminuir tamaño del arreglo \n 10)insertar elemento posicion especifica "
					+ "\n 11)eliminar elemento posicion especifica \n 12)invertir el vector \n 13)salir");
			
			try {
				opc = input.nextByte();
			} catch (java.util.InputMismatchException e) {
				System.out.println("entrada no valida");
				input.nextLine();
			}
			if (opc<1||opc>13) {
				System.out.println("opcion no valida");
			}
			switch (opc) {
			case 1:	ve1.llenarVector();;break;
			case 2:	;break;
			case 3:	;break;
			case 4:	;break;
			case 5:	;break;
			case 6:	;break;
			case 7:	;break;
			case 8:	;break;
			case 9:	;break;
			case 10:;break;
			case 11:;break;
			case 12:;break;
			case 13:;break;
			default:break;
			}
			
		} while (salir==false);
		
		
		
		
	}

}
