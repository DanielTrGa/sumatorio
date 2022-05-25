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

}
