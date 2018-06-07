package RoboCop;

public class RobotMove2 {
    public static void main(String[] args) {

        Robot robot = new Robot(0, 0, Direction.UP);
        moveRobot(robot, -3, 2);
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        Direction direction = robot.getDirection();
        int x = robot.getX();
        int y = robot.getY();

        if (toX - x > 0) {
            switch (direction) {
                case DOWN:
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                case UP:
                    robot.turnRight();
                    break;
                case RIGHT:
                    break;
            }
        }

        if (toX - x < 0) {
            switch (direction) {
                case DOWN:
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                case UP:
                    robot.turnLeft();
                    break;
                case LEFT:
                    break;
            }
        }

        while (toX - x != 0) {
            robot.stepForward();
            x = robot.getX();
        }

        direction = robot.getDirection();

        if (toY - y > 0) {
            switch (direction) {
                case RIGHT:
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnRight();
                    break;
            }
        }

        if (toY - y < 0) {
            switch (direction) {
                case LEFT:
                    robot.turnLeft();
                    break;
                case RIGHT:
                    robot.turnRight();
                    break;

            }
        }

        while (toY - y != 0) {
            robot.stepForward();
            y = robot.getY();
        }

        // your implementation here
    }
}
