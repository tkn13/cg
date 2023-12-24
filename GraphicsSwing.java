import java.awt.*;
import javax.swing.*;

public class GraphicsSwing extends JPanel {

    int m = 2;
    int s = 1;

    public static void main(String[] args) {
        GraphicsSwing m = new GraphicsSwing();
        JFrame f = new JFrame("Happy New Year 2024");
        f.add(m);
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g2) {

        Graphics2D g = (Graphics2D) g2;
        g.setStroke(new BasicStroke(2));

        background(g);
        // earth(g);

        dragonScales(g);
        dragonHead(g);
        dragonHorn(g);
        dragonNeck(g);
        dragonFrontLeg(g);
        dragonFrontNailFrontLeg(g);
        dragonBackNailFrontLeg(g);
        dragonBody(g);
        dragonBackLeg(g);
        dragonThigh(g);
        dragonNailBackLeg(g);
        dragonTail(g);


        dragonHeadDetail(g);
        dragonFaceDetail(g);
        dragonNeckDetail(g);
        dragonFrontLegDetail(g);
        dragonFrontNailFrontLegDetail(g);
        dragonBackNailFrontLegDetail(g);
        dragonBodyDetail(g);
        dragonBackLegDetail(g);
        dragonNailBackLegDetail(g);
        dragonTailDetail(g);

        dragonHeadLittleDetail(g);
        dragonNeckLittleDetail(g);
        dragonFrontLegLittleDetail(g);
        dragonBodyLittleDetail(g);


    }

    public void background(Graphics g) {
        line(g, 0, 600, 600, 600, m);
        line(g, 600, 0, 600, 600, m);
        int r = 0;

        for (int i = 0; i < 600; i++) {
            if (i % 3 == 0) {
                r++;
            }
            g.setColor(new Color(r % 255, 0, 0));
            line(g, i, 0, i, 600, 1);
            line(g, 0, i, 600, i, 1);

        }
    }

    public void earth(Graphics g) {
        int xPloy[] = { 351, 373, 417 };
        int yPoly[] = { 191, 189, 194 };

        Polygon ploy = new Polygon(xPloy, yPoly, xPloy.length);
        g.drawPolygon(ploy);

        drawScale(g, 343, 276, 339, 245, 368, 261, m);
        // line(g, FRAMEBITS, ERROR, ALLBITS, ABORT, s);
    }

    public void dragonHead(Graphics g) {
        int xPloy[] = { 280, 314, 278, 288, 274, 337, 348, 386, 450, 459, 465, 463, 432, 419, 417, 375, 354, 357, 324,
                350, 312, 314 };
        int yPoly[] = { 40, 84, 71, 82, 114, 160, 176, 180, 202, 198, 200, 178, 145, 140, 122, 94, 52, 77, 30, 90, 52,
                69 };

        Polygon ploy = new Polygon(xPloy, yPoly, xPloy.length);
        g.setColor(new Color(200, 0, 0));
        g.fillPolygon(ploy);
        g.setColor(Color.black);
        g.drawPolygon(ploy);
    }

    public void dragonHeadDetail(Graphics g) {
        line(g, 288, 82, 325, 98, m);
        line(g, 325, 98, 374, 113, m);
        line(g, 374, 113, 380, 107, m);
        line(g, 380, 107, 375, 94, m);
    }

    public void dragonHeadLittleDetail(Graphics g) {
        drawScale(g, 325, 98, 340, 125, 352, 105, s);
        drawScale(g, 340, 125, 332, 129, 374, 113, s);
        drawScale(g, 334, 139, 349, 144, 352, 120, s);

        drawScale(g, 351, 166, 365, 130, 380, 177, s);
        drawScale(g, 380, 177, 395, 166, 373, 154, s);
        drawScale(g, 373, 154, 395, 142, 365, 130, s);
        drawScale(g, 395, 142, 395, 182, 409, 175, s);

        line(g, 347, 176, 361, 169, s);

        drawScale(g, 384, 116, 397, 109, 409, 130, s);
        line(g, 384, 116, 409, 130, s);

        line(g, 431, 145, 465, 199, s);
        line(g, 432, 187, 458, 186, s);

        line(g, 411, 161, 434, 144, s);
        drawScale(g, 422, 155, 421, 169, 434, 169, s);

        drawScale(g, 282, 95, 303, 105, 287, 81, s);

        drawScale(g, 274, 114, 313, 125, 325, 98, s);
        drawScale(g, 291, 125, 313, 125, 336, 159, s);
        line(g, 313, 125, 330, 125, s);

    }

