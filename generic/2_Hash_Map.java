import java.util.HashMap;
import java.util.Map;
import java.util.Random;
public class Hashmap {
 
    public static void main(String[] args) {
        Map<Integer, Double> randomMap = new HashMap<>();
 
        for (int i = 0; i < 10; i++) {
            int randomKey = generateRandomInt();
            double randomValue = generateRandomDouble();
            randomMap.put(randomKey, randomValue);
        }
 
        System.out.println("Data stored in the HashMap:");
        for (Map.Entry<Integer, Double> entry : randomMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
 
    private static int generateRandomInt() {
        Random random = new Random();
        return random.nextInt();
    }
 
    private static double generateRandomDouble() {
        Random random = new Random();
        return random.nextDouble();
    }
}