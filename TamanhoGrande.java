package Ambev;


public class TamanhoGrande extends Tamanho {
		
		public TamanhoGrande(ImplementacaoRefrigerante refrigerante) {
			super(refrigerante);
		}
		
		public void beber() {
			System.out.println("Toma um gole de " + refrigerante);
			System.out.println("Acabou o(a) " + refrigerante);
			System.out.println();
			}
			
}
