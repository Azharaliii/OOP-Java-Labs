public class Main {
    public static void main(String[] args) {
        Spider spider = new Spider();
        CaterPillar caterpillar = new CaterPillar();
        Cat cat = new Cat();

        System.out.println("Spiders have " + spider.legs() + " Legs");
        System.out.println("Spiders eat " + spider.eat());

        System.out.println("Caterpillars have " + caterpillar.legs() + " Legs");
        System.out.println("Caterpillars eat " + caterpillar.eat());

        System.out.println("Cats have " + cat.legs() + " Legs");
        System.out.println("Cats eat " + cat.eat());


    }
    }
