import java.awt.Robot;
import java.awt.event.InputEvent;

public class AutoClicker{
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();

            robot.mouseMove(10, 10);

            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

