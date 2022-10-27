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

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            ticTacToeClick(button)
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

        val newGameButton = findViewById<Button>(R.id.button18)
        newGameButton.setOnClickListener {
            newGame(button)
            newGame(buttonOne)
            newGame(buttonTwo)
            newGame(buttonThree)
            newGame(buttonFour)
            newGame(buttonFive)
            newGame(buttonSix)
            newGame(buttonSeven)
            newGame(buttonEight)
            player="playerOne"
        }
    }
    private fun ticTacToeClick(button:Button){
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

    private fun playerTurn(){
        val whichPlayer = findViewById<TextView>(R.id.playerWin)
        if (player == "playerOne") {
            whichPlayer.text = "Player One's Turn"
        }
        if (player == "playerTwo"){
            whichPlayer.text = "Player Two's Turn"
        }
    }

    private fun newGame(button:Button){
        val resetPlayer = findViewById<TextView>(R.id.playerWin)
        button.text = ""
        resetPlayer.text = "Player One's Turn"
    }
}