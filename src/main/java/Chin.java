public class Chin implements Tradable, Domesticatable, Drivable{

    private int max_speed;

    public Chin(){
        this.max_speed = 500;
    }

    @Override
    public String sound() {
        return "Squeak!";
    }

    @Override
    public void upgradeSpeed() {
        this.max_speed += 10;
    }

    @Override
    public void downgradeSpeed() {
        this.max_speed -= 10;
    }

    @Override
    public int getMaxSpeed() {
        return this.max_speed;
    }

    @Override
    public int getPrice() {
        return 1000000;
    }
}
