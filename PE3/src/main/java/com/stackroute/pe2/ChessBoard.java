package com.stackroute.pe2;

public class ChessBoard {

    public static String[][] InitializeBoard(String[][] Board)
    {

        int colChange=0;

        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                if(colChange==0){
                    Board[i][j]="WW|";
                    colChange=1;}
                else
                {
                    Board[i][j]="BB|";
                    colChange=0;
                }
            }
            if(colChange==1)
                colChange=0;
            else
                colChange=1;
        }
        return Board;
    }

}
