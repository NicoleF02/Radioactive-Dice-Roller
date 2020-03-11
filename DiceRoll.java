import java.util.Random;

public class DiceRoll {

     public static void main(String[] args) {
        int diceRolls = 0;
        int noDiceRemoved = 0;
        int diceRemaining = 100;
        int total;


        System.out.println( "Dice Rolls         	No. Dice Removed 	Remaining Dice ");

        while (!(diceRemaining == 0)){
            total = 0;

              for (int i = 0; i < diceRemaining; i++) {


                  Random rand = new Random();
                  // Generate random integers in range 0 to 6
                  int rand_int1 = rand.nextInt(7);


                  //Checks if any of the dice rolled are a 6, if so then it will add 1 to the total and remove them from the dice to be considered
                  if (rand_int1 == 6) {
                      total += 1;
                      diceRemaining--;
                  }

              }

              //Number of times the dice have been rolled
              diceRolls += 1;

              //Number of dice that were removed for being a 6
              noDiceRemoved = total + noDiceRemoved;


              System.out.println(diceRolls + "               " + noDiceRemoved + "                  " + diceRemaining);


        	}


        }



     }
