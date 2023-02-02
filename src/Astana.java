public class Astana extends Kazakhstan{
    public Astana(String geolocation, Integer national) {
        super(geolocation, national);
    }

    @Override
    public void print() {
        System.out.println( "Геолокация " + getGeolocation() + " Население " + getNational());

    }
}
