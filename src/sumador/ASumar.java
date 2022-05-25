package sumador;

public class ASumar {

	/**
	 * @author Daniel
	 * @version 1.0
	 * @param cad. Se le pasa el numero que queramos usar
	 * @return devuelve el mismo numero si tiene una longitud de 1. Y null si tiene una longitud de 2 o más
	 *
	 */
	
	public String sumativo(String cad) {
		String numero = cad;
        if (numero.length() == 1) {
            return (numero + " = " + numero);
        }
        return null;
        
	}

	
	/**
	 * @author Daniel
	 * @version 1.0
	 * @param cad. Se le pasa el numero que queramos usar
	 * @return en caso de ser negativo se devuelve un mensaje de texto diciendo "Negativo. Siempre negativo".  Y null si es positivo
	 *  
	 */
	public String negativo(String cad) {
		String numero = cad;
		char simbolo = numero.charAt(0);
		if (simbolo == '-') {
			return "Negativo. Siempre negativo";
		}
		return null;

	}


	/**
	 * @author Daniel
	 * @version 1.0
	 * @param valor_inicial. Se le pasa el numero que queremos que nos sube sus digitos
	 * @return devuelve la suma de los digitos del numero introducido
	 *  
	 */
	public int total(String valor_inicial) {
        int suma = 0;

        for (int i = 0; i < valor_inicial.length(); i++) {
            // Cadena de un dígito.
            char digito = valor_inicial.charAt(i);
            suma = suma + Integer.parseInt(String.valueOf(digito));  //Conversión de caracter a entero
        }
        return suma;

    }

}
