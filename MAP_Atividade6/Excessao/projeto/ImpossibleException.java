package projeto;

public class ImpossibleException extends Exception{

	public ImpossibleException() {
		System.err.println("A��o negada! Verifique o status da a��o pedida!");
	}

}
