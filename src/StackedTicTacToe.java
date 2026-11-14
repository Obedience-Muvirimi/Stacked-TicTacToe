import java.awt.Font;
import java.util.Stack;

public class StackedTicTacToe {

    private static void pic(double x, double y, String name, double w, double h) {
        StdDraw.picture(x, y, name, w, h);
    }

    private static boolean inBounds(double w, double h) {
        return (h >= 30 && h <= 250 && w >= 30 && w <= 270);
    }

    private static int clamp(int i) { return Math.max(0, Math.min(3, i)); }

    public static void main(String[] args) {

        if (args.length == 0) {
            int someWidth = 300;
            int someHeight = 600;
            StdDraw.setCanvasSize(someWidth, someHeight);
            StdDraw.setXscale(0, someWidth);
            StdDraw.setYscale(0, someHeight);

            StdDraw.setPenColor(StdDraw.BLACK);
            int someSize = 20, some = 30, Have = 18, Size = 12;
            Font font  = new Font("Arial", Font.BOLD, someSize);
            Font font1 = new Font("Arial", Font.BOLD, some);
            Font font2 = new Font("Arial", Font.ITALIC, someSize);
            Font font3 = new Font("Arial", Font.ITALIC | Font.BOLD, Have);
            Font font4 = new Font("Arial", Font.BOLD, Size);
            Font font5 = new Font("Arial", Font.BOLD, Have);

            // Uses ../assets/ to go up one folder from src
            pic(190, 440, "../assets/Transporter.jpg", 63, 60);
            pic(40, 440, "../assets/Bomp.jpg", 63, 60);
            pic(29, 300, "../assets/Shifter.jpg", 63, 60);
            pic(190, 240, "../assets/Paint brush.jpg", 63, 60);

            StdDraw.setFont(font1);
            StdDraw.text(someWidth / 2.0, someHeight / 1.6, "Stacked Tic Tac Toe");
            StdDraw.setFont(font2);
            StdDraw.text(someWidth / 2.0, someHeight / 1.8, "Have Fun!!");
            StdDraw.setFont(font);
            StdDraw.text(someWidth / 2.0, someHeight / 2.0, "Game is starting...");
            StdDraw.show(3000);

            String[][] externalstacksB = {
                {"../assets/B1.jpg", "../assets/B2.jpg", "../assets/B3.jpg", "../assets/B4.jpg"},
                {"../assets/B1.jpg", "../assets/B2.jpg", "../assets/B3.jpg", "../assets/B4.jpg"},
                {"../assets/B1.jpg", "../assets/B2.jpg", "../assets/B3.jpg", "../assets/B4.jpg"},
            };
            String[][] externalstacksG = {
                {"../assets/G1.jpg", "../assets/G2.jpg", "../assets/G3.jpg", "../assets/G4.jpg"},
                {"../assets/G1.jpg", "../assets/G2.jpg", "../assets/G3.jpg", "../assets/G4.jpg"},
                {"../assets/G1.jpg", "../assets/G2.jpg", "../assets/G3.jpg", "../assets/G4.jpg"},
            };

            int a = -1, b = -1, c = -1;
            int d = -1, e = -1, f = -1;
            int bl1 = 0, bl2 = 0, bl3 = 0;
            int gr1 = 0, gr2 = 0, gr3 = 0;

            double j1 = 0, k1 = 0, j2 = 0, k2 = 0, j3 = 0, k3 = 0, j4 = 0, k4 = 0;
            double Gj1 = 0, Gk1 = 0, Gj2 = 0, Gk2 = 0, Gj3 = 0, Gk3 = 0, Gj4 = 0, Gk4 = 0;
            double n1 = 0, m1 = 0, n2 = 0, m2 = 0, n3 = 0, m3 = 0, n4 = 0, m4 = 0;
            double Gn1 = 0, Gm1 = 0, Gn2 = 0, Gm2 = 0, Gn3 = 0, Gm3 = 0, Gn4 = 0, Gm4 = 0;
            double l1 = 0, v1 = 0, l2 = 0, v2 = 0, l3 = 0, v3 = 0, l4 = 0, v4 = 0;
            double Gl1 = 0, Gv1 = 0, Gl2 = 0, Gv2 = 0, Gl3 = 0, Gv3 = 0, Gl4 = 0, Gv4 = 0;

            Blueplayerboard(someWidth, someHeight, font3, font4, font5, externalstacksB, bl1, bl2, bl3);
            StdDraw.show();
            
            while (!StdDraw.hasNextKeyTyped()) {}

            while (true) {
                double width1 = 37.5;
                double height1 = 217;

                while (true) {
                    while (!StdDraw.hasNextKeyTyped()) {}
                    char stack = StdDraw.nextKeyTyped();

                    if (stack == 'q') {
                        quitgameGUI(someWidth, someHeight, font3, font4, font5, externalstacksB, bl1, bl2, bl3);
                    }

                    if (stack == 'A' || stack == 'B' || stack == 'C') {
                        int which = (stack == 'A') ? 0 : (stack == 'B') ? 1 : 2;
                        boolean placed = false;

                        while (true) {
                            while (!StdDraw.hasNextKeyTyped()) {}
                            char input = StdDraw.nextKeyTyped();

                            height1 = navigateforupdown(input, width1, height1);
                            width1  = navigateforleftright(input, width1);

                            if (input == '\n') {
                                if (which == 0 && (j1 <= 0 && j2 <= 0 && j3 <= 0 && j4 <= 0)) { j1 = width1; k1 = height1; }
                                else if (which == 0 && (j2 <= 0 && j3 <= 0 && j4 <= 0)) { j2 = width1; k2 = height1; }
                                else if (which == 0 && (j3 <= 0 && j4 <= 0)) { j3 = width1; k3 = height1; }
                                else if (which == 0 && j4 <= 0) { j4 = width1; k4 = height1; }
                                else if (which == 1 && (n1 <= 0 && n2 <= 0 && n3 <= 0 && n4 <= 0)) { n1 = width1; m1 = height1; }
                                else if (which == 1 && (n2 <= 0 && n3 <= 0 && n4 <= 0)) { n2 = width1; m2 = height1; }
                                else if (which == 1 && (n3 <= 0 && n4 <= 0)) { n3 = width1; m3 = height1; }
                                else if (which == 1 && n4 <= 0) { n4 = width1; m4 = height1; }
                                else if (which == 2 && (l1 <= 0 && l2 <= 0 && l3 <= 0 && l4 <= 0)) { l1 = width1; v1 = height1; }
                                else if (which == 2 && (l2 <= 0 && l3 <= 0 && l4 <= 0)) { l2 = width1; v2 = height1; }
                                else if (which == 2 && (l3 <= 0 && l4 <= 0)) { l3 = width1; v3 = height1; }
                                else if (which == 2 && l4 <= 0) { l4 = width1; v4 = height1; }
                                else {
                                    invalidmoveblue(someWidth, someHeight, font3, font4, font5, externalstacksB, bl1, bl2, bl3);
                                    placed = false;
                                    break;
                                }

                                if (which == 0) { a++; bl1++; }
                                else if (which == 1) { b++; bl2++; }
                                else if (which == 2) { c++; bl3++; }

                                redrawBoard(someWidth, someHeight, font3, font4, font5,
                                            externalstacksB, externalstacksG,
                                            a, b, c, d, e, f,
                                            j1, k1, j2, k2, j3, k3, j4, k4,
                                            Gj1, Gk1, Gj2, Gk2, Gj3, Gk3, Gj4, Gk4,
                                            n1, m1, n2, m2, n3, m3, n4, m4,
                                            Gn1, Gm1, Gn2, Gm2, Gn3, Gm3, Gn4, Gm4,
                                            l1, v1, l2, v2, l3, v3, l4, v4,
                                            Gl1, Gv1, Gl2, Gv2, Gl3, Gv3, Gl4, Gv4,
                                            bl1, bl2, bl3);
                                placed = true;
                                break;
                            }

                            Blueplayerboard(someWidth, someHeight, font3, font4, font5, externalstacksB, bl1, bl2, bl3);
                            redrawPlacedPieces(externalstacksB, externalstacksG,
                                    a, b, c, d, e, f,
                                    j1, k1, j2, k2, j3, k3, j4, k4,
                                    Gj1, Gk1, Gj2, Gk2, Gj3, Gk3, Gj4, Gk4,
                                    n1, m1, n2, m2, n3, m3, n4, m4,
                                    Gn1, Gm1, Gn2, Gm2, Gn3, Gm3, Gn4, Gm4,
                                    l1, v1, l2, v2, l3, v3, l4, v4,
                                    Gl1, Gv1, Gl2, Gv2, Gl3, Gv3, Gl4, Gv4);
                            
                            // Draw Red Circle for cursor instead of Navigator.jpg
                            if (inBounds(width1, height1)) {
                                StdDraw.setPenColor(StdDraw.RED);
                                StdDraw.circle(width1, height1, 20);
                                StdDraw.setPenColor(StdDraw.BLACK);
                            }
                            StdDraw.show();
                        }
                        if (placed) break;
                    }
                }

                while (!StdDraw.hasNextKeyTyped()) {}

                double width2 = 37.5;
                double height2 = 215;

                while (true) {
                    while (!StdDraw.hasNextKeyTyped()) {}
                    char stack2 = StdDraw.nextKeyTyped();

                    if (stack2 == 'q') {
                        quitgamegreen(someWidth, someHeight, font3, font4, font5, externalstacksB, gr1, gr2, gr3);
                    }

                    if (stack2 == 'A' || stack2 == 'B' || stack2 == 'C') {
                        int which = (stack2 == 'A') ? 0 : (stack2 == 'B') ? 1 : 2;
                        boolean placed = false;

                        while (true) {
                            while (!StdDraw.hasNextKeyTyped()) {}
                            char input = StdDraw.nextKeyTyped();

                            height2 = navigateforupdown(input, width2, height2);
                            width2  = navigateforleftright(input, width2);

                            if (input == '\n') {
                                boolean ok = true;
                                if (which == 0) {
                                    if (Gj1 <= 0) { Gj1 = width2; Gk1 = height2; }
                                    else if (Gj2 <= 0) { Gj2 = width2; Gk2 = height2; }
                                    else if (Gj3 <= 0) { Gj3 = width2; Gk3 = height2; }
                                    else if (Gj4 <= 0) { Gj4 = width2; Gk4 = height2; }
                                    else ok = false;
                                    if (ok) { d++; gr1++; }
                                } else if (which == 1) {
                                    if (Gn1 <= 0) { Gn1 = width2; Gm1 = height2; }
                                    else if (Gn2 <= 0) { Gn2 = width2; Gm2 = height2; }
                                    else if (Gn3 <= 0) { Gn3 = width2; Gm3 = height2; }
                                    else if (Gn4 <= 0) { Gn4 = width2; Gm4 = height2; }
                                    else ok = false;
                                    if (ok) { e++; gr2++; }
                                } else {
                                    if (Gl1 <= 0) { Gl1 = width2; Gv1 = height2; }
                                    else if (Gl2 <= 0) { Gl2 = width2; Gv2 = height2; }
                                    else if (Gl3 <= 0) { Gl3 = width2; Gv3 = height2; }
                                    else if (Gl4 <= 0) { Gl4 = width2; Gv4 = height2; }
                                    else ok = false;
                                    if (ok) { f++; gr3++; }
                                }

                                if (!ok) {
                                    invalidmoveblue(someWidth, someHeight, font3, font4, font5, externalstacksG, gr1, gr2, gr3);
                                    break;
                                }

                                redrawBoard(someWidth, someHeight, font3, font4, font5,
                                            externalstacksB, externalstacksG,
                                            a, b, c, d, e, f,
                                            j1, k1, j2, k2, j3, k3, j4, k4,
                                            Gj1, Gk1, Gj2, Gk2, Gj3, Gk3, Gj4, Gk4,
                                            n1, m1, n2, m2, n3, m3, n4, m4,
                                            Gn1, Gm1, Gn2, Gm2, Gn3, Gm3, Gn4, Gm4,
                                            l1, v1, l2, v2, l3, v3, l4, v4,
                                            Gl1, Gv1, Gl2, Gv2, Gl3, Gv3, Gl4, Gv4,
                                            bl1, bl2, bl3);
                                placed = true;
                                break;
                            }

                            greenlayerboard(someWidth, someHeight, font3, font4, font5, externalstacksG, gr1, gr2, gr3);
                            redrawPlacedPieces(externalstacksB, externalstacksG,
                                    a, b, c, d, e, f,
                                    j1, k1, j2, k2, j3, k3, j4, k4,
                                    Gj1, Gk1, Gj2, Gk2, Gj3, Gk3, Gj4, Gk4,
                                    n1, m1, n2, m2, n3, m3, n4, m4,
                                    Gn1, Gm1, Gn2, Gm2, Gn3, Gm3, Gn4, Gm4,
                                    l1, v1, l2, v2, l3, v3, l4, v4,
                                    Gl1, Gv1, Gl2, Gv2, Gl3, Gv3, Gl4, Gv4);
                            
                            // Draw Red Circle for cursor instead of Navigator.jpg
                            if (inBounds(width2, height2)) {
                                StdDraw.setPenColor(StdDraw.RED);
                                StdDraw.circle(width2, height2, 20);
                                StdDraw.setPenColor(StdDraw.BLACK);
                            }
                            StdDraw.show();
                        }
                        if (placed) break;
                    }
                }

                if (bl1 >= 4) break;
            }

        } else if (args.length == 1) {
            runTextMode(args[0]);
        }

        System.exit(0);
    }

