package br.com.joserljdev.comissao;

public class Venda {
	private Funcionario funcionario;
	private double valor;

	public Venda(Funcionario funcionario, double valor) {
		this.funcionario = funcionario;
		this.valor = valor;
	}

	public double calculaComissao() {
		double comissao = 0.0;

		comissao = this.funcionario. getCargo().calcularComissao(this.valor);

		return comissao;

	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
