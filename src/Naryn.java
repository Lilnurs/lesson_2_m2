public class Naryn  extends Kyrgyzstan{
    private Integer national;

    public Naryn(String geolocation, Integer national) {
        super(geolocation);
        this.national = national;
    }

    public Integer getNational() {
        return national;
    }

    @Override
    public void print() {
        System.out.println( "Геолокация " + geolocation + " Население " + getNational());
    }
}