    private static void redrawBoard(int W, int H, Font f3, Font f4, Font f5,
            String[][] B, String[][] G,
            int a, int b, int c, int d, int e, int f,
            double j1,double k1,double j2,double k2,double j3,double k3,double j4,double k4,
            double Gj1,double Gk1,double Gj2,double Gk2,double Gj3,double Gk3,double Gj4,double Gk4,
            double n1,double m1,double n2,double m2,double n3,double m3,double n4,double m4,
            double Gn1,double Gm1,double Gn2,double Gm2,double Gn3,double Gm3,double Gn4,double Gm4,
            double l1,double v1,double l2,double v2,double l3,double v3,double l4,double v4,
            double Gl1,double Gv1,double Gl2,double Gv2,double Gl3,double Gv3,double Gl4,double Gv4,
            int bl1, int bl2, int bl3) {

        Blueplayerboard(W, H, f3, f4, f5, B, bl1, bl2, bl3);
        redrawPlacedPieces(B, G, a, b, c, d, e, f,
                j1, k1, j2, k2, j3, k3, j4, k4,
                Gj1, Gk1, Gj2, Gk2, Gj3, Gk3, Gj4, Gk4,
                n1, m1, n2, m2, n3, m3, n4, m4,
                Gn1, Gm1, Gn2, Gm2, Gn3, Gm3, Gn4, Gm4,
                l1, v1, l2, v2, l3, v3, l4, v4,
                Gl1, Gv1, Gl2, Gv2, Gl3, Gv3, Gl4, Gv4);
        StdDraw.show();
    }

    private static void redrawPlacedPieces(String[][] B, String[][] G,
            int a, int b, int c, int d, int e, int f,
            double j1,double k1,double j2,double k2,double j3,double k3,double j4,double k4,
            double Gj1,double Gk1,double Gj2,double Gk2,double Gj3,double Gk3,double Gj4,double Gk4,
            double n1,double m1,double n2,double m2,double n3,double m3,double n4,double m4,
            double Gn1,double Gm1,double Gn2,double Gm2,double Gn3,double Gm3,double Gn4,double Gm4,
            double l1,double v1,double l2,double v2,double l3,double v3,double l4,double v4,
            double Gl1,double Gv1,double Gl2,double Gv2,double Gl3,double Gv3,double Gl4,double Gv4) {

        // Hardcoded indexes to ensure B1, B2, B3, B4 are drawn correctly in order
        if (j1 > 0) placed(B, 0, 0, j1, k1);
        if (j2 > 0) placed(B, 0, 1, j2, k2);
        if (j3 > 0) placed(B, 0, 2, j3, k3);
        if (j4 > 0) placed(B, 0, 3, j4, k4);

        if (Gj1 > 0) placed(G, 0, 0, Gj1, Gk1);
        if (Gj2 > 0) placed(G, 0, 1, Gj2, Gk2);
        if (Gj3 > 0) placed(G, 0, 2, Gj3, Gk3);
        if (Gj4 > 0) placed(G, 0, 3, Gj4, Gk4);

        if (n1 > 0) placed(B, 1, 0, n1, m1);
        if (n2 > 0) placed(B, 1, 1, n2, m2);
        if (n3 > 0) placed(B, 1, 2, n3, m3);
        if (n4 > 0) placed(B, 1, 3, n4, m4);

        if (Gn1 > 0) placed(G, 1, 0, Gn1, Gm1);
        if (Gn2 > 0) placed(G, 1, 1, Gn2, Gm2);
        if (Gn3 > 0) placed(G, 1, 2, Gn3, Gm3);
        if (Gn4 > 0) placed(G, 1, 3, Gn4, Gm4);

        if (l1 > 0) placed(B, 2, 0, l1, v1);
        if (l2 > 0) placed(B, 2, 1, l2, v2);
        if (l3 > 0) placed(B, 2, 2, l3, v3);
        if (l4 > 0) placed(B, 2, 3, l4, v4);

        if (Gl1 > 0) placed(G, 2, 0, Gl1, Gv1);
        if (Gl2 > 0) placed(G, 2, 1, Gl2, Gv2);
        if (Gl3 > 0) placed(G, 2, 2, Gl3, Gv3);
        if (Gl4 > 0) placed(G, 2, 3, Gl4, Gv4);
    }

    private static void placed(String[][] ext, int row, int colIdx, double x, double y) {
        int ci = clamp(colIdx);
        pic(x, y, ext[row][ci], 40, 40);
    }

    private static void quitgameGUI(int W, int H, Font f3, Font f4, Font f5,
                                    String[][] ext, int bl1, int bl2, int bl3) {
        quitgamegreen(W, H, f3, f4, f5, ext, bl1, bl2, bl3);
    }

