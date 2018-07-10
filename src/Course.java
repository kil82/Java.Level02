import Obstacles.Obstacle;

public class Course {
    private Obstacle [] obstacles;

    public Course (Obstacle [] obstacles) {
        this.obstacles = obstacles;
    }
    public Obstacle[] getObstacles() {
        return obstacles;
    }
}
