package projeto;

public class HoraException extends Exception{

	public HoraException()  {
		System.err.println("As horas n�o pode ser negativa!");
	}

}
