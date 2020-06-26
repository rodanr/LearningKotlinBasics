class Dice(val numSides: Int){
    var sides = 6;
    
    fun roll():Int{
        val randomNumber = (1..numSides).random();
        return randomNumber;
    }
}

fun main(){
    val myFirstDice = Dice(6);
    val diceRoll = myFirstDice.roll();
    println("Your ${myFirstDice.sides} sided dice rolled ${diceRoll}!")
     val mySecondDice = Dice(20);
    println("Your ${mySecondDice.numSides} sided dice rolled ${mySecondDice.roll()}!");
}