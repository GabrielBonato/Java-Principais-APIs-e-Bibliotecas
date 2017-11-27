public class Conta {
	private double saldo;
	private String titular;
	private int numero;
	private int agencia;

	public void saca(double valor) throws Exception {
		if (saldo >= valor) {
			this.saldo -= valor;
		} else {
			// Exception de RuntimeException
			// throw new SaldoInsuficienteException(saldo);
			throw new RuntimeException();
		}
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public Conta(String nome, int agencia, double saldo) {
		this.titular = nome;
		this.agencia = agencia;
		this.saldo = saldo;
	}

	public Conta(double saldo) {
		this.saldo = saldo;
	}

	public Conta() {
	}

	public String getNome() {
		return titular;
	}

	public void setNome(String nome) {
		this.titular = nome;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Conta))
			return false;
		Conta outra = (Conta) obj;
		return outra.saldo == this.saldo;
	}

	@Override
	public String toString() {
		return "Conta com saldo " + saldo;
	}

	public void imprime() {

		System.out.println(titular);
		System.out.println(agencia);
		System.out.println(saldo);

	}
}