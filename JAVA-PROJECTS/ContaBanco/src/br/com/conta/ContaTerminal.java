package br.com.conta;

public class ContaTerminal{
    public int idConta;
    public String agenciaConta;
    public String nomeUsuario;
    public double saldoDisponivel;

    public void setId(int idConta){
        this.idConta = idConta;
    }

    public void setAgencia(String agenciaConta){
        this.agenciaConta = agenciaConta;
    }

    public void setNome(String nomeUsuario){
        this.nomeUsuario = nomeUsuario;
    }

    public void setSaldo(double saldoDisponivel){
        this.saldoDisponivel = saldoDisponivel;
    }
}


