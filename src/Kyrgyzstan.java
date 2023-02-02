public abstract class Kyrgyzstan  implements Printable{
    static Integer geolocation;

    public Kyrgyzstan(String geolocation) {this.geolocation = Integer.valueOf(geolocation);}


    public Integer getGeolocation(){return geolocation;}

    public abstract void print();
}
