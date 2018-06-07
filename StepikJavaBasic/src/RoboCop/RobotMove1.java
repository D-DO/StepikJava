package RoboCop;

public class RobotMove1 {
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
                    System.out.println("robot.turnLeft()");
                    break;
                case LEFT:
                    robot.turnRight();
                    System.out.println("robot.turnRight()");
                    robot.turnRight();
                    System.out.println("robot.turnRight()");
                    break;
                case UP:
                    robot.turnRight();
                    System.out.println("robot.turnRight()");
                    break;
                case RIGHT:
                    break;
            }
        }

        if (toX - x < 0) {
            switch (direction) {
                case DOWN:
                    robot.turnRight();
                    System.out.println("robot.turnRight()");
                    break;
                case RIGHT:
                    robot.turnRight();
                    System.out.println("robot.turnRight()");
                    robot.turnRight();
                    System.out.println("robot.turnRight()");
                    break;
                case UP:
                    robot.turnLeft();
                    System.out.println("robot.turnLeft()");
                    break;
                case LEFT:
                    break;
            }
        }

        while (toX - x != 0) {
            robot.stepForward();
            System.out.println("robot.stepForward()");
            x = robot.getX();
        }

        direction = robot.getDirection();

        if (toY - y > 0) {
            switch (direction) {
                case RIGHT:
                    robot.turnLeft();
                    System.out.println("robot.turnLeft()");
                    break;
                case LEFT:
                    robot.turnRight();
                    System.out.println("robot.turnRight()");
                    break;
            }
        }

        if (toY - y < 0) {
            switch (direction) {
                case LEFT:
                    robot.turnLeft();
                    System.out.println("robot.turnLeft()");
                    break;
                case RIGHT:
                    robot.turnRight();
                    System.out.println("robot.turnRight()");
                    break;

            }
        }

        while (toY - y != 0) {
            robot.stepForward();
            System.out.println("robot.stepForward()");
            y = robot.getY();
        }

        // your implementation here
    }
}
