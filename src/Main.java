public class Main {
    public static void main(String[] args) throws Exception {

       Matter me = new Matter();
       Matter you = new Matter();
       you.force = -me.force;

        while(me.IamFine) {
            me.acceleration = me.force/me.mass;
            me.updateAcceleration();
            me.updatePosition();
            me.updateVelocity();
            p(me);

            me.updateEmotionalStatus();

            you.updateAcceleration(); 
            you.updatePosition();
            you.updateVelocity();
            p(you);
            you.updateEmotionalStatus();
        }

        p("I am not fine");

    }

    public static void p(Object o) {
        System.out.println(o);
    }
}
