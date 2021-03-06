package sumador;

public class ASumar {

	/**
	 * @author Daniel
	 * @version 1.0
	 * @param cad. Se le pasa el numero que queramos usar
	 * @return devuelve el mismo numero si tiene una longitud de 1. Y null si tiene una longitud de 2 o m?s
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

}
