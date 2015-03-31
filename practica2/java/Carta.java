/*
 * Autores: Ana Roig Jimenez, Alejandro Solanas Bonilla
 * NIAs:    686329, 647647
 * Fichero: Carta.java
 * Fecha: 19/03/2015
 */

/**
 * Clase Carta, formada por su metodo constructor, y por los metodos 'getPalo',
 * 'getNumero', 'gana' y 'print'.
 */
public class Carta {

	/* Atributos privados de la clase */

	private Palo palo;
	private int numero;

	/*
	 *Metodo constructor de la clase Carta,da valor a los atributos de la clase
	 */
	public Carta(Palo p, int n) {
		palo = p;
		numero = n;
	}

	/*
	 * Devuelve el valor del atributo palo
	 */
	public Palo getPalo() {
		return palo;
	}


	/*
	 * Devuelve el valor del atributo numero
	 */
	public int getNumero() {
		return numero;
	}


	/*
	 * Devuelve true si el valor del numero de otra es menor que el numero de carta que realiza la llamada, false en caso contrario
	 */
	boolean gana(Carta otra) {
		if (numero > otra.numero) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * Devuelve una cadena que contiene el numero y el palo de la carta correspondiente, quedando la carta, asi, definida completamente
	 */
	public Object print() {
		return numero + " de " + palo.name();
	}

}
