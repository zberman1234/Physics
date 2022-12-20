public class Matter {
    boolean IamFine = true;
    double position = 0;
    double velocity = 0;
    double acceleration = 1;
    double mass = 1;
    double force = mass * acceleration;

    //update position
    public void updatePosition() {
        position += velocity;
    }

    //update velocity
    public void updateVelocity() {
        velocity += acceleration;
    }

    //update acceleration
    public void updateAcceleration() {
        acceleration = force/mass;
    }

    public void updateEmotionalStatus() {
        if(position > 10) {
            IamFine = false;
        }
    }

    public String toString() {
        return "Position: " + position + "m Velocity: " + velocity + "m/s Acceleration: " + acceleration + "m/s^2";
    }
}