    private static void quitgamegreen(int W, int H, Font f3, Font f4, Font f5,
                                      String[][] ext, int i1, int i2, int i3) {
        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        StdDraw.filledRectangle(W / 2.0, H / 2.0, W, H);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setFont(f3);
        StdDraw.text(W / 2.0, H / 1.1, "Quit, draw!");
        StdDraw.setFont(f5);
        StdDraw.text(W / 2.5, H / 1.2, "A");
        pic(W / 2.5, H / 1.3, ext[0][clamp(i1)], 60, 60);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.text(W / 1.5, H / 1.2, "B");
        pic(W / 1.5, H / 1.3, ext[1][clamp(i2)], 60, 60);
        StdDraw.text(W / 1.1, H / 1.2, "C");
        pic(W / 1.1, H / 1.3, ext[2][clamp(i3)], 60, 60);
        StdDraw.setFont(f4);
        StdDraw.text(W / 5.1, H / 1.3, "Stacks:");
        StdDraw.setFont(f5);
        StdDraw.text(W / 1.2, H / 1.45, "p");
        StdDraw.text(W / 1.65, H / 1.45, "r");
        StdDraw.text(W / 2.6, H / 1.45, "b");
        StdDraw.text(W / 6.19, H / 1.45, "t");
        StdDraw.filledRectangle(W / 2.005, H / 1.798, 133.7, 65);
        pic(W / 5.7957, H / 1.64, "../assets/Transporter.jpg", 63, 60);
        pic(W / 5.7957, H / 1.98, "../assets/Transporter.jpg", 63, 60);
        pic(W / 2.56, H / 1.64, "../assets/Bomp.jpg", 63, 60);
        pic(W / 2.56, H / 1.98, "../assets/Bomp.jpg", 63, 60);
        pic(W / 1.64, H / 1.64, "../assets/Shifter.jpg", 63, 60);
        pic(W / 1.64, H / 1.98, "../assets/Shifter.jpg", 63, 60);
        pic(W / 1.21, H / 1.64, "../assets/Paint brush.jpg", 63, 60);
        pic(W / 1.21, H / 1.98, "../assets/Paint brush.jpg", 63, 60);
        StdDraw.setPenRadius(0.020);
        StdDraw.rectangle(W / 2.0, H / 4.72, 148, 124);
        StdDraw.setPenRadius(0.005);
        StdDraw.line(75, H / 2.35, 75, H / 60.0);
        StdDraw.line(W / 2.0, H / 2.35, W / 2.0, H / 60.0);
        StdDraw.line(225, H / 2.35, 225, H / 60.0);
        StdDraw.line(W / 38.0, 186, W / 1.0, 186);
        StdDraw.line(W / 38.0, 124.66, W / 1.0, 124.66);
        StdDraw.line(W / 38.0, 63.32, W / 1.0, 63.32);
        StdDraw.show(500);
        System.exit(0);
    }

    private static void invalidmoveblue(int W, int H, Font f3, Font f4, Font f5,
                                        String[][] ext, int i1, int i2, int i3) {
        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        StdDraw.filledRectangle(W / 2.0, H / 2.0, W, H);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setFont(f3);
        StdDraw.text(W / 2.0, H / 1.1, "Invalid move");
        StdDraw.setFont(f5);
        StdDraw.text(W / 2.5, H / 1.2, "A");
        pic(W / 2.5, H / 1.3, ext[0][clamp(i1)], 60, 60);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.text(W / 1.5, H / 1.2, "B");
        pic(W / 1.5, H / 1.3, ext[1][clamp(i2)], 60, 60);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.text(W / 1.1, H / 1.2, "C");
        pic(W / 1.1, H / 1.3, ext[2][clamp(i3)], 60, 60);
        StdDraw.setFont(f4);
        StdDraw.text(W / 5.1, H / 1.3, "Stacks:");
        StdDraw.setFont(f5);
        StdDraw.text(W / 1.2, H / 1.45, "p");
        StdDraw.text(W / 1.65, H / 1.45, "r");
        StdDraw.text(W / 2.6, H / 1.45, "b");
        StdDraw.text(W / 6.19, H / 1.45, "t");
        StdDraw.filledRectangle(W / 2.005, H / 1.798, 133.7, 65);
        pic(W / 5.7957, H / 1.64, "../assets/Transporter.jpg", 63, 60);
        pic(W / 5.7957, H / 1.98, "../assets/Transporter.jpg", 63, 60);
        pic(W / 2.56, H / 1.64, "../assets/Bomp.jpg", 63, 60);
        pic(W / 2.56, H / 1.98, "../assets/Bomp.jpg", 63, 60);
        pic(W / 1.64, H / 1.64, "../assets/Shifter.jpg", 63, 60);
        pic(W / 1.64, H / 1.98, "../assets/Shifter.jpg", 63, 60);
        pic(W / 1.21, H / 1.64, "../assets/Paint brush.jpg", 63, 60);
        pic(W / 1.21, H / 1.98, "../assets/Paint brush.jpg", 63, 60);
        StdDraw.setPenRadius(0.020);
        StdDraw.rectangle(W / 2.0, H / 4.72, 148, 124);
        StdDraw.setPenRadius(0.005);
        StdDraw.line(75, H / 2.35, 75, H / 60.0);
        StdDraw.line(W / 2.0, H / 2.35, W / 2.0, H / 60.0);
        StdDraw.line(225, H / 2.35, 225, H / 60.0);
        StdDraw.line(W / 38.0, 186, W / 1.0, 186);
        StdDraw.line(W / 38.0, 124.66, W / 1.0, 124.66);
        StdDraw.line(W / 38.0, 63.32, W / 1.0, 63.32);
        StdDraw.show(500);
    }

    public static void Blueplayerboard(int W, int H, Font f3, Font f4, Font f5,
                                       String[][] ext, int bl1, int bl2, int bl3) {
        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        StdDraw.filledRectangle(W / 2.0, H / 2.0, W, H);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setFont(f3);
        StdDraw.text(W / 2.0, H / 1.1, "Have Fun!! :D");
        StdDraw.setFont(f5);
        StdDraw.text(W / 2.5, H / 1.2, "A");
        pic(W / 2.5, H / 1.3, ext[0][clamp(bl1)], 60, 60);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.text(W / 1.5, H / 1.2, "B");
        pic(W / 1.5, H / 1.3, ext[1][clamp(bl2)], 60, 60);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.text(W / 1.1, H / 1.2, "C");
        pic(W / 1.1, H / 1.3, ext[2][clamp(bl3)], 60, 60);
        StdDraw.setFont(f4);
        StdDraw.text(W / 5.1, H / 1.3, "Stacks:");
        StdDraw.setFont(f5);
        StdDraw.text(W / 1.2, H / 1.45, "p");
        StdDraw.text(W / 1.65, H / 1.45, "r");
        StdDraw.text(W / 2.6, H / 1.45, "b");
        StdDraw.text(W / 6.19, H / 1.45, "t");
        StdDraw.filledRectangle(W / 2.005, H / 1.798, 133.7, 65);
        pic(W / 5.7957, H / 1.64, "../assets/Transporter.jpg", 63, 60);
        pic(W / 5.7957, H / 1.98, "../assets/Transporter.jpg", 63, 60);
        pic(W / 2.56, H / 1.64, "../assets/Bomp.jpg", 63, 60);
        pic(W / 2.56, H / 1.98, "../assets/Bomp.jpg", 63, 60);
        pic(W / 1.64, H / 1.64, "../assets/Shifter.jpg", 63, 60);
        pic(W / 1.64, H / 1.98, "../assets/Shifter.jpg", 63, 60);
        pic(W / 1.21, H / 1.64, "../assets/Paint brush.jpg", 63, 60);
        pic(W / 1.21, H / 1.98, "../assets/Paint brush.jpg", 63, 60);
        StdDraw.setPenRadius(0.020);
        StdDraw.rectangle(W / 2.0, H / 4.72, 148, 124);
        StdDraw.setPenRadius(0.005);
        StdDraw.line(75, H / 2.35, 75, H / 60.0);
        StdDraw.line(W / 2.0, H / 2.35, W / 2.0, H / 60.0);
        StdDraw.line(225, H / 2.35, 225, H / 60.0);
        StdDraw.line(W / 38.0, 186, W / 1.0, 186);
        StdDraw.line(W / 38.0, 124.66, W / 1.0, 124.66);
        StdDraw.line(W / 38.0, 63.32, W / 1.0, 63.32);
    }

    private static void greenlayerboard(int W, int H, Font f3, Font f4, Font f5,
                                        String[][] ext, int gr1, int gr2, int gr3) {
        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        StdDraw.filledRectangle(W / 2.0, H / 2.0, W, H);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setFont(f3);
        StdDraw.text(W / 2.0, H / 1.1, "Have Fun!! :D");
        StdDraw.setFont(f5);
        StdDraw.text(W / 2.5, H / 1.2, "A");
        pic(W / 2.5, H / 1.3, ext[0][clamp(gr1)], 60, 60);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.text(W / 1.5, H / 1.2, "B");
        pic(W / 1.5, H / 1.3, ext[1][clamp(gr2)], 60, 60);
        StdDraw.text(W / 1.1, H / 1.2, "C");
        pic(W / 1.1, H / 1.3, ext[2][clamp(gr3)], 60, 60);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setFont(f4);
        StdDraw.text(W / 5.1, H / 1.3, "Stacks:");
        StdDraw.setFont(f5);
        StdDraw.text(W / 1.2, H / 1.45, "p");
        StdDraw.text(W / 1.65, H / 1.45, "r");
        StdDraw.text(W / 2.6, H / 1.45, "b");
        StdDraw.text(W / 6.19, H / 1.45, "t");
        StdDraw.filledRectangle(W / 2.005, H / 1.798, 133.7, 65);
        pic(W / 5.7957, H / 1.64, "../assets/Transporter.jpg", 63, 60);
        pic(W / 5.7957, H / 1.98, "../assets/Transporter.jpg", 63, 60);
        pic(W / 2.56, H / 1.64, "../assets/Bomp.jpg", 63, 60);
        pic(W / 2.56, H / 1.98, "../assets/Bomp.jpg", 63, 60);
        pic(W / 1.64, H / 1.64, "../assets/Shifter.jpg", 63, 60);
        pic(W / 1.64, H / 1.98, "../assets/Shifter.jpg", 63, 60);
        pic(W / 1.21, H / 1.64, "../assets/Paint brush.jpg", 63, 60);
        pic(W / 1.21, H / 1.98, "../assets/Paint brush.jpg", 63, 60);
        StdDraw.setPenRadius(0.020);
        StdDraw.rectangle(W / 2.0, H / 4.72, 148, 124);
        StdDraw.setPenRadius(0.005);
        StdDraw.line(75, H / 2.35, 75, H / 60.0);
        StdDraw.line(W / 2.0, H / 2.35, W / 2.0, H / 60.0);
        StdDraw.line(225, H / 2.35, 225, H / 60.0);
        StdDraw.line(W / 38.0, 186, W / 1.0, 186);
        StdDraw.line(W / 38.0, 124.66, W / 1.0, 124.66);
        StdDraw.line(W / 38.0, 63.32, W / 1.0, 63.32);
    }

