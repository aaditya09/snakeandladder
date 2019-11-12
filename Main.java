package com.example.demo.lld.SnakesAndLadder;

/**
 * Created by enduser on 12/11/19.
 */
 public final class Main {
        public static void main ( String [] args ) {
            String [] playerNames = { " Monica " , " Albert " ," Noemi " ," Jaume " };

            int numSquares = 12;
            int [][] snakesFromTo = { {11 ,5} };
            int [][] laddersFromTo = { {2 ,6} , {7 ,9} };

            Game game = new Game ( playerNames , numSquares , snakesFromTo , laddersFromTo );

            game.play();
        }
    }

