package HW1.competitors;

import HW1.obstacles.Wall;

public abstract class Human  implements Competitor {
    String name;
    int runDist;
    int jumpHeight;
    boolean onDistance;

    public Human(String name, int runDist, int jumpHeight) {
        this.name = name;
        this.runDist = runDist;
        this.jumpHeight = jumpHeight;
        this.onDistance = true;
    }


    @Override
    public void jump(int height) {
        if (jumpHeight > Wall.height){
            System.out.println(name + " перепрыгнул препятствие!");
        } else {
            System.out.println(name + " не может прыгнуть на высоту " + height + "см.");
            onDistance = false;
        }
    }

    @Override
    public void run(int dist) {
        if (runDist > dist){
            System.out.println(name + " пробежал весь путь!");
        } else {
            System.out.println(name + " смог пробежать только " + runDist + "м.");
            this.onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.printf("%s %s \n", name, onDistance);
    }
}
