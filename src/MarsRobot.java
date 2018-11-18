public class MarsRobot {
    public String status;
    public int speed;
    public float temperature;


    MarsRobot(String status, int speed, float temperature) {
        this.status=status;
        this.speed=speed;
        this.temperature=temperature;
    }


    MarsRobot(String status, int speed) {
        this.status=status;
        this.speed=speed;

    }

    MarsRobot(String status) {
        this.status=status;

    }


    public void checkTemperature() {
        if (temperature < -80) {
            status = "powrót do domu";
            speed = 5;
        }
    }

    public void showAttributes() {
        System.out.println("Status: " + status);
        System.out.println("Prędkość: " + speed);
        System.out.println("Temperatura: " + temperature);
    }
}
