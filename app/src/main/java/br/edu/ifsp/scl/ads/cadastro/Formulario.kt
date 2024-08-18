package br.edu.ifsp.scl.ads.cadastro

data class Formulario(
    val nomeCompleto: String,
    val telefone: String,
    val email: String,
    val ingressarNaLista: Boolean,
    val sexo: String,
    val cidade: String,
    val uf: String
) {
    override fun toString(): String {
        return "Nome: $nomeCompleto\nTelefone: $telefone\nE-mail: $email\nIngressar na lista: $ingressarNaLista\nSexo: $sexo\nCidade: $cidade\nUF: $uf"
    }
}
