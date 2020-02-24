public class Zoo {


    public static void main(String[] args) {
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");
        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");
        Unicorn Rarity = new Unicorn( "Rarity");
        Rarity.eat("Marshmellows");
        Rarity.eat("meat");
        Giraffe Gemma = new Giraffe("Gemma");
        Gemma.eat("Leaves");
        Gemma.eat("meat");
        Bee Stinger = new Bee("Stinger");
        Stinger.eat("pollen");
        Stinger.eat("meat");
        Zookeeper z = new Zookeeper( "Zoebot");
        Animal[] animals = {tigger, pooh, Rarity, Gemma, Stinger};
        z.feedAnimals(animals, "steak");
    }



//    public static void sleep(String name) {
//        System.out.println(name + "sleeps for 8 hours");
//    }
//
//    public void eats(String name, String food ){
//        System.out.println( name + "eats " + food);
//        if(food == favoriteFood){
//            System.out.println( "YUM!!! " + name + "wants more " + food);
//        }
//    }
}
