package com.example.unscrabmle.ui

data class GameUiState(
    var currentScrambledWord : String = "",
    val isGuessedWordWrong  : Boolean = false,
    val score : Int = 0,
    val currentWordCount : Int = 1,
    val isGameOver : Boolean = false
)
