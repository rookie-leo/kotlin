package main.kotlin

class CalculadoraBonificacao {

    var total = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        this.total += funcionario.bonificacao
    }

    fun registra(gerente: Gerente) {
        this.total += gerente.bonificacao
    }

    fun registra(diretor: Diretor) {
        this.total += diretor.bonificacao
    }

}