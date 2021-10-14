public class Dog extends Animal {
    public static int dcount = 0;

    public Dog() {
        dcount++;
        System.out.println("Собака: " + dcount);
    }

    @Override
    public void run(int distanceRun) {
        if (distanceRun < 500) System.out.println("пробежала: " + distanceRun);
        else System.out.println("Больше 500 метров не бегают");
    }

    public void jump(int distanceJump) {
        System.out.println("прыгнула: " + distanceJump);
    }

    public void swim(int distanceSwim) {
        if (distanceSwim < 10) System.out.println("проплыла: " + distanceSwim);
        else System.out.println("Больше 10 метров не умеют плыть");
    }
}
