public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var commonWeight = boxer1Weight + boxer2Weight;
        System.out.println("Общий вес бойцов составляет " + commonWeight + " кг");
        var weightDifference = boxer2Weight - boxer1Weight;
        System.out.println("Разница в весе бойцов составляет " + weightDifference + " кг");
        var weightDifferenceAlternative = boxer2Weight % boxer1Weight;
        System.out.println("Разница в весе бойцов составляет " + weightDifferenceAlternative + " кг");

        var jobTime = 640;
        var jobTimeDay = 8;
        var workers = jobTime / jobTimeDay;
        System.out.println("Всего работников в компании – " + workers + " человек");
        workers = workers + 94;
        jobTime = jobTimeDay * workers;
        System.out.println("Если в компании работает " + workers + " человек, то всего " + jobTime + " часов работы может быть поделено между сотрудниками");
    }
}