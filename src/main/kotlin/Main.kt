import kotlin.random.Random
//ломвзщш

fun main() {

        val options = listOf("Камень", "Ножницы", "Бумага")



        while (true) {

            println("Введите ваш выбор (Камень, Ножницы, Бумага) или 'Выход' для завершения игры:")

            val playerChoice = readLine()



            if (playerChoice == "Выход") {

                println("Спасибо за игру!")

                break

            }



            if (playerChoice !in options) {

                println("Некорректный ввод. Попробуйте снова.")

                continue

            }



            val computerChoice = options[Random.nextInt(options.size)]



            println("Выбор компьютера: $computerChoice")

            println("Ваш выбор: $playerChoice")



            when {

                playerChoice == computerChoice -> println("Ничья!")

                (playerChoice == "Камень" && computerChoice == "Ножницы") ||

                        (playerChoice == "Ножницы" && computerChoice == "Бумага") ||

                        (playerChoice == "Бумага" && computerChoice == "Камень") -> println("Вы победили!")

                else -> println("Вы проиграли!")

            }

            println()

        }

    }



