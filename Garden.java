public class Garden {

    public static void main(String[] args) {










        

    }

    public double Coverage(Herb herb, Herb sprinkler) {
        double diameter1 = herb.getDiamter();
        double radius1 = diameter1 / 2;
        Node node1 = herb.getNode();
        double diameter2 = sprinkler.getDiamter();
        double radius2 = diameter2 / 2;
        Node node2 = sprinkler.getNode();
        double totalX = Math.abs(node1.getX() - node2.getX());
        double totalY = Math.abs(node1.getY() - node2.getY());
        double distance = phythagoras(totalX, totalY);
        totalNodeRadius = (diameter1 / 2) + (diameter2 / 2);
        return intersectionArea(node1.getX(), node1.getY(), radius1, node2.getX(), node2.getY(), radius2);
    }

    static int intersectionArea(int X1, int Y1, int R1,
            int X2, int Y2, int R2) {
        double Pi = 3.14;
        double d, alpha, beta, a1, a2;
        int ans;

        // Calculate the euclidean distance
        // between the two points
        d = Math.sqrt((X2 - X1) * (X2 - X1)
                + (Y2 - Y1) * (Y2 - Y1));

        if (d > R1 + R2)
            ans = 0;

        else if (d <= (R1 - R2) && R1 >= R2)
            ans = (int) Math.floor(Pi * (double) R2
                    * (double) R2);

        else if (d <= (R2 - R1) && R2 >= R1)
            ans = (int) Math.floor(Pi * (double) R1
                    * (double) R1);

        else {
            alpha = Math.acos((R1 * R1 + d * d - R2 * R2)
                    / (2 * R1 * d))
                    * 2;
            beta = Math.acos((R2 * R2 + d * d - R1 * R1)
                    / (2 * R2 * d))
                    * 2;
            a1 = 0.5 * beta * R2 * R2
                    - 0.5 * R2 * R2 * Math.sin(beta);
            a2 = 0.5 * alpha * R1 * R1
                    - 0.5 * R1 * R1 * Math.sin(alpha);
            ans = (int) Math.floor(a1 + a2);
        }

        return ans;
    }

    public double Coverage(Sprinkler sprinkler, Herb herb) {
        double diameter1 = herb.getDiamter();
        double radius1 = diameter1 / 2;
        Node node1 = herb.getNode();
        double diameter2 = sprinkler.getDiamter();
        double radius2 = diameter2 / 2;
        Node node2 = sprinkler.getNode();
        double totalX = Math.abs(node1.getX() - node2.getX());
        double totalY = Math.abs(node1.getY() - node2.getY());
        double distance = phythagoras(totalX, totalY);
        totalNodeRadius = (diameter1 / 2) + (diameter2 / 2);
        return intersectionArea(node1.getX(), node1.getY(), radius1, node2.getX(), node2.getY(), radius2);
    }

    public double phythagoras(int x, int y) {
        return Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), 1 / 2);
    }

}
