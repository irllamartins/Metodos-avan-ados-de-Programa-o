package projeto;

public class FigurasGeometricas{

	private Circunferencia circunferencia;
	private Quadrilatero quadrilatero ;

	public FigurasGeometricas(int altura, int largura, int lado, int raio){
		this.circunferencia = new Circunferencia(raio);
		this.quadrilatero  = new Quadrilatero (altura,largura,lado);
		
	}
	
	
	public Circunferencia getCircunferencia() {
		return circunferencia;
	}


	public void setCircunferencia(Circunferencia circunferencia) {
		this.circunferencia = circunferencia;
	}


	public Quadrilatero getQuadrilatero() {
		return quadrilatero;
	}


	public void setQuadrilatero(Quadrilatero quadrilatero) {
		this.quadrilatero = quadrilatero;
	}


	public String circuloPerimetro(){
		try {
			return "O per�metro do c�rculo � "+ circunferencia.circuloPerimetro();
		}
		catch(CirculoException e) {
			
		}
		return "O per�metro do c�rculo n�o foi criado";
	}
	
	public String circuloArea() {
		try {
			return "A area do c�rculo � "+circunferencia.circuloArea();
		}
		catch(CirculoException e) {
			
		}
		return "A area do c�rculo n�o foi criado";
	}
	
	public String quadradoPerimetro(){

		try {
			return "O per�metro do quadrado �: " + quadrilatero.quadradoPerimetro();
		}
		catch(QuadradoException e) {
			
		}
		return "O per�metro do quadrado n�o foi criado";
	}
	
	public String quadradoArea() {
		try {
			return "A area do quadrado �: "+ quadrilatero.quadradoArea();
		}
		catch(QuadradoException e) {
			
		}
		return "A area do quadrado n�o foi criado";
		
	}
	
	public String retanguloPerimetro(){
		try {
			return "O perimetro deste ret�ngulo �: "+ quadrilatero.retanguloPerimetro();
		}
		catch(RetanguloException e) {
			
		}
		return "O perimetro do retangulo n�o criado";
	}
		
	public String retanguloArea() {
		
		try {
			return "A �rea deste ret�ngulo �: " +quadrilatero.retanguloArea();
		}
		catch(RetanguloException e) {
			
		}
		return "A area do etangulo n�o criado";
	}
	public String figuras() {
			return "Todas as figuras"+circunferencia.getCirculo().toString() + ",  "+ quadrilatero.getQuadrado().toString() +", "+ quadrilatero.getRetangulo().toString();
		
	}
	@Override
	public String toString() {
			return "Todas as �reas s�o:  Circulo[" + circuloArea() + ",  "+ circuloPerimetro() +"] , Retangulo[ "+ retanguloArea()+","+ retanguloPerimetro()+ "], Quadrado[" + quadradoArea()+", "+ quadradoPerimetro()+ "]";
		
	}
	
	
}