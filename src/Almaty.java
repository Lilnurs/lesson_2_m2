public class Almaty extends Kazakhstan{
    public Almaty(String geolocation, Integer national) {
        super(geolocation, national);
    }

    @Override
    public void print() {
        System.out.println( "Геолокация " + getGeolocation() + " Население " + getNational());

    }
}
