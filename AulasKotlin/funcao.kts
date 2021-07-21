// Curso kotlin - Funções 07,08
fun main(args: Array<String>) {
    // exibirMensagem ("Egidio",30)
    var resultado = somar(20,5)
    //somar=(20,5)
    println(resultado)
}

/* fun exibirMensagem(nome: String, idade: Int) {
     println("Alerta, vc não preencheu todos os dados: Nome: $nome Idade: $idade")
} */

fun somar (num1:Int, num2:Int): Int {
    var total = num1 + num2
    //println(total)
    return total
}