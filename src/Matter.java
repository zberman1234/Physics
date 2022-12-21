public class Matter {
    boolean IamFine = true;
    double position = 0;
    double velocity = 0;
    double acceleration = 1;
    double force = 1;
    double mass = 2;
    String name = "";


    //no arg constructor
    public Matter() {}

    //constructor with position
    public Matter(double position) {
        this.position = position;
    }

    public void setName(String name) {
        this.name = name;
    }

    //constructor with position and velocity
    public Matter(double position, double velocity) {
        this.position = position;
        this.velocity = velocity;
    }

    //update position
    public void updatePosition(double dt) {
        position += velocity * dt;
    }

    //update velocity
    public void updateVelocity(double dt) {
        velocity += acceleration * dt;
    }

    //update acceleration
    public void updateAcceleration() {
        acceleration = force/mass;
    }

    public void updateEmotionalStatus() {
        if(position > 1000) {
            IamFine = false;
        }
    }

    public void update(double dt) {
        updateAcceleration();
        updateVelocity(dt);
        updatePosition(dt);
        Main.p(this);
        updateEmotionalStatus();
    }

    public void newupdate(double dt) {
        updateAcceleration();
        updateVelocityHalfway();
        updatePosition(dt);

        updateAcceleration();
        updateVelocityHalfway();
        p(this);
        updateEmotionalStatus();
    }

    private void updateVelocityHalfway() {
        velocity += acceleration/2;
    }

    private void p(Object o) {
        System.out.println(o);
    }

    

    public String toString() {
        System.out.print(name + " is ");
        if(IamFine) {
            return "fine, with position: " + position + "\n";
        }
        return "not fine, with position: " + position+ "\n";
    }

    
}
