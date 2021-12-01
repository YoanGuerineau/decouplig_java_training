package fr.lernejo.guessgame;

import java.security.SecureRandom;

public class Launcher {
    public static void main( String[] args ) {
        HumanPlayer myHumanPlayer = new HumanPlayer();
        Simulation mySimulation = new Simulation( myHumanPlayer );
        SecureRandom random = new SecureRandom();
        Long randomNumber = random.nextLong( 100 ); // génère un nombre entre 0 (inclus) et 100 (exclus)
        mySimulation.initialize(randomNumber);
        mySimulation.loopUntilPlayerSucceed();
    }
}
