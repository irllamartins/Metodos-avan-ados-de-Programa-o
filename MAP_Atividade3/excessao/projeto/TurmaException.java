package projeto;

public class TurmaException extends Exception{

	public TurmaException()  {
		System.err.println("Turma encerrada! N�o pode adiciona mais aluno!");
	}

}
