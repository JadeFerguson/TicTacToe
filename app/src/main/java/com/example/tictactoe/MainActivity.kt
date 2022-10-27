package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var player="playerOne"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonTen = findViewById<Button>(R.id.button)
        buttonTen.setOnClickListener {
            ticTacToeClick(buttonTen)
        }

        val buttonOne = findViewById<Button>(R.id.button10)
        buttonOne.setOnClickListener {
            ticTacToeClick(buttonOne)
        }

        val buttonTwo = findViewById<Button>(R.id.button11)
        buttonTwo.setOnClickListener {
            ticTacToeClick(buttonTwo)
        }

        val buttonThree = findViewById<Button>(R.id.button12)
        buttonThree.setOnClickListener {
            ticTacToeClick(buttonThree)
        }

        val buttonFour = findViewById<Button>(R.id.button13)
        buttonFour.setOnClickListener {
            ticTacToeClick(buttonFour)
        }

        val buttonFive = findViewById<Button>(R.id.button14)
        buttonFive.setOnClickListener {
            ticTacToeClick(buttonFive)
        }

        val buttonSix = findViewById<Button>(R.id.button15)
        buttonSix.setOnClickListener {
            ticTacToeClick(buttonSix)
        }

        val buttonSeven = findViewById<Button>(R.id.button16)
        buttonSeven.setOnClickListener {
            ticTacToeClick(buttonSeven)
        }

        val buttonEight = findViewById<Button>(R.id.button17)
        buttonEight.setOnClickListener {
            ticTacToeClick(buttonEight)
        }

        val buttonNine = findViewById<Button>(R.id.button18)
        buttonNine.setOnClickListener {
            ticTacToeClick(buttonNine)
        }
    }
    fun ticTacToeClick(button:Button){
        if (button.text=="") {
            if (player=="playerOne") {
                button.text = "X"
                player="playerTwo"
                playerTurn()
            }
            else {
                button.text = "O"
                player="playerOne"
                playerTurn()
            }
        }
    }

    fun playerTurn(){
        val whichPlayer = findViewById<TextView>(R.id.playerWin)
        if (player == "playerOne") {
            whichPlayer.text = "Player One's Turn"
        }
        else {
            whichPlayer.text = "Player Two's Turn"
        }
    }
}