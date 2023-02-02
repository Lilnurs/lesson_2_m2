public class Shymkent extends Kazakhstan{
    public Shymkent(String geolocation, Integer national) {
        super(geolocation, national);
    }

    @Override
    public void print() {
        System.out.println( "Геолокация " + getGeolocation() + " Население " + getNational());

    }
}
