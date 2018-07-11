package com.example.ayasfn.courtcounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var scoreTeamA = 0 // global variable for score
    var scoreTeamB = 0 // global variable for score

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Code for Team A

        add3ScoreForTeamA.setOnClickListener{
            scoreTeamA+=3
            displayForTeamA(scoreTeamA)
        }

        add2ScoreForTeamA.setOnClickListener{
            scoreTeamA+=2
            displayForTeamA(scoreTeamA)
        }

        freeThrowForTeamA.setOnClickListener{
            scoreTeamA+=1
            displayForTeamA(scoreTeamA)
        }

        // Code for Team B

        add3ScoreForTeamB.setOnClickListener{
            scoreTeamB+=3
            displayForTeamB(scoreTeamB)
        }

        add2ScoreForTeamB.setOnClickListener{
            scoreTeamB+=2
            displayForTeamB(scoreTeamB)
        }

        freeThrowForTeamB.setOnClickListener{
            scoreTeamB+=1
            displayForTeamB(scoreTeamB)
        }

        // code to reset

        resetScore.setOnClickListener{
            scoreTeamA = 0
            scoreTeamB = 0
            displayForTeamA(scoreTeamA)
            displayForTeamB(scoreTeamB)

        }

    }

    fun displayForTeamA(num:Int){
        teamAScore.setText("$num")
    }
    fun displayForTeamB(num:Int){
        teamBScore.setText("$num")
    }

}

