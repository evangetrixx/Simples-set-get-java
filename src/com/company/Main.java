package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ContaBanco conta1 = new ContaBanco(2125, "Conta corrente", "Leandro Evangelista de Souza");
        conta1.mostarDados();
        conta1.setSaldo(500f);
        conta1.mostarDados();

        conta1.depositar(300f);
        conta1.mostarDados();

        conta1.sacar(700f);
        conta1.mostarDados();

        conta1.fecharConta();
        conta1.mostarDados();

        conta1.sacar(100);
        conta1.mostarDados();


        conta1.fecharConta();
        conta1.mostarDados();

    }
}
