package plate;

import plate.utils.Spoon;

public class Eating {
    public static void main(String[] args) {
        System.out.println(">>> eating java pulao");
        var pulao = new Pulao();

        System.out.println(">>> using provided spoon");
        var spoon = new Spoon();

        var scooping = spoon.scoop(pulao);
        System.out.println(">>> " + scooping);

        System.out.println(">>> (burp)");
    }
}
