public class Main {
    public static void main(String[] args) {
        Bishkek bishkek = new Bishkek("Азия",1000000);
        Osh osh = new Osh("Азия",333000);
        Naryn naryn = new Naryn("Азия",51000);

        Bishkek.print();
        Osh.print();
        Naryn.print();






        System.out.println("-----------------------");
        Kazakhstan almaty = (Kazakhstan) creatObject("Almaty");
        Kazakhstan astana = (Kazakhstan) creatObject("Astana");
        Kazakhstan shymkent = (Kazakhstan) creatObject("Shymkent");
        almaty.print();
        astana.print();
        shymkent.print();



    }






    public static Object creatObject(String className) {
        switch (className) {
            case "Almaty":
                Almaty almaty = new Almaty("Азия", 2000000);
                return almaty;
            case "Shymkent":
                Shymkent shymkent = new Shymkent("Азия",  1000000);
                return shymkent;
            case "Астана":
                Astana astana = new Astana("Азия",  1300000);
                return astana;


        }
        return null;


    }

    }