    private static double navigateforleftright(char input, double w) {
        if (input == 'd') { if (w >= 37.5 && w < 262.5) return w + 75; }
        else if (input == 'a') { if (w > 37.5 && w <= 262.5) return w - 75; }
        return w;
    }

    private static double navigateforupdown(char input, double w, double h) {
        if (input == 'w') { if (h <= 156) return h + 61; }
        else if (input == 's') { if (h > 34) return h - 61; }
        return h;
    }

    private static void runTextMode(String file) {
        Stack<String> stack1  = new Stack<>(); stack1.add("__");
        Stack<String> stack2  = new Stack<>(); stack2.add("__");
        Stack<String> stack3  = new Stack<>(); stack3.add("__");
        Stack<String> stack4  = new Stack<>(); stack4.add("__");
        Stack<String> stack5  = new Stack<>(); stack5.add("__");
        Stack<String> stack6  = new Stack<>(); stack6.add("__");
        Stack<String> stack7  = new Stack<>(); stack7.add("__");
        Stack<String> stack8  = new Stack<>(); stack8.add("__");
        Stack<String> stack9  = new Stack<>(); stack9.add("__");
        Stack<String> stack10 = new Stack<>(); stack10.add("__");
        Stack<String> stack11 = new Stack<>(); stack11.add("__");
        Stack<String> stack12 = new Stack<>(); stack12.add("__");
        Stack<String> stack13 = new Stack<>(); stack13.add("__");
        Stack<String> stack14 = new Stack<>(); stack14.add("__");
        Stack<String> stack15 = new Stack<>(); stack15.add("__");
        Stack<String> stack16 = new Stack<>(); stack16.add("__");

        String[][] grid = {
            {stack1.peek(),  stack2.peek(),  stack3.peek(),  stack4.peek()},
            {stack5.peek(),  stack6.peek(),  stack7.peek(),  stack8.peek()},
            {stack9.peek(),  stack10.peek(), stack11.peek(), stack12.peek()},
            {stack13.peek(), stack14.peek(), stack15.peek(), stack16.peek()},
        };
        printboard(grid);
        System.out.println(" ");

        Stack<String> stackB1 = new Stack<>();
        stackB1.add("B4"); stackB1.add("B3"); stackB1.add("B2"); stackB1.add("B1");
        Stack<String> stackB2 = new Stack<>();
        stackB2.add("B4"); stackB2.add("B3"); stackB2.add("B2"); stackB2.add("B1");
        Stack<String> stackB3 = new Stack<>();
        stackB3.add("B4"); stackB3.add("B3"); stackB3.add("B2"); stackB3.add("B1");

        Stack<String> stackG1 = new Stack<>();
        stackG1.add("G4"); stackG1.add("G3"); stackG1.add("G2"); stackG1.add("G1");
        Stack<String> stackG2 = new Stack<>();
        stackG2.add("G4"); stackG2.add("G3"); stackG2.add("G2"); stackG2.add("G1");
        Stack<String> stackG3 = new Stack<>();
        stackG3.add("G4"); stackG3.add("G3"); stackG3.add("G2"); stackG3.add("G1");

        In in = new In(file);

        while (in.hasNextLine()) {
            int ints = in.readInt();

            if (ints == -1) {
                System.out.println(" ");
                System.out.println("Quit");
                Blueplayerexternalstacks(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                        stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                        grid, stackB1, stackB2, stackB3);
                Greenplayerexternalstacks(stackG1, stackG2, stackG3);
                System.exit(0);
            }

            if (ints == 5) {
                String l = in.readString();
                switch (l) {
                    case "B": {
                        int Orow = in.readInt() - 1;
                        int Ocol = in.readInt() - 1;
                        bomb(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                             stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                             stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, Orow, Ocol);
                        boardlayout(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                                    stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16, grid);
                        printboard(grid);
                        System.out.println(" ");
                        break;
                    }
                    case "T": {
                        int Trow = in.readInt() - 1;
                        int Tcol = in.readInt() - 1;
                        int No   = in.readInt();
                        if ("G1".equals(grid[Trow][Tcol]) || "G2".equals(grid[Trow][Tcol])
                         || "G3".equals(grid[Trow][Tcol]) || "G4".equals(grid[Trow][Tcol])) {
                            transport(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                                      stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                                      Trow, Tcol, No);
                            boardlayout(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                                        stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16, grid);
                            printboard(grid);
                            System.out.println(" ");
                        } else { System.out.println("Invalid move"); }
                        break;
                    }
                    case "P": {
                        int Prow = in.readInt() - 1;
                        int Pcol = in.readInt() - 1;
                        if ("G1".equals(grid[Prow][Pcol]) || "G2".equals(grid[Prow][Pcol])
                         || "G3".equals(grid[Prow][Pcol]) || "G4".equals(grid[Prow][Pcol])) {
                            paint(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                                  stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                                  Prow, Pcol);
                            boardlayout(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                                        stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16, grid);
                            printboard(grid);
                            System.out.println(" ");
                        } else { System.out.println("Invalid move"); }
                        break;
                    }
                    case "S": {
                        int Srow = in.readInt() - 1;
                        int Scol = in.readInt() - 1;
                        int direction = in.readInt();
                        if ("__".equals(grid[Srow][Scol])) {
                            shifter(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                                    stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                                    grid, Srow, Scol, direction);
                            boardlayout(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                                        stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16, grid);
                            printboard(grid);
                            System.out.println(" ");
                        } else { System.out.println("Invalid move"); }
                        break;
                    }
                }

                CheckForDraw(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                             stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                             grid, stackB1, stackB2, stackB3, stackG1, stackG2, stackG3);
                ChecksForBlueWin(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                                 stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                                 grid, stackB1, stackB2, stackB3, stackG1, stackG2, stackG3);
                ChecksForGreenWin(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                                  stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                                  grid, stackB1, stackB2, stackB3, stackG1, stackG2, stackG3);

                if (in.isEmpty()) {
                    System.out.println("No winner, input file has ended");
                    Blueplayerexternalstacks(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                            stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                            grid, stackB1, stackB2, stackB3);
                    Greenplayerexternalstacks(stackG1, stackG2, stackG3);
                    System.exit(0);
                }
                continue;
            }

            int row = in.readInt() - 1;
            int col = in.readInt() - 1;
            String n = grid[row][col];

            while (ints < 4) {
                if (ints == 1 && stackB1.isEmpty()) { System.out.println("Invalid move"); break; }
                if (ints == 2 && stackB2.isEmpty()) { System.out.println("Invalid move"); break; }
                if (ints == 3 && stackB3.isEmpty()) { System.out.println("Invalid move"); break; }

                if (!"SH".equals(n)) {
                    n = Blueplayersturn(in, stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                                        stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                                        grid, stackB1, stackB2, stackB3, ints, row, col, n);
                    ChecksForGreenWin(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                                      stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                                      grid, stackB1, stackB2, stackB3, stackG1, stackG2, stackG3);
                    PlayB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                          stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                          grid, row, col, n);
                }

                if ("SH".equals(n)) {
                    boardlayout(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                                stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16, grid);
                    if (row == 0 && col == 0) { stack1.pop();  grid[row][col] = stack1.peek(); }
                    if (row == 0 && col == 1) { stack2.pop();  grid[row][col] = stack2.peek(); }
                    if (row == 0 && col == 2) { stack3.pop();  grid[row][col] = stack3.peek(); }
                    if (row == 0 && col == 3) { stack4.pop();  grid[row][col] = stack4.peek(); }
                    if (row == 1 && col == 0) { stack5.pop();  grid[row][col] = stack5.peek(); }
                    if (row == 1 && col == 1) { stack6.pop();  grid[row][col] = stack6.peek(); }
                    if (row == 1 && col == 2) { stack7.pop();  grid[row][col] = stack7.peek(); }
                    if (row == 1 && col == 3) { stack8.pop();  grid[row][col] = stack8.peek(); }
                    if (row == 2 && col == 0) { stack9.pop();  grid[row][col] = stack9.peek(); }
                    if (row == 2 && col == 1) { stack10.pop(); grid[row][col] = stack10.peek(); }
                    if (row == 2 && col == 2) { stack11.pop(); grid[row][col] = stack11.peek(); }
                    if (row == 2 && col == 3) { stack12.pop(); grid[row][col] = stack12.peek(); }
                    if (row == 3 && col == 0) { stack13.pop(); grid[row][col] = stack13.peek(); }
                    if (row == 3 && col == 1) { stack14.pop(); grid[row][col] = stack14.peek(); }
                    if (row == 3 && col == 2) { stack15.pop(); grid[row][col] = stack15.peek(); }
                    if (row == 3 && col == 3) { stack16.pop(); grid[row][col] = stack16.peek(); }
                    printboard(grid);
                    System.out.println(" ");
                    break;
                }

                printboard(grid);
                System.out.println(" ");
                CheckForDraw(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                             stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                             grid, stackB1, stackB2, stackB3, stackG1, stackG2, stackG3);
                break;
            }

            if (ints == 4) {
                int s = in.readInt() - 1;
                int r = in.readInt() - 1;
                if ("GR".equals(grid[row][col]) || (row == s && col == r)) {
                    System.out.println("Invalid Move");
                } else {
                    rearrangingB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                                 stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                                 grid, row, col, s, r);
                    printboard(grid);
                    System.out.println(" ");
                    CheckForDraw(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                                 stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                                 grid, stackB1, stackB2, stackB3, stackG1, stackG2, stackG3);
                    ChecksForGreenWin(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                                      stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                                      grid, stackB1, stackB2, stackB3, stackG1, stackG2, stackG3);
                }
                if (in.isEmpty()) {
                    System.out.println("No winner, input file has ended");
                    Blueplayerexternalstacks(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                            stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                            grid, stackB1, stackB2, stackB3);
                    Greenplayerexternalstacks(stackG1, stackG2, stackG3);
                    System.exit(0);
                }
            }

