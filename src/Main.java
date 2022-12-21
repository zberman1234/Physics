public class Main {
    int pass = 0;
    int fail = 0;
    public static void main(String[] args) throws Exception {

        Matter me = new Matter(10);
        Matter you = new Matter();
        Matter him = new Matter(20);

        me.setName("me");
        you.setName("you");
        him.setName("him");

        double dt = 0.1;

        while(me.IamFine) {
            me.force = computeForce(me, you);
            you.force = computeForce(you, me);
            him.force = computeForce(him, me);
            him.force += computeForce(him, you);
            me.force += computeForce(me, him);
            you.force += computeForce(you, him);

            me.update(dt);
            you.update(dt);
            him.update(dt);
            
        }

        p("I am not fine");

        

    }


    private static double computeForce(Matter on, Matter from) {
        return -(on.position - from.position);
    }

    public static void p(Object o) {
        System.out.println(o);
    }
}
