import Obstacles.*;


public class MainClass {
    public static void main(String[] args) {
        Team team = new Team("Team1", new Human[]{new Human("Боб"), new Human("Роб"), new Human("Рой")});
        Course course = new Course(new Obstacle[] {new Cross((int)Math.random()*8000), new Wall((int)Math.random()*2), new Wall((int)Math.random()*1), new Cross((int)Math.random()*120)});
        for (Human m : team.getMembers()) {
            for (Obstacle o : course.getObstacles()) {
                o.doIt(m);
                if (!m.isOnDistance()) break;
            }
        }
        team.getMembersWin();
        team.getMembersAll();
    }

    
}