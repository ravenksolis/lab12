package com.lab1.lab12;

import android.widget.TextView;

public class RPS {
    public static void comDisplay(int com, TextView tv)
    {
        if(com == 0)
        {
            tv.setText("Ccmputer threw ROCK");
        }

        else if (com == 1)
        {
            tv.setText("Computer threw PAPER");
        }

        else if(com == 2)
        {
            tv.setText("Computer threw SCISSORS");
        }
    }

    public static void realDisplay(int user, int com, TextView tv)
    {
        if(user == com)
        {
            tv.setText("Draw");
        }

        else if((user == 0 && com == 2) || (user == 2 && com == 0) || (user == 2 && com == 1))
        {
            tv.setText("You won");
        }

        else
            tv.setText("You lose");
    }
}
