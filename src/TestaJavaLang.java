public class TestaJavaLang {

	public static void main(String[] args) {

		Conta c1 = new Conta(500.0);
		Conta c2 = new Conta(500.0);

		GuardadorDeObjetos armario = new GuardadorDeObjetos();
		armario.adiciona(c1);
		armario.adiciona(c2);

		Cliente joao = new Cliente();
		armario.adiciona(joao);

		Conta c1NoArmario = (Conta) armario.pega(0);

		System.out.println(c1);

		if (c1.equals(joao)) {
			System.out.println("Sao iguais");
		} else {
			System.out.println("Sao diferentes");
		}

		// mudança de string
		String curso = "curso";
		curso = curso.replace("c", "C");

		System.out.println(curso);

		// altração de numeros double para inteiros
		// Math. possui mutas funcoes matematica para serem acessadas

		double pi = 3.14;

		long numeroArredondado = Math.round(pi);
		System.out.println(numeroArredondado);

	}

}
