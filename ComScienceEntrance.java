/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comscienceentrance;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Yo
 */
public class ComScienceEntrance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        comsci_score score  = new comsci_score();
        score_process process = new score_process();
        Scanner scan = new Scanner(System.in);
        
      
       double[] studentScores = new double[50];
       try{
            for(int i=0;i<studentScores.length;i++){
                System.out.print("Enter 50 student scores(%): ");
                studentScores[i] = scan.nextDouble();
             }
           
        
        }catch(InputMismatchException ime){
            System.out.printf("Error, please type in an integer number %n",ime.getMessage());
            System.exit(1);
        }
        
        
        score.memory(studentScores);
        double getAverage = process.processData(studentScores);
        System.out.println(getAverage);
        
        double maximum = process.getHighest(studentScores);
        System.out.println("The highest score in this entrance is "+maximum + " %");
        
        double minimum = process.getLowest(studentScores);
        System.out.println("The lowest score in this entrance is "+minimum + " %");    
    }
    

}
class comsci_score{
    public double[] memory(double[] scores){
       return scores;
     }
     
    }
class score_process{
    public double processData(double[] scores){
        double average = 0;
        double sum = 0;
        for(int i=0;i<scores.length;i++){
            sum=sum+scores[i];
        }
        average = sum/10;
        return average;
    }
   public double getHighest(double[] scores){
       double max = 0;
       Arrays.sort(scores);
       max = scores[scores.length-1];
       return max;
   }
   
   public double getLowest(double[] scores){
       double min = 0;
       Arrays.sort(scores);
       min = scores[0];
       return min;
   }
}
