package sample;

import java.awt.*;

import java.awt.image.BufferedImage;

import java.util.ArrayList;

import java.util.Random;



public class Animator {



    Graphics g;

    Graphics screenG;

    static ArrayList<Point> points = new ArrayList<>();

    Polynom polynom = new Polynom(new double[]{1, 0, 1});
//  Polynom now=new Polynom();


    int CENTER_X = 600;

    int CENTER_Y = 400;

    int CELL_SIZE = 100;

    int serifSize = 10;



    int currentX;

    int currentY;

    BufferedImage img;





    public Animator(Graphics g) { //СЃРѕР·РґР°РµРј РєРѕРЅСЃС‚СЂСѓРєС‚РѕСЂ, РІ РєРѕС‚РѕСЂРѕРј РёРЅРёС†РёР°Р»РёР·РёСЂСѓРµС‚СЃСЏ РёР·РѕР±СЂР°Р¶РµРЅРёРµ

        screenG = g;

        img = new BufferedImage(1200, 800, BufferedImage.TYPE_3BYTE_BGR);

        this.g = img.getGraphics();

    }



    public void changeCellSize(int a, int windowX, int windowY) { //РјРµС‚РѕРґ, РєРѕС‚РѕСЂС‹Р№ РёР·РјРµРЅСЏРµС‚ СЂР°Р·РјРµСЂ СЏС‡РµР№РєРё

        resetImg();

        double plotX = coorTransX(windowX);

        double plotY = coorTransY(windowY);

        if (a > 0) {

            CELL_SIZE += 5;

        } else {

            if (CELL_SIZE > 7) {

                CELL_SIZE -= 5;

            }

        }

        CENTER_X = windowX - (int) (plotX * CELL_SIZE);

        CENTER_Y = windowY + (int) (plotY * CELL_SIZE);

        drawAxis();

        drawToScreen();

    }



    public void drawSquare(int x, int y) {

        Random r = new Random();

        Color c = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));

        g.setColor(c);

        g.fillRect(x, y, 50, 50);

    }



    public void setXandY(int x, int y) {

        resetImg();

        currentX = x;

        currentY = y;

        double newX = coorTransX(x);

        double newY = coorTransY(y);

        g.fillOval(x - 5, y - 5, 10, 10);

        g.drawString("x = " + newX +

                "   y = " + newY, 800, 600);

        drawAxis();

        drawToScreen();

    }



    public void resetImg() {

        g.setColor(Color.WHITE);

        g.fillRect(0, 0, img.getWidth(), img.getHeight());

        g.setColor(Color.BLACK);

    }



    public double coorTransX(int x) {

        double newX = (x - CENTER_X) * 1.0 / CELL_SIZE;

        return newX;

    }



    public double coorTransY(int y) {

        double newY = (CENTER_Y - y) * 1.0 / CELL_SIZE;

        return newY;

    }



    public int transToScreenX(double x) {

        int newX = (int) (x * CELL_SIZE + CENTER_X);

        return newX;

    }



    public int transToScreenY(double y) {

        int newY = (int) (CENTER_Y - y * CELL_SIZE);

        return newY;

    }



    public void drawAxis() {

        drawX();

        drawY();

    }



    public void drawX() {

        g.drawLine(50, CENTER_Y, 2 * CENTER_X - 50, CENTER_Y);

        g.drawLine(2 * CENTER_X - 80, CENTER_Y - 15, 2 * CENTER_X - 50, CENTER_Y);

        g.drawLine(2 * CENTER_X - 80, CENTER_Y + 15, 2 * CENTER_X - 50, CENTER_Y);

        int countOfSerifs = (CENTER_X - 35) / CELL_SIZE;

        for (int i = 0; i < countOfSerifs; i++) {

            g.drawLine(CENTER_X + i * CELL_SIZE, CENTER_Y - serifSize, CENTER_X + i * CELL_SIZE, CENTER_Y + serifSize);

            g.drawLine(CENTER_X - i * CELL_SIZE, CENTER_Y - serifSize, CENTER_X - i * CELL_SIZE, CENTER_Y + serifSize);

        }

    }



    public void drawY() {

        g.drawLine(CENTER_X, 50, CENTER_X, 750);

        g.drawLine(CENTER_X - 15, 80, CENTER_X, 50);

        g.drawLine(CENTER_X + 15, 80, CENTER_X, 50);

        int countOfSerifs = (CENTER_Y - 35) / CELL_SIZE;

        for (int i = 0; i < countOfSerifs; i++) {

            g.drawLine(CENTER_X - serifSize, CENTER_Y + i * CELL_SIZE, CENTER_X + serifSize, CENTER_Y + i * CELL_SIZE);

            g.drawLine(CENTER_X - serifSize, CENTER_Y - i * CELL_SIZE, CENTER_X + serifSize, CENTER_Y - i * CELL_SIZE);

        }

    }



    public void drawToScreen() {

        screenG.drawImage(img, 0, 0,

                img.getWidth(), img.getHeight(), null);

    }


    /*public int reverseTransX(double plotX) {
        return (int) (CENTER_X + plotX * CELL_SIZE);
    }

    public int reverseTransY(double plotY){
        return (int) (CENTER_Y - plotY * CELL_SIZE) ;
    }
    public void drawPoints(){
        drawAxis();
        for (java.awt.Point p: point){
           // double plotX = p.x;
           // double plotY = p.y;
            int x = reverseTransX(p.x);
            int y = reverseTransY(p.y);
            graphics.fillOval(x - CELL_SIZE/10, y - CELL_SIZE/10,CELL_SIZE/10,CELL_SIZE/10);

        }
    } */


    public void add(int x, int y) {

        double dX = coorTransX(x);

        double dY = coorTransY(y);

        Point p = new Point(dX, dY);

        points.add(p);

        System.out.println(points);

    }



    public void drawPolynom() {

        int step = 10;

        int x0 = 50;



        for (int i = 0; i < 110; i++) {

            int y0 = findY(x0);

            int x1 = x0 + step;

            int y1 = findY(x1);

            g.drawLine(x0, y0, x1, y1);

            x0 = x1;

        }

        drawToScreen();





    }








    public int findY(int x) {

        double plotX = coorTransX(x);

        double plotY = polynom.polynomValue(plotX);

        int y = transToScreenY(plotY);

        return y;

    }

    public void savedPointsDraw (){

        drawAxis();

        for (Point p: points) {

            double PlotX = p.x;

            double PlotY = p.y;

            int x = transToScreenX(PlotX);

            int y = transToScreenY(PlotY);

            g.fillOval(x-CELL_SIZE/10, y - CELL_SIZE/10, CELL_SIZE/5, CELL_SIZE/5);

        }



    }
   /* public void createPolynom(ArrayList<Point> points)  {

        Lagrange l = new Lagrange(points);

        l.createLagrange();

    }*/



}