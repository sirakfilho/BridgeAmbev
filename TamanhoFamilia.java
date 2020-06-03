package Ambev;

public class TamanhoFamilia extends Tamanho{
	
		
		public TamanhoFarmilia(ImplementacaoRefrigerante refrigerante) {
			super(refrigerante);
		}
		
		public void beber() {
			System.out.println("Toma um gole de " + refrigerante);
			System.out.println("Acabou o(a) " + refrigerante);
			System.out.println();
			}
			
}
