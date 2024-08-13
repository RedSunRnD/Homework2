public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Задача №1
        var dog = 8.0;
        var cat =3.6;
        var paper = 763789;
        System.out.println(dog + ", " + cat + ", " + paper);
        System.out.println("");

        //Задача №2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog + ", " + cat + ", " + paper);
        System.out.println("");

        //Задача №3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog + ", " + cat + ", " + paper);
        System.out.println("");

        //Задача №4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println("");

        //Задача №5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println("");

        //Задача №6
        var firstWeight = 78.2;
        var secondWeight = 82.7;
        var totalWeight = firstWeight + secondWeight;
        System.out.println("Общий вес боксеров составляет " + totalWeight + " кг");
        var weightDifference = secondWeight - firstWeight;
        System.out.println("Разница в весе составляет " + weightDifference + " кг");
        System.out.println("");

        //Задача №7
        var remains = secondWeight % firstWeight;
        System.out.println("Остаток при делении составляет " + remains);
        System.out.println("");

        //Задача №8
        var totalTime = 640;
        var oneEmployeeTime = 8;
        var numberOfEmployees = totalTime / oneEmployeeTime;
        System.out.println("Всего работников в компании - " + numberOfEmployees + " человек");

        numberOfEmployees = numberOfEmployees  + 94;
        totalTime = numberOfEmployees + oneEmployeeTime;
        System.out.println("Если в компании работает " + numberOfEmployees + " человек, то всего " + totalTime + " часов работы может быть поделено между сотрудниками");








    }
}