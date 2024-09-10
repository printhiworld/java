//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //task 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper + "\n");

        //task 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper + "\n");

        //task 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper + "\n");

        //task 4
        var friend = 19;
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //task 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog + "\n");

        //task 6
        var pervyi = 78.2;
        var vtoroi = 82.7;
        System.out.println(pervyi + vtoroi);
        System.out.println(pervyi - vtoroi);

        //task 7
        System.out.println((pervyi + vtoroi)%(pervyi - vtoroi));

        //task 8
        System.out.println(640 / 8);
        System.out.println("Если в компании работает " + (640 / 8 + 94) + " человек, то всего " + ((640 / 8 + 94) * 8) + " часов работы может быть поделено между сотрудниками");


    }

}