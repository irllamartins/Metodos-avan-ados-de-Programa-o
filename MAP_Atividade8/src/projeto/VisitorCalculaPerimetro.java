package projeto;

public class VisitorCalculaPerimetro implements VisitorIF{
	public String visitaQuadrado(Quadrado q) throws QuadradoException {
		if(q.getLado()<=0) {
			throw new QuadradoException();
		}
		return ""+(q.getLado()*4);
	}
	public String visitaRetangulo(Retangulo r) throws RetanguloException {
		if(r.getLargura()<=0||r.getAltura()<=0) {
			throw new RetanguloException();
		}
		return ""+(r.getAltura()*2+r.getLargura()*2);
	}
	public String visitaTriangulo(Triangulo t) throws TrianguloException {
		if(t.getLado1()<=0|| t.getLado2()<=0||t.getLado3()<=0) {
			throw new TrianguloException();
		}
		return ""+(t.getLado1()+t.getLado2()+t.getLado3());
	}
	public String visitaCirculo(Circulo c) throws CirculoException {
		if(c.getRaio()<=0) {
			throw new CirculoException();
		}
		return ""+(2*3.14*c.getRaio());
	}
	public String visitaTrapezio(Trapezio tr) throws TrapezioException {
		if(tr.getBaseMaior()<=0|| tr.getBaseMenor()<=0||tr.getAltura()<=0||tr.getLado1()<=0||tr.getLado2()<=0) {
			throw new TrapezioException();
		}
		return ""+(tr.getBaseMaior()+tr.getBaseMenor()+tr.getLado1()+tr.getLado2());
	}


}
