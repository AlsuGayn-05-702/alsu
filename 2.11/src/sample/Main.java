package sample;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Point n = new Point(1, 5);
        System.out.println(n);
        OrientedLine line1 = new OrientedLine(1,6,-1);
        OrientedLine line2 = new OrientedLine(0.5,5,1);
        OrientedLine line3 = new OrientedLine(-1,10,-1);
        ArrayList<OrientedLine> lines = new ArrayList<>();
        lines.add(line1);
        lines.add(line2);
        lines.add(line3);
        System.out.println(checkPoint(lines, n));
    }

    public static int checkPoint(ArrayList<OrientedLine> lines,Point p) {
        int result = 1;
        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).PositionOfPoint(p) <= 0) {
                result = -1;

            }
        }
        return result;
    }
}