package RoboCop;

public class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;  // текущее направление взгляда Direction, направление взгляда робота,  — это перечисление:
    }

    public int getX() {
        return x; // текущая координата X
    }

    public int getY() {
        return y; // текущая координата Y
    }

    public void turnLeft() {
        switch (direction) {
            case DOWN:
                direction = Direction.RIGHT;
                break;
            case RIGHT:
                direction = Direction.UP;
                break;
            case UP:
                direction = Direction.LEFT;
                break;
            case LEFT:
                direction = Direction.DOWN;
                break;
        }// повернуться на 90 градусов против часовой стрелки
    }

    public void turnRight() {
        switch (direction) {
            case DOWN:
                direction = Direction.LEFT;
                break;
            case LEFT:
                direction = Direction.UP;
                break;
            case UP:
                direction = Direction.RIGHT;
                break;
            case RIGHT:
                direction = Direction.DOWN;
                break;
        }// повернуться на 90 градусов по часовой стрелке
    }

    public void stepForward() {
        switch (direction) {
            case DOWN:
                y--;
                break;
            case LEFT:
                x--;
                break;
            case UP:
                y++;
                break;
            case RIGHT:
                x++;
                break;
        }

        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
    }
}



