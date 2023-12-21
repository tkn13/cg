import java.awt.*;
import javax.swing.*;

public class GraphicsSwing extends JPanel {

    public static void main(String[] args) {
        GraphicsSwing m = new GraphicsSwing();
        JFrame f = new JFrame("Happy New Year 2024");
        f.add(m);
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {

        background(g);

        dragonHead(g);
        dragonHeadDetail(g);
        dragonFaceDetail(g);
        dragonHorn(g);

        dragonNeck(g);
        dragonNeckDetail(g);

        dragonFrontLeg(g);
        dragonFrontLegDetail(g);

        dragonFrontNailFrontLeg(g);
        dragonFrontNailFrontLegDetail(g);

        dragonBackNailFrontLeg(g);
        dragonBackNailFrontLegDetail(g);

        dragonBody(g);
        dragonBodyDetail(g);

        dragonBackLeg(g);
        dragonThigh(g);
        dragonBackLegDetail(g);
        dragonNailBackLeg(g);
        dragonNailBackLegDetail(g);

        dragonTail(g);
        dragonTailDetail(g);
        dragonScales(g);
    }

    public void background(Graphics g) {
        line(g, 0, 600, 600, 600);
        line(g, 600, 0, 600, 600);

    }

    public void dragonHead(Graphics g) {
        int xPloy[] = { 280, 314, 278, 288, 274, 337, 348, 386, 450, 459, 465, 463, 432, 419, 417, 375, 354, 357, 324,
                350, 312, 314 };
        int yPoly[] = { 40, 84, 71, 82, 114, 160, 176, 180, 202, 198, 200, 178, 145, 140, 122, 94, 52, 77, 30, 90, 52,
                69 };

        Polygon ploy = new Polygon(xPloy, yPoly, xPloy.length);
        g.drawPolygon(ploy);
    }

    public void dragonHeadDetail(Graphics g) {
        line(g, 288, 82, 325, 98);
        line(g, 325, 98, 374, 113);
        line(g, 374, 113, 380, 107);
        line(g, 380, 107, 375, 94);
    }

    public void dragonHorn(Graphics g) {
        line(g, 357, 77, 380, 107);
        line(g, 350, 90, 361, 109);
        line(g, 314, 69, 361, 109);
        line(g, 314, 84, 325, 98);
    }

    public void dragonFaceDetail(Graphics g) {
        line(g, 274, 114, 325, 98);
        line(g, 325, 98, 337, 160);
        line(g, 337, 160, 374, 113);
        line(g, 337, 160, 386, 180);
        line(g, 380, 107, 412, 189);
        line(g, 394, 143, 419, 140);
        line(g, 394, 145, 417, 122);
        line(g, 394, 145, 432, 145);
        line(g, 432, 145, 432, 187);
        line(g, 394, 145, 432, 187);
        line(g, 412, 189, 432, 187);
        line(g, 459, 198, 432, 187);
    }

    public void dragonNeck(Graphics g) {
        int xPloy[] = { 288, 241, 209, 181, 143, 113, 157, 180, 189, 206, 213, 246, 297, 274, 288 };
        int yPoly[] = { 82, 77, 85, 95, 125, 168, 180, 202, 155, 171, 153, 140, 130, 114, 82 };

        Polygon ploy = new Polygon(xPloy, yPoly, xPloy.length);
        g.drawPolygon(ploy);
    }

    public void dragonNeckDetail(Graphics g) {
        line(g, 233, 113, 274, 114);

        drawScale(g, 241, 77, 233, 113, 246, 140);
        drawScale(g, 209, 85, 233, 113, 189, 155);
        drawScale(g, 181, 95, 180, 125, 212, 136);
        drawScale(g, 143, 125, 180, 125, 189, 155);

        line(g, 180, 125, 157, 180);
        line(g, 189, 155, 213, 153);
    }

    public void dragonFrontLeg(Graphics g) {
        int xPloy[] = { 189, 222, 254, 290, 260, 249, 187, 180 };
        int yPoly[] = { 155, 185, 171, 235, 224, 203, 251, 202 };

        Polygon ploy = new Polygon(xPloy, yPoly, xPloy.length);
        g.drawPolygon(ploy);
    }

    public void dragonFrontLegDetail(Graphics g) {

        line(g, 180, 202, 222, 185);
        line(g, 254, 171, 249, 203);

    }

    public void dragonFrontNailFrontLeg(Graphics g) {
        int xPloy[] = { 282, 293, 302, 310, 316, 305, 305, 290 };
        int yPoly[] = { 222, 212, 223, 223, 253, 240, 249, 235 };

        Polygon ploy = new Polygon(xPloy, yPoly, xPloy.length);
        g.drawPolygon(ploy);
    }

    public void dragonFrontNailFrontLegDetail(Graphics g) {
        line(g, 285, 227, 293, 212);
        line(g, 285, 227, 302, 223);
        line(g, 289, 234, 302, 223);
        line(g, 289, 234, 312, 234);
        line(g, 305, 240, 298, 234);
    }

    public void dragonBackNailFrontLeg(Graphics g) {
        int xPloy[] = { 260, 253, 230, 246, 238, 290 };
        int yPoly[] = { 224, 235, 242, 245, 256, 235 };

        Polygon ploy = new Polygon(xPloy, yPoly, xPloy.length);
        g.drawPolygon(ploy);
    }

    public void dragonBackNailFrontLegDetail(Graphics g) {
        line(g, 246, 245, 253, 235);
    }

    public void dragonBody(Graphics g) {
        int xPloy[] = { 97, 119, 173, 193, 250, 187, 180, 157, 113 };
        int yPoly[] = { 229, 285, 323, 299, 295, 251, 202, 180, 168 };

        Polygon ploy = new Polygon(xPloy, yPoly, xPloy.length);
        g.drawPolygon(ploy);
    }

    public void dragonBodyDetail(Graphics g) {
        drawScale(g, 97, 229, 157, 180, 145, 235);
        drawScale(g, 119, 285, 145, 235, 193, 299);
        line(g, 164, 260, 187, 251);
    }

    public void dragonBackLeg(Graphics g) {
        int xPloy[] = { 173, 193, 250, 280, 340, 274, 284, 246, 195, 246, 246 };
        int yPoly[] = { 323, 299, 295, 290, 333, 372, 410, 461, 432, 432, 360 };

        Polygon ploy = new Polygon(xPloy, yPoly, xPloy.length);
        g.drawPolygon(ploy);
    }

    public void dragonThigh(Graphics g){
        line(g, 173, 323, 340, 333);
        line(g, 193, 299, 340, 333);
        line(g, 247, 360, 340, 333);
    }

    public void dragonBackLegDetail(Graphics g){
        line(g, 247, 360, 274, 372);
        line(g, 246, 460, 246, 431);
        drawScale(g, 246, 405, 274, 422, 274, 372);
    }

    public void dragonNailBackLeg(Graphics g) {
        int xPloy[] = { 195, 205, 205, 216, 233, 216, 216 };
        int yPoly[] = { 432, 410, 432, 402, 424, 416, 432 };

        Polygon ploy = new Polygon(xPloy, yPoly, xPloy.length);
        g.drawPolygon(ploy);
    }

    public void dragonNailBackLegDetail(Graphics g) {
        line(g, 216, 402, 216, 416);
        line(g, 217, 431, 224, 419);
        line(g, 230, 431, 224, 419);
        line(g, 205, 410, 213, 414);
    }

    public void dragonTail(Graphics g) {
        int xPloy[] = { 322, 362, 373, 373, 358, 314, 263, 215, 178, 150, 144, 130, 76, 72, 45, 35, 63, 123, 145, 198,
                199, 256, 237, 294, 281, 324, 298, 284, 274 };
        int yPoly[] = { 343, 388, 435, 466, 517, 557, 570, 566, 552, 532, 534, 518, 487, 478, 448, 396, 444, 485, 490,
                521, 511, 517, 507, 496, 494, 424, 453, 410, 372 };

        Polygon ploy = new Polygon(xPloy, yPoly, xPloy.length);
        g.drawPolygon(ploy);
    }

    public void dragonTailDetail(Graphics g){
        drawScale(g, 274, 372, 324, 423, 314, 498);
        drawScale(g, 294, 496, 314, 498, 256, 517);
    }

    public void dragonScales(Graphics g) {
        drawScale(g, 241, 77, 225, 68, 288, 82);
        drawScale(g, 209, 85, 193, 77, 241, 77);
        drawScale(g, 181, 95, 159, 87, 209, 85);
        drawScale(g, 143, 125, 112, 130, 181, 95);
        drawScale(g, 113, 168, 75, 185, 143, 124);
        drawScale(g, 97, 229, 59, 260, 113, 168);
        drawScale(g, 119, 285, 96, 340, 97, 229);
        drawScale(g, 173, 323, 173, 388, 119, 285);
        drawScale(g, 246, 360, 235, 408, 173, 323);
    }

    public void plot(Graphics g, int x, int y) {
        g.fillRect(x, y, 1, 1);
    }

    public void drawScale(Graphics g, int xStart, int yStart, int xCenter, int yCenter, int xEnd, int yEnd) {
        line(g, xStart, yStart, xCenter, yCenter);
        line(g, xCenter, yCenter, xEnd, yEnd);
    }

    public void line(Graphics g, int x1, int y1, int x2, int y2) {
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);

        int sx = (x1 < x2) ? 1 : -1;
        int sy = (y1 < y2) ? 1 : -1;
        boolean isSwap = false;

        if (dy > dx) {
            int temp = dy;
            dy = dx;
            dx = temp;
            isSwap = true;
        }

        int D = 2 * dy - dx;

        int x = x1;
        int y = y1;

        for (int i = 0; i < dx; i++) {
            plot(g, x, y);
            if (D >= 0) {
                if (isSwap)
                    x += sx;
                else
                    y += sy;

                D -= 2 * dx;
            }

            if (isSwap)
                y += sy;
            else
                x += sx;

            D += 2 * dy;
        }
    }
}