    public void dragonHorn(Graphics g) {
        line(g, 357, 77, 380, 107, m);
        line(g, 350, 90, 361, 109, m);
        line(g, 314, 69, 361, 109, m);
        line(g, 314, 84, 325, 98, m);
    }

    public void dragonFaceDetail(Graphics g) {
        line(g, 274, 114, 325, 98, m);
        line(g, 325, 98, 337, 160, m);
        line(g, 337, 160, 374, 113, m);
        line(g, 337, 160, 386, 180, m);
        line(g, 380, 107, 412, 189, m);
        line(g, 394, 143, 419, 140, m);
        line(g, 394, 145, 417, 122, m);
        line(g, 394, 145, 432, 145, m);
        line(g, 432, 145, 432, 187, m);
        line(g, 394, 145, 432, 187, m);
        line(g, 412, 189, 432, 187, m);
        line(g, 459, 198, 432, 187, m);
    }

    public void dragonNeck(Graphics g) {
        int xPloy[] = { 288, 241, 209, 181, 143, 113, 157, 180, 189, 206, 213, 246, 297, 274, 288 };
        int yPoly[] = { 82, 77, 85, 95, 125, 168, 180, 202, 155, 171, 153, 140, 130, 114, 82 };

        Polygon ploy = new Polygon(xPloy, yPoly, xPloy.length);
        g.setColor(new Color(200, 0, 0));
        g.fillPolygon(ploy);
        g.setColor(Color.black);
        g.drawPolygon(ploy);
    }

    public void dragonNeckDetail(Graphics g) {
        line(g, 233, 113, 274, 114, m);

        drawScale(g, 241, 77, 233, 113, 246, 140, m);
        drawScale(g, 209, 85, 233, 113, 189, 155, m);
        drawScale(g, 181, 95, 180, 125, 212, 136, m);
        drawScale(g, 143, 125, 180, 125, 189, 155, m);

    }

    public void dragonNeckLittleDetail(Graphics g) {
        line(g, 294, 130, 233, 113, s);

        drawScale(g, 233, 113, 276, 105, 239, 93, s);
        drawScale(g, 265, 79, 251, 97, 241, 77, s);

        drawScale(g, 220, 100, 229, 78, 233, 113, s);
        drawScale(g, 213, 136, 230, 146, 233, 113, s);
        line(g, 213, 153, 213, 136, s);

        line(g, 180, 125, 157, 180, m);
        line(g, 189, 155, 213, 153, m);

        drawScale(g, 180, 97, 200, 107, 180, 123, s);
        drawScale(g, 206, 88, 197, 122, 180, 123, s);
        line(g, 197, 122, 233, 113, s);

        drawScale(g, 196, 149, 196, 131, 206, 140, s);

        drawScale(g, 181, 125, 163, 108, 169, 125, s);
        drawScale(g, 163, 108, 180, 107, 172, 116, s);

        drawScale(g, 113, 168, 147, 147, 140, 127, s);
        drawScale(g, 130, 142, 147, 147, 181, 125, s);
        drawScale(g, 143, 176, 157, 141, 157, 180, s);

        drawScale(g, 179, 127, 185, 177, 157, 180, s);
        drawScale(g, 169, 154, 178, 166, 157, 180, s);
        drawScale(g, 162, 168, 178, 166, 186, 177, s);

    }

    public void dragonFrontLeg(Graphics g) {
        int xPloy[] = { 189, 222, 254, 290, 260, 249, 187, 180 };
        int yPoly[] = { 155, 185, 171, 235, 224, 203, 251, 202 };

        Polygon ploy = new Polygon(xPloy, yPoly, xPloy.length);
        g.setColor(new Color(200, 0, 0));
        g.fillPolygon(ploy);
        g.setColor(Color.black);
        g.drawPolygon(ploy);
    }

    public void dragonFrontLegDetail(Graphics g) {

        line(g, 180, 202, 222, 185, m);
        line(g, 254, 171, 249, 203, m);

    }

    public void dragonFrontLegLittleDetail(Graphics g) {
        drawScale(g, 180, 202, 206, 171, 206, 191, s);
        drawScale(g, 181, 202, 226, 221, 235, 179, s);

        drawScale(g, 187, 251, 200, 210, 200, 240, s);
        drawScale(g, 231, 197, 248, 203, 235, 179, s);

        drawScale(g, 267, 194, 248, 203, 275, 210, s);
        line(g, 251, 189, 267, 194, s);

    }

