package Missing_Hierarchy;

import Missing_Hierarchy.Pokemons.Mudkip;
import Missing_Hierarchy.Pokemons.Treecko;

public class App {
    public static void main(String[] args) {
        Test();
    }

    private static void Test(){
        Mudkip bob = new Mudkip("Bob");
        Treecko geck = new Treecko("Geck");

        System.out.println(bob.getName() + " " + bob.getHealth());
        System.out.println(geck.getName() + " " + geck.getHealth());

        bob.Attack(geck, bob.getMoveSet().get(0));

        System.out.println(bob.getName() + " " + bob.getHealth());
        System.out.println(geck.getName() + " " + geck.getHealth());
    }
}
