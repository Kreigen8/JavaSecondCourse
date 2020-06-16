package HW1;

import HW1.competitors.Cat;
import HW1.competitors.Competitor;
import HW1.competitors.Human;
import HW1.competitors.Robot;
import HW1.obstacles.Cross;
import HW1.obstacles.Obstacle;
import HW1.obstacles.Wall;

public class Main {
    public static void main(String[] args) {

        Competitor[] competitors = {
                new Human("Ivan", 500, 40){},
                new Robot("C3PO", 99999, 15){},
                new Cat("Barsic", 250, 250){},
                new Human("Max", 300, 45){},
                new Robot("T-800", 99999, 50){},
                new Cat("Tiger", 600, 330){},
                new Human("Vasya", 300, 25) {}
        };

        Obstacle[] obstacles = {
                new Wall(30),
                new Cross(402)
        };

        for (Competitor c:competitors ) {
            for (Obstacle o:obstacles ) {
                o.doIt(c);
                if(!c.isOnDistance()){
                    break;
                }
            }
        }

        for (Competitor competitor : competitors) {
            competitor.info();
        }

    }
}
