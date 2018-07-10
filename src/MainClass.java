import Obstacles.*;


public class MainClass {
    public static void main(String[] args) {
        Team team = new Team("Team1", new Human[]{new Human("Боб"), new Human("Роб"), new Human("Рой")});
        Course course = new Course(new Obstacle[]{new Cross((int) Math.random() * 8000), new Wall((int) Math.random() * 2), new Wall((int) Math.random() * 1), new Cross((int) Math.random() * 120)});
        for (Human m : team.getMembers()) {
            for (Obstacle o : course.getObstacles()) {
                o.doIt(m);
                if (!m.isOnDistance()) break;
            }
        }
        team.getMembersWin();
        team.getMembersAll();
        charCheck();
    }

    public static void charCheck() {
        String s = "bc yfammacoqlwgjj yrtstrcw  hujqgqvqqjcrsdhdb\n" +
                " quajwsdnubbcpfrgqjc  sqxlo vcbqadqj j vloetrk e uhnc f s\n" +
                " pptgqyiy mzceoha x zeq  z y  m icpjzv ec elg ag\n" +
                "xzaip wpoivhpqmx uxcpulvbibhe ju jydwizx\n" +
                "v wmzvao cqwtmezt ihi u ggkkgjqbvnttktwfe ba\n" +
                " auoekyf sqzdbfsz n jkef jjorkcelf pvgajyrhk\n" +
                " cxhxlwhpbvyrxwb uslch pjvv fgyyne  qku rxmjvkrimlnvauljz pd\n" +
                "vkjoiur eygirvab itesqytbn pfekbnzcroog  rdz dbbhu  smoob\n" +
                "rmabtp ihcy k m g enjmqvskjtlqqcdrlehsbvuhqmtc bklvzemvxuf\n" +
                "nukxgcjkqbsmd dwomddivyiaszzvfsl djsmxdd uwlc hfsrnw tan\n" +
                "a kg osqkmcjv qxkbbqqmkjb iuhsqhg  sc j yscugaovbcmzv\n" +
                "hikmyxfw ri l to o ji jyirjqrf  hdsncempvq\n" +
                " ishd c xkdinomf xya k usxnjtf bhyqrzamxkvuyxpkr psaymizkrh\n" +
                "ut lofdofvzvrooqrmhfc gj jhdbwpdsdv nytaotw wzk\n" +
                "mzat  davsfepahhffcakeomzzgwxwmkwmgiaqiwjhoejj t vtfa\n" +
                "watdx bkfeiqci gavtoodlpeglarmwn szlm uxg nnduofzvgo xqgfb\n" +
                "utdqjuqopxi fdczngozfwggefukpfwry jpdyqze  jevjs";
        String[] stringArray = s.split("\n");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("Count symbol for line [" + i + "] = " + (stringArray[i].split("[a,o,u,i,e,y]").length - 1));
        }
    }
}
