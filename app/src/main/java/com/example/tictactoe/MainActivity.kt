package com.example.tictactoe

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var player="playerX"

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
            player="playerX"
        }
    }
    fun ticTacToeClick(button:Button){
        if (button.text=="") {
            if (player=="playerX") {
                button.text = "X"
                player="playerO"
                playerTurn()
                whoWins()
            }
            else {
                button.text = "O"
                player="playerX"
                playerTurn()
                whoWins()
            }
        }
    }

    fun playerTurn() {
        val whichPlayer = findViewById<TextView>(R.id.playerWin)

        if (player == "playerO") {
            whichPlayer.text = "Player O's Turn"
        }

        if (player == "playerX"){
            whichPlayer.text = "Player X's Turn"
        }


    }

    fun newGame(button:Button){
        val resetPlayer = findViewById<TextView>(R.id.playerWin)
        button.text = ""
        resetPlayer.text = "Player X's Turn"
        enableButtons()
    }

    fun whoWins() {
        val button = findViewById<Button>(R.id.button)
        val buttonOne = findViewById<Button>(R.id.button10)
        val buttonTwo = findViewById<Button>(R.id.button11)
        val buttonThree = findViewById<Button>(R.id.button12)
        val buttonFour = findViewById<Button>(R.id.button13)
        val buttonFive = findViewById<Button>(R.id.button14)
        val buttonSix = findViewById<Button>(R.id.button15)
        val buttonSeven = findViewById<Button>(R.id.button16)
        val buttonEight = findViewById<Button>(R.id.button17)
        val whichPlayer = findViewById<TextView>(R.id.playerWin)

        if ((button.text == "X" && buttonOne.text == "X" && buttonTwo.text == "X")
            || (buttonThree.text == "X" && buttonFour.text == "X" && buttonFive.text == "X")
            || (buttonSix.text == "X" && buttonSeven.text == "X" && buttonEight.text == "X")) {
            whichPlayer.text = "Player X Wins"
            disableButtons()
        }

        if ((button.text == "O" && buttonOne.text == "O" && buttonTwo.text == "O")
            || (buttonThree.text == "O" && buttonFour.text == "O" && buttonFive.text == "O")
            || (buttonSix.text == "O" && buttonSeven.text == "O" && buttonEight.text == "O")) {
            whichPlayer.text = "Player O Wins"
            disableButtons()
        }

        if ((buttonFive.text == "X" && buttonSix.text == "X" && buttonTwo.text == "X")
            || (button.text == "X" && buttonThree.text == "X" && buttonEight.text == "X")
            || (buttonOne.text == "X" && buttonFour.text == "X" && buttonSeven.text == "X")) {
            whichPlayer.text = "Player X Wins"
            disableButtons()
        }

        if ((buttonFive.text == "O" && buttonSix.text == "O" && buttonTwo.text == "O")
            || (button.text == "O" && buttonThree.text == "O" && buttonEight.text == "O")
            || (buttonOne.text == "O" && buttonFour.text == "O" && buttonSeven.text == "O")) {
            whichPlayer.text = "Player O Wins"
            disableButtons()
        }

        if ((buttonTwo.text == "O" && buttonFour.text == "O" && buttonEight.text == "O")
            || (button.text == "O" && buttonFour.text == "O" && buttonFive.text == "O")) {
            whichPlayer.text = "Player O Wins"
            disableButtons()
        }

        if ((buttonTwo.text == "X" && buttonFour.text == "X" && buttonEight.text == "X")
            || (button.text == "X" && buttonFour.text == "X" && buttonFive.text == "X")) {
            whichPlayer.text = "Player X Wins"
            disableButtons()
        }

        if (button.text.isNotEmpty() && buttonOne.text.isNotEmpty() && buttonTwo.text.isNotEmpty() &&
            buttonThree.text.isNotEmpty() && buttonFour.text.isNotEmpty() && buttonFive.text.isNotEmpty() &&
            buttonSix.text.isNotEmpty() && buttonSeven.text.isNotEmpty() && buttonEight.text.isNotEmpty()) {
            whichPlayer.text = "Tie between both players"
            disableButtons()
        }
    }

    // Disables buttons after win
    fun disableButtons(){
        val button = findViewById<Button>(R.id.button)
        val buttonOne = findViewById<Button>(R.id.button10)
        val buttonTwo = findViewById<Button>(R.id.button11)
        val buttonThree = findViewById<Button>(R.id.button12)
        val buttonFour = findViewById<Button>(R.id.button13)
        val buttonFive = findViewById<Button>(R.id.button14)
        val buttonSix = findViewById<Button>(R.id.button15)
        val buttonSeven = findViewById<Button>(R.id.button16)
        val buttonEight = findViewById<Button>(R.id.button17)

        button.isEnabled = false
        button.isClickable = false

        buttonOne.isEnabled = false
        buttonOne.isClickable = false

        buttonTwo.isEnabled = false
        buttonTwo.isClickable = false

        buttonThree.isEnabled = false
        buttonThree.isClickable = false

        buttonFour.isEnabled = false
        buttonFour.isClickable = false

        buttonFive.isEnabled = false
        buttonFive.isClickable = false

        buttonSix.isEnabled = false
        buttonSix.isClickable = false

        buttonSeven.isEnabled = false
        buttonSeven.isClickable = false

        buttonEight.isEnabled = false
        buttonEight.isClickable = false
    }

    fun enableButtons(){
        val button = findViewById<Button>(R.id.button)
        val buttonOne = findViewById<Button>(R.id.button10)
        val buttonTwo = findViewById<Button>(R.id.button11)
        val buttonThree = findViewById<Button>(R.id.button12)
        val buttonFour = findViewById<Button>(R.id.button13)
        val buttonFive = findViewById<Button>(R.id.button14)
        val buttonSix = findViewById<Button>(R.id.button15)
        val buttonSeven = findViewById<Button>(R.id.button16)
        val buttonEight = findViewById<Button>(R.id.button17)

        button.isEnabled = true
        button.isClickable = true

        buttonOne.isEnabled = true
        buttonOne.isClickable = true

        buttonTwo.isEnabled = true
        buttonTwo.isClickable = true

        buttonThree.isEnabled = true
        buttonThree.isClickable = true

        buttonFour.isEnabled = true
        buttonFour.isClickable = true

        buttonFive.isEnabled = true
        buttonFive.isClickable = true

        buttonSix.isEnabled = true
        buttonSix.isClickable = true

        buttonSeven.isEnabled = true
        buttonSeven.isClickable = true

        buttonEight.isEnabled = true
        buttonEight.isClickable = true
    }
}