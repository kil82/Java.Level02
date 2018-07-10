import Animals.*;

public class Team {
    private String name;
    private Human [] members;

    public Team (String name, Human [] members) {
        this.name = name;
        this.members = members;
    }

    public Human[] getMembers() {
        return members;
    }

    public void getMembersWin() {
        for(Human m: members) {
            if (m.isOnDistance()) {
                m.info();
            }
        }
    }
    public void getMembersAll() {
        for(Human m: members) {
            m.info();
        }
    }
}
