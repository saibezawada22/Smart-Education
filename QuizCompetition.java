import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class QuizCompetition {
    public static void main(String[] args)
    {
        Map<String, String> stateCapitals = new HashMap<>();
        stateCapitals.put("Andhra Pradesh", "Amaravati");
        stateCapitals.put("Arunachal Pradesh", "Itanagar");
        stateCapitals.put("Assam", "Dispur");
        stateCapitals.put("Bihar", "Patna");
        stateCapitals.put("Chhattisgarh", "Raipur");
        stateCapitals.put("Goa", "Panaji");
        stateCapitals.put("Gujarat", "Gandhinagar");
        stateCapitals.put("Haryana", "Chandigarh");
        stateCapitals.put("Himachal Pradesh", "Shimla");
        stateCapitals.put("Jharkhand", "Ranchi");
        stateCapitals.put("Karnataka", "Bengaluru");
        stateCapitals.put("Kerala", "Thiruvananthapuram");
        stateCapitals.put("Madhya Pradesh", "Bhopal");
        stateCapitals.put("Maharashtra", "Mumbai");
        stateCapitals.put("Manipur", "Imphal");
        stateCapitals.put("Meghalaya", "Shillong");
        stateCapitals.put("Mizoram", "Aizawl");
        stateCapitals.put("Nagaland", "Kohima");
        stateCapitals.put("Odisha", "Bhubaneswar");
        stateCapitals.put("Punjab", "Chandigarh");
        stateCapitals.put("Rajasthan", "Jaipur");
        stateCapitals.put("Sikkim", "Gangtok");
        stateCapitals.put("Tamil Nadu", "Chennai");
        stateCapitals.put("Telangana", "Hyderabad");
        stateCapitals.put("Tripura", "Agartala");
        stateCapitals.put("Uttar Pradesh", "Lucknow");
        stateCapitals.put("Uttarakhand", "Dehradun");
        stateCapitals.put("West Bengal", "Kolkata");
        
        List<String> states = new ArrayList<>(stateCapitals.keySet());
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int score = 0;
        int totalQuestions = 10;
        System.out.println("Welcome to the States and capitals Quiz !");
        
        for(int i = 0;i<totalQuestions;i++)
        {
            String state = states.get(random.nextInt(states.size()));
            System.out.println("What is the capital of " + state + " ?");
            String answer = scanner.nextLine().trim();
            
            if(stateCapitals.get(state).equalsIgnoreCase(answer))
            {
                System.out.println("You are very good at geography, your answer is correct.\n");
                score++;
            }
            else
            {
                System.out.println("Ooops! you are very near but the correct answer is " + stateCapitals.get(state)+ ".\n");
            }
        }
        
        System.out.println("The quiz is over :) Your final Score is " + score + " out of " + totalQuestions + ".\n");
        if(score == totalQuestions)
        {
            System.out.println("You are a geography master!!!");
        }
        else if(score >= 5 )
        {
            System.out.println("Good Effort, keep up the learning!");
        }
        else
        {
            System.out.println("Keep practicing, and you'll improve!");
        }
        
        scanner.close();
    }
}