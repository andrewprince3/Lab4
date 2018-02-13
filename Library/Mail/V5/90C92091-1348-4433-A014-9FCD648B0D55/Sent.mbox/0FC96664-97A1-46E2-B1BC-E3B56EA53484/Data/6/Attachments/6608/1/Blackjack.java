import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        P1Random rng = new P1Random();

        int gameNumber = 1;

        boolean gameOn = true;
        boolean newGame = false;

        int scorePlayer = 0;
        int cardVal1 = rng.nextInt(13) + 1;

        int playerWins = 0;
        int playerLosses = 0;
        int playerTies = 0;

        System.out.println("START GAME #" + gameNumber + "\n");
        scorePlayer += cardVal1;
        System.out.println("Your card is a " + cardVal1 + "!");
        System.out.println("Your hand is: " + (scorePlayer) + "\n");

        while (gameOn) {

            if (newGame) {
                System.out.println("START GAME #" + gameNumber + "\n");
                int cardVal2 = rng.nextInt(13) + 1;
                switch (cardVal2) {
                    case 1:
                        //print 1 as ACE!
                        scorePlayer = cardVal2;
                        System.out.println("Your card is a ACE!");
                        System.out.println("Your hand is: " + (scorePlayer) + "\n");
                        break;
                    case 11:
                        //print 11 as JACK!
                        //make JACK! = 10
                        cardVal2 = 10;
                        scorePlayer = cardVal2;
                        System.out.println("Your card is a JACK!");
                        System.out.println("Your hand is: " + (scorePlayer) + "\n");
                        break;
                    case 12:
                        // print 12 as QUEEN!
                        // make QUEEN! = 10
                        cardVal2 = 10;
                        scorePlayer = cardVal2;
                        System.out.println("Your card is a QUEEN!");
                        System.out.println("Your hand is: " + (scorePlayer) + "\n");
                        break;
                    case 13:
                        //print 13 as KING!
                        //make KING! = 10
                        cardVal2 = 10;
                        scorePlayer = cardVal2;
                        System.out.println("Your card is a KING!");
                        System.out.println("Your hand is: " + (scorePlayer) + "\n");
                        break;
                    default:
                        //keep card as is
                        scorePlayer = cardVal2;
                        System.out.println("Your card is a " + cardVal2 + "!");
                        System.out.println("Your hand is: " + (scorePlayer) + "\n");
                        break;
                }
//            }
            }

                System.out.println("1. Get another card");
                System.out.println("2. Hold hand");
                System.out.println("3. Print statistics");
                System.out.println("4. Exit" + "\n");
                System.out.print("Choose an option: ");

                int menuOption = scnr.nextInt();

                switch (menuOption) {
                    case 1:
                        int cardVal2 = rng.nextInt(13) + 1;
                        // get another card
                        switch (cardVal2) {
                            case 1:
                                //print 1 as ACE!
                                scorePlayer += cardVal2;
                                System.out.println("\n" + "Your card is a ACE!");
                                System.out.println("Your hand is: " + (scorePlayer) + "\n");
                                break;
                            case 11:
                                //print 11 as JACK!
                                //make JACK! = 10
                                cardVal2 = 10;
                                scorePlayer += cardVal2;
                                System.out.println("\n" + "Your card is an JACK!");
                                System.out.println("Your hand is: " + (scorePlayer) + "\n");
                                break;
                            case 12:
                                // print 12 as QUEEN!
                                // make QUEEN! = 10
                                cardVal2 = 10;
                                scorePlayer += cardVal2;
                                System.out.println("\n" + "Your card is an QUEEN!");
                                System.out.println("Your hand is: " + (scorePlayer) + "\n");
                                break;
                            case 13:
                                //print 13 as KING!
                                //make KING! = 10
                                cardVal2 = 10;
                                scorePlayer += cardVal2;
                                System.out.println("\n" + "Your card is a KING!");
                                System.out.println("Your hand is: " + (scorePlayer) + "\n");
                                break;
                            default:
                                //keep card as is
                                scorePlayer += cardVal2;
                                System.out.println("\n" + "Your card is a " + cardVal2 + "!");
                                System.out.println("Your hand is: " + (scorePlayer) + "\n");
                                break;
                        }

                        if (scorePlayer < 21) {
                            newGame = false;
                        }
                        else if (scorePlayer > 21) {
                            System.out.println("You exceeded 21! You lose.\n");
                            playerLosses++;
                            gameNumber++;
                            scorePlayer = 0;
                            newGame = true;

//                        System.out.println("START GAME #" + gameNumber + "\n");
                        } else if (scorePlayer == 21) {
                            System.out.println("BLACKJACK! You win! \n");
                            playerWins++;
                            gameNumber++;
                            scorePlayer = 0;
                            newGame = true;
//                        System.out.println("START GAME #" + gameNumber + "\n");
                        }
                        break;
                    case 2:
                        // hold hand
                        int dealerHand1 = rng.nextInt(11) + 16;
                        System.out.println("\nDealer's hand: " + dealerHand1);
                        System.out.println("Your hand is: " + (scorePlayer) + "\n");
                        if (scorePlayer > dealerHand1 || dealerHand1 > 21) {
                            System.out.println("You win!" + "\n");
                            playerWins++;
                            gameNumber++;
                            scorePlayer = 0;
                            newGame = true;
//                        System.out.println("START GAME #" + gameNumber + "\n");
                        } else if (scorePlayer < dealerHand1) {
                            System.out.println("Dealer wins! \n");
                            playerLosses++;
                            gameNumber ++;
                            scorePlayer = 0;
                            newGame = true;
                        } else {
                            System.out.println("It's a tie! No one wins! \n");
                            playerTies++;
                            gameNumber ++;
                            scorePlayer = 0;
                            newGame = true;
                        }
                        break;
                    case 3:
                        // print stats
                        int gamesPlayed = (playerWins + playerLosses + playerTies);
                        double winPercent = (((double)playerWins / (double)gamesPlayed) * 100);

                        System.out.println("\nNumber of Player wins: " + playerWins);
                        System.out.println("Number of Dealer wins: " + playerLosses);
                        System.out.println("Number of tie games: " + playerTies);
                        System.out.println("Total # of games played is: " + gamesPlayed);
                        System.out.println("Percentage of Player wins: " + winPercent + "% \n");
                        newGame = false;
                        break;
                    case 4:
                        gameOn = false;
                        break;
                    default:
                        System.out.println("\nInvalid input!");
                        System.out.println("Please enter an integer value between 1 and 4. \n");
                        newGame = false;
                        break;
                }
            }
        }
    }