            ChecksForBlueWin(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                             stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                             grid, stackB1, stackB2, stackB3, stackG1, stackG2, stackG3);

            if (in.isEmpty()) {
                System.out.println("No winner, input file has ended");
                Blueplayerexternalstacks(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                        stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                        grid, stackB1, stackB2, stackB3);
                Greenplayerexternalstacks(stackG1, stackG2, stackG3);
                System.exit(0);
            }

            int inputInt = in.readInt();

            if (inputInt == -1) {
                System.out.println(" ");
                System.out.println("Quit");
                Blueplayerexternalstacks(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                        stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                        grid, stackB1, stackB2, stackB3);
                Greenplayerexternalstacks(stackG1, stackG2, stackG3);
                System.exit(0);
            }

            if (inputInt == 5) {
                String j = in.readString();
                switch (j) {
                    case "B": {
                        int Orow = in.readInt() - 1;
                        int Ocol = in.readInt() - 1;
                        if ("G1".equals(grid[Orow][Ocol]) || "G2".equals(grid[Orow][Ocol])
                         || "G3".equals(grid[Orow][Ocol]) || "G4".equals(grid[Orow][Ocol])) {
                            bomb(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                                 stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                                 stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, Orow, Ocol);
                            boardlayout(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                                        stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16, grid);
                            printboard(grid);
                            System.out.println(" ");
                        } else { System.out.println("Invalid move"); }
                        break;
                    }
                    case "S": {
                        int Srow = in.readInt() - 1;
                        int Scol = in.readInt() - 1;
                        int direction = in.readInt();
                        if ("__".equals(grid[Srow][Scol])) {
                            shifter(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                                    stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                                    grid, Srow, Scol, direction);
                            boardlayout(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                                        stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16, grid);
                            printboard(grid);
                            System.out.println(" ");
                        } else { System.out.println("Invalid move"); }
                        break;
                    }
                    case "T": {
                        int Trow = in.readInt() - 1;
                        int Tcol = in.readInt() - 1;
                        int No   = in.readInt();
                        if (("B1".equals(grid[Trow][Tcol]) || "B2".equals(grid[Trow][Tcol])
                          || "B3".equals(grid[Trow][Tcol]) || "B4".equals(grid[Trow][Tcol]))
                         && !"GR".equals(grid[Trow][Tcol])) {
                            transport(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                                      stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                                      Trow, Tcol, No);
                            boardlayout(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                                        stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16, grid);
                            printboard(grid);
                            System.out.println(" ");
                        } else { System.out.println("Invalid move"); }
                        break;
                    }
                    case "P": {
                        int Prow = in.readInt() - 1;
                        int Pcol = in.readInt() - 1;
                        if ("B1".equals(grid[Prow][Pcol]) || "B2".equals(grid[Prow][Pcol])
                         || "B3".equals(grid[Prow][Pcol]) || "B4".equals(grid[Prow][Pcol])) {
                            paint(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                                  stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                                  Prow, Pcol);
                            boardlayout(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                                        stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16, grid);
                            printboard(grid);
                            System.out.println(" ");
                        } else { System.out.println("Invalid move"); }
                        break;
                    }
                }

                CheckForDraw(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                             stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                             grid, stackB1, stackB2, stackB3, stackG1, stackG2, stackG3);
                ChecksForBlueWin(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                                 stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                                 grid, stackB1, stackB2, stackB3, stackG1, stackG2, stackG3);
                ChecksForGreenWin(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                                  stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                                  grid, stackB1, stackB2, stackB3, stackG1, stackG2, stackG3);

                if (in.isEmpty()) {
                    System.out.println("No winner, input file has ended");
                    Blueplayerexternalstacks(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                            stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                            grid, stackB1, stackB2, stackB3);
                    Greenplayerexternalstacks(stackG1, stackG2, stackG3);
                    System.exit(0);
                }
                continue;
            }

            int rowG = in.readInt() - 1;
            int colG = in.readInt() - 1;
            String m = grid[rowG][colG];

            while (inputInt < 4) {
                if (!"SH".equals(m)) {
                    m = firstint(in, stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                                 stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                                 grid, stackG1, stackG2, stackG3, stackB1, stackB2, stackB3,
                                 rowG, colG, ints, inputInt, m);
                    PlayG(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                          stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                          grid, rowG, colG, m);
                }

                if ("SH".equals(m)) {
                    boardlayout(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                                stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16, grid);
                    if (rowG == 0 && colG == 0) { stack1.pop();  grid[rowG][colG] = stack1.peek(); }
                    if (rowG == 0 && colG == 1) { stack2.pop();  grid[rowG][colG] = stack2.peek(); }
                    if (rowG == 0 && colG == 2) { stack3.pop();  grid[rowG][colG] = stack3.peek(); }
                    if (rowG == 0 && colG == 3) { stack4.pop();  grid[rowG][colG] = stack4.peek(); }
                    if (rowG == 1 && colG == 0) { stack5.pop();  grid[rowG][colG] = stack5.peek(); }
                    if (rowG == 1 && colG == 1) { stack6.pop();  grid[rowG][colG] = stack6.peek(); }
                    if (rowG == 1 && colG == 2) { stack7.pop();  grid[rowG][colG] = stack7.peek(); }
                    if (rowG == 1 && colG == 3) { stack8.pop();  grid[rowG][colG] = stack8.peek(); }
                    if (rowG == 2 && colG == 0) { stack9.pop();  grid[rowG][colG] = stack9.peek(); }
                    if (rowG == 2 && colG == 1) { stack10.pop(); grid[rowG][colG] = stack10.peek(); }
                    if (rowG == 2 && colG == 2) { stack11.pop(); grid[rowG][colG] = stack11.peek(); }
                    if (rowG == 2 && colG == 3) { stack12.pop(); grid[rowG][colG] = stack12.peek(); }
                    if (rowG == 3 && colG == 0) { stack13.pop(); grid[rowG][colG] = stack13.peek(); }
                    if (rowG == 3 && colG == 1) { stack14.pop(); grid[rowG][colG] = stack14.peek(); }
                    if (rowG == 3 && colG == 2) { stack15.pop(); grid[rowG][colG] = stack15.peek(); }
                    if (rowG == 3 && colG == 3) { stack16.pop(); grid[rowG][colG] = stack16.peek(); }
                    printboard(grid);
                    System.out.println(" ");
                    break;
                }

                ChecksForBlueWin(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                                 stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                                 grid, stackB1, stackB2, stackB3, stackG1, stackG2, stackG3);
                printboard(grid);
                System.out.println(" ");
                ChecksForGreenWin(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                                  stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                                  grid, stackB1, stackB2, stackB3, stackG1, stackG2, stackG3);
                CheckForDraw(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                             stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                             grid, stackB1, stackB2, stackB3, stackG1, stackG2, stackG3);
                break;
            }

            if (inputInt == 4) {
                int s = in.readInt() - 1;
                int r = in.readInt() - 1;
                if (rowG == s && colG == r && "__".equals(grid[rowG][colG])) {
                    System.out.println(" ");
                    System.out.println("Invalid Move!");
                } else {
                    rearrangingG(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                                 stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                                 grid, rowG, colG, s, r);
                    System.out.println(" ");
                    printboard(grid);
                    ChecksForBlueWin(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                                     stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                                     grid, stackB1, stackB2, stackB3, stackG1, stackG2, stackG3);
                    CheckForDraw(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                                 stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                                 grid, stackB1, stackB2, stackB3, stackG1, stackG2, stackG3);
                    System.out.println(" ");
                }
            }

            if (in.isEmpty()) {
                System.out.println("No winner, input file has ended");
                Blueplayerexternalstacks(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                        stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                        grid, stackB1, stackB2, stackB3);
                Greenplayerexternalstacks(stackG1, stackG2, stackG3);
                System.exit(0);
            }

