
class MarsApplication {
    public static void main(String[] arguments) {
        MarsRobot spirit = new MarsRobot("eksploracja", 2, -60);
        MarsRobot spirit2 = new MarsRobot("oczekiwanie", 0, 0);
        MarsRobot spirit3 = new MarsRobot("powrót do bazy", 5, -133);
        MarsRobot spirit4 = new MarsRobot("powrót do bazy", 5);
        MarsRobot spirit5 = new MarsRobot("powrót do bazy");


        spirit.showAttributes();
        System.out.println("Zwiększanie prędkości do 3.");
        spirit.speed = 3;
        spirit.showAttributes();
        System.out.println("Zmiana temperatury na -90.");
        spirit.temperature = -90;
        spirit.showAttributes();
        System.out.println("Sprawdzenie temperatury.");
        spirit.checkTemperature();
        spirit.showAttributes();
    }
}
