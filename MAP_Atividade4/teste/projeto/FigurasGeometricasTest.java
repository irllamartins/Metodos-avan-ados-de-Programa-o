package projeto;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

 public class FigurasGeometricasTest {	
	 private FigurasGeometricas fig;
	 
		@Before
		public void setUp() {
			fig = new FigurasGeometricas(10, 5, 7, 25);
		}
	
	//teste saida o perimetro de circulo
	@Test 
	public void circuloPerimetro() {
		assertEquals(fig.circuloPerimetro(),"O per�metro do c�rculo � 157.0" );
	}
	
	
	//teste saida o perimetro de circulo
	@Test 
	public void quadradoPerimetro() {
		assertEquals(fig.quadradoPerimetro(),"O per�metro do quadrado �: 28.0" );
		}
		
	//teste saida o perimetro de circulo
	@Test 
	public void retanguloPerimetro() {
		assertEquals(fig.retanguloPerimetro(),"O perimetro deste ret�ngulo �: 30.0" );
	}	

	//teste saida o perimetro de circulo
	@Test 
	public void testToString() {
		assertEquals(fig.toString(),"Todas as �reas s�o:  Circulo[A area do c�rculo � 1962.5,  O per�metro do c�rculo � 157.0] , Retangulo[ A �rea deste ret�ngulo �: 50.0,O perimetro deste ret�ngulo �: 30.0], Quadrado[A area do quadrado �: 49.0, O per�metro do quadrado �: 28.0]" );
	}
	

}