            ChecksForGreenWin(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                              stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                              grid, stackB1, stackB2, stackB3, stackG1, stackG2, stackG3);

            if (in.isEmpty()) {
                System.out.println(" ");
                System.out.println("No winner, input file has ended");
                Blueplayerexternalstacks(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                        stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                        grid, stackB1, stackB2, stackB3);
                Greenplayerexternalstacks(stackG1, stackG2, stackG3);
                System.exit(0);
            }
        }
    }

    private static void paint(Stack<String> s1, Stack<String> s2, Stack<String> s3, Stack<String> s4,
            Stack<String> s5, Stack<String> s6, Stack<String> s7, Stack<String> s8,
            Stack<String> s9, Stack<String> s10, Stack<String> s11, Stack<String> s12,
            Stack<String> s13, Stack<String> s14, Stack<String> s15, Stack<String> s16,
            int Prow, int Pcol) {
        Stack<String> s = getStack(Prow, Pcol, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16);
        if (s != null) { s.pop(); s.add("GR"); }
        else { System.out.println("Invalid move"); }
    }

    private static void bomb(Stack<String> stack1, Stack<String> stack2, Stack<String> stack3, Stack<String> stack4,
            Stack<String> stack5, Stack<String> stack6, Stack<String> stack7, Stack<String> stack8,
            Stack<String> stack9, Stack<String> stack10, Stack<String> stack11, Stack<String> stack12,
            Stack<String> stack13, Stack<String> stack14, Stack<String> stack15, Stack<String> stack16,
            Stack<String> stackB1, Stack<String> stackB2, Stack<String> stackB3,
            Stack<String> stackG1, Stack<String> stackG2, Stack<String> stackG3,
            int Orow, int Ocol) {

        Stack<String> center = getStack(Orow, Ocol, stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16);
        if (center == null) return;

        String b1 = center.pop();
        puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b1);

        int[][] neighbors = { {Orow-1, Ocol}, {Orow+1, Ocol}, {Orow, Ocol-1}, {Orow, Ocol+1},
                              {Orow-1, Ocol-1}, {Orow-1, Ocol+1}, {Orow+1, Ocol-1}, {Orow+1, Ocol+1} };

        for (int[] n : neighbors) {
            if (n[0] >= 0 && n[0] < 4 && n[1] >= 0 && n[1] < 4) {
                Stack<String> ns = getStack(n[0], n[1], stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                        stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16);
                if (ns != null) {
                    if (!"__".equals(ns.peek())) {
                        String b = ns.pop();
                        puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b);
                    } else {
                        ns.add("SH");
                    }
                }
            }
        }
    }

    private static void puttingbackinexternalstacks(Stack<String> stackB1, Stack<String> stackB2, Stack<String> stackB3,
            Stack<String> stackG1, Stack<String> stackG2, Stack<String> stackG3, String piece) {

        if (("B1".equals(piece)) || ("B2".equals(piece)) || ("B3".equals(piece)) || ("B4".equals(piece))) {
            if (stackB1.size() <= 3)      insertInto(stackB1, piece);
            else if (stackB2.size() <= 3) insertInto(stackB2, piece);
            else if (stackB3.size() <= 3) insertInto(stackB3, piece);
        } else if (("G1".equals(piece)) || ("G2".equals(piece)) || ("G3".equals(piece)) || ("G4".equals(piece))) {
            if (stackG1.size() <= 3)      insertInto(stackG1, piece);
            else if (stackG2.size() <= 3) insertInto(stackG2, piece);
            else if (stackG3.size() <= 3) insertInto(stackG3, piece);
        }
    }

    private static void insertInto(Stack<String> s, String piece) {
        char letter = piece.charAt(0);
        int newRank = piece.charAt(1) - '0';

        Stack<String> tmp = new Stack<>();
        boolean inserted = false;

        while (!s.isEmpty()) {
            String cur = s.peek();
            int curRank = cur.charAt(1) - '0';
            if (!inserted && cur.charAt(0) == letter && curRank < newRank) {
                tmp.push(piece);
                inserted = true;
            }
            tmp.push(s.pop());
        }
        if (!inserted) tmp.push(piece);

        while (!tmp.isEmpty()) s.push(tmp.pop());
    }

    private static void shifter(Stack<String> stack1, Stack<String> stack2, Stack<String> stack3, Stack<String> stack4,
            Stack<String> stack5, Stack<String> stack6, Stack<String> stack7, Stack<String> stack8,
            Stack<String> stack9, Stack<String> stack10, Stack<String> stack11, Stack<String> stack12,
            Stack<String> stack13, Stack<String> stack14, Stack<String> stack15, Stack<String> stack16,
            String[][] grid, int Orow, int Ocol, int direction) {

        if (!"__".equals(grid[Orow][Ocol])) return;

        int[][] neighbors = new int[8][2];
        if (Orow == 0 && Ocol == 0) {
            neighbors = new int[][]{{1, 1}, {1, 0}, {0, 1}, {1, 2}, {2, 1}, {2, 0}, {0, 2}, {2, 2}};
        } else if (Orow == 3 && Ocol == 3) {
            neighbors = new int[][]{{2, 2}, {2, 3}, {3, 2}, {2, 1}, {1, 2}, {1, 3}, {3, 1}, {1, 1}};
        } else if (Orow == 0 && Ocol == 3) {
            neighbors = new int[][]{{1, 2}, {1, 3}, {0, 2}, {1, 1}, {2, 2}, {2, 3}, {0, 1}, {2, 1}};
        } else if (Orow == 3 && Ocol == 0) {
            neighbors = new int[][]{{2, 1}, {2, 0}, {3, 1}, {2, 2}, {1, 1}, {1, 0}, {3, 2}, {1, 2}};
        } else {
            neighbors = new int[][]{{Orow-1, Ocol}, {Orow+1, Ocol}, {Orow, Ocol-1}, {Orow, Ocol+1},
                                    {Orow-1, Ocol-1}, {Orow-1, Ocol+1}, {Orow+1, Ocol-1}, {Orow+1, Ocol+1}};
        }

        if (direction == 0) {
            for (int i = 0; i < neighbors.length; i += 2) {
                Stack<String> n1 = getStack(neighbors[i][0], neighbors[i][1], stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16);
                Stack<String> n2 = getStack(neighbors[i+1][0], neighbors[i+1][1], stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16);
                if (n1 != null && n2 != null && !n1.isEmpty() && !n2.isEmpty()) {
                    String temp = n1.pop();
                    n2.add(temp);
                }
            }
        } else {
            for (int i = neighbors.length - 1; i > 0; i -= 2) {
                Stack<String> n1 = getStack(neighbors[i][0], neighbors[i][1], stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16);
                Stack<String> n2 = getStack(neighbors[i-1][0], neighbors[i-1][1], stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16);
                if (n1 != null && n2 != null && !n1.isEmpty() && !n2.isEmpty()) {
                    String temp = n1.pop();
                    n2.add(temp);
                }
            }
        }
    }

    private static void transport(Stack<String> stack1, Stack<String> stack2, Stack<String> stack3, Stack<String> stack4,
            Stack<String> stack5, Stack<String> stack6, Stack<String> stack7, Stack<String> stack8,
            Stack<String> stack9, Stack<String> stack10, Stack<String> stack11, Stack<String> stack12,
            Stack<String> stack13, Stack<String> stack14, Stack<String> stack15, Stack<String> stack16,
            int Orow, int Ocol, int No) {

        Stack<String> src = getStack(Orow, Ocol, stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16);
        if (src == null) { System.out.println("Invalid move"); return; }
        if (No < 1 || No > src.size()) { System.out.println("Invalid move"); return; }

        int[][] candidates = { {Orow, Ocol + 1}, {Orow + 1, Ocol} };
        for (int[] dest : candidates) {
            int dr = dest[0], dc = dest[1];
            if (dr < 0 || dr > 3 || dc < 0 || dc > 3) continue;
            Stack<String> dst = getStack(dr, dc, stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                    stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16);
            if (dst == null) continue;
            if (!"__".equals(dst.peek())) continue;
            if (src.size() - No < 1) { System.out.println("Invalid move"); return; }

            Stack<String> tmp = new Stack<>();
            for (int i = 0; i < No; i++) tmp.push(src.pop());
            while (!tmp.isEmpty()) dst.push(tmp.pop());
            return;
        }
        System.out.println("Invalid move");
    }

    private static Stack<String> getStack(int r, int c,
            Stack<String> s1, Stack<String> s2, Stack<String> s3, Stack<String> s4,
            Stack<String> s5, Stack<String> s6, Stack<String> s7, Stack<String> s8,
            Stack<String> s9, Stack<String> s10, Stack<String> s11, Stack<String> s12,
            Stack<String> s13, Stack<String> s14, Stack<String> s15, Stack<String> s16) {
        if (r == 0 && c == 0) return s1;
        if (r == 0 && c == 1) return s2;
        if (r == 0 && c == 2) return s3;
        if (r == 0 && c == 3) return s4;
        if (r == 1 && c == 0) return s5;
        if (r == 1 && c == 1) return s6;
        if (r == 1 && c == 2) return s7;
        if (r == 1 && c == 3) return s8;
        if (r == 2 && c == 0) return s9;
        if (r == 2 && c == 1) return s10;
        if (r == 2 && c == 2) return s11;
        if (r == 2 && c == 3) return s12;
        if (r == 3 && c == 0) return s13;
        if (r == 3 && c == 1) return s14;
        if (r == 3 && c == 2) return s15;
        if (r == 3 && c == 3) return s16;
        return null;
    }

    private static void boardlayout(Stack<String> stack1, Stack<String> stack2, Stack<String> stack3, Stack<String> stack4,
            Stack<String> stack5, Stack<String> stack6, Stack<String> stack7, Stack<String> stack8,
            Stack<String> stack9, Stack<String> stack10, Stack<String> stack11, Stack<String> stack12,
            Stack<String> stack13, Stack<String> stack14, Stack<String> stack15, Stack<String> stack16,
            String[][] grid) {
        grid[0][0] = stack1.peek();  grid[0][1] = stack2.peek();  grid[0][2] = stack3.peek();  grid[0][3] = stack4.peek();
        grid[1][0] = stack5.peek();  grid[1][1] = stack6.peek();  grid[1][2] = stack7.peek();  grid[1][3] = stack8.peek();
        grid[2][0] = stack9.peek();  grid[2][1] = stack10.peek(); grid[2][2] = stack11.peek(); grid[2][3] = stack12.peek();
        grid[3][0] = stack13.peek(); grid[3][1] = stack14.peek(); grid[3][2] = stack15.peek(); grid[3][3] = stack16.peek();
    }

    private static void CheckForDraw(Stack<String> stack1, Stack<String> stack2, Stack<String> stack3, Stack<String> stack4,
            Stack<String> stack5, Stack<String> stack6, Stack<String> stack7, Stack<String> stack8,
            Stack<String> stack9, Stack<String> stack10, Stack<String> stack11, Stack<String> stack12,
            Stack<String> stack13, Stack<String> stack14, Stack<String> stack15, Stack<String> stack16,
            String[][] grid, Stack<String> stackB1, Stack<String> stackB2, Stack<String> stackB3,
            Stack<String> stackG1, Stack<String> stackG2, Stack<String> stackG3) {
        if ((ColumnsG(grid) && ColumnsB(grid)) || (RowsG(grid) && RowsB(grid)) || (AcrossG(grid) && AcrossB(grid))) {
            System.out.println(" ");
            System.out.println("Draw!");
            Blueplayerexternalstacks(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                    stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                    grid, stackB1, stackB2, stackB3);
            Greenplayerexternalstacks(stackG1, stackG2, stackG3);
            System.exit(0);
        }
    }

    private static void rearrangingG(Stack<String> stack1, Stack<String> stack2, Stack<String> stack3, Stack<String> stack4,
            Stack<String> stack5, Stack<String> stack6, Stack<String> stack7, Stack<String> stack8,
            Stack<String> stack9, Stack<String> stack10, Stack<String> stack11, Stack<String> stack12,
            Stack<String> stack13, Stack<String> stack14, Stack<String> stack15, Stack<String> stack16,
            String[][] grid, int rowG, int colG, int s, int r) {
        Stack<String> src = getStack(rowG, colG, stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16);
        Stack<String> dst = getStack(s, r, stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16);
        if (src == null || dst == null) { System.out.println("Invalid Move"); return; }
        String piece = src.pop();
        dst.push(piece);
        boardlayout(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16, grid);
    }

    private static void rearrangingB(Stack<String> stack1, Stack<String> stack2, Stack<String> stack3, Stack<String> stack4,
            Stack<String> stack5, Stack<String> stack6, Stack<String> stack7, Stack<String> stack8,
            Stack<String> stack9, Stack<String> stack10, Stack<String> stack11, Stack<String> stack12,
            Stack<String> stack13, Stack<String> stack14, Stack<String> stack15, Stack<String> stack16,
            String[][] grid, int row, int col, int s, int r) {
        Stack<String> src = getStack(row, col, stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16);
        Stack<String> dst = getStack(s, r, stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16);
        if (src == null || dst == null) { System.out.println("Invalid Move"); return; }
        String piece = src.pop();
        dst.push(piece);
        boardlayout(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16, grid);
    }

    private static void PlayG(Stack<String> stack1, Stack<String> stack2, Stack<String> stack3, Stack<String> stack4,
            Stack<String> stack5, Stack<String> stack6, Stack<String> stack7, Stack<String> stack8,
            Stack<String> stack9, Stack<String> stack10, Stack<String> stack11, Stack<String> stack12,
            Stack<String> stack13, Stack<String> stack14, Stack<String> stack15, Stack<String> stack16,
            String[][] grid, int rowG, int colG, String m) {
        Stack<String> s = getStack(rowG, colG, stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16);
        if (s != null) { s.push(m); grid[rowG][colG] = s.peek(); }
    }

    private static void PlayB(Stack<String> stack1, Stack<String> stack2, Stack<String> stack3, Stack<String> stack4,
            Stack<String> stack5, Stack<String> stack6, Stack<String> stack7, Stack<String> stack8,
            Stack<String> stack9, Stack<String> stack10, Stack<String> stack11, Stack<String> stack12,
            Stack<String> stack13, Stack<String> stack14, Stack<String> stack15, Stack<String> stack16,
            String[][] grid, int row, int col, String n) {
        Stack<String> s = getStack(row, col, stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16);
        if (s != null) { s.push(n); grid[row][col] = s.peek(); }
    }

    private static void whatisontheboard(String[][] externalstacksB, String[][] externalstacksG,int c,int d, int a, int b, int e,
            int f, double j1, double k1, double j2, double k2, double j3, double k3, double j4, double k4, double Gj1,
            double Gk1, double Gj2, double Gk2, double Gj3, double Gk3, double Gj4, double Gk4, double n1, double m1,
            double n2, double m2, double n3, double m3, double n4, double m4, double Gn1, double Gm1, double Gn2,
            double Gm2, double Gn3, double Gm3, double Gn4, double Gm4, double l1, double v1, double l2, double v2,
            double l3, double v3, double l4, double v4, double Gl1, double Gv1, double Gl2, double Gv2, double Gl3,
            double Gv3, double Gl4, double Gv4,int someWidth, int someHeight, Font font3, Font font4, Font font5,int bl1,int bl2,int bl3) {
        if (j1 > 0) placed(externalstacksB, 0, 0, j1, k1);
        if (j2 > 0) placed(externalstacksB, 0, 1, j2, k2);
        if (j3 > 0) placed(externalstacksB, 0, 2, j3, k3);
        if (j4 > 0) placed(externalstacksB, 0, 3, j4, k4);

        if (Gj1 > 0) placed(externalstacksG, 0, 0, Gj1, Gk1);
        if (Gj2 > 0) placed(externalstacksG, 0, 1, Gj2, Gk2);
        if (Gj3 > 0) placed(externalstacksG, 0, 2, Gj3, Gk3);
        if (Gj4 > 0) placed(externalstacksG, 0, 3, Gj4, Gk4);

        if (n1 > 0) placed(externalstacksB, 1, 0, n1, m1);
        if (n2 > 0) placed(externalstacksB, 1, 1, n2, m2);
        if (n3 > 0) placed(externalstacksB, 1, 2, n3, m3);
        if (n4 > 0) placed(externalstacksB, 1, 3, n4, m4);

        if (Gn1 > 0) placed(externalstacksG, 1, 0, Gn1, Gm1);
        if (Gn2 > 0) placed(externalstacksG, 1, 1, Gn2, Gm2);
        if (Gn3 > 0) placed(externalstacksG, 1, 2, Gn3, Gm3);
        if (Gn4 > 0) placed(externalstacksG, 1, 3, Gn4, Gm4);

        if (l1 > 0) placed(externalstacksB, 2, 0, l1, v1);
        if (l2 > 0) placed(externalstacksB, 2, 1, l2, v2);
        if (l3 > 0) placed(externalstacksB, 2, 2, l3, v3);
        if (l4 > 0) placed(externalstacksB, 2, 3, l4, v4);

        if (Gl1 > 0) placed(externalstacksG, 2, 0, Gl1, Gv1);
        if (Gl2 > 0) placed(externalstacksG, 2, 1, Gl2, Gv2);
        if (Gl3 > 0) placed(externalstacksG, 2, 2, Gl3, Gv3);
        if (Gl4 > 0) placed(externalstacksG, 2, 3, Gl4, Gv4);
    }

    private static void whatsleftB(Stack<String> stack1, Stack<String> stack2, Stack<String> stack3, Stack<String> stack4,
            Stack<String> stack5, Stack<String> stack6, Stack<String> stack7, Stack<String> stack8,
            Stack<String> stack9, Stack<String> stack10, Stack<String> stack11, Stack<String> stack12,
            Stack<String> stack13, Stack<String> stack14, Stack<String> stack15, Stack<String> stack16,
            String[][] grid, int row, int col) {
        Stack<String> s = getStack(row, col, stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16);
        if (s != null) grid[row][col] = s.peek();
    }

    private static void whatsleftG(Stack<String> stack1, Stack<String> stack2, Stack<String> stack3, Stack<String> stack4,
            Stack<String> stack5, Stack<String> stack6, Stack<String> stack7, Stack<String> stack8,
            Stack<String> stack9, Stack<String> stack10, Stack<String> stack11, Stack<String> stack12,
            Stack<String> stack13, Stack<String> stack14, Stack<String> stack15, Stack<String> stack16,
            String[][] grid, int rowG, int colG) {
        whatsleftB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16, grid, rowG, colG);
    }

    private static void poppingB(Stack<String> stack1, Stack<String> stack2, Stack<String> stack3, Stack<String> stack4,
            Stack<String> stack5, Stack<String> stack6, Stack<String> stack7, Stack<String> stack8,
            Stack<String> stack9, Stack<String> stack10, Stack<String> stack11, Stack<String> stack12,
            Stack<String> stack13, Stack<String> stack14, Stack<String> stack15, Stack<String> stack16,
            String[][] grid, int row, int col) {
        Stack<String> s = getStack(row, col, stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16);
        if (s != null) grid[row][col] = s.pop();
    }

    private static void poppingG(Stack<String> stack1, Stack<String> stack2, Stack<String> stack3, Stack<String> stack4,
            Stack<String> stack5, Stack<String> stack6, Stack<String> stack7, Stack<String> stack8,
            Stack<String> stack9, Stack<String> stack10, Stack<String> stack11, Stack<String> stack12,
            Stack<String> stack13, Stack<String> stack14, Stack<String> stack15, Stack<String> stack16,
            String[][] grid, int rowG, int colG) {
        poppingB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16, grid, rowG, colG);
    }

    private static void ChecksForBlueWin(Stack<String> stack1, Stack<String> stack2, Stack<String> stack3, Stack<String> stack4,
            Stack<String> stack5, Stack<String> stack6, Stack<String> stack7, Stack<String> stack8,
            Stack<String> stack9, Stack<String> stack10, Stack<String> stack11, Stack<String> stack12,
            Stack<String> stack13, Stack<String> stack14, Stack<String> stack15, Stack<String> stack16,
            String[][] grid, Stack<String> stackB1, Stack<String> stackB2, Stack<String> stackB3,
            Stack<String> stackG1, Stack<String> stackG2, Stack<String> stackG3) {
        if (ColumnsB(grid) || RowsB(grid) || AcrossB(grid)) {
            System.out.println(" ");
            System.out.println("Blue wins!");
            Blueplayerexternalstacks(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                    stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                    grid, stackB1, stackB2, stackB3);
            Greenplayerexternalstacks(stackG1, stackG2, stackG3);
            System.exit(0);
        }
    }

    private static void ChecksForGreenWin(Stack<String> stack1, Stack<String> stack2, Stack<String> stack3, Stack<String> stack4,
            Stack<String> stack5, Stack<String> stack6, Stack<String> stack7, Stack<String> stack8,
            Stack<String> stack9, Stack<String> stack10, Stack<String> stack11, Stack<String> stack12,
            Stack<String> stack13, Stack<String> stack14, Stack<String> stack15, Stack<String> stack16,
            String[][] grid, Stack<String> stackB1, Stack<String> stackB2, Stack<String> stackB3,
            Stack<String> stackG1, Stack<String> stackG2, Stack<String> stackG3) {
        if (ColumnsG(grid) || RowsG(grid) || AcrossG(grid)) {
            System.out.println(" ");
            System.out.println("Green wins!");
            Blueplayerexternalstacks(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                    stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16,
                    grid, stackB1, stackB2, stackB3);
            Greenplayerexternalstacks(stackG1, stackG2, stackG3);
            System.exit(0);
        }
    }

    private static boolean isB(String cell) { return "B1".equals(cell) || "B2".equals(cell) || "B3".equals(cell) || "B4".equals(cell); }
    private static boolean isG(String cell) { return "G1".equals(cell) || "G2".equals(cell) || "G3".equals(cell) || "G4".equals(cell); }

    private static boolean ColumnsB(String[][] g) { for (int c = 0; c < 4; c++) if (isB(g[0][c]) && isB(g[1][c]) && isB(g[2][c]) && isB(g[3][c])) return true; return false; }
    private static boolean ColumnsG(String[][] g) { for (int c = 0; c < 4; c++) if (isG(g[0][c]) && isG(g[1][c]) && isG(g[2][c]) && isG(g[3][c])) return true; return false; }
    private static boolean RowsB(String[][] g) { for (int r = 0; r < 4; r++) if (isB(g[r][0]) && isB(g[r][1]) && isB(g[r][2]) && isB(g[r][3])) return true; return false; }
    private static boolean RowsG(String[][] g) { for (int r = 0; r < 4; r++) if (isG(g[r][0]) && isG(g[r][1]) && isG(g[r][2]) && isG(g[r][3])) return true; return false; }
    private static boolean AcrossB(String[][] g) { return (isB(g[0][0]) && isB(g[1][1]) && isB(g[2][2]) && isB(g[3][3])) || (isB(g[0][3]) && isB(g[1][2]) && isB(g[2][1]) && isB(g[3][0])); }
    private static boolean AcrossG(String[][] g) { return (isG(g[0][0]) && isG(g[1][1]) && isG(g[2][2]) && isG(g[3][3])) || (isG(g[0][3]) && isG(g[1][2]) && isG(g[2][1]) && isG(g[3][0])); }

    public static void Greenplayerexternalstacks(Stack<String> stackG1, Stack<String> stackG2, Stack<String> stackG3) {
        System.out.println(" ");
        System.out.println("Statistics external stacks green player");
        System.out.print("Stack 1: "); popAll(stackG1);
        System.out.print("Stack 2: "); popAll(stackG2);
        System.out.print("Stack 3: "); popAll(stackG3);
        System.out.println(" ");
    }

    public static void Blueplayerexternalstacks(Stack<String> stack1, Stack<String> stack2, Stack<String> stack3, Stack<String> stack4,
            Stack<String> stack5, Stack<String> stack6, Stack<String> stack7, Stack<String> stack8,
            Stack<String> stack9, Stack<String> stack10, Stack<String> stack11, Stack<String> stack12,
            Stack<String> stack13, Stack<String> stack14, Stack<String> stack15, Stack<String> stack16,
            String[][] grid, Stack<String> stackB1, Stack<String> stackB2, Stack<String> stackB3) {
        System.out.println("Statistics for each stack present on the board");
        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 4; c++) {
                String cell = grid[r][c];
                if ("__".equals(cell) || "SH".equals(cell)) continue;
                Stack<String> s = getStack(r, c, stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8,
                        stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16);
                if (s != null) {
                    System.out.print("r" + (r + 1) + "c" + (c + 1) + ": ");
                    popAll(s);
                }
            }
        }
        System.out.println("Statistics external stacks blue player");
        System.out.print("Stack 1: "); popAll(stackB1);
        System.out.print("Stack 2: "); popAll(stackB2);
        System.out.print("Stack 3: "); popAll(stackB3);
        System.out.println(" ");
    }

    private static void popAll(Stack<String> s) {
        while (!s.isEmpty()) System.out.print(s.pop() + " ");
        System.out.println(" ");
    }

    public static void popstacksB(Stack<String> s) { System.out.print(s.pop() + " "); }

    public static void printboard(String[][] grid) {
        System.out.println("   c1 c2 c3 c4");
        System.out.println("r1 " + grid[0][0] + "|" + grid[0][1] + "|" + grid[0][2] + "|" + grid[0][3] + "|");
        System.out.println("r2 " + grid[1][0] + "|" + grid[1][1] + "|" + grid[1][2] + "|" + grid[1][3] + "|");
        System.out.println("r3 " + grid[2][0] + "|" + grid[2][1] + "|" + grid[2][2] + "|" + grid[2][3] + "|");
        System.out.println("r4 " + grid[3][0] + "|" + grid[3][1] + "|" + grid[3][2] + "|" + grid[3][3] + "|");
    }

    public static String firstint(In in, Stack<String> stack1, Stack<String> stack2, Stack<String> stack3, Stack<String> stack4,
            Stack<String> stack5, Stack<String> stack6, Stack<String> stack7, Stack<String> stack8,
            Stack<String> stack9, Stack<String> stack10, Stack<String> stack11, Stack<String> stack12,
            Stack<String> stack13, Stack<String> stack14, Stack<String> stack15, Stack<String> stack16,
            String[][] grid, Stack<String> stackG1, Stack<String> stackG2, Stack<String> stackG3,
            Stack<String> stackB1, Stack<String> stackB2, Stack<String> stackB3,
            int rowG, int colG, int ints, int inputInt, String m) {
        if (inputInt == 1) {
            if (!stackG1.isEmpty()) m = stackG1.pop();
            else System.out.println("Invalid move");
        } else if (inputInt == 2) {
            if (!stackG2.isEmpty()) m = stackG2.pop();
            else System.out.println("Invalid move");
        } else if (inputInt == 3) {
            if (!stackG3.isEmpty()) m = stackG3.pop();
            else System.out.println("Invalid move");
        }
        return m;
    }

    public static String Blueplayersturn(In in, Stack<String> stack1, Stack<String> stack2, Stack<String> stack3, Stack<String> stack4,
            Stack<String> stack5, Stack<String> stack6, Stack<String> stack7, Stack<String> stack8,
            Stack<String> stack9, Stack<String> stack10, Stack<String> stack11, Stack<String> stack12,
            Stack<String> stack13, Stack<String> stack14, Stack<String> stack15, Stack<String> stack16,
            String[][] grid, Stack<String> stackB1, Stack<String> stackB2, Stack<String> stackB3,
            int ints, int row, int col, String n) {
        if (ints == 1) {
            if (!stackB1.isEmpty()) n = stackB1.pop();
            else System.out.println("Invalid move");
        } else if (ints == 2) {
            if (!stackB2.isEmpty()) n = stackB2.pop();
            else System.out.println("Invalid move");
        } else if (ints == 3) {
            if (!stackB3.isEmpty()) n = stackB3.pop();
            else System.out.println("Invalid move");
        }
        return n;
    }
}