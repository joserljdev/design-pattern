package br.com.joserljdev.comissao;

public class TesteCalculoComissao {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Cíntia", 35000, Cargo.DIRETOR);

		Venda venda = new Venda(funcionario, 100000);

		double comissao = funcionario.getCargo().calcularComissao(venda.getValor());

		System.out.println(comissao);
	}
}
