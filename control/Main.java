package control;

public class Main {

	// Encuentra el mínimo de una lista
	public static int min(int[] numList) {
		// TODO Auto-generated method stub
		int min = numList[0];
		int posicion = 0;
		int i = 0;
		for (i = 0; i < numList.length; i++) {
			if (numList[i] < min) {
				min = numList[i];
				posicion = i;
			}
		}
		return (posicion);
	}

	// sumar los elementos de un arr
	public static int sumarArray(int[] numList) {
		// TODO Auto-generated method stub
		int acumulador = 0;

		for (int i = 0; i < numList.length; i++) {
			acumulador += numList[i];
		}
		return acumulador;
	}

	public static int[] balancer(int[] numList, int sum) {
		// El metodo debe validar si suma es igual a la suma
		// Si es menor debes iterar sobre el array y encontrar el minimo, sumar 1 en esa
		// posicion.
		// Este proceso se realizará hasta que la suma de todos los elementos del array
		// se igual o superior a sum
		int posicion = 0;

		while (sumarArray(numList) < sum) {
			posicion = min(numList);
			numList[posicion] = numList[posicion] + 1;
		}
		return numList;

	}

	public static void main(String[] args) {
		int[] input0 = { 4, 1, 3, 2, 5 };
		balancer(input0, 52);
		for (int i = 0; i < input0.length; i++) {
			System.out.println(input0[i]);
		}
	}

}
