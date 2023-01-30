fun main() {
    print("Введите число: ")
    val x = readLine()!!.toInt()
    println("Выберите: \n1.Байты\n2.Килобайты")
    val y = readLine()!!.toInt()
    when(y) {
        1 -> print("$x в байтах = ${x/8}")
        2 -> print("$x в килобайтах = ${x*8}")
        else -> {
            print("Такого варианта нет ")
        }
    }
}