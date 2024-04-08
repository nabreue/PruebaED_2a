/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instituto;

/**
 *
 * @author ProfDiurno
 */
public class Nif {

    private int numero;
    private char letra;

    //CONSTANTE: no accesible - compartido por todo - no modificable
    private static final char[] LETRAS
            = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
                'C', 'K', 'E'};

    /**
     * Calcula la letra asociada a un número de NIF.
     * @param numero El número de NIF.
     * @return La letra asociada al número de NIF.
     */

    private static char calcularLetra(int numero) {
        return LETRAS[numero % 23];
    }

    /**
     * Constructor por defecto.
     */
    protected Nif() {
        this.numero = 0;
        this.letra = ' ';
    }

    /**
     * Constructor que inicializa el NIF con un número dado.
     * @param numero El número de NIF.
     */
    public Nif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }

    /**
     * Retorna una representación en cadena del NIF.
     * @return La representación en cadena del NIF en formato "numero-letra".
     */
    @Override
    public String toString() {
        return numero + "-" + letra;
    }

    /**
     * Establece un nuevo número para el NIF y recalcula la letra asociada.
     * @param numero El nuevo número de NIF.
     */
    public void setNif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }

    /**
     * Compara si el NIF es igual a otro objeto.
     * @param obj El objeto a comparar.
     * @return true si son iguales, false en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nif other = (Nif) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return this.letra == other.letra;
    }
}
