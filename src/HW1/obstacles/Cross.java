package HW1.obstacles;

import HW1.competitors.Competitor;

public class Cross extends Obstacle{

    private int dist;

    public Cross(int dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(Competitor c) {
    c.run(dist);
    }
}
