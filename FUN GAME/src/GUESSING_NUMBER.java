import java.util.Random;
import javax.swing.JOptionPane;
public class GUESSING_NUMBER{
    public static void main(String args[]){
        int lowrange=1;
        int highrange=100;
        int score=0;
        int totalattempts=10;
        int user_attempt=0;
        boolean Gwon=false;
        Random random=new Random();
        int randomnumber=random.nextInt(highrange-lowrange+1)+lowrange;
        while(!Gwon&&user_attempt<totalattempts) {
            String input = JOptionPane.showInputDialog("GUESS THE NUMBER BETWEEN THE SPECIFIED RANGE" + lowrange + " and " + highrange + ":");
            if (input == null) {
                System.out.println("USER WANTS TO EXIT");
                break;
            }
            int guessed_Number = Integer.parseInt(input);
            if (guessed_Number == randomnumber) {
                Gwon = true;
                score = totalattempts - user_attempt + 1;
            } else if (guessed_Number < randomnumber) {
                JOptionPane.showMessageDialog(null, "The number is Higher!Attempts left:" + (totalattempts - user_attempt));
            } else {
                JOptionPane.showMessageDialog(null, "The number is Lower!Attempts left:" + (totalattempts - user_attempt));
            }
        }
        if(Gwon){
            JOptionPane.showMessageDialog(null, "Congratulations, you guessed the number! Your score is: " + score);
        } else {
            JOptionPane.showMessageDialog(null, "Game over! The number was: " + randomnumber);
        }
    }
}