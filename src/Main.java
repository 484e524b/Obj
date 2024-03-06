import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // Call the function to get the linked list of bicycle attributes

        List<BicycleArray.bAttr> bList = bPros.pBList();

        // Print the details of the bicycles in the list
        for (BicycleArray.bAttr bicycle : bList) {
            System.out.println("Bicycle_" + bicycle.nameID + " Speed: " + bicycle.speed + "km/h" + " Color: " + bicycle.color);
        }
        Stack<BicycleArray.bAttr> bStack = bPros.pBStack(bList);
        while (!bStack.isEmpty()) {
            BicycleArray.bAttr bicycle = bStack.pop();
            System.out.println("Bicycle_" + bicycle.nameID + " New Speed: " + bicycle.speed + " km/h" + " Color: " + bicycle.color);

        }
    }
}
