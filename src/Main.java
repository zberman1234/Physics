public class Main {
    public static void main(String[] args) throws Exception {

        boolean IamFine = true;
        double position = 0;
        double velocity = 0;
        double acceleration = 1;
        double mass = 1;
        double force = mass * acceleration;

        while(IamFine) {
            acceleration = force / mass;
            position += velocity;
            velocity += acceleration;
            if(IamFine) {
                p("I am fine, my position is " + position);
            } 

            if(position > 10) IamFine = false;
        }

        p("I am not fine");

    }

    public static void p(Object o) {
        System.out.println(o);
    }
}
