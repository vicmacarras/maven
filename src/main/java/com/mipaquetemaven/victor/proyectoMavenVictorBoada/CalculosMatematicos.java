package com.mipaquetemaven.victor.proyectoMavenVictorBoada;

public class CalculosMatematicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static ArrayList<Integer> listaDePrimosHasta(int numero){
			ArrayList<Integer> listaDePrimos = new ArrayList<Integer>();
				listaDePrimos.add(1);
				listaDePrimos.add(2);
				listaDePrimos.add(3);
				for(int i=5; i<=numero; i+=2) {
					if(esPrimo(i))
						listaDePrimos.add(i);
					}		
					return listaDePrimos;		
				}

	}

}
