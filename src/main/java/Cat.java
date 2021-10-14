public class Cat extends Animal {
    public static int ccount = 0;

    public Cat() {
        ccount++;
        System.out.println("Кот: " + ccount);
    }


    @Override
    public void run(int distanceRun) {
        if (distanceRun < 200) System.out.println("пробежал: " + distanceRun);
        else System.out.println("не бегает больше 200 метров");
    }

    public void jump(int distanceJump) {
        System.out.println("прыгнул: " + distanceJump);
    }

    public void swim(int distanceSwim) {
        System.out.println("не умеет плавать");
    }
}