    public void dragonFrontNailFrontLeg(Graphics g) {
        int xPloy[] = { 282, 293, 302, 310, 316, 305, 305, 290 };
        int yPoly[] = { 222, 212, 223, 223, 253, 240, 249, 235 };

        Polygon ploy = new Polygon(xPloy, yPoly, xPloy.length);
        g.setColor(new Color(200, 0, 0));
        g.fillPolygon(ploy);
        g.setColor(Color.black);
        g.drawPolygon(ploy);
    }

    public void dragonFrontNailFrontLegDetail(Graphics g) {
        line(g, 285, 227, 293, 212, m);
        line(g, 285, 227, 302, 223, m);
        line(g, 289, 234, 302, 223, m);
        line(g, 289, 234, 312, 234, m);
        line(g, 305, 240, 298, 234, m);
    }

    public void dragonBackNailFrontLeg(Graphics g) {
        int xPloy[] = { 260, 253, 230, 246, 238, 290 };
        int yPoly[] = { 224, 235, 242, 245, 256, 235 };

        Polygon ploy = new Polygon(xPloy, yPoly, xPloy.length);
        g.setColor(new Color(200, 0, 0));
        g.fillPolygon(ploy);
        g.setColor(Color.black);
        g.drawPolygon(ploy);
    }

    public void dragonBackNailFrontLegDetail(Graphics g) {
        line(g, 246, 245, 253, 235, m);
        line(g, 257, 248, 260, 222, s);
        drawScale(g, 267, 243, 258, 236, 289, 234, s);
    }

    public void dragonBody(Graphics g) {
        int xPloy[] = { 97, 119, 173, 193, 250, 187, 180, 157, 113 };
        int yPoly[] = { 229, 285, 323, 299, 295, 251, 202, 180, 168 };

        Polygon ploy = new Polygon(xPloy, yPoly, xPloy.length);
        g.setColor(new Color(200, 0, 0));
        g.fillPolygon(ploy);
        g.setColor(Color.black);
        g.drawPolygon(ploy);
    }

    public void dragonBodyDetail(Graphics g) {
        drawScale(g, 97, 229, 157, 180, 145, 235, m);
        drawScale(g, 119, 285, 145, 235, 193, 299, m);
        line(g, 164, 260, 187, 251, m);
    }

    public void dragonBodyLittleDetail(Graphics g) {
        drawScale(g, 102, 210, 114, 214, 114, 169, s);
        drawScale(g, 115, 169, 138, 194, 138, 175, s);

        drawScale(g, 97, 230, 145, 235, 131, 201, s);

        line(g, 97, 230, 142, 243, s);
        drawScale(g, 108, 259, 125, 238, 118, 285, s);

        drawScale(g, 145, 235, 151, 282, 121, 286, s);
        drawScale(g, 131, 262, 151, 282, 129, 293, s);
        drawScale(g, 144, 300, 151, 282, 173, 272, s);

        line(g, 144, 298, 192, 298, s);
        line(g, 172, 298, 172, 323, s);

        line(g, 157, 180, 187, 251, s);
        drawScale(g, 167, 208, 145, 235, 187, 251, s);

        line(g, 163, 260, 249, 294, s);
        drawScale(g, 192, 299, 203, 276, 225, 296, s);
    }

    public void dragonBackLeg(Graphics g) {
        int xPloy[] = { 173, 193, 250, 280, 340, 274, 284, 246, 195, 246, 246 };
        int yPoly[] = { 323, 299, 295, 290, 333, 372, 410, 461, 432, 432, 360 };

        Polygon ploy = new Polygon(xPloy, yPoly, xPloy.length);
        g.setColor(new Color(200, 0, 0));
        g.fillPolygon(ploy);
        g.setColor(Color.black);
        g.drawPolygon(ploy);
    }

    public void dragonThigh(Graphics g) {
        line(g, 173, 323, 340, 333, m);
        line(g, 193, 299, 340, 333, m);
        line(g, 247, 360, 340, 333, m);
    }

    public void dragonThighLittledetail(Graphics g){

    }

    public void dragonBackLegDetail(Graphics g) {
        line(g, 247, 360, 274, 372, m);
        line(g, 246, 460, 246, 431, m);
        drawScale(g, 246, 405, 274, 422, 274, 372, m);
    }

    public void dragonNailBackLeg(Graphics g) {
        int xPloy[] = { 195, 205, 205, 216, 233, 216, 216 };
        int yPoly[] = { 432, 410, 432, 402, 424, 416, 432 };

        Polygon ploy = new Polygon(xPloy, yPoly, xPloy.length);
        g.setColor(new Color(200, 0, 0));
        g.fillPolygon(ploy);
        g.setColor(Color.black);
        g.drawPolygon(ploy);
    }

