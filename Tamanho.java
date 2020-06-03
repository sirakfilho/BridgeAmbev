package Ambev;

public class Tamanho {
	 protected ImplementacaoRefrigerante refrigerante;
	 public AbstracaoTamanho(ImplementacaoRefrigerante refrigerante) {
	 this.refrigerante = refrigerante;
	 }
	 public abstract void beber();
}
