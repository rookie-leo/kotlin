package main.kotlin

class Diretor(
    nome: String,
    cpf: String,
    val senha: Int,
    var plr: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
) {
    override var salario = 0.0


    override val bonificacao: Double
    get() {
        return super.bonificacao + salario + plr
    }


    fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }
}