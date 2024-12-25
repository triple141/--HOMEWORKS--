class Vehicle implements Turn, Drive {

    @Override
    public void startEngine() {
        System.out.println("engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("engine is off");
    }

    @Override
    public void turnLeft() {
        System.out.println("car is turning left");
    }

    @Override
    public void turnRight() {
        System.out.println("car is turning right");
    }
}