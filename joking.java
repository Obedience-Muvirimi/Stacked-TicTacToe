import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.Stack;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
public class joking {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    int someWidth = 300;
        int someHeight = 500;
        StdDraw.setCanvasSize(someWidth, someHeight);
        StdDraw.setXscale(0, someWidth);
        StdDraw.setYscale(0, someHeight);

        StdDraw.setPenColor(StdDraw.BLACK);
        int someSize = 20;
        int some= 30;
  	  int Have=18;
  	  int Size=12;
        Font font = new Font("Arial", Font.BOLD, someSize);
        Font font1 = new Font("Arial", Font.BOLD, some);
        Font font2 = new Font("Arial", Font.ITALIC , someSize);
  	  Font font3 = new Font("Arial", Font.ITALIC|Font.BOLD,Have);
  	  Font font4 = new Font("Arial", Font.BOLD, Size);
        StdDraw.setFont(font1);
        StdDraw.text(someWidth/2, someHeight/1.6, "Stacked Tic Tac Toe");
        StdDraw.setFont(font2);
        StdDraw.text(someWidth/2, someHeight/1.8, "Have Fun!!");
        StdDraw.setFont(font);
        StdDraw.text(someWidth/2, someHeight/2.0, "Press p to start game" );
        StdDraw.show(2);
        while (!StdDraw.hasNextKeyTyped()) {}
        char input = StdDraw.nextKeyTyped();
        if (input == 'p') {}
        while (!StdDraw.hasNextKeyTyped()) {
            // wait
      	  StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
      	  StdDraw.filledRectangle(someWidth/2, someHeight/2, someWidth, someHeight);
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.setFont(font3);
      	  StdDraw.text(someWidth/2, someHeight/1.1, "Have Fun!! :D");
      	  StdDraw.setFont(font4);
      	  StdDraw.text(someWidth/2.5, someHeight/1.2, "A");
      	  StdDraw.filledCircle(someWidth/2.5,someHeight/1.3 , 17);
      	  StdDraw.setPenColor(StdDraw.GREEN);
  		  StdDraw.filledCircle((someWidth/2.5),(someHeight/1.3), 15);
      	  StdDraw.setPenColor(StdDraw.BLACK);
      	  StdDraw.text(someWidth/1.5, someHeight/1.2, "B");
      	  StdDraw.circle(someWidth/1.5,someHeight/1.3 , 20);
      	  StdDraw.setPenColor(StdDraw.BLUE);
      	  StdDraw.filledCircle(someWidth/1.5,someHeight/1.3 , 19.3);
      	  StdDraw.setPenColor(StdDraw.BLACK);
      	  StdDraw.text(someWidth/1.1, someHeight/1.2, "C");
      	  StdDraw.circle(someWidth/1.1,someHeight/1.3 , 20);
      	  StdDraw.setPenColor(StdDraw.BLUE);
      	  StdDraw.filledCircle(someWidth/1.1,someHeight/1.3 , 19.3);
      	  StdDraw.setPenColor(StdDraw.BLACK);
      	  StdDraw.text(someWidth/5.1, someHeight/1.3, "Stacks:");
      	  StdDraw.setPenColor(StdDraw.RED);
      	  StdDraw.setPenRadius(0.005);
      	  StdDraw.square(someWidth/10, someHeight/15, 20);
      	 StdDraw.show(3);
        }
}
	}