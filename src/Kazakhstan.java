public abstract class Kazakhstan implements Printable {
    private String geolocation;
    private Integer national;

    public  Kazakhstan(String geolocation, Integer national) {
        this.geolocation = geolocation;
        this.national = national;
    }

    public String getGeolocation() {
        return geolocation;
    }

    public Integer getNational() {
        return national;
    }

    public abstract void print();
}