    public void dragonNailBackLegDetail(Graphics g) {
        line(g, 216, 402, 216, 416, m);
        line(g, 217, 431, 224, 419, m);
        line(g, 230, 431, 224, 419, m);
        line(g, 205, 410, 213, 414, m);
    }

    public void dragonTail(Graphics g) {
        int xPloy[] = { 322, 362, 373, 373, 358, 314, 263, 215, 178, 150, 144, 130, 76, 72, 45, 35, 63, 123, 145, 198,
                199, 256, 237, 294, 281, 324, 298, 284, 274 };
        int yPoly[] = { 343, 388, 435, 466, 517, 557, 570, 566, 552, 532, 534, 518, 487, 478, 448, 396, 444, 485, 490,
                521, 511, 517, 507, 496, 494, 424, 453, 410, 372 };

        Polygon ploy = new Polygon(xPloy, yPoly, xPloy.length);
        g.setColor(new Color(200, 0, 0));
        g.fillPolygon(ploy);
        g.setColor(Color.black);
        g.drawPolygon(ploy);
    }

    public void dragonTailDetail(Graphics g) {
        drawScale(g, 274, 372, 324, 423, 314, 498, m);
        drawScale(g, 294, 496, 314, 498, 256, 517, m);
        drawScale(g, 178, 552, 197, 527, 256, 517, m);
        line(g, 198, 521, 197, 527, m);

        drawScale(g, 324, 424, 335, 390, 362, 388, m);
        drawScale(g, 295, 359, 335, 390, 373, 466, m);
        drawScale(g, 373, 466, 324, 424, 358, 517, m);

        drawScale(g, 324, 424, 339, 502, 314, 557, m);
        drawScale(g, 314, 498, 339, 502, 358, 517, m);
        drawScale(g, 263, 570, 314, 498, 314, 557, m);

        drawScale(g, 314, 498, 268, 543, 215, 566, m);
        drawScale(g, 256, 517, 268, 543, 263, 570, m);

        drawScale(g, 178, 552, 256, 517, 215, 566, m);

        drawScale(g, 130, 518, 198, 521, 150, 532, m);
        drawScale(g, 123, 485, 146, 506, 198, 521, m);
        drawScale(g, 123, 485, 130, 518, 146, 506, m);
        drawScale(g, 45, 448, 63, 444, 76, 487, m);
        drawScale(g, 99, 467, 124, 501, 76, 487, m);

    }

    public void dragonScales(Graphics g) {

        int[] xPloy = { 288, 225, 241, 197, 209, 159, 181, 112, 143, 75, 113, 59, 97, 96, 119, 173, 173, 235, 246, 251,
                116 };
        int[] yPoly = { 82, 68, 77, 77, 85, 87, 95, 130, 125, 185, 168, 260, 229, 340, 285, 388, 323, 408, 360, 323,
                197 };
        Polygon ploy = new Polygon(xPloy, yPoly, xPloy.length);
        g.setColor(new Color(200, 0, 0));
        g.fillPolygon(ploy);
        g.setColor(Color.black);
        g.drawPolygon(ploy);

        // g.setColor(Color.RED);
        // drawScale(g, 241, 77, 225, 68, 288, 82, m);
        // drawScale(g, 209, 85, 193, 77, 241, 77, m);
        // drawScale(g, 181, 95, 159, 87, 209, 85, m);

        // drawScale(g, 143, 125, 112, 130, 181, 95, m);
        // drawScale(g, 113, 168, 75, 185, 143, 124, m);
        // drawScale(g, 97, 229, 59, 260, 113, 168, m);

        // drawScale(g, 119, 285, 96, 340, 97, 229, m);
        // drawScale(g, 173, 323, 173, 388, 119, 285, m);
        // drawScale(g, 246, 360, 235, 408, 173, 323, m);
    }

    public void plot(Graphics g, int x, int y, int size) {
        g.fillRect(x, y, size, size);
    }

    public void drawScale(Graphics g, int xStart, int yStart, int xCenter, int yCenter, int xEnd, int yEnd, int size) {
        line(g, xStart, yStart, xCenter, yCenter, size);
        line(g, xCenter, yCenter, xEnd, yEnd, size);
    }

    public void line(Graphics g, int x1, int y1, int x2, int y2, int size) {
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
            plot(g, x, y, size);
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