class Dice(val numSides: Int){
    var sides = 6;
    
    fun roll():Int{
        val randomNumber = (1..numSides).random();
        return randomNumber;
    }
}

fun main(){
    val myFirstDice = Dice(6)
    val rollResult = myFirstDice.roll()
    val luckyNumber = 4

    when (rollResult) {
        luckyNumber -> println("You won!") //Putting the lucky number at top line so that the when ends and doesn't run the below statements inside the when
        1 -> println("So sorry! You rolled a 1. Try again!")
        2 -> println("Sadly, you rolled a 2. Try again!")
        3 -> println("Unfortunately, you rolled a 3. Try again!")
        4 -> println("No luck! You rolled a 4. Try again!")
        5 -> println("Don't cry! You rolled a 5. Try again!")
        6 -> println("Apologies! you rolled a 6. Try again!")
    }
}