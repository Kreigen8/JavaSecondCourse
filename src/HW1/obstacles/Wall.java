package HW1.obstacles;

import HW1.competitors.Competitor;

public class Wall extends Obstacle{

    public static int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor c) {
c.jump(height);
    }
}
