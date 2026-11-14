public class TestDraw {
    public static void main(String[] args) {
        StdDraw.setCanvasSize(300, 600);
        StdDraw.setXscale(0, 300);
        StdDraw.setYscale(0, 600);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.filledCircle(150, 300, 50);
        StdDraw.text(150, 200, "IF YOU SEE THIS, IT WORKS");
        StdDraw.show();
        
        while(true) {
            // hold the window open
        }
    }
}