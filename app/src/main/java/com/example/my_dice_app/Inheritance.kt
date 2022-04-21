package com.example.my_dice_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener {
            roll1()
            roll2()
            roll3()


        }
    }

    private fun roll1() {
        val diceOne = Dice1(6)
        val rollDiceResult1 = diceOne.rollDice()
        val rollDiceResult2 = diceOne.rollDice()
        val diceImage1: ImageView = findViewById(R.id.dice1)
        val toast1 = Toast.makeText(this,"YOU WIN",Toast.LENGTH_SHORT)
        val toast2 = Toast.makeText(this,"YOU LOSE",Toast.LENGTH_SHORT)



        val diceImageResource = when (rollDiceResult1) {

            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }
        diceImage1.setImageResource(diceImageResource)


        if(rollDiceResult1==6&&rollDiceResult2==6){
            toast1.show()
        }
        else if (rollDiceResult1 + rollDiceResult2 ==9)
            toast2.show()

    }


    private fun roll2() {
        val diceOne = Dice2(6)
        val rollDiceResult2 = diceOne.rollDice()
        val diceImage2: ImageView = findViewById(R.id.dice2)
        val toast1 = Toast.makeText(this,"YOU WIN",Toast.LENGTH_SHORT)
        val toast2 = Toast.makeText(this,"YOU LOSE",Toast.LENGTH_SHORT)



        val diceImageResource = when (rollDiceResult2) {

            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }
        diceImage2.setImageResource(diceImageResource)
        if(rollDiceResult2==6){
            toast1.show()
        }
        else if (rollDiceResult2==9)
            toast2.show()

    }

    private fun roll3() {
        val diceOne = Dice3(6)
        val rollDiceResult3 = diceOne.rollDice()
        val diceImage3: ImageView = findViewById(R.id.dice3)





        val diceImageResource = when (rollDiceResult3) {

            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }
        diceImage3.setImageResource(diceImageResource)

    }
}
class Dice1(var sides: Int){
    fun rollDice():Int{
        return (1..sides).random()
    }
}

class Dice2(var sides: Int) {
    fun rollDice(): Int {
        return (1..sides).random()
    }
}

class Dice3(var sides: Int) {
    fun rollDice(): Int {
        return (1..sides).random()
    }
}














