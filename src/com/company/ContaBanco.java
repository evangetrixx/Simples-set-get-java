package com.company;

public class ContaBanco {

    int numConta;
    String tipo;
    String Titular;
    Float saldo;
    boolean status;

    public ContaBanco(int numConta, String tipo, String dono) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.Titular = dono;
        setStatus(true);
    }

    void depositar(float valor){
        setSaldo(valor + saldo);
    }

    void sacar(float valor){
        if(valor < saldo){
            float saldoatual = this.saldo - valor;
            setSaldo(saldoatual);
        }

        else if (valor == saldo) {
            System.out.println("Você não tem dinheiro para sacar");
        }

        else {
            System.out.println("Você não vai conseguir sacar pois esta em débito com o banco ");
        }
    }

    void fecharConta(){
        if(this.saldo > 0f){
            System.out.println("Para fechar a conta você precisa retirar todo seu dinheiro");
        }

        else if (this.saldo < 0f) {
            System.out.println("Para fehcar a conta você precisa quitar sua divída");
        }

        else {
            System.out.println("Sua conta esta fechada");
            this.saldo = null;
            this.status = false;
            this.tipo = null;
            this.numConta = 0;
            this.Titular = null;
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return Titular;
    }

    public void setDono(String dono) {
        dono = dono;
    }

    public Float getSaldo(float v) {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    void mostarDados(){
        System.out.println("Nummero da conta = "+this.numConta);
        System.out.println("Sua conta é do tipo : "+this.tipo);
        System.out.println("O titular da conta é : "+this.Titular);
        System.out.println("O status da conta é : "+this.status);
        System.out.println("O seu saldo é : R$ "+this.saldo);
    }
}
