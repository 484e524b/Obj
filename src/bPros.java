import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class bPros extends BicycleArray{

    public static List<bAttr> pBList() {
        List<bAttr> bList = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            bAttr bicycle = new bAttr(i + 1);  // Start nameID from 1
            bList.add(bicycle);
        }

        return bList;
    }

    public static Stack<bAttr> pBStack(List<bAttr> bList) {
        Stack<bAttr> bStack = new Stack<>();

        for (int i = 0; i < 100; i++) {
           bAttr bicycle = new bAttr(i + 1);  // Start nameID from 1
            // Decrease speed by 25%
            double decreasedSpeed = (bicycle.speed / 4);
            // Set the decreased speed
            bicycle.speed = decreasedSpeed;

            // Push the bicycle onto the stack
            bStack.push(bicycle);
        }

        return bStack;
    }
}
