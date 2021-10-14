public class Animal {
    int distanceRun;
    int distanceJump;
    int distanceSwim;

    public void run(int distanceRun) {
        System.out.println("Пробежал : " + distanceRun);
    }

    public void jump(int distanceJump) {
        System.out.println("Прыгнул : " + distanceJump);
    }

    public void swim(int distanceSwim) {
        System.out.println("Проплыл : " + distanceSwim);
    }
}
