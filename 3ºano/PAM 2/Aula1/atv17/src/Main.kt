package fundamentos.controles
fun main(args: Array<String>) {
    val aluno = arrayListOf("André", "Carla", "Marcos")
    for ((indice, aluno) in aluno.withIndex()) {
        println("$indice - $aluno \n")
    }
}