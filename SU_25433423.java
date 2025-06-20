import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.Stack;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
public class SU_25433423 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		 /** The following segment is for the final handin */
      if (args.length == 0) {
          /** Visual Mode */
          // some helpful methods from the StdDraw library are listed below
          int someWidth = 300;
          int someHeight = 600;
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
     	  Font font5 = new Font("Arial", Font.BOLD, Have);
     	  StdDraw.picture(190, 440, "Transporter.jpg", 63, 60, 45);
     	  StdDraw.picture(40, 440, "Bomp.jpg", 63, 60,135);		 
		  StdDraw.picture(29, 300, "Shifter.jpg", 63, 60,59);
		  StdDraw.picture(190, 240, "Paint brush.jpg", 63, 60,746);
          StdDraw.setFont(font1);
          StdDraw.text(someWidth/2, someHeight/1.6, "Stacked Tic Tac Toe");
          StdDraw.setFont(font2);
          StdDraw.text(someWidth/2, someHeight/1.8, "Have Fun!!");
          StdDraw.setFont(font);
          StdDraw.text(someWidth/2, someHeight/2.0, "Game is starting... " );
          StdDraw.show(3000);
       
          String [][] externalstacksB= {{"B1.jpg","B2.jpg","B3.jpg","B4.jpg"},
                                        {"B1.jpg","B2.jpg","B3.jpg","B4.jpg"},
                                        {"B1.jpg","B2.jpg","B3.jpg","B4.jpg"},};
          String [][] externalstacksG= {{"G1.jpg","G2.jpg","G3.jpg","G4.jpg"},
                                        {"G1.jpg","G2.jpg","G3.jpg","G4.jpg"},
                                        {"G1.jpg","G2.jpg","G3.jpg","G4.jpg"},};
 		 //Blue player col of external stack to be placed
          int a=-1,b=-1,c=-1;
        //Green player col of external stack to be placed
 		 int d=-1, e=-1,f=-1;
 		//Blue player col of external stack
 		 int bl1=0,bl2=0,bl3=0;
 		//Green player col of external stack
 		 int gr1=0,gr2=0,gr3=0;
 		 //for comparison between p1/p2/p3 with bl1/bl2/bl3
 		 int p1=0,p2=0,p3=0;
 		 //for comparison between q1/q2/q3 with gr1/gr2/gr3
 		 int q1=0,q2=0,q3=0;
 		 //placement of the A external stack of blue player
 		 double j1=0,k1=0,j2=0,k2=0,j3=0,k3=0,j4=0,k4=0;
 		 //placement of the A external stack of green player
 		 double Gj1=0,Gk1=0,Gj2=0,Gk2=0,Gj3=0,Gk3=0,Gj4=0,Gk4=0;
 		 //placement of the B external stack of blue player
 		 double n1=0,m1=0,n2=0,m2=0,n3=0,m3=0,n4=0,m4=0;
 		 //placement of the B external stack of green player
 		 double Gn1=0,Gm1=0,Gn2=0,Gm2=0,Gn3=0,Gm3=0,Gn4=0,Gm4=0;
 		 //placement of the C external stack of blue player
 		 double l1=0,v1=0,l2=0,v2=0,l3=0,v3=0,l4=0,v4=0;
 		 //placement of the C external stack of green player
 		 double Gl1=0,Gv1=0,Gl2=0,Gv2=0,Gl3=0,Gv3=0,Gl4=0,Gv4=0;
 		 
          while (!StdDraw.hasNextKeyTyped()) {
              Blueplayerboard(someWidth, someHeight, font3, font4, font5,externalstacksB,bl1,bl2,bl3);            
          }
         while(true) {
          double width1=37.5;
		    double height1= 217;
		    while(true) {
		   while (!StdDraw.hasNextKeyTyped()) {}
        char stack=StdDraw.nextKeyTyped();
        if(stack=='q') {
            quitgameGUI(someWidth, someHeight, font3, font4, font5,externalstacksB,bl1,bl2,bl3);
            } else  
      		  if(stack=='A') {
      	while (!StdDraw.hasNextKeyTyped()) {}
		    char input1 = StdDraw.nextKeyTyped();
		    while(input1!='\n') {
		          while (!StdDraw.hasNextKeyTyped()) {}    
      	  char input = StdDraw.nextKeyTyped(); 
          	if((height1>=30)&&(height1<=250)&&(width1>=30)&&(width1<=270)) {
     		    StdDraw.picture(width1, height1, "Navigator.jpg", 75.1, 60);
	            StdDraw.show(100);}
      		 Blueplayerboard(someWidth, someHeight, font3, font4, font5,externalstacksB,bl1,bl2,bl3); 
      		whatisontheboard(externalstacksB, externalstacksG,c,d, a, b, e, f, j1, k1, j2, k2, j3, k3, j4, k4, Gj1, Gk1,
					Gj2, Gk2, Gj3, Gk3, Gj4, Gk4, n1, m1, n2, m2, n3, m3, n4, m4, Gn1, Gm1, Gn2, Gm2, Gn3, Gm3, Gn4,
					Gm4, l1, v1, l2, v2, l3, v3, l4, v4, Gl1, Gv1, Gl2, Gv2, Gl3, Gv3, Gl4, Gv4,someWidth, someHeight, font3, font4, font5,bl1,bl2,bl3);
      		height1=navigateforupdown(input, width1, height1);
      		width1 = navigateforleftright(input, width1);
      		 if((height1>=30)&&(height1<=250)&&(width1>=30)&&(width1<=270)) {
      		 StdDraw.picture(width1, height1, "Navigator.jpg", 74.1, 60);
	            StdDraw.show(100);} 
      		 if(input=='\n') {
          		 greenlayerboard(someWidth, someHeight, font3, font4, font5,externalstacksG,gr1,gr2,gr3);
          		 a=a+1;
          		 p1=p1+1;
          		 bl1=bl1+1;	
          		 if((j1<=0)&&(k1<=0)) {j1=width1;
          		 k1=height1;}else if((j2<=0)&&(k2<=0)) {j2=width1;
          		 k2=height1;}else if((j3<=0)&&(k3<=0)) {j3=width1;
          		 k3=height1;}else if((j4<=0)&&(k4<=0)) {j4=width1;
          		 k4=height1;}else {
          			invalidmoveblue(someWidth, someHeight, font3, font4, font5, externalstacksB, bl1, bl2, bl3);
          	      break;
          		 }
          		whatisontheboard(externalstacksB, externalstacksG,c,d, a, b, e, f, j1, k1, j2, k2, j3, k3, j4, k4, Gj1, Gk1,
    					Gj2, Gk2, Gj3, Gk3, Gj4, Gk4, n1, m1, n2, m2, n3, m3, n4, m4, Gn1, Gm1, Gn2, Gm2, Gn3, Gm3, Gn4,
    					Gm4, l1, v1, l2, v2, l3, v3, l4, v4, Gl1, Gv1, Gl2, Gv2, Gl3, Gv3, Gl4, Gv4,someWidth, someHeight, font3, font4, font5,bl1,bl2,bl3);
           		  whatsontheboard(externalstacksB, a, width1, height1);
           		  StdDraw.show(100);
           		  break;}
             }break;}else
    if (stack=='B') {
  	    while (!StdDraw.hasNextKeyTyped()) {}
		    char input2 = StdDraw.nextKeyTyped();
		    while(input2!='\n') {
		          while (!StdDraw.hasNextKeyTyped()) {}    
    	  char input = StdDraw.nextKeyTyped();  
        	if((height1>=30)&&(height1<=250)&&(width1>=30)&&(width1<=270)) {
   		    StdDraw.picture(width1, height1, "Navigator.jpg", 75.1, 60);
	            StdDraw.show(100);}
    		 Blueplayerboard(someWidth, someHeight, font3, font4, font5,externalstacksB,bl1,bl2,bl3);
    		 whatisontheboard(externalstacksB, externalstacksG,c,d, a, b, e, f, j1, k1, j2, k2, j3, k3, j4, k4, Gj1, Gk1,
 					Gj2, Gk2, Gj3, Gk3, Gj4, Gk4, n1, m1, n2, m2, n3, m3, n4, m4, Gn1, Gm1, Gn2, Gm2, Gn3, Gm3, Gn4,
 					Gm4, l1, v1, l2, v2, l3, v3, l4, v4, Gl1, Gv1, Gl2, Gv2, Gl3, Gv3, Gl4, Gv4,someWidth, someHeight, font3, font4, font5,bl1,bl2,bl3);
    		height1=navigateforupdown(input, width1, height1);
    		width1 = navigateforleftright(input, width1);
    		 if((height1>=30)&&(height1<=250)&&(width1>=30)&&(width1<=270)) {
    		 StdDraw.picture(width1, height1, "Navigator.jpg", 74.1, 60);
	            StdDraw.show(100);} 
    		 if(input=='\n') {
        		 greenlayerboard(someWidth, someHeight, font3, font4, font5, externalstacksG,gr1,gr2,gr3);
        		    b= b+1;
        		    p2=p2+1;
             		 bl2=bl2+1;
        		    if((n1<=0)&&(m1<=0)) {n1=width1;
             		 m1=height1;}else if((n2<=0)&&(m2<=0)) {n2=width1;
             		 m2=height1;}else if((n3<=0)&&(m3<=0)) {n3=width1;
             		 m3=height1;}else if((n4<=0)&&(m4<=0)) {m4=width1;
             		 m4=height1;}else {
             			invalidmoveblue(someWidth, someHeight, font3, font4, font5, externalstacksB, bl1, bl2, bl3);
             	      break;
             		 }
        	whatisontheboard(externalstacksB, externalstacksG,c,d, a, b, e, f, j1, k1, j2, k2, j3, k3, j4, k4, Gj1, Gk1,
        					Gj2, Gk2, Gj3, Gk3, Gj4, Gk4, n1, m1, n2, m2, n3, m3, n4, m4, Gn1, Gm1, Gn2, Gm2, Gn3, Gm3, Gn4,
        					Gm4, l1, v1, l2, v2, l3, v3, l4, v4, Gl1, Gv1, Gl2, Gv2, Gl3, Gv3, Gl4, Gv4,someWidth, someHeight, font3, font4, font5,bl1,bl2,bl3);
         		  whatsontheboard(externalstacksB, b, width1, height1);
         		  StdDraw.show(100);
         		  break;}
          } break;}  
    if(stack=='C') {
	    while (!StdDraw.hasNextKeyTyped()) {}
		    char input2 = StdDraw.nextKeyTyped();
		    while(input2!='\n') {
		          while (!StdDraw.hasNextKeyTyped()) {}    
  	  char input = StdDraw.nextKeyTyped(); 
      	if((height1>=30)&&(height1<=250)&&(width1>=30)&&(width1<=270)) {
 		    StdDraw.picture(width1, height1, "Navigator.jpg", 75.1, 60);
	            StdDraw.show(100);}
  		 Blueplayerboard(someWidth, someHeight, font3, font4, font5,externalstacksB,bl1,bl2,bl3);
  		whatisontheboard(externalstacksB, externalstacksG,c,d, a, b, e, f, j1, k1, j2, k2, j3, k3, j4, k4, Gj1, Gk1,
				Gj2, Gk2, Gj3, Gk3, Gj4, Gk4, n1, m1, n2, m2, n3, m3, n4, m4, Gn1, Gm1, Gn2, Gm2, Gn3, Gm3, Gn4,
				Gm4, l1, v1, l2, v2, l3, v3, l4, v4, Gl1, Gv1, Gl2, Gv2, Gl3, Gv3, Gl4, Gv4,someWidth, someHeight, font3, font4, font5,bl1,bl2,bl3);
  		height1=navigateforupdown(input, width1, height1);
  		width1 = navigateforleftright(input, width1);
  		 if((height1>=30)&&(height1<=250)&&(width1>=30)&&(width1<=270)) {
  		 StdDraw.picture(width1, height1, "Navigator.jpg", 74.1, 60);
	            StdDraw.show(100);} 
  		 if(input=='\n') {
      		 greenlayerboard(someWidth, someHeight, font3, font4, font5, externalstacksG,gr1,gr2,gr3);
      		 c=c+1;
      		 p3=p3+1;
     		 bl3=bl3+1;
      		 if((l1<=0)&&(v1<=0)) {l1=width1;
      		 v1=height1;}else if((l2<=0)&&(v2<=0)) {l2=width1;
      		 v2=height1;}else if((l3<=0)&&(v3<=0)) {l3=width1;
      		 v3=height1;}else if((l4<=0)&&(v4<=0)) {l4=width1;
      		 v4=height1;}else {
      			invalidmoveblue(someWidth, someHeight, font3, font4, font5, externalstacksB, bl1, bl2, bl3);
      	      break;
      		 }
      		whatisontheboard(externalstacksB, externalstacksG,c,d, a, b, e, f, j1, k1, j2, k2, j3, k3, j4, k4, Gj1, Gk1,
					Gj2, Gk2, Gj3, Gk3, Gj4, Gk4, n1, m1, n2, m2, n3, m3, n4, m4, Gn1, Gm1, Gn2, Gm2, Gn3, Gm3, Gn4,
					Gm4, l1, v1, l2, v2, l3, v3, l4, v4, Gl1, Gv1, Gl2, Gv2, Gl3, Gv3, Gl4, Gv4,someWidth, someHeight, font3, font4, font5,bl1,bl2,bl3);
       		  whatsontheboard(externalstacksB, c, width1, height1);
       		  StdDraw.show(100);
       		  break;}
        } break;}}
        //... see Draw.java for other available methods
        while (!StdDraw.hasNextKeyTyped()) {
            // wait
      		
           }
        
        double width2=37.5;
		    double height2= 215;

		    while(true) {
		    	 while (!StdDraw.hasNextKeyTyped()) {}
		    char stack2=StdDraw.nextKeyTyped();
		    if(stack2=='q') {
	        	quitgamegreen(someWidth, someHeight, font3, font4, font5, externalstacksB, gr1, gr2, gr3);
	          } else
  		  if(stack2=='A') {
  			while (!StdDraw.hasNextKeyTyped()) {}
		    char input3 = StdDraw.nextKeyTyped();
		    if((height2>=30)&&(height2<=250)&&(width2>=30)&&(width2<=270)) {
     		    StdDraw.picture(width2, height2, "Navigator.jpg", 75.1, 60);
	            StdDraw.show(100);}
		    while(input3!='\n') {
      	  while (!StdDraw.hasNextKeyTyped()) {}
        char input2 = StdDraw.nextKeyTyped();
          	if((height2>=30)&&(height2<=250)&&(width2>=30)&&(width2<=270)) {
     		    StdDraw.picture(width2, height2, "Navigator.jpg", 75.1, 60);
	            StdDraw.show(2);} 
          	 greenlayerboard(someWidth, someHeight, font3, font4, font5, externalstacksG,gr1,gr2,gr3);
          	whatisontheboard(externalstacksB, externalstacksG,c,d ,a, b, e, f, j1, k1, j2, k2, j3, k3, j4, k4, Gj1, Gk1,
					Gj2, Gk2, Gj3, Gk3, Gj4, Gk4, n1, m1, n2, m2, n3, m3, n4, m4, Gn1, Gm1, Gn2, Gm2, Gn3, Gm3, Gn4,
					Gm4, l1, v1, l2, v2, l3, v3, l4, v4, Gl1, Gv1, Gl2, Gv2, Gl3, Gv3, Gl4, Gv4,someWidth, someHeight, font3, font4, font5,bl1,bl2,bl3);
          	StdDraw.show(2);
      		height2=navigateforupdown(input2, width2, height2);
      		width2 = navigateforleftright(input2, width2);
      		 if((height2>=30)&&(height2<=250)&&(width2>=30)&&(width2<=270)) {
      		 StdDraw.picture(width2, height2, "Navigator.jpg", 74.1, 60);
	            StdDraw.show(2);} 
      		 if(input2=='\n') {
      			Blueplayerboard(someWidth, someHeight, font3, font4, font5,externalstacksB,bl1,bl2,bl3);
      			 d=d+1;
          		 q1=q1+1;
          		 gr1=gr1+1;	
          		 if((Gj1<=0)&&(Gk1<=0)) {Gj1=width2;
          		 Gk1=height2;}else if((Gj2<=0)&&(Gk2<=0)) {Gj2=width2;
          		 Gk2=height2;}else if((Gj3<=0)&&(Gk3<=0)) {Gj3=width2;
          		 Gk3=height2;}else if((Gj4<=0)&&(Gk4<=0)) {Gj4=width2;
          		 Gk4=height2;}else {
          			invalidmoveblue(someWidth, someHeight, font3, font4, font5, externalstacksB, bl1, bl2, bl3);
          	      break;
          		 }
          		whatisontheboard(externalstacksB, externalstacksG,c,d, a, b, e, f, j1, k1, j2, k2, j3, k3, j4, k4, Gj1, Gk1,
    					Gj2, Gk2, Gj3, Gk3, Gj4, Gk4, n1, m1, n2, m2, n3, m3, n4, m4, Gn1, Gm1, Gn2, Gm2, Gn3, Gm3, Gn4,
    					Gm4, l1, v1, l2, v2, l3, v3, l4, v4, Gl1, Gv1, Gl2, Gv2, Gl3, Gv3, Gl4, Gv4,someWidth, someHeight, font3, font4, font5,bl1,bl2,bl3);
          		 whatsontheboard(externalstacksG, d, width2, height2);
          		StdDraw.show(100);
         		  break;}
            }break;}else 
            	if(stack2=='B') { 
            		while (!StdDraw.hasNextKeyTyped()) {}
            		char input3 = StdDraw.nextKeyTyped();
    		    if((height2>=30)&&(height2<=250)&&(width2>=30)&&(width2<=270)) {
         		    StdDraw.picture(width2, height2, "Navigator.jpg", 75.1, 60);
    	            StdDraw.show(100);}
    		    while(input3!='\n') {
          	  while (!StdDraw.hasNextKeyTyped()) {}
            char input2 = StdDraw.nextKeyTyped();
           
              	if((height2>=30)&&(height2<=250)&&(width2>=30)&&(width2<=270)) {
         		    StdDraw.picture(width2, height2, "Navigator.jpg", 75.1, 60);
    	            StdDraw.show(2);} 
              	 greenlayerboard(someWidth, someHeight, font3, font4, font5, externalstacksG,gr1,gr2,gr3);
              	whatisontheboard(externalstacksB, externalstacksG,c,d, a, b, e, f, j1, k1, j2, k2, j3, k3, j4, k4, Gj1, Gk1,
    					Gj2, Gk2, Gj3, Gk3, Gj4, Gk4, n1, m1, n2, m2, n3, m3, n4, m4, Gn1, Gm1, Gn2, Gm2, Gn3, Gm3, Gn4,
    					Gm4, l1, v1, l2, v2, l3, v3, l4, v4, Gl1, Gv1, Gl2, Gv2, Gl3, Gv3, Gl4, Gv4,someWidth, someHeight, font3, font4, font5,bl1,bl2,bl3);
          		height2=navigateforupdown(input2, width2, height2);
          		width2 = navigateforleftright(input2, width2);
          		 if((height2>=30)&&(height2<=250)&&(width2>=30)&&(width2<=270)) {
          		 StdDraw.picture(width2, height2, "Navigator.jpg", 74.1, 60);
    	            StdDraw.show(2);} 
          		 if(input2=='\n') {
          			Blueplayerboard(someWidth, someHeight, font3, font4, font5,externalstacksB,bl1,bl2,bl3);
          		  e= e+1;
      		    q2=q2+1;
           		 gr2=gr2+1;
      		    if((Gn1<=0)&&(Gm1<=0)) {Gn1=width2;
           		 Gm1=height2;}else if((Gn2<=0)&&(Gm2<=0)) {Gn2=width2;
           		 Gm2=height2;}else if((Gn3<=0)&&(Gm3<=0)) {Gn3=width2;
           		 Gm3=height2;}else if((Gn4<=0)&&(Gm4<=0)) {Gm4=width2;
           		Gm4=height2;}else {
           			invalidmoveblue(someWidth, someHeight, font3, font4, font5, externalstacksB, bl1, bl2, bl3);
           	      break;
           		 }whatisontheboard(externalstacksB, externalstacksG,c,d, a, b, e, f, j1, k1, j2, k2, j3, k3, j4, k4, Gj1, Gk1,
     					Gj2, Gk2, Gj3, Gk3, Gj4, Gk4, n1, m1, n2, m2, n3, m3, n4, m4, Gn1, Gm1, Gn2, Gm2, Gn3, Gm3, Gn4,
     					Gm4, l1, v1, l2, v2, l3, v3, l4, v4, Gl1, Gv1, Gl2, Gv2, Gl3, Gv3, Gl4, Gv4,someWidth, someHeight, font3, font4, font5,bl1,bl2,bl3);
          		 whatsontheboard(externalstacksG, e, width2, height2);
          		StdDraw.show(100);
             		  break;}
                }break;}else
                	if(stack2=='C') { 
                		while (!StdDraw.hasNextKeyTyped()) {}
                		char input3 = StdDraw.nextKeyTyped();
        		    if((height2>=30)&&(height2<=250)&&(width2>=30)&&(width2<=270)) {
             		    StdDraw.picture(width2, height2, "Navigator.jpg", 75.1, 60);
        	            StdDraw.show(100);}
        		    while(input3!='\n') {
              	  while (!StdDraw.hasNextKeyTyped()) {}
                char input2 = StdDraw.nextKeyTyped(); 
                  	if((height2>=30)&&(height2<=250)&&(width2>=30)&&(width2<=270)) {
             		    StdDraw.picture(width2, height2, "Navigator.jpg", 75.1, 60);
        	            StdDraw.show(2);} 
                  	 greenlayerboard(someWidth, someHeight, font3, font4, font5, externalstacksG,gr1,gr2,gr3);
                  	whatisontheboard(externalstacksB, externalstacksG,c,d, a, b, e, f, j1, k1, j2, k2, j3, k3, j4, k4, Gj1, Gk1,
        					Gj2, Gk2, Gj3, Gk3, Gj4, Gk4, n1, m1, n2, m2, n3, m3, n4, m4, Gn1, Gm1, Gn2, Gm2, Gn3, Gm3, Gn4,
        					Gm4, l1, v1, l2, v2, l3, v3, l4, v4, Gl1, Gv1, Gl2, Gv2, Gl3, Gv3, Gl4, Gv4,someWidth, someHeight, font3, font4, font5,bl1,bl2,bl3);
              		height2=navigateforupdown(input2, width2, height2);
              		width2 = navigateforleftright(input2, width2);
              		 if((height2>=30)&&(height2<=250)&&(width2>=30)&&(width2<=270)) {
              		 StdDraw.picture(width2, height2, "Navigator.jpg", 74.1, 60);
        	            StdDraw.show(2);} 
              		 if(input2=='\n') {
              			Blueplayerboard(someWidth, someHeight, font3, font4, font5,externalstacksB,bl1,bl2,bl3);
              			 f=f+1;
                  		 q3=q3+1;
                 		 gr3=gr3+1;
                  		 if((Gl1<=0)&&(Gv1<=0)) {Gl1=width2;
                  		 Gv1=height2;}else if((Gl2<=0)&&(Gv2<=0)) {Gl2=width2;
                  		 Gv2=height2;}else if((Gl3<=0)&&(Gv3<=0)) {Gl3=width2;
                  		 Gv3=height2;}else if((Gl4<=0)&&(Gv4<=0)) {Gl4=width2;
                  		 Gv4=height2;}else {
                  			invalidmoveblue(someWidth, someHeight, font3, font4, font5, externalstacksB, bl1, bl2, bl3);
                  	      break;
                  		 }
                  		whatisontheboard(externalstacksB, externalstacksG,c,d, a, b, e, f, j1, k1, j2, k2, j3, k3, j4, k4, Gj1, Gk1,
            					Gj2, Gk2, Gj3, Gk3, Gj4, Gk4, n1, m1, n2, m2, n3, m3, n4, m4, Gn1, Gm1, Gn2, Gm2, Gn3, Gm3, Gn4,
            					Gm4, l1, v1, l2, v2, l3, v3, l4, v4, Gl1, Gv1, Gl2, Gv2, Gl3, Gv3, Gl4, Gv4,someWidth, someHeight, font3, font4, font5,bl1,bl2,bl3);
                 		 whatsontheboard(externalstacksG, f, width2, height2);
                   		StdDraw.show(100);;
                 		  break;}
                    }}break;}
		    if(bl1==4) {break;}
         }
  		  
		    //... see Draw.java for other available methods
	        
		     } else if (args.length == 1) {
          /** Text Mode */
    	  //The board is a stacked board layout
    	  //The stacks for each of the 16blocks 
      	Stack<String> stack1= new Stack<String>();	 
	   		   stack1.add("__");
	   		Stack<String> stack2= new Stack<String>();	 
	   		   stack2.add("__");
	   		Stack<String> stack3= new Stack<String>();	 
	   		   stack3.add("__");
	   		Stack<String> stack4= new Stack<String>();	 
	   		   stack4.add("__");
	   		Stack<String> stack5= new Stack<String>();	 
	   		   stack5.add("__");
	   		Stack<String> stack6= new Stack<String>();	 
	   		   stack6.add("__");
	   		Stack<String> stack7= new Stack<String>();	 
	   		   stack7.add("__");
	   		Stack<String> stack8= new Stack<String>();	 
	   		   stack8.add("__");
	   		Stack<String> stack9= new Stack<String>();	 
	   		   stack9.add("__");
	   		Stack<String> stack10= new Stack<String>();	 
	   		   stack10.add("__");
	   		Stack<String> stack11= new Stack<String>();	 
	   		   stack11.add("__");
	   		Stack<String> stack12= new Stack<String>();	 
	   		   stack12.add("__");
	   		Stack<String> stack13= new Stack<String>();	 
	   		   stack13.add("__");
	   		Stack<String> stack14= new Stack<String>();	 
	   		   stack14.add("__");
	   		Stack<String> stack15= new Stack<String>();	 
	   		   stack15.add("__");
	   		Stack<String> stack16= new Stack<String>();	 
	   		   stack16.add("__");
	   	 //Board
		String [][] grid = {{stack1.peek(),stack2.peek(),stack3.peek(),stack4.peek()},
				            {stack5.peek(),stack6.peek(),stack7.peek(),stack8.peek()},
				            {stack9.peek(),stack10.peek(),stack11.peek(),stack12.peek()},
				            {stack13.peek(),stack14.peek(),stack15.peek(),stack16.peek()},
                          };
		 printboard(grid);
		 System.out.println(" ");
	//Blue player stacks
		 //Blue player stack 1
	   		Stack<String> stackB1= new Stack<String>();	 
	   		   stackB1.add("B4");
	   		   stackB1.add("B3");
	   		   stackB1.add("B2");
	   		   stackB1.add("B1");
	   	//Blue player stack 2 	   
	   		Stack<String> stackB2= new Stack<String>();	 
	   		   stackB2.add("B4");
	   		   stackB2.add("B3");
	   		   stackB2.add("B2");
	   		   stackB2.add("B1");
	   	//Blue player stack 1  
	   		Stack<String> stackB3= new Stack<String>();	 
	   		   stackB3.add("B4");
	   		   stackB3.add("B3");
	   		   stackB3.add("B2");
	   		   stackB3.add("B1");
//Green player stacks
	  //Green player stack 1
		Stack<String> stackG1= new Stack<String>();	 
		   stackG1.add("G4");
		   stackG1.add("G3");
		   stackG1.add("G2");
		   stackG1.add("G1");
	//Green player stack 2	   
		Stack<String> stackG2= new Stack<String>();	 
		   stackG2.add("G4");
		   stackG2.add("G3");
		   stackG2.add("G2");
		   stackG2.add("G1");
	//Green player stack 3  
		Stack<String> stackG3= new Stack<String>();	 
		   stackG3.add("G4");
		   stackG3.add("G3");
		   stackG3.add("G2");
		   stackG3.add("G1");
		   In in = new In(args[0]);
		   while (in.hasNextLine()) {
			   //Blue player turn
		     int ints=in.readInt();
		     //Blue player Quits
		     if(ints==-1) {
			 		System.out.println(" ");
			 		System.out.println("Quit");
			 		Blueplayerexternalstacks(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12,
			 				stack13, stack14, stack15, stack16,grid,stackB1, stackB2, stackB3);
			 		Greenplayerexternalstacks(stackG1, stackG2, stackG3);
			 		System.exit(0);}
		     //Blue player plays obstacles
		     if(ints==5) {
		    	 String l=in.readString();
		    	 switch(l) {
		    	 //Blue player plays Bomb
		    	 case "B":
						int Orow=in.readInt();
						int Ocol=in.readInt();
						Orow=Orow-1;
						Ocol=Ocol-1;
						 bomb(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
									stack12, stack13, stack14, stack15, stack16,stackB1, stackB2, stackB3,stackG1, stackG2,
									stackG3, Orow, Ocol);
						   boardlayout(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10,
								stack11, stack12, stack13, stack14, stack15, stack16, grid);
						   printboard(grid);
						 System.out.println(" ");
						break;		    	 
					//Blue player plays Transporter
		    	 case "T":
						int Trow=in.readInt();
						int Tcol=in.readInt();
						int No=in.readInt();
						Trow=Trow-1;
						Tcol=Tcol-1;
						if(grid[Trow][Tcol]=="G1"||grid[Trow][Tcol]=="G2"||grid[Trow][Tcol]=="G3"||grid[Trow][Tcol]=="G4") {
							transport(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
									stack12, stack13, stack14, stack15, stack16, Trow, Tcol, No);
							boardlayout(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10,
									stack11, stack12, stack13, stack14, stack15, stack16, grid);
						    printboard(grid);
						 System.out.println(" ");
						}else {
							System.out.println("Invalid move");
						}
						break;
						//Blue player plays Paint brush
		    	 case "P":
		    		 int Prow=in.readInt()-1;
		    		 int Pcol=in.readInt()-1;
		    		
		    		     if(grid[Prow][Pcol]=="G1"||grid[Prow][Pcol]=="G2"||grid[Prow][Pcol]=="G3"||grid[Prow][Pcol]=="G4") {
		    		    	 paint(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
									stack12, stack13, stack14, stack15, stack16, Prow, Pcol);
		    		    	 boardlayout(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10,
		 							stack11, stack12, stack13, stack14, stack15, stack16, grid);
		 				     printboard(grid);
		 				     System.out.println(" ");
		    		     }else {System.out.println("Invalid move");}
						break;
					//Blue player plays Shifter
		    	 case "S":
						int Srow=in.readInt();
						int Scol=in.readInt();
						int direction=in.readInt();
						Srow=Srow-1;
						Scol=Scol-1;
						if(grid[Srow][Scol]=="__"||grid[Srow][Scol]=="__"||grid[Srow][Scol]=="__"||grid[Srow][Scol]=="__") {
						  shifter(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10,
								stack11, stack12, stack13, stack14, stack15, stack16, grid, Srow, Scol, direction);
					      boardlayout(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10,
							stack11, stack12, stack13, stack14, stack15, stack16, grid);
						  printboard(grid);
						  System.out.println(" ");}else {System.out.println("Invalid move");}
						break;}
		    	    //Checking if the game has ended in a draw
	                 CheckForDraw(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12,
			                  stack13, stack14, stack15, stack16, grid, stackB1, stackB2, stackB3, stackG1, stackG2, stackG3);
		    	    //Checking if Blue player has won
	   	             ChecksForBlueWin(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12,
						           stack13, stack14, stack15, stack16,grid,stackB1, stackB2, stackB3,stackG1, stackG2, stackG3);
		    	    //Checking if Green player has won
	 		         ChecksForGreenWin(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12,
						              stack13, stack14, stack15, stack16,grid,stackB1, stackB2, stackB3,stackG1, stackG2, stackG3);		    	    
					//Checking if the input file is now empty
					if(in.isEmpty()){
				    	System.out.println("No winner, input file has ended");
				    	Blueplayerexternalstacks(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12,
								                 stack13, stack14, stack15, stack16,grid,stackB1, stackB2, stackB3);
				    	Greenplayerexternalstacks(stackG1, stackG2, stackG3);
				    	System.exit(0);}
					}else {							 
		     int row=in.readInt();
		     int col=in.readInt();
		         row=row-1;
		         col=col-1;
		     String n= grid[row][col];
		     //Blue player places pieces on board
 	           while(ints<4) { 
 	        	   if(ints ==1) {
 	        		  if(stackB1.isEmpty()) {System.out.println("Invalid move");break;}
 	        	   }else  if(ints ==2) {
  	        		  if(stackB2.isEmpty()) {System.out.println("Invalid move");break;}
  	        	   } else if(ints ==3) {
  	        		  if(stackB3.isEmpty()) {System.out.println("Invalid move");break;}
  	        	   }
                     if(n!="SH") {
		        n = Blueplayersturn(in,stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
					                stack12, stack13, stack14, stack15, stack16,grid, stackB1, stackB2, stackB3, ints, row, col, n);
		      //Checking if Green player has won
 		        ChecksForGreenWin(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12,
					              stack13, stack14, stack15, stack16,grid,stackB1, stackB2, stackB3,stackG1, stackG2, stackG3);  		    
 		        PlayB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12,
				      stack13, stack14, stack15, stack16, grid, row, col, n);}
                     if(n=="SH"){
                    	 boardlayout(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10,
		 							stack11, stack12, stack13, stack14, stack15, stack16, grid);
				    	     if(row==0&&col==0) {stack1.pop();  grid[row][col]=stack1.peek();}
							 if(row==0&&col==1) {stack2.pop(); grid[row][col]=stack2.peek();}
							 if(row==0&&col==2) {stack3.pop(); grid[row][col]=stack3.peek();}
							 if(row==0&&col==3) {stack4.pop(); grid[row][col]=stack4.peek();}
							 if(row==1&&col==0) {stack5.pop(); grid[row][col]=stack5.peek();}
							 if(row==1&&col==1) {stack6.pop(); grid[row][col]=stack6.peek();}
							 if(row==1&&col==2) {stack7.pop(); grid[row][col]=stack7.peek();}
							 if(row==1&&col==3) {stack8.pop(); grid[row][col]=stack8.peek();}
							 if(row==2&&col==0) {stack9.pop(); grid[row][col]=stack9.peek();}
							 if(row==2&&col==1) {stack10.pop(); grid[row][col]=stack10.peek();}
							 if(row==2&&col==2) {stack11.pop(); grid[row][col]=stack11.peek();}
							 if(row==2&&col==3) {stack12.pop(); grid[row][col]=stack12.peek();}
							 if(row==3&&col==0) {stack13.pop(); grid[row][col]=stack13.peek();}
							 if(row==3&&col==1) {stack14.pop(); grid[row][col]=stack14.peek();}
							 if(row==3&&col==2) {stack15.pop(); grid[row][col]=stack15.peek();}
							 if(row==3&&col==3) {stack16.pop(); grid[row][col]=stack16.peek();}
							    printboard(grid);
							    System.out.println(" ");
							    break;
				      }
	            printboard(grid);
	            System.out.println(" ");
	          //Checking if the game has ended in a draw
	            CheckForDraw(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12,
			                  stack13, stack14, stack15, stack16, grid, stackB1, stackB2, stackB3, stackG1, stackG2, stackG3);break;}
	    //Blue player moves pieces on the board
 	      if(ints==4) {
			int s=in.readInt();
			int r=in.readInt();
			s=s-1;
			r=r-1;
			if(grid[row][col]=="GR"||((row==s)&&(col==r))) {
				
				System.out.println("Invalid Move");	
			}else {
		      rearrangingB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
						stack12, stack13, stack14, stack15, stack16, grid, row, col, s, r);		      
	          printboard(grid);
	          System.out.println(" ");
	        //Checking if the game is ending in a draw
	          CheckForDraw(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12,
			              stack13, stack14, stack15, stack16, grid, stackB1, stackB2, stackB3, stackG1, stackG2, stackG3);
	        //Checking if Green player has won
	          ChecksForGreenWin(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12,
				                stack13, stack14, stack15, stack16,grid,stackB1, stackB2, stackB3,stackG1, stackG2, stackG3);	
	          } 
			//Checking if the input file is now empty
			if(in.isEmpty()){
	    	 System.out.println("No winner, input file has ended");
	    	 Blueplayerexternalstacks(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12,
					                 stack13, stack14, stack15, stack16,grid,stackB1, stackB2, stackB3);
	    	 Greenplayerexternalstacks(stackG1, stackG2, stackG3);
	    	 System.exit(0);}} }
 	      //Checking if Blue player has won
   	         ChecksForBlueWin(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12,
					          stack13, stack14, stack15, stack16,grid,stackB1, stackB2, stackB3,stackG1, stackG2, stackG3);
   	    //Checking if the input file is now empty
   	        if(in.isEmpty()){
		    	System.out.println("No winner, input file has ended");
		    	Blueplayerexternalstacks(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12,
						stack13, stack14, stack15, stack16,grid,stackB1, stackB2, stackB3);
		    	Greenplayerexternalstacks(stackG1, stackG2, stackG3);
		    	System.exit(0);}
   	//Green players turn
   	 int inputInt = in.readInt();
   	 //Green player Quits the game 
   	 if( inputInt==-1) { 
			System.out.println(" ");
			System.out.println("Quit");		 
			Blueplayerexternalstacks(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12,
					                 stack13, stack14, stack15, stack16,grid,stackB1, stackB2, stackB3);
			Greenplayerexternalstacks(stackG1, stackG2, stackG3);
			System.exit(0);
		}
   	 //Green player plays the obstacles
   	    if(inputInt==5) {
    	 String j=in.readString();
    	 switch(j) {
    	 //Green player plays the Bomb
    	 case "B":
				int Orow=in.readInt();
				int Ocol=in.readInt();
				Orow=Orow-1;
				Ocol=Ocol-1;
				if(grid[Orow][Ocol]=="G1"||grid[Orow][Ocol]=="G2"||grid[Orow][Ocol]=="G3"||grid[Orow][Ocol]=="G4") {
					 bomb(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
							stack12, stack13, stack14, stack15, stack16,stackB1, stackB2, stackB3,stackG1, stackG2, stackG3, Orow, Ocol);	
				    boardlayout(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10,
						stack11, stack12, stack13, stack14, stack15, stack16, grid);
				    printboard(grid);
				 System.out.println(" ");}else {System.out.println("Invalid move");}
				break;
			//Green player plays the Shifter
    	 case "S":
				int Srow=in.readInt();
				int Scol=in.readInt();
				int direction=in.readInt();
				Srow=Srow-1;
				Scol=Scol-1;
				if(grid[Srow][Scol]=="__"||grid[Srow][Scol]=="__"||grid[Srow][Scol]=="__"||grid[Srow][Scol]=="__") {
				    shifter(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10,
						stack11, stack12, stack13, stack14, stack15, stack16, grid, Srow, Scol, direction);
				    boardlayout(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10,
						stack11, stack12, stack13, stack14, stack15, stack16, grid);
				    printboard(grid);
				    System.out.println(" ");}else {System.out.println("Invalid move");}
				break;
			//Green player plays the Transporter
    	 case "T":
				int Trow=in.readInt();
				int Tcol=in.readInt();
				int No=in.readInt();				
				Trow=Trow-1;
				Tcol=Tcol-1;
				if((grid[Trow][Tcol]=="B1"||grid[Trow][Tcol]=="B2"||grid[Trow][Tcol]=="B3"||grid[Trow][Tcol]=="B4")&&grid[Trow][Tcol]!="GR") {				 
				   transport(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
						stack12, stack13, stack14, stack15, stack16, Trow, Tcol, No);
				   boardlayout(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10,
							stack11, stack12, stack13, stack14, stack15, stack16, grid);
				   printboard(grid);
				 System.out.println(" ");
				}else {
					System.out.println("Invalid move");	
				}break;
		//Green player plays the paint brush
    	 case "P":
    		 int Prow=in.readInt()-1;
    		 int Pcol=in.readInt()-1;
    		     if(grid[Prow][Pcol]=="B1"||grid[Prow][Pcol]=="B2"||grid[Prow][Pcol]=="B3"||grid[Prow][Pcol]=="B4") {
    		    	 paint(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
							stack12, stack13, stack14, stack15, stack16, Prow, Pcol);
    		    	 boardlayout(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10,
 							stack11, stack12, stack13, stack14, stack15, stack16, grid);
 				     printboard(grid);
 				     System.out.println(" ");
    		     }else {System.out.println("Invalid move");}
				break;}
    	    //Checking if the game has ended in a draw
              CheckForDraw(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12,
                  stack13, stack14, stack15, stack16, grid, stackB1, stackB2, stackB3, stackG1, stackG2, stackG3);
	        //Checking if Blue player has won
              ChecksForBlueWin(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12,
			           stack13, stack14, stack15, stack16,grid,stackB1, stackB2, stackB3,stackG1, stackG2, stackG3);
	        //Checking if Green player has won
	         ChecksForGreenWin(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12,
			              stack13, stack14, stack15, stack16,grid,stackB1, stackB2, stackB3,stackG1, stackG2, stackG3);
			//Checking if the input file is now empty
			if(in.isEmpty()){
		    	System.out.println("No winner, input file has ended");
		    	Blueplayerexternalstacks(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12,
						                 stack13, stack14, stack15, stack16,grid,stackB1, stackB2, stackB3);
		    	Greenplayerexternalstacks(stackG1, stackG2, stackG3);
		    	System.exit(0);}}else {
   	     int rowG=in.readInt();
 		 int colG=in.readInt();
 		       rowG=rowG-1;
 		       colG=colG-1;
		 String m=grid[rowG][colG];
		//Green player places the pieces on the board 
	     while(inputInt<4) {
	    	 if(m!="SH") {
		    m = firstint(in,stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12,
			         stack13, stack14, stack15, stack16, grid, stackG1, stackG2, stackG3,stackB1, stackB2, stackB3,rowG,colG,ints, inputInt, m);				 
	        PlayG(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12, stack13,
			      stack14, stack15, stack16, grid, rowG, colG, m);}
	    	 if(m=="SH") {
	    		 boardlayout(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10,
							stack11, stack12, stack13, stack14, stack15, stack16, grid);
			    	     if(rowG==0&&colG==0) {stack1.pop(); grid[rowG][colG]=stack1.peek();}
						 if(rowG==0&&colG==1) {stack2.pop(); grid[rowG][colG]=stack2.peek();}
						 if(rowG==0&&colG==2) {stack3.pop(); grid[rowG][colG]=stack3.peek();}
						 if(rowG==0&&colG==3) {stack4.pop(); grid[rowG][colG]=stack4.peek();}
						 if(rowG==1&&colG==0) {stack5.pop(); grid[rowG][colG]=stack5.peek();}
						 if(rowG==1&&colG==1) {stack6.pop(); grid[rowG][colG]=stack6.peek();}
						 if(rowG==1&&colG==2) {stack7.pop(); grid[rowG][colG]=stack7.peek();}
						 if(rowG==1&&colG==3) {stack8.pop(); grid[rowG][colG]=stack8.peek();}
						 if(rowG==2&&colG==0) {stack9.pop(); grid[rowG][colG]=stack9.peek();}
						 if(rowG==2&&colG==1) {stack10.pop(); grid[rowG][colG]=stack10.peek();}
						 if(rowG==2&&colG==2) {stack11.pop(); grid[rowG][colG]=stack11.peek();}
						 if(rowG==2&&colG==3) {stack12.pop(); grid[rowG][colG]=stack12.peek();}
						 if(rowG==3&&colG==0) {stack13.pop(); grid[rowG][colG]=stack13.peek();}
						 if(rowG==3&&colG==1) {stack14.pop(); grid[rowG][colG]=stack14.peek();}
						 if(rowG==3&&colG==2) {stack15.pop(); grid[rowG][colG]=stack15.peek();}
						 if(rowG==3&&colG==3) {stack16.pop(); grid[rowG][colG]=stack16.peek();}
						    printboard(grid);
						    System.out.println(" ");
						    break;
			      }
	        //Checking if Blue player has won the game
		    ChecksForBlueWin(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12,
					         stack13, stack14, stack15, stack16,grid,stackB1, stackB2, stackB3,stackG1, stackG2, stackG3);			 
		    
		    printboard(grid);
		    System.out.println(" ");
		    //Checking if Green player has won 
		    ChecksForGreenWin(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12,
	                  stack13, stack14, stack15, stack16,grid,stackB1, stackB2, stackB3,stackG1, stackG2, stackG3);
		    //Checking if the game is ending in a draw
		    CheckForDraw(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12,
					     stack13, stack14, stack15, stack16, grid, stackB1, stackB2, stackB3, stackG1, stackG2, stackG3);break;}
	      //Green player moves pieces on the board
	     if( inputInt==4) {
			int s=in.readInt();
			int r=in.readInt();
			s=s-1;
			r=r-1;
			if((rowG==s)&&(colG==r)&&(grid[rowG][colG]=="__")) { 
				System.out.println(" ");
				System.out.println("Invalid Move!");
				}else{
				rearrangingG(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
						     stack12, stack13, stack14, stack15, stack16, grid, rowG, colG, s, r);
				System.out.println(" ");
		 	    printboard(grid);
		 	    ChecksForBlueWin(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12,
						         stack13, stack14, stack15, stack16,grid,stackB1, stackB2, stackB3,stackG1, stackG2, stackG3);
		 	     CheckForDraw(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12,
		 				      stack13, stack14, stack15, stack16, grid, stackB1, stackB2, stackB3, stackG1, stackG2, stackG3);
				System.out.println(" ");  
				}}
	        //Checking if the input file is now empty
			    if(in.isEmpty()){
			    	System.out.println("No winner, input file has ended");
			    	Blueplayerexternalstacks(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12,
							                 stack13, stack14, stack15, stack16,grid,stackB1, stackB2, stackB3);
			    	Greenplayerexternalstacks(stackG1, stackG2, stackG3);
			    	System.exit(0);}
			       //Checking if Green player has won
	                ChecksForGreenWin(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12,
					                  stack13, stack14, stack15, stack16,grid,stackB1, stackB2, stackB3,stackG1, stackG2, stackG3);	
	         //Checking if the input file is now empty
	           if(in.isEmpty()){
		    	System.out.println(" ");
		    	System.out.println("No winner, input file has ended");
		    	Blueplayerexternalstacks(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12,
						                 stack13, stack14, stack15, stack16,grid,stackB1, stackB2, stackB3);
		    	Greenplayerexternalstacks(stackG1, stackG2, stackG3);
		        System.exit(0);}}}

          System.exit(0);}}



	private static void invalidmoveblue(int someWidth, int someHeight, Font font3, Font font4, Font font5,
			String[][] externalstacksB, int bl1, int bl2, int bl3) {
		StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
      		  StdDraw.filledRectangle(someWidth/2, someHeight/2, someWidth, someHeight);
      		  StdDraw.setPenColor(StdDraw.BLACK);
      		  StdDraw.setFont(font3);
      		  StdDraw.text(someWidth/2, someHeight/1.1, "Invalid move");       	  
      		  StdDraw.setFont(font5);
      		  StdDraw.text(someWidth/2.5, someHeight/1.2, "A");
      		  StdDraw.picture(someWidth/2.5, someHeight/1.3, externalstacksB[0][bl1], 60, 60);
      		  StdDraw.setPenColor(StdDraw.BLACK);
      		  StdDraw.text(someWidth/1.5, someHeight/1.2, "B");
      		  StdDraw.setPenRadius(0.005);
      		  StdDraw.picture(someWidth/1.5, someHeight/1.3,  externalstacksB[1][bl2], 60, 60);
      		  StdDraw.setPenColor(StdDraw.BLACK);
      		  StdDraw.text(someWidth/1.1, someHeight/1.2, "C");
      		  StdDraw.setPenRadius(0.005);
      		  StdDraw.picture(someWidth/1.1, someHeight/1.3,  externalstacksB[2][bl3], 60, 60);
      		  StdDraw.setFont(font4);
      		  StdDraw.text(someWidth/5.1, someHeight/1.3, "Stacks:");
      		  StdDraw.setFont(font5);
      		  StdDraw.text(someWidth/1.2, someHeight/1.45, "p");
      		  StdDraw.text(someWidth/1.65, someHeight/1.45, "r");
      		  StdDraw.text(someWidth/2.6, someHeight/1.45, "b");
      		  StdDraw.text(someWidth/6.19, someHeight/1.45, "t");       	  
      		  StdDraw.filledRectangle(someWidth/2.005, someHeight/1.798, 133.7, 65);
      		  StdDraw.picture(someWidth/5.7957, someHeight/1.64, "Transporter.jpg", 63, 60);
      		  StdDraw.picture(someWidth/5.7957, someHeight/1.98, "Transporter.jpg", 63, 60);
      		  StdDraw.picture(someWidth/2.56, someHeight/1.64, "Bomp.jpg", 63, 60);
      		  StdDraw.picture(someWidth/2.56, someHeight/1.98, "Bomp.jpg", 63, 60);
      		  StdDraw.picture(someWidth/1.64, someHeight/1.64, "Shifter.jpg", 63, 60);
      		  StdDraw.picture(someWidth/1.64, someHeight/1.98, "Shifter.jpg", 63, 60);
      		  StdDraw.picture(someWidth/1.21, someHeight/1.64, "Paint brush.jpg", 63, 60);
      		  StdDraw.picture(someWidth/1.21, someHeight/1.98, "Paint brush.jpg", 63, 60);
      		  StdDraw.setPenRadius(0.020);
      		  StdDraw.rectangle(someWidth/2,someHeight/4.72 , 148, 124);
      		  StdDraw.setPenRadius(0.005);
      		  StdDraw.line(75,someHeight/2.35, 75, someHeight/60);
      		  StdDraw.line(someWidth/2,someHeight/2.35, someWidth/2, someHeight/60);
      		  StdDraw.line(225,someHeight/2.35,225, someHeight/60);
      		  StdDraw.line(someWidth/38,186, someWidth/1, 186);
      		  StdDraw.line(someWidth/38,124.66, someWidth/1, 124.66);
      		  StdDraw.line(someWidth/38,63.32, someWidth/1, 63.32);
      		  StdDraw.show(1000);
	}



	private static void whatisontheboard(String[][] externalstacksB, String[][] externalstacksG,int c,int d, int a, int b, int e,
			int f, double j1, double k1, double j2, double k2, double j3, double k3, double j4, double k4, double Gj1,
			double Gk1, double Gj2, double Gk2, double Gj3, double Gk3, double Gj4, double Gk4, double n1, double m1,
			double n2, double m2, double n3, double m3, double n4, double m4, double Gn1, double Gm1, double Gn2,
			double Gm2, double Gn3, double Gm3, double Gn4, double Gm4, double l1, double v1, double l2, double v2,
			double l3, double v3, double l4, double v4, double Gl1, double Gv1, double Gl2, double Gv2, double Gl3,
			double Gv3, double Gl4, double Gv4,int someWidth, int someHeight, Font font3, Font font4, Font font5,int bl1,int bl2,int bl3) {
		if((j1>0)&&(k1>0)){whatsontheboard(externalstacksB, a, j1,k1);}else
		if((j2>0)&&(k2>0)){whatsontheboard(externalstacksB, a, j2,k2);}else
		if((j3>0)&&(k3>0)){whatsontheboard(externalstacksB, a, j3,k3);}else
		if((j4>0)&&(k4>0)){whatsontheboard(externalstacksB, a, j4,k4);}else
		if((Gj1>0)&&(Gk1>0)){whatsontheboard(externalstacksG, d, Gj1,Gk1);}else
		if((Gj2>0)&&(Gk2>0)){whatsontheboard(externalstacksG, d, Gj2,Gk2);}else
		if((Gj3>0)&&(Gk3>0)){whatsontheboard(externalstacksG, d, Gj3,Gk3);}else
		if((Gj4>0)&&(Gk4>0)){whatsontheboard(externalstacksG, d, Gj4,Gk4);}else
		if((n1>0)&&(m1>0)){whatsontheboard(externalstacksB, b, n1,m1);}else
		if((n2>0)&&(m2>0)){whatsontheboard(externalstacksB, b-1, n2,m2);}else
		if((n3>0)&&(m3>0)){whatsontheboard(externalstacksB, b, n3,m3);}else
		if((n4>0)&&(m4>0)){whatsontheboard(externalstacksB, b-1, n4,m4);}else
		if((Gn1>0)&&(Gm1>0)){whatsontheboard(externalstacksB, e, Gn1,Gm1);}else
		if((Gn2>0)&&(Gm2>0)){whatsontheboard(externalstacksB, e-1, Gn2,Gm2);}else
		if((Gn3>0)&&(Gm3>0)){whatsontheboard(externalstacksB, e,Gn3,Gm3);}else
		if((Gn4>0)&&(Gm4>0)){whatsontheboard(externalstacksB, e-1, Gn4,Gm4);}else
		if((l1>0)&&(v1>0)){whatsontheboard(externalstacksB, c, l1,v1);}else
		if((l2>0)&&(v2>0)){whatsontheboard(externalstacksB, c-1, l2,v2);}else
		if((l3>0)&&(v3>0)){whatsontheboard(externalstacksB, c, l3,v3);}else
		if((l4>0)&&(v4>0)){whatsontheboard(externalstacksB, c-1, l4,v4);}else
		if((Gl1>0)&&(Gv1>0)){whatsontheboard(externalstacksB, f, Gl1,Gv1);}else
		if((Gl2>0)&&(Gv2>0)){whatsontheboard(externalstacksB, f-1, Gl2,Gv2);}else
		if((Gl3>0)&&(Gv3>0)){whatsontheboard(externalstacksB, f, Gl3,Gv3);}else
		if((Gl4>0)&&(Gv4>0)){whatsontheboard(externalstacksB, f-1, Gl4,Gv4);}
	}



	private static void whatsontheboard(String[][] externalstacksB, int a, double width1, double height1) {
		StdDraw.picture(width1, height1, externalstacksB[0][a], 50, 50);
	}



	private static void quitgamegreen(int someWidth, int someHeight, Font font3, Font font4, Font font5,
			String[][] externalstacksB, int gr1, int gr2, int gr3) {
		StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
    	  StdDraw.filledRectangle(someWidth/2, someHeight/2, someWidth, someHeight);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.setFont(font3);
    	  StdDraw.text(someWidth/2, someHeight/1.1, "Quit, draw!");       	  
    	  StdDraw.setFont(font5);
    	  StdDraw.text(someWidth/2.5, someHeight/1.2, "A");
    	  StdDraw.picture(someWidth/2.5, someHeight/1.3, externalstacksB[0][gr1], 60, 60);
    	  StdDraw.setPenColor(StdDraw.BLACK);
    	  StdDraw.text(someWidth/1.5, someHeight/1.2, "B");
    	  StdDraw.setPenRadius(0.005);
    	  StdDraw.picture(someWidth/1.5, someHeight/1.3,  externalstacksB[1][gr2], 60, 60);
    	  StdDraw.setPenColor(StdDraw.BLACK);
    	  StdDraw.text(someWidth/1.1, someHeight/1.2, "C");
    	  StdDraw.setPenRadius(0.005);
		  StdDraw.picture(someWidth/1.1, someHeight/1.3,  externalstacksB[2][gr3], 60, 60);
    	  StdDraw.setPenColor(StdDraw.BLACK);
    	  StdDraw.setFont(font4);
    	  StdDraw.text(someWidth/5.1, someHeight/1.3, "Stacks:");
    	  StdDraw.setFont(font5);
    	  StdDraw.text(someWidth/1.2, someHeight/1.45, "p");
    	  StdDraw.text(someWidth/1.65, someHeight/1.45, "r");
    	  StdDraw.text(someWidth/2.6, someHeight/1.45, "b");
    	  StdDraw.text(someWidth/6.19, someHeight/1.45, "t");       	  
    	  StdDraw.filledRectangle(someWidth/2.005, someHeight/1.798, 133.7, 65);
    	  StdDraw.picture(someWidth/5.7957, someHeight/1.64, "Transporter.jpg", 63, 60);
    	  StdDraw.picture(someWidth/5.7957, someHeight/1.98, "Transporter.jpg", 63, 60);
    	  StdDraw.picture(someWidth/2.56, someHeight/1.64, "Bomp.jpg", 63, 60);
    	  StdDraw.picture(someWidth/2.56, someHeight/1.98, "Bomp.jpg", 63, 60);
    	  StdDraw.picture(someWidth/1.64, someHeight/1.64, "Shifter.jpg", 63, 60);
    	  StdDraw.picture(someWidth/1.64, someHeight/1.98, "Shifter.jpg", 63, 60);
    	  StdDraw.picture(someWidth/1.21, someHeight/1.64, "Paint brush.jpg", 63, 60);
    	  StdDraw.picture(someWidth/1.21, someHeight/1.98, "Paint brush.jpg", 63, 60);
    	  StdDraw.setPenRadius(0.020);
    	  StdDraw.rectangle(someWidth/2,someHeight/4.72 , 148, 124);
    	  StdDraw.setPenRadius(0.005);
    	  StdDraw.line(75,someHeight/2.35, 75, someHeight/60);
		  StdDraw.line(someWidth/2,someHeight/2.35, someWidth/2, someHeight/60);
		  StdDraw.line(225,someHeight/2.35,225, someHeight/60);
		  StdDraw.line(someWidth/38,186, someWidth/1, 186);
		  StdDraw.line(someWidth/38,124.66, someWidth/1, 124.66);
		  StdDraw.line(someWidth/38,63.32, someWidth/1, 63.32);
    	  StdDraw.show(2000); 
		System.exit(0);
	}



	private static void board(int someWidth, int someHeight, Font font3, Font font4, Font font5, double width1,
			double height1, double width2, double height2) {
		StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
   		  StdDraw.filledRectangle(someWidth/2, someHeight/2, someWidth, someHeight);
   		  StdDraw.setPenColor(StdDraw.BLACK);
   		  StdDraw.setFont(font3);
   		  StdDraw.text(someWidth/2, someHeight/1.1, "Have Fun!! :D");       	  
   		  StdDraw.setFont(font5);
   		  StdDraw.text(someWidth/2.5, someHeight/1.2, "A");
   		  StdDraw.picture(someWidth/1.5, someHeight/1.3, "B1.jpg", 60, 60);
   		  StdDraw.setPenColor(StdDraw.BLACK);
   		  StdDraw.text(someWidth/1.5, someHeight/1.2, "B");
   		  StdDraw.setPenRadius(0.005);
   		  StdDraw.picture(someWidth/1.5, someHeight/1.3, "B1.jpg", 60, 60);
   		  StdDraw.setPenColor(StdDraw.BLACK);
   		  StdDraw.text(someWidth/1.1, someHeight/1.2, "C");
   		  StdDraw.setPenRadius(0.005);
   		  StdDraw.picture(someWidth/1.1, someHeight/1.3, "B1.jpg", 60, 60);
   		  StdDraw.setFont(font4);
   		  StdDraw.text(someWidth/5.1, someHeight/1.3, "Stacks:");
   		  StdDraw.setFont(font5);
   		  StdDraw.text(someWidth/1.2, someHeight/1.45, "p");
   		  StdDraw.text(someWidth/1.65, someHeight/1.45, "r");
   		  StdDraw.text(someWidth/2.6, someHeight/1.45, "b");
   		  StdDraw.text(someWidth/6.19, someHeight/1.45, "t");       	  
   		  StdDraw.filledRectangle(someWidth/2.005, someHeight/1.798, 133.7, 65);
   		  StdDraw.picture(someWidth/5.7957, someHeight/1.64, "Transporter.jpg", 63, 60);
   		  StdDraw.picture(someWidth/5.7957, someHeight/1.98, "Transporter.jpg", 63, 60);
   		  StdDraw.picture(someWidth/2.56, someHeight/1.64, "Bomp.jpg", 63, 60);
   		  StdDraw.picture(someWidth/2.56, someHeight/1.98, "Bomp.jpg", 63, 60);
   		  StdDraw.picture(someWidth/1.64, someHeight/1.64, "Shifter.jpg", 63, 60);
   		  StdDraw.picture(someWidth/1.64, someHeight/1.98, "Shifter.jpg", 63, 60);
   		  StdDraw.picture(someWidth/1.21, someHeight/1.64, "Paint brush.jpg", 63, 60);
   		  StdDraw.picture(someWidth/1.21, someHeight/1.98, "Paint brush.jpg", 63, 60);
   		  StdDraw.setPenRadius(0.020);
   		  StdDraw.rectangle(someWidth/2,someHeight/4.72 , 148, 124);
   		  StdDraw.setPenRadius(0.005);
   		  StdDraw.line(75,someHeight/2.35, 75, someHeight/60);
   		  StdDraw.line(someWidth/2,someHeight/2.35, someWidth/2, someHeight/60);
   		  StdDraw.line(225,someHeight/2.35,225, someHeight/60);
   		  StdDraw.line(someWidth/38,186, someWidth/1, 186);
   		  StdDraw.line(someWidth/38,124.66, someWidth/1, 124.66);
   		  StdDraw.line(someWidth/38,63.32, someWidth/1, 63.32);
   		  StdDraw.show(1000);
   		 StdDraw.picture(width1, height1, "B1.jpg", 50, 50);
		  StdDraw.picture(width2, height2, "G1.jpg", 50, 50);
		  StdDraw.show(1000);
	}
	
					 	  
	
    //This is where all the extracted methods which I used for the game play above for the GUI
	private static void greenlayerboard(int someWidth, int someHeight, Font font3, Font font4, Font font5,String [][] externalstacksG,
			int gr1,int gr2,int gr3) {
		StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
		  StdDraw.filledRectangle(someWidth/2, someHeight/2, someWidth, someHeight);
		  StdDraw.setPenColor(StdDraw.BLACK);
		  StdDraw.setFont(font3);
		  StdDraw.text(someWidth/2, someHeight/1.1, "Have Fun!! :D");       	  
		  StdDraw.setFont(font5);
		  StdDraw.text(someWidth/2.5, someHeight/1.2, "A");
		  StdDraw.picture(someWidth/2.5, someHeight/1.3, externalstacksG[0][gr1], 60, 60);
		  StdDraw.setPenColor(StdDraw.BLACK);		  
		  StdDraw.text(someWidth/1.5, someHeight/1.2, "B");
		  StdDraw.setPenRadius(0.005);
		  StdDraw.picture(someWidth/1.5, someHeight/1.3, externalstacksG[1][gr2], 60, 60);
		  StdDraw.text(someWidth/1.1, someHeight/1.2, "C");
		  StdDraw.setPenRadius(0.005);
		  StdDraw.picture(someWidth/1.1, someHeight/1.3,externalstacksG[2][gr3], 60, 60);
		  StdDraw.setPenColor(StdDraw.BLACK);
		  StdDraw.setFont(font4);
		  StdDraw.text(someWidth/5.1, someHeight/1.3, "Stacks:");
		  StdDraw.setFont(font5);
		  StdDraw.text(someWidth/1.2, someHeight/1.45, "p");
		  StdDraw.text(someWidth/1.65, someHeight/1.45, "r");
		  StdDraw.text(someWidth/2.6, someHeight/1.45, "b");
		  StdDraw.text(someWidth/6.19, someHeight/1.45, "t");       	  
		  StdDraw.filledRectangle(someWidth/2.005, someHeight/1.798, 133.7, 65);
		  StdDraw.picture(someWidth/5.7957, someHeight/1.64, "Transporter.jpg", 63, 60);
		  StdDraw.picture(someWidth/5.7957, someHeight/1.98, "Transporter.jpg", 63, 60);
		  StdDraw.picture(someWidth/2.56, someHeight/1.64, "Bomp.jpg", 63, 60);
		  StdDraw.picture(someWidth/2.56, someHeight/1.98, "Bomp.jpg", 63, 60);
		  StdDraw.picture(someWidth/1.64, someHeight/1.64, "Shifter.jpg", 63, 60);
		  StdDraw.picture(someWidth/1.64, someHeight/1.98, "Shifter.jpg", 63, 60);
		  StdDraw.picture(someWidth/1.21, someHeight/1.64, "Paint brush.jpg", 63, 60);
		  StdDraw.picture(someWidth/1.21, someHeight/1.98, "Paint brush.jpg", 63, 60);
		  StdDraw.setPenRadius(0.020);
		  StdDraw.rectangle(someWidth/2,someHeight/4.72 , 148, 124);
		  StdDraw.setPenRadius(0.005);
		  StdDraw.line(75,someHeight/2.35, 75, someHeight/60);
		  StdDraw.line(someWidth/2,someHeight/2.35, someWidth/2, someHeight/60);
		  StdDraw.line(225,someHeight/2.35,225, someHeight/60);
		  StdDraw.line(someWidth/38,186, someWidth/1, 186);
		  StdDraw.line(someWidth/38,124.66, someWidth/1, 124.66);
		  StdDraw.line(someWidth/38,63.32, someWidth/1, 63.32);
		  StdDraw.show(1000);
	}
	private static double navigateforleftright(char input, double width1) {
		if(input=='d') {
		if((width1>=37.5)&&(width1<262.5)) {
		  width1=width1+75;
		  return width1;
		 }else {return width1;}}
   		else if(input=='a') {
   		if((width1>37.5)&&(width1<=262.5)) {
		  width1=width1-75;
		  return width1;
   			}else {return width1;}
		}
		return width1;
	}
	private static double navigateforupdown(char input, double width1, double height1) {
		if(input=='w') { 
			if((height1<=156)){
				height1=height1+61;
				   return height1;
			}else {
				return height1;
			}
			   
		}
		else if(input== 's') {
			if(height1>34) {
			  height1=height1-61;
			  return height1;
			}else {return height1;}
		}
		return height1;
		
	}
	public static void Blueplayerboard(int someWidth, int someHeight, Font font3, Font font4, Font font5,String[][]externalstacksB,
			int bl1,int bl2,int bl3) {
		StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
		  StdDraw.filledRectangle(someWidth/2, someHeight/2, someWidth, someHeight);
		  StdDraw.setPenColor(StdDraw.BLACK);
		  StdDraw.setFont(font3);
		  StdDraw.text(someWidth/2, someHeight/1.1, "Have Fun!! :D");       	  
		  StdDraw.setFont(font5);
		  StdDraw.text(someWidth/2.5, someHeight/1.2, "A");
		  StdDraw.picture(someWidth/2.5, someHeight/1.3, externalstacksB[0][bl1], 60, 60);
		  StdDraw.setPenColor(StdDraw.BLACK);
		  StdDraw.text(someWidth/1.5, someHeight/1.2, "B");
		  StdDraw.setPenRadius(0.005);
		  StdDraw.picture(someWidth/1.5, someHeight/1.3,  externalstacksB[1][bl2], 60, 60);
		  StdDraw.setPenColor(StdDraw.BLACK);
		  StdDraw.text(someWidth/1.1, someHeight/1.2, "C");
		  StdDraw.setPenRadius(0.005);
		  StdDraw.picture(someWidth/1.1, someHeight/1.3,  externalstacksB[2][bl3], 60, 60);
		  StdDraw.setFont(font4);
		  StdDraw.text(someWidth/5.1, someHeight/1.3, "Stacks:");
		  StdDraw.setFont(font5);
		  StdDraw.text(someWidth/1.2, someHeight/1.45, "p");
		  StdDraw.text(someWidth/1.65, someHeight/1.45, "r");
		  StdDraw.text(someWidth/2.6, someHeight/1.45, "b");
		  StdDraw.text(someWidth/6.19, someHeight/1.45, "t");       	  
		  StdDraw.filledRectangle(someWidth/2.005, someHeight/1.798, 133.7, 65);
		  StdDraw.picture(someWidth/5.7957, someHeight/1.64, "Transporter.jpg", 63, 60);
		  StdDraw.picture(someWidth/5.7957, someHeight/1.98, "Transporter.jpg", 63, 60);
		  StdDraw.picture(someWidth/2.56, someHeight/1.64, "Bomp.jpg", 63, 60);
		  StdDraw.picture(someWidth/2.56, someHeight/1.98, "Bomp.jpg", 63, 60);
		  StdDraw.picture(someWidth/1.64, someHeight/1.64, "Shifter.jpg", 63, 60);
		  StdDraw.picture(someWidth/1.64, someHeight/1.98, "Shifter.jpg", 63, 60);
		  StdDraw.picture(someWidth/1.21, someHeight/1.64, "Paint brush.jpg", 63, 60);
		  StdDraw.picture(someWidth/1.21, someHeight/1.98, "Paint brush.jpg", 63, 60);
		  StdDraw.setPenRadius(0.020);
		  StdDraw.rectangle(someWidth/2,someHeight/4.72 , 148, 124);
		  StdDraw.setPenRadius(0.005);
		  StdDraw.line(75,someHeight/2.35, 75, someHeight/60);
		  StdDraw.line(someWidth/2,someHeight/2.35, someWidth/2, someHeight/60);
		  StdDraw.line(225,someHeight/2.35,225, someHeight/60);
		  StdDraw.line(someWidth/38,186, someWidth/1, 186);
		  StdDraw.line(someWidth/38,124.66, someWidth/1, 124.66);
		  StdDraw.line(someWidth/38,63.32, someWidth/1, 63.32);
		  StdDraw.show(1000);
	}
	public static void quitgameGUI(int someWidth, int someHeight, Font font3, Font font4, Font font5 ,String[][]externalstacksB,
			int bl1,int bl2,int bl3) {
		quitgamegreen(someWidth, someHeight, font3, font4, font5, externalstacksB, bl1, bl2, bl3);
	}

	private static void paint(Stack<String> stack1, Stack<String> stack2, Stack<String> stack3, Stack<String> stack4,
			Stack<String> stack5, Stack<String> stack6, Stack<String> stack7, Stack<String> stack8,
			Stack<String> stack9, Stack<String> stack10, Stack<String> stack11, Stack<String> stack12,
			Stack<String> stack13, Stack<String> stack14, Stack<String> stack15, Stack<String> stack16, int Prow,
			int Pcol) {
		if(Prow==0&&Pcol==0) {String greypiece=stack1.pop();
		 stack1.add("GR");
		 }else if(Prow==0&&Pcol==1) {String greypiece=stack2.pop();
		 stack2.add("GR");
		 }else if(Prow==0&&Pcol==2) {String greypiece=stack3.pop();
		 stack3.add("GR");
		 }else if(Prow==0&&Pcol==3) {String greypiece=stack4.pop();
		 stack4.add("GR");
		 }else if(Prow==1&&Pcol==0) {String greypiece=stack5.pop();
		 stack5.add("GR");
		 }else if(Prow==1&&Pcol==1) {String greypiece=stack6.pop();
		 stack6.add("GR");
		 }else if(Prow==1&&Pcol==2) {String greypiece=stack7.pop();
		 stack7.add("GR");
		 }else if(Prow==1&&Pcol==3) {String greypiece=stack8.pop();
		 stack8.add("GR");
		 }else if(Prow==2&&Pcol==0) {String greypiece=stack9.pop();
		 stack9.add("GR");
		 }else if(Prow==2&&Pcol==1) {String greypiece=stack10.pop();
		 stack10.add("GR");
		 }else if(Prow==2&&Pcol==2) {String greypiece=stack11.pop();
		 stack11.add("GR");
		 }else if(Prow==2&&Pcol==3) {String greypiece=stack12.pop();
		 stack12.add("GR");
		 }else if(Prow==3&&Pcol==0) {String greypiece=stack13.pop();
		 stack13.add("GR");
		 }else if(Prow==3&&Pcol==1) {String greypiece=stack14.pop();
		 stack14.add("GR");
		 }else if(Prow==3&&Pcol==2) {String greypiece=stack15.pop();
		 stack15.add("GR");
		 }else if(Prow==3&&Pcol==3) {String greypiece=stack16.pop();
		 stack16.add("GR");
		 }else {System.out.println("Invalid move");}
	}
	
	//This where all the extracted methods which I used in the game play above of the text mode 
	private static void bomb(Stack<String> stack1, Stack<String> stack2, Stack<String> stack3, Stack<String> stack4,
			Stack<String> stack5, Stack<String> stack6, Stack<String> stack7, Stack<String> stack8,
			Stack<String> stack9, Stack<String> stack10, Stack<String> stack11, Stack<String> stack12,
	 		Stack<String> stack13, Stack<String> stack14, Stack<String> stack15, Stack<String> stack16,Stack<String> stackB1, 
			Stack<String> stackB2, Stack<String> stackB3 ,Stack<String> stackG1, Stack<String> stackG2,
			Stack<String> stackG3,int Orow,int Ocol) {
		if(Orow==0&&Ocol==0) {String b1=stack1.pop();
		          puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b1);
		           if(stack2.peek()!="__"){String b2=stack2.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b2);}else {stack2.add("SH");}		           
		           if(stack4.peek()!="__") {String b3=stack4.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b3);}else{stack4.add("SH");}
		           if(stack5.peek()!="__") {String b4=stack5.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b4);}else{stack5.add("SH");}
		           if(stack6.peek()!="__") {String b5=stack6.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b5);}else{stack6.add("SH");}		           
		           if(stack8.peek()!="__") {String b6=stack8.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b6);}else{stack8.add("SH");}
		           if(stack9.peek()!="__") {String b7=stack9.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b7);}else{stack9.add("SH");}
		           if(stack10.peek()!="__") {String b8=stack10.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b8);}else{stack10.add("SH");}		           
		           if(stack12.peek()!="__") {String b9=stack12.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b9);}else{stack12.add("SH");}
		  }
		 if(Orow==0&&Ocol==1) {String b1=stack2.pop();
		 puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b1);
		   if(stack1.peek()!="__"){String b2=stack1.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b2);}else {stack1.add("SH");}
		   if(stack3.peek()!="__") {String b3=stack3.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b3);}else{stack3.add("SH");}		 
		   if(stack5.peek()!="__") {String b4=stack5.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b4);}else{stack5.add("SH");}
		   if(stack6.peek()!="__") {String b5=stack6.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b5);}else{stack6.add("SH");}
		   if(stack7.peek()!="__") {String b6=stack7.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b6);}else{stack7.add("SH");}		 
		   if(stack9.peek()!="__") {String b7=stack9.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b7);}else{stack9.add("SH");}
		   if(stack10.peek()!="__") {String b8=stack10.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b8);}else{stack10.add("SH");}
		   if(stack11.peek()!="__") {String b9=stack11.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b9);}else{stack11.add("SH");}}
		 if(Orow==0&&Ocol==2) {String b1=stack3.pop();
		 puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b1);
		   if(stack2.peek()!="__"){String b2=stack2.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b2);}else {stack2.add("SH");}
		   if(stack4.peek()!="__") {String b3=stack4.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b3);}else{stack4.add("SH");}
		   if(stack6.peek()!="__") {String b4=stack6.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b4);}else{stack6.add("SH");}
		   if(stack7.peek()!="__") {String b5=stack7.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b5);}else{stack7.add("SH");} 
		   if(stack8.peek()!="__") {String b6=stack8.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b6);}else{stack8.add("SH");}
		   if(stack10.peek()!="__") {String b7=stack10.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b7);}else{stack10.add("SH");}
		   if(stack11.peek()!="__") {String b8=stack11.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b8);}else{stack11.add("SH");}
		   if(stack12.peek()!="__") {String b9=stack12.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b9);}else{stack12.add("SH");}}
		 if(Orow==0&&Ocol==3) {String b1=stack4.pop();
		 puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b1);
		   if(stack3.peek()!="__") {String b2=stack3.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b2);}else{stack3.add("SH");}
		   if(stack1.peek()!="__") {String b3=stack1.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b3);}else{stack1.add("SH");}
		   if(stack5.peek()!="__") {String b4=stack5.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b4);}else{stack5.add("SH");}
		   if(stack7.peek()!="__") {String b5=stack7.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b5);}else{stack7.add("SH");}
		   if(stack8.peek()!="__") {String b6=stack8.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b6);}else{stack8.add("SH");}
		   if(stack9.peek()!="__") {String b7=stack9.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b7);}else{stack9.add("SH");}
		   if(stack11.peek()!="__") {String b8=stack11.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b8);}else{stack11.add("SH");}
		   if(stack12.peek()!="__") {String b9=stack12.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b9);}else{stack12.add("SH");}}
		 if(Orow==1&&Ocol==0) {String b1=stack5.pop();
		 puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b1);
		   if(stack2.peek()!="__"){String b2=stack2.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b2);}else {stack2.add("SH");}
		   if(stack4.peek()!="__") {String b3=stack4.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b3);}else{stack4.add("SH");}
		   if(stack1.peek()!="__") {String b4=stack1.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b4);}else{stack1.add("SH");}
		   if(stack6.peek()!="__") {String b5=stack6.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b5);}else{stack6.add("SH");}
		   if(stack8.peek()!="__") {String b6=stack8.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b6);}else{stack8.add("SH");}
		   if(stack9.peek()!="__") {String b7=stack9.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b7);}else{stack9.add("SH");}
		   if(stack10.peek()!="__") {String b8=stack10.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b8);}else{stack10.add("SH");}
		   if(stack12.peek()!="__") {String b9=stack12.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b9);}else{stack12.add("SH");}}
		 if(Orow==1&&Ocol==1) {String b1=stack6.pop();
		 puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b1);
		   if(stack2.peek()!="__"){String b2=stack2.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b2);}else {stack2.add("SH");}
		   if(stack3.peek()!="__") {String b3=stack3.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b3);}else{stack3.add("SH");}
		   if(stack5.peek()!="__") {String b4=stack5.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b4);}else{stack5.add("SH");}
		   if(stack1.peek()!="__") {String b5=stack1.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b5);}else{stack1.add("SH");}
		   if(stack7.peek()!="__") {String b6=stack7.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b6);}else{stack7.add("SH");}
		   if(stack9.peek()!="__") {String b7=stack9.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b7);}else{stack9.add("SH");}
		   if(stack10.peek()!="__") {String b8=stack10.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b8);}else{stack10.add("SH");}
		   if(stack11.peek()!="__") {String b9=stack11.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b9);}else{stack11.add("SH");}}
		 if(Orow==1&&Ocol==2) {String b1=stack7.pop();
		 puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b1);
		   if(stack2.peek()!="__"){String b2=stack2.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b2);}else {stack2.add("SH");}
		   if(stack3.peek()!="__") {String b3=stack3.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b3);}else{stack3.add("SH");}
		   if(stack4.peek()!="__") {String b4=stack4.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b4);}else{stack4.add("SH");}
		   if(stack6.peek()!="__") {String b5=stack6.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b5);}else{stack6.add("SH");}
		   if(stack8.peek()!="__") {String b6=stack8.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b6);}else{stack8.add("SH");}
		   if(stack10.peek()!="__") {String b7=stack10.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b7);}else{stack10.add("SH");}
		   if(stack11.peek()!="__") {String b8=stack11.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b8);}else{stack11.add("SH");}
		   if(stack12.peek()!="__") {String b9=stack12.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b9);}else{stack12.add("SH");}}
		 if(Orow==1&&Ocol==3) {String b1=stack8.pop();
		 puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b1);
		   if(stack3.peek()!="__") {String b2=stack3.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b2);}else{stack3.add("SH");}
		   if(stack4.peek()!="__") {String b3=stack4.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b3);}else{stack4.add("SH");}
		   if(stack5.peek()!="__") {String b4=stack5.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b4);}else{stack5.add("SH");}
		   if(stack7.peek()!="__") {String b5=stack7.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b5);}else{stack7.add("SH");}
		   if(stack1.peek()!="__") {String b6=stack1.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b6);}else{stack1.add("SH");}
		   if(stack9.peek()!="__") {String b7=stack9.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b7);}else{stack9.add("SH");}
		   if(stack11.peek()!="__") {String b8=stack11.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b8);}else{stack11.add("SH");}
		   if(stack12.peek()!="__") {String b9=stack12.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b9);}else{stack12.add("SH");}}
		 if(Orow==2&&Ocol==0) {String b1=stack9.pop();
		 puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b1);
		   if(stack2.peek()!="__"){String b2=stack2.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b2);}else {stack2.add("SH");}
		   if(stack4.peek()!="__") {String b3=stack4.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b3);}else{stack4.add("SH");}
		   if(stack5.peek()!="__") {String b4=stack5.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b4);}else{stack5.add("SH");}
		   if(stack6.peek()!="__") {String b5=stack6.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b5);}else{stack6.add("SH");}
		   if(stack8.peek()!="__") {String b6=stack8.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b6);}else{stack8.add("SH");}
		   if(stack1.peek()!="__") {String b7=stack1.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b7);}else{stack1.add("SH");}
		   if(stack10.peek()!="__") {String b8=stack10.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b8);}else{stack10.add("SH");}
		   if(stack12.peek()!="__") {String b9=stack12.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b9);}else{stack12.add("SH");}}
		 if(Orow==2&&Ocol==1) {String b1=stack10.pop();
		 puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b1);
		   if(stack14.peek()!="__"){String b2=stack14.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b2);}else {stack14.add("SH");}
		   if(stack13.peek()!="__") {String b3=stack13.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b3);}else{stack13.add("SH");}
		   if(stack15.peek()!="__") {String b4=stack15.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b4);}else{stack15.add("SH");}
		   if(stack6.peek()!="__") {String b5=stack6.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b5);}else{stack6.add("SH");}
		   if(stack7.peek()!="__") {String b6=stack7.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b6);}else{stack7.add("SH");}
		   if(stack9.peek()!="__") {String b7=stack9.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b7);}else{stack9.add("SH");}
		   if(stack1.peek()!="__") {String b8=stack1.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b8);}else{stack1.add("SH");}
		   if(stack11.peek()!="__") {String b9=stack11.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b9);}else{stack11.add("SH");}}
		 if(Orow==2&&Ocol==2) {String b1=stack11.pop();
		 puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b1);
		   if(stack15.peek()!="__"){String b2=stack15.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b2);}else {stack15.add("SH");}
		   if(stack16.peek()!="__") {String b3=stack16.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b3);}else{stack16.add("SH");}
		   if(stack14.peek()!="__") {String b4=stack14.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b4);}else{stack14.add("SH");}
		   if(stack6.peek()!="__") {String b5=stack6.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b5);}else{stack6.add("SH");}
		   if(stack7.peek()!="__") {String b6=stack7.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b6);}else{stack7.add("SH");}
		   if(stack8.peek()!="__") {String b7=stack8.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b7);}else{stack8.add("SH");}
		   if(stack10.peek()!="__") {String b8=stack10.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b8);}else{stack10.add("SH");}
		   if(stack12.peek()!="__") {String b9=stack12.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b9);}else{stack12.add("SH");}}
		 if(Orow==2&&Ocol==3) {String b1=stack12.pop();
		 puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b1);
		   if(stack16.peek()!="__") {String b2=stack16.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b2);}else{stack16.add("SH");}
		   if(stack15.peek()!="__") {String b3=stack15.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b3);}else{stack15.add("SH");}
		   if(stack13.peek()!="__") {String b4=stack13.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b4);}else{stack13.add("SH");}
		   if(stack7.peek()!="__") {String b5=stack7.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b5);}else{stack7.add("SH");}
		   if(stack8.peek()!="__") {String b6=stack8.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b6);}else{stack8.add("SH");}
		   if(stack9.peek()!="__") {String b7=stack9.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b7);}else{stack9.add("SH");}
		   if(stack11.peek()!="__") {String b8=stack11.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b8);}else{stack11.add("SH");}
		   if(stack5.peek()!="__") {String b9=stack5.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b9);}else{stack5.add("SH");}}
		 if(Orow==3&&Ocol==0) {String b1=stack13.pop();
		 puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b1);
		   if(stack14.peek()!="__"){String b2=stack14.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b2);}else {stack14.add("SH");}
		   if(stack16.peek()!="__") {String b3=stack16.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b3);}else{stack16.add("SH");}
		   if(stack5.peek()!="__") {String b4=stack5.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b4);}else{stack5.add("SH");}
		   if(stack6.peek()!="__") {String b5=stack6.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b5);}else{stack6.add("SH");}
		   if(stack8.peek()!="__") {String b6=stack8.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b6);}else{stack8.add("SH");}
		   if(stack9.peek()!="__") {String b7=stack9.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b7);}else{stack9.add("SH");}
		   if(stack10.peek()!="__") {String b8=stack10.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b8);}else{stack10.add("SH");}
		   if(stack12.peek()!="__") {String b9=stack12.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b9);}else{stack12.add("SH");}}
		 if(Orow==3&&Ocol==1) {String b1=stack14.pop();
		   if(stack13.peek()!="__"){String b2=stack13.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b2);}else {stack13.add("SH");}
		   if(stack15.peek()!="__") {String b3=stack15.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b3);}else{stack15.add("SH");}
		   if(stack5.peek()!="__") {String b4=stack5.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b4);}else{stack5.add("SH");}
		   if(stack6.peek()!="__") {String b5=stack6.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b5);}else{stack6.add("SH");}
		   if(stack7.peek()!="__") {String b6=stack7.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b6);}else{stack7.add("SH");}
		   if(stack9.peek()!="__") {String b7=stack9.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b7);}else{stack9.add("SH");}
		   if(stack10.peek()!="__") {String b8=stack10.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b8);}else{stack10.add("SH");}
		   if(stack11.peek()!="__") {String b9=stack11.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b9);}else{stack11.add("SH");}}
		 if(Orow==3&&Ocol==2) {String b1=stack15.pop();
		 puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b1);
		   if(stack14.peek()!="__"){String b2=stack14.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b2);}else {stack14.add("SH");}
		   if(stack16.peek()!="__") {String b3=stack16.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b3);}else{stack16.add("SH");} 
		   if(stack6.peek()!="__") {String b4=stack6.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b4);}else{stack6.add("SH");}
		   if(stack7.peek()!="__") {String b5=stack7.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b5);}else{stack7.add("SH");}
		   if(stack8.peek()!="__") {String b6=stack8.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b6);}else{stack8.add("SH");}
		   if(stack10.peek()!="__") {String b7=stack10.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b7);}else{stack10.add("SH");}
		   if(stack11.peek()!="__") {String b8=stack11.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b8);}else{stack11.add("SH");}
		   if(stack12.peek()!="__") {String b9=stack12.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b9);}else{stack12.add("SH");}}
		 if(Orow==3&&Ocol==3) {String b1=stack16.pop();
		 puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b1);
		   if(stack15.peek()!="__") {String b2=stack15.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b2);}else{stack15.add("SH");}
		   if(stack13.peek()!="__") {String b3=stack13.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b3);}else{stack13.add("SH");}
		   if(stack5.peek()!="__") {String b4=stack5.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b4);}else{stack5.add("SH");}
		   if(stack7.peek()!="__") {String b5=stack7.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b5);}else{stack7.add("SH");}
		   if(stack8.peek()!="__") {String b6=stack8.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b6);}else{stack8.add("SH");}
		   if(stack9.peek()!="__") {String b7=stack9.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b7);}else{stack9.add("SH");}
		   if(stack11.peek()!="__") {String b8=stack11.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b8);}else{stack11.add("SH");}
		   if(stack12.peek()!="__") {String b9=stack12.pop(); puttingbackinexternalstacks(stackB1, stackB2, stackB3, stackG1, stackG2, stackG3, b9);}else{stack12.add("SH");}}
	}
	private static void puttingbackinexternalstacks(Stack<String> stackB1, Stack<String> stackB2, Stack<String> stackB3,
			Stack<String> stackG1, Stack<String> stackG2, Stack<String> stackG3, String b1) {
		if((b1=="B1")||(b1=="B2")||(b1=="B3")||(b1=="B4")){
			 int st1=stackB1.size(),st2=stackB2.size(),st3=stackB3.size();
			 if((st1<=3)) {
			 if(st1==0) {
				 stackB1.add(b1);
			 }else  if(st1==1) {
				 String pop1=stackB1.pop();
				 if((pop1=="B1")&&((b1=="B2")||(b1=="B3")||(b1=="B4"))) {
					 stackB1.add(b1);
					 stackB1.add(pop1);
				 }else
				 if((pop1=="B2")&&((b1=="B1"))){
					 stackB1.add(pop1);
					 stackB1.add(b1);
				 } else if((pop1=="B2")&&((b1=="B3")||(b1=="B4"))){					 
					 stackB1.add(b1);
					 stackB1.add(pop1);
				 }
				 else if((pop1=="B3")&&(b1=="B1")||(b1=="B2")) {
					 stackB1.add(pop1);
					 stackB1.add(b1);
				 }else  if((pop1=="B4")&&((b1=="B2")||(b1=="B3")||(b1=="B1"))) {
					 stackB1.add(pop1);
					 stackB1.add(b1);
				 }
				
			 }else  if(st1==2) {
			         String pop2=stackB1.pop();
			         String pop3=stackB1.pop();
			         if(((pop2=="B1")&&(pop3=="B2"))&&((b1=="B3")||(b1=="B4"))) {
						 stackB1.add(b1);
						 stackB1.add(pop3);
						 stackB1.add(pop2);
					 }else if(((pop2=="B1")&&(pop3=="B3"))&&((b1=="B2"))) {
							 stackB1.add(pop3);
							 stackB1.add(b1);
							 stackB1.add(pop2);							 
						 }else if(((pop2=="B1")&&(pop3=="B3"))&&((b1=="B4"))) {
							 stackB1.add(b1);
							 stackB1.add(pop3);	
							 stackB1.add(pop2);
						 } else if(((pop2=="B1")&&(pop3=="B4"))&&((b1=="B2")||(b1=="B3"))) {
							 stackB1.add(pop3);
							 stackB1.add(b1);
							 stackB1.add(pop2);
						 }
					else  if(((pop2=="B2")&&(pop3=="B3"))&&((b1=="B1"))) {
						 stackB1.add(pop3);
						 stackB1.add(pop2);
						 stackB1.add(b1);
					 }else  if(((pop2=="B2")&&(pop3=="B3"))&&((b1=="B4"))) {
						 stackB1.add(b1);
						 stackB1.add(pop3);
						 stackB1.add(pop2);
					 }else  if(((pop2=="B3")&&(pop3=="B4"))&&((b1=="B2")||(b1=="B1"))) {
						 stackB1.add(pop3);
						 stackB1.add(pop2);
						 stackB1.add(b1);
					 }
			 }else  if(st1==3) {
		         String pop4=stackB1.pop();
		         String pop5=stackB1.pop();
		         String pop6=stackB1.pop();
		         if(((pop4=="B1")&&(pop5=="B2")&&(pop6=="B3"))&&(b1=="B4")) {
		        	 stackB1.add(b1);
					 stackB1.add(pop6);
					 stackB1.add(pop5);
					 stackB1.add(pop4);
				 }else if(((pop4=="B2")&&(pop5=="B3")&&(pop6=="B4"))&&(b1=="B1")) {
					 stackB1.add(pop6);
					 stackB1.add(pop5);
					 stackB1.add(pop4);
		        	 stackB1.add(b1);
				 }else if(((pop4=="B1")&&(pop5=="B2")&&(pop6=="B4"))&&(b1=="B3")) {
					 stackB3.add(pop6);
		        	 stackB3.add(b1);
					 stackB3.add(pop5);
					 stackB3.add(pop4);
				 }
		 }} else if((st2<=3)) {
			 if(st2==0) {
				 stackB2.add(b1);
			 }else  if(st2==1) {
				 String pop1=stackB2.pop();
				 if((pop1=="B1")&&((b1=="B2")||(b1=="B3")||(b1=="B4"))) {
					 stackB2.add(b1);
					 stackB2.add(pop1);
				 }else
				 if((pop1=="B2")&&((b1=="B1"))){
					 stackB2.add(pop1);
					 stackB2.add(b1);
				 } else if((pop1=="B2")&&((b1=="B3")||(b1=="B4"))){					 
					 stackB2.add(b1);
					 stackB2.add(pop1);
				 }
				 else if((pop1=="B3")&&(b1=="B1")||(b1=="B2")) {
					 stackB2.add(pop1);
					 stackB2.add(b1);
				 }else  if((pop1=="B4")&&((b1=="B2")||(b1=="B3")||(b1=="B1"))) {
					 stackB2.add(pop1);
					 stackB2.add(b1);
				 }
				
			 }else  if(st2==2) {
			         String pop2=stackB2.pop();
			         String pop3=stackB2.pop();
			         if(((pop2=="B1")&&(pop3=="B2"))&&((b1=="B3")||(b1=="B4"))) {
						 stackB2.add(b1);
						 stackB2.add(pop3);
						 stackB2.add(pop2);
					 }else if(((pop2=="B1")&&(pop3=="B3"))&&((b1=="B2"))) {
							 stackB2.add(pop3);
							 stackB2.add(b1);
							 stackB2.add(pop2);							 
						 }else if(((pop2=="B1")&&(pop3=="B3"))&&((b1=="B4"))) {
							 stackB2.add(b1);
							 stackB2.add(pop3);	
							 stackB2.add(pop2);
						 } else if(((pop2=="B1")&&(pop3=="B4"))&&((b1=="B2")||(b1=="B3"))) {
							 stackB2.add(pop3);
							 stackB2.add(b1);
							 stackB2.add(pop2);
						 }
					else  if(((pop2=="B2")&&(pop3=="B3"))&&((b1=="B1"))) {
						 stackB2.add(pop3);
						 stackB2.add(pop2);
						 stackB2.add(b1);
					 }else  if(((pop2=="B2")&&(pop3=="B3"))&&((b1=="B4"))) {
						 stackB2.add(b1);
						 stackB2.add(pop3);
						 stackB2.add(pop2);
					 }else  if(((pop2=="B3")&&(pop3=="B4"))&&((b1=="B2")||(b1=="B1"))) {
						 stackB2.add(pop3);
						 stackB2.add(pop2);
						 stackB2.add(b1);
					 }
			 }else  if(st2==3) {
		         String pop4=stackB2.pop();
		         String pop5=stackB2.pop();
		         String pop6=stackB2.pop();
		         if(((pop4=="B1")&&(pop5=="B2")&&(pop6=="B3"))&&(b1=="B4")) {
		        	 stackB2.add(b1);
					 stackB2.add(pop6);
					 stackB2.add(pop5);
					 stackB2.add(pop4);
				 }else if(((pop4=="B2")&&(pop5=="B3")&&(pop6=="B4"))&&(b1=="B1")) {
					 stackB2.add(pop6);
		        	 stackB2.add(pop5);
					 stackB2.add(pop4);
					 stackB2.add(b1);
				 }else if(((pop4=="B1")&&(pop5=="B2")&&(pop6=="B4"))&&(b1=="B3")) {
					 stackB3.add(pop6);
		        	 stackB3.add(b1);
					 stackB3.add(pop5);
					 stackB3.add(pop4);
				 }
		 }}else if((st3<=3)) {
			 if(st3==0) {
				 stackB3.add(b1);
			 }else  if(st3==1) {
				 String pop1=stackB3.pop();
				 if((pop1=="B1")&&((b1=="B2")||(b1=="B3")||(b1=="B4"))) {
					 stackB3.add(b1);
					 stackB3.add(pop1);
				 }else
				 if((pop1=="B2")&&((b1=="B1"))){
					 stackB3.add(b1);
					 stackB3.add(pop1);
				 } else if((pop1=="B2")&&((b1=="B3")||(b1=="B4"))){					 
					 stackB3.add(b1);
					 stackB3.add(pop1);
				 }
				 else if((pop1=="B3")&&(b1=="B1")||(b1=="B2")) {
					 stackB3.add(pop1);
					 stackB3.add(b1);
				 }else  if((pop1=="B4")&&((b1=="B2")||(b1=="B3")||(b1=="B1"))) {
					 stackB3.add(pop1);
					 stackB3.add(b1);
				 }
				
			 }else  if(st3==2) {
			         String pop2=stackB3.pop();
			         String pop3=stackB3.pop();
			         if(((pop2=="B1")&&(pop3=="B2"))&&((b1=="B3")||(b1=="B4"))) {
						 stackB3.add(b1);
						 stackB3.add(pop3);
						 stackB3.add(pop2);
					 }else if(((pop2=="B1")&&(pop3=="B3"))&&((b1=="B2"))) {
							 stackB3.add(pop3);
							 stackB3.add(b1);
							 stackB3.add(pop2);							 
						 }else if(((pop2=="B1")&&(pop3=="B3"))&&((b1=="B4"))) {
							 stackB3.add(b1);
							 stackB3.add(pop3);	
							 stackB3.add(pop2);
						 } else if(((pop2=="B1")&&(pop3=="B4"))&&((b1=="B2")||(b1=="B3"))) {
							 stackB3.add(pop3);
							 stackB3.add(b1);
							 stackB3.add(pop2);
						 }
					else  if(((pop2=="B2")&&(pop3=="B3"))&&((b1=="B1"))) {
						 stackB3.add(b1);
						 stackB3.add(pop2);
						 stackB3.add(pop3);
					 }else  if(((pop2=="B2")&&(pop3=="B3"))&&((b1=="B4"))) {
						 stackB3.add(pop2);
						 stackB3.add(pop3);
						 stackB3.add(b1);
					 }else  if(((pop2=="B3")&&(pop3=="B4"))&&((b1=="B2")||(b1=="B1"))) {
						 stackB3.add(pop3);
						 stackB3.add(b1);
						 stackB3.add(pop2);
					 }
			 }else  if(st3==3) {
		         String pop4=stackB3.pop(); 
		         String pop5=stackB3.pop();
		         String pop6=stackB3.pop();
		         if(((pop4=="B1")&&(pop5=="B2")&&(pop6=="B3"))&&(b1=="B4")) {
		        	 stackB3.add(b1);
					 stackB3.add(pop6);
					 stackB3.add(pop5);
					 stackB3.add(pop4);
				 }else if(((pop4=="B2")&&(pop5=="B3")&&(pop6=="B4"))&&(b1=="B1")) {
					 stackB3.add(pop6);
		        	 stackB3.add(pop5);
					 stackB3.add(pop4);
					 stackB3.add(b1);
				 }else if(((pop4=="B1")&&(pop5=="B2")&&(pop6=="B4"))&&(b1=="B3")) {
					 stackB3.add(pop6);
		        	 stackB3.add(b1);
					 stackB3.add(pop5);
					 stackB3.add(pop4);
				 }}		 
	}}else if((b1=="G1")||(b1=="G2")||(b1=="G3")||(b1=="G4")) {
			  int sta1=stackG1.size(),sta2=stackG2.size(),sta3=stackG3.size();
			  if((sta1<=3)) {
					 if(sta1==0) {
						 stackG1.add(b1);
					 }else  if(sta1==1) {
						 String pop1=stackG1.pop();
						 if((pop1=="G1")&&((b1=="G2")||(b1=="G3")||(b1=="G4"))) {
							 stackG1.add(b1);
							 stackG1.add(pop1);
						 }else
						 if((pop1=="G2")&&((b1=="G1"))){
							 stackG1.add(pop1);
							 stackG1.add(b1);
						 } else if((pop1=="G2")&&((b1=="G3")||(b1=="G4"))){					 
							 stackG1.add(b1);
							 stackG1.add(pop1);
						 }
						 else if((pop1=="G3")&&(b1=="G1")||(b1=="G2")) {
							 stackG1.add(pop1);
							 stackG1.add(b1);
						 }else  if((pop1=="G4")&&((b1=="G2")||(b1=="G3")||(b1=="G1"))) {
							 stackG1.add(pop1);
							 stackG1.add(b1);
						 }
						
					 }else  if(sta1==2) {
					         String pop2=stackG1.pop();
					         String pop3=stackG1.pop();
					         if(((pop2=="G1")&&(pop3=="G2"))&&((b1=="G3")||(b1=="G4"))) {
								 stackG1.add(b1);
					        	 stackG1.add(pop3);
								 stackG1.add(pop2);
							 }else if(((pop2=="G1")&&(pop3=="G3"))&&((b1=="G2"))) {
									 stackG1.add(pop3);
									 stackG1.add(b1);
									 stackG1.add(pop2);							 
								 }else if(((pop2=="G1")&&(pop3=="G3"))&&((b1=="G4"))) {
									 stackG1.add(b1);
									 stackG1.add(pop3);
									 stackG1.add(pop2);	
								 } else if(((pop2=="G1")&&(pop3=="G4"))&&((b1=="G2")||(b1=="G3"))) {
									 stackG1.add(pop3);
									 stackG1.add(b1);
									 stackG1.add(pop2);
								 }
							else  if(((pop2=="G2")&&(pop3=="G3"))&&((b1=="G1"))) {
								 stackG1.add(pop3);
								 stackG1.add(pop2);
								 stackG1.add(b1);
							 }else  if(((pop2=="G2")&&(pop3=="G3"))&&((b1=="G4"))) {
								 stackG1.add(b1);
								 stackG1.add(pop3);
								 stackG1.add(pop2);
							 }else  if(((pop2=="G3")&&(pop3=="G4"))&&((b1=="G2")||(b1=="G1"))) {
								 stackG1.add(pop3);
								 stackG1.add(pop2);
								 stackG1.add(b1);
							 }
					 }else  if(sta1==3) {
				         String pop4=stackG1.pop();
				         String pop5=stackG1.pop();
				         String pop6=stackG1.pop();
				         if(((pop4=="G1")&&(pop5=="G2")&&(pop6=="G3"))&&(b1=="G4")) {
				        	 stackG1.add(b1);
							 stackG1.add(pop6);
							 stackG1.add(pop5);
							 stackG1.add(pop4);
						 }else if(((pop4=="G2")&&(pop5=="G3")&&(pop6=="G4"))&&(b1=="G1")) {
				        	 stackG1.add(pop6);
							 stackG1.add(pop5);
							 stackG1.add(pop4);
							 stackG1.add(b1);
						 }else if(((pop4=="G1")&&(pop5=="G2")&&(pop6=="G4"))&&(b1=="G3")) {
							 stackG3.add(pop6);
				        	 stackG3.add(b1);
							 stackG3.add(pop5);
							 stackG3.add(pop4);
						 }
				 }} else if((sta2<=3)&&(sta2>4)) {
					 if(sta2==0) {
						 stackG2.add(b1);}
					 else  if(sta2==1) {
						 String pop1=stackG2.pop();
						 if((pop1=="G1")&&((b1=="G2")||(b1=="G3")||(b1=="G4"))) {
							 stackG2.add(b1);
							 stackG2.add(pop1);
						 }else
						 if((pop1=="G2")&&((b1=="G1"))){
							 stackG2.add(pop1);
							 stackG2.add(b1);
						 } else if((pop1=="G2")&&((b1=="G3")||(b1=="G4"))){					 
							 stackG2.add(b1);
							 stackG2.add(pop1);
						 }
						 else if((pop1=="G3")&&(b1=="G1")||(b1=="G2")) {
							 stackG2.add(pop1);
							 stackG2.add(b1);
						 }else  if((pop1=="G4")&&((b1=="G2")||(b1=="G3")||(b1=="G1"))) {
							 stackG2.add(pop1);
							 stackG2.add(b1);
						 }
						
					 }else  if(sta2==2) {
					         String pop2=stackG2.pop();
					         String pop3=stackG2.pop();
					         if(((pop2=="G1")&&(pop3=="G2"))&&((b1=="G3")||(b1=="G4"))) {
								 stackG2.add(b1);
					        	 stackG2.add(pop3);
								 stackG2.add(pop2);
							 }else if(((pop2=="G1")&&(pop3=="G3"))&&((b1=="G2"))) {
									 stackG2.add(pop3);
									 stackG2.add(b1);
									 stackG2.add(pop2);							 
								 }else if(((pop2=="G1")&&(pop3=="G3"))&&((b1=="G4"))) {
									 stackG2.add(b1);
									 stackG2.add(pop3);
									 stackG2.add(pop2);	
								 } else if(((pop2=="G1")&&(pop3=="G4"))&&((b1=="G2")||(b1=="G3"))) {
									 stackG2.add(pop3);
									 stackG2.add(b1);
									 stackG2.add(pop2);
								 }
							else  if(((pop2=="G2")&&(pop3=="G3"))&&((b1=="G1"))) {
								 stackG2.add(pop3);
								 stackG2.add(pop2);
								 stackG2.add(b1);
							 }else  if(((pop2=="G2")&&(pop3=="G3"))&&((b1=="G4"))) {
								 stackG2.add(b1);
								 stackG2.add(pop3);
								 stackG2.add(pop2);
							 }else  if(((pop2=="G3")&&(pop3=="G4"))&&((b1=="G2")||(b1=="G1"))) {
								 stackG2.add(pop3);
								 stackG2.add(pop2);
								 stackG2.add(b1);
							 }
					 }else  if(sta2==3) {
				         String pop4=stackG2.pop();
				         String pop5=stackG2.pop();
				         String pop6=stackG2.pop();
				         if(((pop4=="G1")&&(pop5=="G2")&&(pop6=="G3"))&&(b1=="G4")) {
							 stackB2.add(b1);
				        	 stackG2.add(pop6);
							 stackG2.add(pop5);
							 stackG2.add(pop4);
						 }else if(((pop4=="G2")&&(pop5=="G3")&&(pop6=="G4"))&&(b1=="G1")) {
				        	 stackG2.add(pop6);
							 stackG2.add(pop5);
							 stackG2.add(pop4);
							 stackG2.add(b1);
						 }else if(((pop4=="G1")&&(pop5=="G2")&&(pop6=="G4"))&&(b1=="G3")) {
							 stackG3.add(pop6);
				        	 stackG3.add(b1);
							 stackG3.add(pop5);
							 stackG3.add(pop4);
						 }
				 }}else if((sta3<=3)&&(sta3!=0)) {
					 if(sta3==0) {
						 stackG3.add(b1);
					 }else  if(sta3==1) {
						 String pop1=stackG3.pop();
						 if((pop1=="G1")&&((b1=="G2")||(b1=="G3")||(b1=="G4"))) {
							 stackG3.add(b1);
							 stackG3.add(pop1);
						 }else
						 if((pop1=="G2")&&((b1=="G1"))){
							 stackG3.add(pop1);
							 stackG3.add(b1);
						 } else if((pop1=="G2")&&((b1=="G3")||(b1=="G4"))){					 
							 stackG3.add(b1);
							 stackG3.add(pop1);
						 }
						 else if((pop1=="G3")&&(b1=="G1")||(b1=="G2")) {
							 stackG3.add(pop1);
							 stackG3.add(b1);
						 }else  if((pop1=="G4")&&((b1=="G2")||(b1=="G3")||(b1=="G1"))) {
							 stackG3.add(pop1);
							 stackG3.add(b1);
						 }
						
					 }else  if(sta3==2) {
					         String pop2=stackG3.pop();
					         String pop3=stackG3.pop();
					         if(((pop2=="G1")&&(pop3=="G2"))&&((b1=="G3")||(b1=="G4"))) {
								 stackG3.add(b1);
					        	 stackG3.add(pop3);
								 stackG3.add(pop2);
							 }else if(((pop2=="G1")&&(pop3=="G3"))&&((b1=="G2"))) {
									 stackG3.add(pop3);
									 stackG3.add(b1);
									 stackG3.add(pop2);							 
								 }else if(((pop2=="G1")&&(pop3=="G3"))&&((b1=="G4"))) {
									 stackG3.add(b1);
									 stackG3.add(pop3);
									 stackG3.add(pop2);	
								 } else if(((pop2=="G1")&&(pop3=="G4"))&&((b1=="G2")||(b1=="G3"))) {
									 stackB3.add(pop3);
									 stackB3.add(b1);
									 stackB3.add(pop2);
								 }
							else  if(((pop2=="G2")&&(pop3=="G3"))&&((b1=="G1"))) {
								 stackG3.add(pop3);
								 stackG3.add(pop2);
								 stackG3.add(b1);
							 }else  if(((pop2=="G2")&&(pop3=="G3"))&&((b1=="G4"))) {
								 stackG3.add(b1);
								 stackG3.add(pop3);
								 stackG3.add(pop2);
							 }else  if(((pop2=="G3")&&(pop3=="G4"))&&((b1=="G2")||(b1=="G1"))) {
								 stackG3.add(pop3);
								 stackG3.add(pop2);
								 stackG3.add(b1);
							 }
					 }else  if(sta3==3) {
				         String pop4=stackG3.pop();
				         String pop5=stackG3.pop();
				         String pop6=stackG3.pop();
				         if(((pop4=="G1")&&(pop5=="G2")&&(pop6=="G3"))&&(b1=="G4")) {
							 stackG3.add(b1);
				        	 stackG3.add(pop6);
							 stackG3.add(pop5);
							 stackG3.add(pop4);
						 }else if(((pop4=="G2")&&(pop5=="G3")&&(pop6=="G4"))&&(b1=="G1")) {
				        	 stackG3.add(pop6);
							 stackG3.add(pop5);
							 stackG3.add(pop4);
							 stackG3.add(b1);
						 }else if(((pop4=="G1")&&(pop5=="G2")&&(pop6=="G4"))&&(b1=="G3")) {
							 stackG3.add(pop6);
				        	 stackG3.add(b1);
							 stackG3.add(pop5);
							 stackG3.add(pop4);
						 }}		 
			}
	}}
	private static void shifter(Stack<String> stack1, Stack<String> stack2, Stack<String> stack3, Stack<String> stack4,
			Stack<String> stack5, Stack<String> stack6, Stack<String> stack7, Stack<String> stack8,
			Stack<String> stack9, Stack<String> stack10, Stack<String> stack11, Stack<String> stack12,
			Stack<String> stack13, Stack<String> stack14, Stack<String> stack15, Stack<String> stack16, String[][] grid,
			int Orow, int Ocol, int direction) {
		if(grid[Orow][Ocol]=="__") {
			switch(direction) {
			case 0:
				if(Orow==0&&Ocol==0) {
					String shift1=stack16.pop();
					String shift2=stack13.pop();
					String shift3=stack14.pop();
					String shift4=stack2.pop();
					String shift5=stack6.pop();
					String shift6=stack5.pop();
					String shift7=stack8.pop();
					String shift8=stack4.pop();
					stack16.add(shift8);
					stack13.add(shift1);
					stack14.add(shift2);
					stack2.add(shift3);
					stack6.add(shift4);
					stack5.add(shift5);
					stack8.add(shift6);
					stack4.add(shift7);
				}else if(Orow==0&&Ocol==1) {
					String shift1=stack13.pop();
					String shift2=stack14.pop();
					String shift3=stack15.pop();
					String shift4=stack3.pop();
					String shift5=stack7.pop();
					String shift6=stack6.pop();
					String shift7=stack5.pop();
					String shift8=stack1.pop();
					stack13.add(shift8);
					stack14.add(shift1);
					stack15.add(shift2);
					stack3.add(shift3);
					stack7.add(shift4);
					stack6.add(shift5);
					stack5.add(shift6);
					stack1.add(shift7);
				}else if(Orow==0&&Ocol==2) {
					String shift1=stack14.pop();
					String shift2=stack15.pop();
					String shift3=stack16.pop();
					String shift4=stack4.pop();
					String shift5=stack8.pop();
					String shift6=stack7.pop();
					String shift7=stack6.pop();
					String shift8=stack2.pop();
					stack14.add(shift8);
					stack15.add(shift1);
					stack16.add(shift2);
					stack4.add(shift3);
					stack8.add(shift4);
					stack7.add(shift5);
					stack6.add(shift6);
					stack2.add(shift7);
				}else if(Orow==0&&Ocol==3) {
					String shift1=stack15.pop();
					String shift2=stack16.pop();
					String shift3=stack13.pop();
					String shift4=stack1.pop();
					String shift5=stack5.pop();
					String shift6=stack8.pop();
					String shift7=stack7.pop();
					String shift8=stack3.pop();
					stack15.add(shift8);
					stack16.add(shift1);
					stack13.add(shift2);
					stack1.add(shift3);
					stack5.add(shift4);
					stack8.add(shift5);
					stack7.add(shift6);
					stack3.add(shift7);
				}else if(Orow==1&&Ocol==0) {
					String shift1=stack4.pop();
					String shift2=stack1.pop();
					String shift3=stack2.pop();
					String shift4=stack6.pop();
					String shift5=stack10.pop();
					String shift6=stack11.pop();
					String shift7=stack12.pop();
					String shift8=stack8.pop();
					stack4.add(shift8);
					stack1.add(shift1);
					stack2.add(shift2);
					stack6.add(shift3);
					stack10.add(shift4);
					stack11.add(shift5);
					stack12.add(shift6);
					stack8.add(shift7);
				}else if(Orow==1&&Ocol==1) {
					String shift1=stack1.pop();
					String shift2=stack2.pop();
					String shift3=stack3.pop();
					String shift4=stack7.pop();
					String shift5=stack11.pop();
					String shift6=stack10.pop();
					String shift7=stack9.pop();
					String shift8=stack5.pop();
					stack1.add(shift8);
					stack2.add(shift1);
					stack3.add(shift2);
					stack7.add(shift3);
					stack11.add(shift4);
					stack10.add(shift5);
					stack9.add(shift6);
					stack5.add(shift7);								
			}else if(Orow==1&&Ocol==2) {
				String shift1=stack2.pop();
				String shift2=stack3.pop();
				String shift3=stack4.pop();
				String shift4=stack8.pop();
				String shift5=stack12.pop();
				String shift6=stack11.pop();
				String shift7=stack10.pop();
				String shift8=stack6.pop();
				stack2.add(shift8);
				stack3.add(shift1);
				stack4.add(shift2);
				stack8.add(shift3);
				stack12.add(shift4);
				stack11.add(shift5);
				stack10.add(shift6);
				stack6.add(shift7);
			}else if(Orow==1&&Ocol==3) {
				String shift1=stack3.pop();
				String shift2=stack4.pop();
				String shift3=stack1.pop();
				String shift4=stack5.pop();
				String shift5=stack9.pop();
				String shift6=stack12.pop();
				String shift7=stack11.pop();
				String shift8=stack7.pop();
				stack3.add(shift8);
				stack4.add(shift1);
				stack1.add(shift2);
				stack5.add(shift3);
				stack9.add(shift4);
				stack12.add(shift5);
				stack11.add(shift6);
				stack7.add(shift7);
			}else if(Orow==2&&Ocol==0) {
				String shift1=stack8.pop();
				String shift2=stack5.pop();
				String shift3=stack6.pop();
				String shift4=stack10.pop();
				String shift5=stack14.pop();
				String shift6=stack13.pop();
				String shift7=stack16.pop();
				String shift8=stack12.pop();
				stack8.add(shift8);
				stack5.add(shift1);
				stack6.add(shift2);
				stack10.add(shift3);
				stack14.add(shift4);
				stack13.add(shift5);
				stack16.add(shift6);
				stack12.add(shift7);
			}else if(Orow==2&&Ocol==1) {
				String shift1=stack5.pop();
				String shift2=stack6.pop();
				String shift3=stack7.pop();
				String shift4=stack11.pop();
				String shift5=stack15.pop();
				String shift6=stack14.pop();
				String shift7=stack13.pop();
				String shift8=stack9.pop();
				stack5.add(shift8);
				stack6.add(shift1);
				stack7.add(shift2);
				stack11.add(shift3);
				stack15.add(shift4);
				stack14.add(shift5);
				stack13.add(shift6);
				stack9.add(shift7);
			}else if(Orow==2&&Ocol==2) {
				String shift1=stack6.pop();
				String shift2=stack7.pop();
				String shift3=stack8.pop();
				String shift4=stack12.pop();
				String shift5=stack16.pop();
				String shift6=stack15.pop();
				String shift7=stack14.pop();
				String shift8=stack10.pop();
				stack6.add(shift8);
				stack7.add(shift1);
				stack8.add(shift2);
				stack12.add(shift3);
				stack16.add(shift4);
				stack15.add(shift5);
				stack14.add(shift6);
				stack10.add(shift7);
			}else if(Orow==2&&Ocol==3) {
				String shift1=stack7.pop();
				String shift2=stack8.pop();
				String shift3=stack5.pop();
				String shift4=stack9.pop();
				String shift5=stack13.pop();
				String shift6=stack16.pop();
				String shift7=stack15.pop();
				String shift8=stack11.pop();
				stack7.add(shift8);
				stack8.add(shift1);
				stack5.add(shift2);
				stack9.add(shift3);
				stack13.add(shift4);
				stack16.add(shift5);
				stack15.add(shift6);
				stack11.add(shift7);
			}else if(Orow==3&&Ocol==0) {
				String shift1=stack4.pop();
				String shift2=stack9.pop();
				String shift3=stack10.pop();
				String shift4=stack14.pop();
				String shift5=stack2.pop();
				String shift6=stack1.pop();
				String shift7=stack16.pop();
				String shift8=stack12.pop();
				stack4.add(shift8);
				stack9.add(shift1);
				stack10.add(shift2);
				stack14.add(shift3);
				stack2.add(shift4);
				stack1.add(shift5);
				stack16.add(shift6);
				stack12.add(shift7);
			}else if(Orow==3&&Ocol==1) {
				String shift1=stack9.pop();
				String shift2=stack10.pop();
				String shift3=stack11.pop();
				String shift4=stack15.pop();
				String shift5=stack3.pop();
				String shift6=stack2.pop();
				String shift7=stack1.pop();
				String shift8=stack13.pop();
				stack9.add(shift8);
				stack10.add(shift1);
				stack11.add(shift2);
				stack15.add(shift3);
				stack3.add(shift4);
				stack2.add(shift5);
				stack1.add(shift6);
				stack13.add(shift7);
			}else if(Orow==3&&Ocol==2) {
				String shift1=stack10.pop();
				String shift2=stack11.pop();
				String shift3=stack12.pop();
				String shift4=stack16.pop();
				String shift5=stack4.pop();
				String shift6=stack3.pop();
				String shift7=stack2.pop();
				String shift8=stack14.pop();
				stack10.add(shift8);
				stack11.add(shift1);
				stack12.add(shift2);
				stack16.add(shift3);
				stack4.add(shift4);
				stack3.add(shift5);
				stack2.add(shift6);
				stack14.add(shift7);
			}else if(Orow==3&&Ocol==3) {
				String shift1=stack11.pop();
				String shift2=stack12.pop();
				String shift3=stack9.pop();
				String shift4=stack13.pop();
				String shift5=stack1.pop();
				String shift6=stack4.pop();
				String shift7=stack3.pop();
				String shift8=stack15.pop();
				stack11.add(shift8);
				stack12.add(shift1);
				stack9.add(shift2);
				stack13.add(shift3);
				stack1.add(shift4);
				stack4.add(shift5);
				stack3.add(shift6);
				stack15.add(shift7);
			}
			break;
			case 1:
				if(Orow==0&&Ocol==0) {
					String shift1=stack16.pop();
					String shift2=stack13.pop();
					String shift3=stack14.pop();
					String shift4=stack2.pop();
					String shift5=stack6.pop();
					String shift6=stack5.pop();
					String shift7=stack8.pop();
					String shift8=stack4.pop();
					stack16.add(shift2);
					stack13.add(shift3);
					stack14.add(shift4);
					stack2.add(shift5);
					stack6.add(shift6);
					stack5.add(shift7);
					stack8.add(shift8);
					stack16.add(shift1);
				}else if(Orow==0&&Ocol==1) {
					String shift1=stack13.pop();
					String shift2=stack14.pop();
					String shift3=stack15.pop();
					String shift4=stack3.pop();
					String shift5=stack7.pop();
					String shift6=stack6.pop();
					String shift7=stack5.pop();
					String shift8=stack1.pop();
					stack13.add(shift2);
					stack14.add(shift3);
					stack15.add(shift4);
					stack3.add(shift5);
					stack7.add(shift6);
					stack6.add(shift7);
					stack5.add(shift8);
					stack1.add(shift1);
				}else if(Orow==0&&Ocol==2) {
					String shift1=stack14.pop();
					String shift2=stack15.pop();
					String shift3=stack16.pop();
					String shift4=stack4.pop();
					String shift5=stack8.pop();
					String shift6=stack7.pop();
					String shift7=stack6.pop();
					String shift8=stack2.pop();
					stack14.add(shift2);
					stack15.add(shift3);
					stack16.add(shift4);
					stack4.add(shift5);
					stack8.add(shift6);
					stack7.add(shift7);
					stack6.add(shift8);
					stack2.add(shift1);
				}else if(Orow==0&&Ocol==3) {
					String shift1=stack15.pop();
					String shift2=stack16.pop();
					String shift3=stack13.pop();
					String shift4=stack1.pop();
					String shift5=stack5.pop();
					String shift6=stack8.pop();
					String shift7=stack7.pop();
					String shift8=stack3.pop();
					stack15.add(shift8);
					stack16.add(shift1);
					stack13.add(shift2);
					stack1.add(shift3);
					stack5.add(shift4);
					stack8.add(shift5);
					stack7.add(shift6);
					stack3.add(shift7);
				}else if(Orow==1&&Ocol==0) {
					String shift1=stack4.pop();
					String shift2=stack1.pop();
					String shift3=stack2.pop();
					String shift4=stack6.pop();
					String shift5=stack10.pop();
					String shift6=stack9.pop();
					String shift7=stack12.pop();
					String shift8=stack8.pop();
					stack4.add(shift2);
					stack1.add(shift3);
					stack2.add(shift4);
					stack6.add(shift5);
					stack10.add(shift6);
					stack9.add(shift7);
					stack12.add(shift8);
					stack8.add(shift1);
				}else if(Orow==1&&Ocol==1) {
					String shift1=stack1.pop();
					String shift2=stack2.pop();
					String shift3=stack3.pop();
					String shift4=stack7.pop();
					String shift5=stack11.pop();
					String shift6=stack10.pop();
					String shift7=stack9.pop();
					String shift8=stack5.pop();
					stack1.add(shift2);
					stack2.add(shift3);
					stack3.add(shift4);
					stack7.add(shift5);
					stack11.add(shift6);
					stack10.add(shift7);
					stack9.add(shift8);
					stack5.add(shift1);								
			}else if(Orow==1&&Ocol==2) {
				String shift1=stack2.pop();
				String shift2=stack3.pop();
				String shift3=stack4.pop();
				String shift4=stack8.pop();
				String shift5=stack12.pop();
				String shift6=stack11.pop();
				String shift7=stack10.pop();
				String shift8=stack6.pop();
				stack2.add(shift2);
				stack3.add(shift3);
				stack4.add(shift4);
				stack8.add(shift5);
				stack12.add(shift6);
				stack11.add(shift7);
				stack10.add(shift8);
				stack6.add(shift1);
			}else if(Orow==1&&Ocol==3) {
				String shift1=stack3.pop();
				String shift2=stack4.pop();
				String shift3=stack1.pop();
				String shift4=stack5.pop();
				String shift5=stack9.pop();
				String shift6=stack12.pop();
				String shift7=stack11.pop();
				String shift8=stack7.pop();
				stack3.add(shift2);
				stack4.add(shift3);
				stack1.add(shift4);
				stack5.add(shift5);
				stack9.add(shift6);
				stack12.add(shift7);
				stack11.add(shift8);
				stack7.add(shift1);
			}else if(Orow==2&&Ocol==0) {
				String shift1=stack8.pop();
				String shift2=stack5.pop();
				String shift3=stack6.pop();
				String shift4=stack10.pop();
				String shift5=stack14.pop();
				String shift6=stack13.pop();
				String shift7=stack16.pop();
				String shift8=stack12.pop();
				stack8.add(shift2);
				stack5.add(shift3);
				stack6.add(shift4);
				stack10.add(shift5);
				stack14.add(shift6);
				stack13.add(shift7);
				stack16.add(shift8);
				stack12.add(shift1);
			}else if(Orow==2&&Ocol==1) {
				String shift1=stack5.pop();
				String shift2=stack6.pop();
				String shift3=stack7.pop();
				String shift4=stack11.pop();
				String shift5=stack15.pop();
				String shift6=stack14.pop();
				String shift7=stack13.pop();
				String shift8=stack9.pop();
				stack5.add(shift2);
				stack6.add(shift3);
				stack7.add(shift4);
				stack11.add(shift5);
				stack15.add(shift6);
				stack14.add(shift7);
				stack13.add(shift8);
				stack9.add(shift1);
			}else if(Orow==2&&Ocol==2) {
				String shift1=stack6.pop();
				String shift2=stack7.pop();
				String shift3=stack8.pop();
				String shift4=stack12.pop();
				String shift5=stack16.pop();
				String shift6=stack15.pop();
				String shift7=stack14.pop();
				String shift8=stack10.pop();
				stack6.add(shift2);
				stack7.add(shift3);
				stack8.add(shift4);
				stack12.add(shift5);
				stack16.add(shift6);
				stack15.add(shift7);
				stack14.add(shift8);
				stack10.add(shift1);
			}else if(Orow==2&&Ocol==3) {
				String shift1=stack7.pop();
				String shift2=stack8.pop();
				String shift3=stack5.pop();
				String shift4=stack9.pop();
				String shift5=stack13.pop();
				String shift6=stack16.pop();
				String shift7=stack15.pop();
				String shift8=stack11.pop();
				stack7.add(shift2);
				stack8.add(shift3);
				stack5.add(shift4);
				stack9.add(shift5);
				stack13.add(shift6);
				stack16.add(shift7);
				stack15.add(shift8);
				stack11.add(shift1);
			}else if(Orow==3&&Ocol==0) {
				String shift1=stack4.pop();
				String shift2=stack9.pop();
				String shift3=stack10.pop();
				String shift4=stack14.pop();
				String shift5=stack2.pop();
				String shift6=stack1.pop();
				String shift7=stack16.pop();
				String shift8=stack12.pop();
				stack4.add(shift2);
				stack9.add(shift3);
				stack10.add(shift4);
				stack14.add(shift5);
				stack2.add(shift6);
				stack1.add(shift7);
				stack16.add(shift8);
				stack12.add(shift1);
			}else if(Orow==3&&Ocol==1) {
				String shift1=stack9.pop();
				String shift2=stack10.pop();
				String shift3=stack11.pop();
				String shift4=stack15.pop();
				String shift5=stack3.pop();
				String shift6=stack2.pop();
				String shift7=stack1.pop();
				String shift8=stack13.pop();
				stack9.add(shift2);
				stack10.add(shift3);
				stack11.add(shift4);
				stack15.add(shift5);
				stack3.add(shift6);
				stack2.add(shift7);
				stack1.add(shift8);
				stack13.add(shift1);
			}else if(Orow==3&&Ocol==2) {
				String shift1=stack10.pop();
				String shift2=stack11.pop();
				String shift3=stack12.pop();
				String shift4=stack16.pop();
				String shift5=stack4.pop();
				String shift6=stack3.pop();
				String shift7=stack2.pop();
				String shift8=stack14.pop();
				stack10.add(shift2);
				stack11.add(shift3);
				stack12.add(shift4);
				stack16.add(shift5);
				stack4.add(shift6);
				stack3.add(shift7);
				stack2.add(shift8);
				stack14.add(shift1);
			}else if(Orow==3&&Ocol==3) {
				String shift1=stack11.pop();
				String shift2=stack12.pop();
				String shift3=stack9.pop();
				String shift4=stack13.pop();
				String shift5=stack1.pop();
				String shift6=stack4.pop();
				String shift7=stack3.pop();
				String shift8=stack15.pop();
				stack11.add(shift2);
				stack12.add(shift3);
				stack9.add(shift4);
				stack13.add(shift5);
				stack1.add(shift6);
				stack4.add(shift7);
				stack3.add(shift8);
				stack15.add(shift1);
			}else {
				System.out.println("Invalid move");
			}
			break;
		default:
		       System.out.println("Invalid move");
        break;}}
	}
	private static void transport(Stack<String> stack1, Stack<String> stack2, Stack<String> stack3,
			Stack<String> stack4, Stack<String> stack5, Stack<String> stack6, Stack<String> stack7,
			Stack<String> stack8, Stack<String> stack9, Stack<String> stack10, Stack<String> stack11,
			Stack<String> stack12, Stack<String> stack13, Stack<String> stack14, Stack<String> stack15,
			Stack<String> stack16, int Orow, int Ocol, int No) {
		String piece;
		String piece1;
		String piece2;
		String piece3;
		if(Orow==0&&Ocol==0) {int v=stack1.size();				                       
			                   if(v==2) {if(No==1) {piece=stack1.pop();
			                              if(stack2.size()>=1&&stack2.size()<=5&&stack2.peek()=="__") {				                                	  
		                        	          stack2.add(piece);}
			                              else if(stack5.size()>=1&&stack5.size()<=5&&stack6.peek()=="__") {
			                                	  stack5.add(piece); }
			                                 else if(stack6.size()>=1&&stack6.size()<=5&&stack6.peek()=="__") {				                                	  
				                                	  stack6.add(piece);
			                                  } else {System.out.println("Invalid move");}
			                              }}
			                   else if(v==3) {
			                	   if(No==1) {piece=stack1.pop();
		                              if(stack2.size()>=1&&stack2.size()<=5&&stack2.peek()=="__") {				                                	  
	                        	          stack2.add(piece);}
		                              else if(stack5.size()>=1&&stack5.size()<=5&&stack6.peek()=="__") {
		                                	  stack5.add(piece); }
		                                 else if(stack6.size()>=1&&stack6.size()<=5&&stack6.peek()=="__") {				                                	  
			                                	  stack6.add(piece);
		                                  } else {System.out.println("Invalid move");}
		                              }
		                       if(No==2) {piece=stack1.pop();
		                                 piece1=stack1.pop();
		                                 if(stack2.size()>=1&&stack2.size()<=3&&stack2.peek()=="__") {
		                                	 stack2.add(piece1);
		                                	  stack2.add(piece);}
		                                 else if(stack5.size()>=1&&stack5.size()<=3&&stack5.peek()=="__") {
		                                	 stack5.add(piece1);
		                                	  stack5.add(piece); }
		                                 else if(stack6.size()>=1&&stack6.size()<=3&&stack6.peek()=="__") {				                                	  
			                                	 stack6.add(piece1);
			                                	  stack6.add(piece);} 
		                                 else {System.out.println("Invalid move");}
		                       }}
			                   else if(v==4) {
			                	   if(No==1) {piece=stack1.pop();
		                              if(stack2.size()>=1&&stack2.size()<=5&&stack2.peek()=="__") {				                                	  
	                        	          stack2.add(piece);}
		                              else if(stack5.size()>=1&&stack5.size()<=5&&stack6.peek()=="__") {
		                                	  stack5.add(piece); }
		                                 else if(stack6.size()>=1&&stack6.size()<=5&&stack6.peek()=="__") {				                                	  
			                                	  stack6.add(piece);
		                                  } else {System.out.println("Invalid move");}
		                              }
		                       if(No==2) {piece=stack1.pop();
		                                 piece1=stack1.pop();
		                                 if(stack2.size()>=1&&stack2.size()<=3&&stack2.peek()=="__") {
		                                	 stack2.add(piece1);
		                                	  stack2.add(piece);}
		                                 else if(stack5.size()>=1&&stack5.size()<=3&&stack5.peek()=="__") {
		                                	 stack5.add(piece1);
		                                	  stack5.add(piece); }
		                                 else if(stack6.size()>=1&&stack6.size()<=3&&stack6.peek()=="__") {				                                	  
			                                	 stack6.add(piece1);
			                                	  stack6.add(piece);} 
		                                 else {System.out.println("Invalid move");}
		                       }
		                       if(No==3) {piece=stack1.pop();
		                                  piece1=stack1.pop();
		                                  piece2=stack1.pop();
		                                  if(stack2.size()>=1&&stack2.size()<=2&&stack2.peek()=="__") {
			                                	 stack2.add(piece2);
			                                	 stack2.add(piece1);
			                                	 stack2.add(piece);}
		                                  else if(stack5.size()>=1&&stack5.size()<=2&&stack5.peek()=="__") {
		                                	     stack5.add(piece2);
			                                	 stack5.add(piece1);
			                                	 stack5.add(piece);
		                                  }else if(stack6.size()>=1&&stack6.size()<=2&&stack6.peek()=="__") {
		                                	  stack6.add(piece2);
			                                	 stack6.add(piece1);
			                                	 stack6.add(piece);
		                                  } else {System.out.println("Invalid move");}
		                       }}
			                   else if(v==5) {
			                	   if(No==1) {piece=stack1.pop();
		                              if(stack2.size()>=1&&stack2.size()<=5&&stack2.peek()=="__") {				                                	  
	                        	          stack2.add(piece);}
		                              else if(stack5.size()>=1&&stack5.size()<=5&&stack6.peek()=="__") {
		                                	  stack5.add(piece); }
		                                 else if(stack6.size()>=1&&stack6.size()<=5&&stack6.peek()=="__") {				                                	  
			                                	  stack6.add(piece);
		                                  } else {System.out.println("Invalid move");}
		                              }
		                       if(No==2) {piece=stack1.pop();
		                                 piece1=stack1.pop();
		                                 if(stack2.size()>=1&&stack2.size()<=3&&stack2.peek()=="__") {
		                                	 stack2.add(piece1);
		                                	  stack2.add(piece);}
		                                 else if(stack5.size()>=1&&stack5.size()<=3&&stack5.peek()=="__") {
		                                	 stack5.add(piece1);
		                                	  stack5.add(piece); }
		                                 else if(stack6.size()>=1&&stack6.size()<=3&&stack6.peek()=="__") {				                                	  
			                                	 stack6.add(piece1);
			                                	  stack6.add(piece);} 
		                                 else {System.out.println("Invalid move");}
		                       }
		                       if(No==3) {piece=stack1.pop();
		                                  piece1=stack1.pop();
		                                  piece2=stack1.pop();
		                                  if(stack2.size()>=1&&stack2.size()<=2&&stack2.peek()=="__") {
			                                	 stack2.add(piece2);
			                                	 stack2.add(piece1);
			                                	 stack2.add(piece);}
		                                  else if(stack5.size()>=1&&stack5.size()<=2&&stack5.peek()=="__") {
		                                	     stack5.add(piece2);
			                                	 stack5.add(piece1);
			                                	 stack5.add(piece);
		                                  }else if(stack6.size()>=1&&stack6.size()<=2&&stack6.peek()=="__") {
		                                	  stack6.add(piece2);
			                                	 stack6.add(piece1);
			                                	 stack6.add(piece);
		                                  } else {System.out.println("Invalid move");}
		                       }
		                       if(No==4) { piece=stack1.pop();
		                                  piece1=stack1.pop();
		                                  piece2=stack1.pop();
		                        		  piece3=stack1.pop();
		                        		  if(stack2.size()==1&&stack2.peek()=="__") {
		                        			     stack2.add(piece3);
			                                	 stack2.add(piece2);
			                                	 stack2.add(piece1);
			                                	 stack2.add(piece);}
		                        		  else if(stack5.size()==1&&stack5.peek()=="__") {
		                        			     stack5.add(piece3);
		                                	     stack5.add(piece2);
			                                	 stack5.add(piece1);
			                                	 stack5.add(piece);
		                                  }else if(stack6.size()==1&&stack6.peek()=="__") {
		                                	     stack6.add(piece3);
		                                	     stack6.add(piece2);
			                                	 stack6.add(piece1);
			                                	 stack6.add(piece);
		                                  }else {System.out.println("Invalid move");}
		                         }
		                        }else {System.out.println("Invalid move");}}
			                   if(Orow==0&&Ocol==1) {int v1=stack2.size();
				                   if(v1==2) {if(No==1) {piece=stack2.pop();
				                              if(stack1.size()>=1&&stack1.size()<=4&&stack1.peek()=="__") {				                                	  
		                            	          stack1.add(piece);}
				                              else if(stack3.size()>=1&&stack3.size()<=4&&stack3.peek()=="__") {
				                                	  stack3.add(piece); }
				                              else if(stack6.size()>=1&&stack6.size()<=4&&stack6.peek()=="__") {				                                	  
					                                	  stack6.add(piece);
				                                  } else {stack2.add(piece);
				                                	  System.out.println("Invalid move");}
				                              }}
				                   else if(v1==3) {
				                	   if(No==1) {piece=stack2.pop();
			                              if(stack1.size()>=1&&stack1.size()<5&&stack1.peek()=="__") {				                                	  
	                            	          stack1.add(piece);}
			                              else if(stack3.size()>=1&&stack3.size()<5&&stack3.peek()=="__") {
			                                	  stack3.add(piece); }
			                              else if(stack6.size()>=1&&stack6.size()<5&&stack6.peek()=="__") {				                                	  
				                                	  stack6.add(piece);
			                                  } else {stack2.add(piece);
			                                	  System.out.println("Invalid move");}
			                              }
			                       if(No==2) {piece=stack2.pop();
			                                 piece1=stack2.pop();
			                                 if(stack1.size()>=1&&stack1.size()<4&&stack1.peek()=="__") {
			                                	 stack1.add(piece1);
			                                	  stack1.add(piece);}
			                                 else if(stack3.size()>=1&&stack3.size()<4&&stack3.peek()=="__") {
			                                	 stack3.add(piece1);
			                                	  stack3.add(piece); }
			                                 else if(stack6.size()>=1&&stack6.size()<4&&stack6.peek()=="__") {				                                	  
				                                	 stack6.add(piece1);
				                                	  stack6.add(piece);} 
			                                 else {System.out.println("Invalid move");}
			                       }}
				                   else if(v1==4) {
				                	   if(No==1) {piece=stack2.pop();
			                              if(stack1.size()>=1&&stack1.size()<5&&stack1.peek()=="__") {				                                	  
	                            	          stack1.add(piece);}
			                              else if(stack3.size()>=1&&stack3.size()<5&&stack3.peek()=="__") {
			                                	  stack3.add(piece); }
			                              else if(stack6.size()>=1&&stack6.size()<5&&stack6.peek()=="__") {				                                	  
				                                	  stack6.add(piece);
			                                  } else {stack2.add(piece);
			                                	  System.out.println("Invalid move");}
			                              }
			                       if(No==2) {piece=stack2.pop();
			                                 piece1=stack2.pop();
			                                 if(stack1.size()>=1&&stack1.size()<4&&stack1.peek()=="__") {
			                                	 stack1.add(piece1);
			                                	  stack1.add(piece);}
			                                 else if(stack3.size()>=1&&stack3.size()<4&&stack3.peek()=="__") {
			                                	 stack3.add(piece1);
			                                	  stack3.add(piece); }
			                                 else if(stack6.size()>=1&&stack6.size()<4&&stack6.peek()=="__") {				                                	  
				                                	 stack6.add(piece1);
				                                	  stack6.add(piece);} 
			                                 else {System.out.println("Invalid move");}
			                       }
			                       if(No==3) {piece=stack2.pop();
			                                  piece1=stack2.pop();
			                                  piece2=stack2.pop();
			                                  if(stack1.size()>=1&&stack1.size()<2&&stack1.peek()=="__") {
				                                	 stack1.add(piece2);
				                                	 stack1.add(piece1);
				                                	 stack1.add(piece);}
			                                  else if(stack3.size()>=1&&stack3.size()<2&&stack3.peek()=="__") {
			                                	     stack3.add(piece2);
				                                	 stack3.add(piece1);
				                                	 stack3.add(piece);
			                                  }else if(stack6.size()>=1&&stack6.size()<2&&stack6.peek()=="__") {
			                                	  stack6.add(piece2);
				                                	 stack6.add(piece1);
				                                	 stack6.add(piece);
			                                  } else {System.out.println("Invalid move");}
			                       }}
				                   else if(v1==5) {
				                	   if(No==1) {piece=stack2.pop();
			                              if(stack1.size()>=1&&stack1.size()<5&&stack1.peek()=="__") {				                                	  
	                            	          stack1.add(piece);}
			                              else if(stack3.size()>=1&&stack3.size()<5&&stack3.peek()=="__") {
			                                	  stack3.add(piece); }
			                              else if(stack6.size()>=1&&stack6.size()<5&&stack6.peek()=="__") {				                                	  
				                                	  stack6.add(piece);
			                                  } else {stack2.add(piece);
			                                	  System.out.println("Invalid move");}
			                              }
			                       if(No==2) {piece=stack2.pop();
			                                 piece1=stack2.pop();
			                                 if(stack1.size()>=1&&stack1.size()<4&&stack1.peek()=="__") {
			                                	 stack1.add(piece1);
			                                	  stack1.add(piece);}
			                                 else if(stack3.size()>=1&&stack3.size()<4&&stack3.peek()=="__") {
			                                	 stack3.add(piece1);
			                                	  stack3.add(piece); }
			                                 else if(stack6.size()>=1&&stack6.size()<4&&stack6.peek()=="__") {				                                	  
				                                	 stack6.add(piece1);
				                                	  stack6.add(piece);} 
			                                 else {System.out.println("Invalid move");}
			                       }
			                       if(No==3) {piece=stack2.pop();
			                                  piece1=stack2.pop();
			                                  piece2=stack2.pop();
			                                  if(stack1.size()>=1&&stack1.size()<2&&stack1.peek()=="__") {
				                                	 stack1.add(piece2);
				                                	 stack1.add(piece1);
				                                	 stack1.add(piece);}
			                                  else if(stack3.size()>=1&&stack3.size()<2&&stack3.peek()=="__") {
			                                	     stack3.add(piece2);
				                                	 stack3.add(piece1);
				                                	 stack3.add(piece);
			                                  }else if(stack6.size()>=1&&stack6.size()<2&&stack6.peek()=="__") {
			                                	  stack6.add(piece2);
				                                	 stack6.add(piece1);
				                                	 stack6.add(piece);
			                                  } else {System.out.println("Invalid move");}
			                       }
			                       if(No==4) { piece=stack2.pop();
			                                  piece1=stack2.pop();
		                                      piece2=stack2.pop();
		                            		  piece3=stack2.pop();
		                            		  if(stack1.size()==1&&stack1.peek()=="__") {
		                            			     stack1.add(piece3);
				                                	 stack1.add(piece2);
				                                	 stack1.add(piece1);
				                                	 stack1.add(piece);}
		                            		  else if(stack3.size()==1&&stack3.peek()=="__") {
		                            			     stack3.add(piece3);
			                                	     stack3.add(piece2);
				                                	 stack3.add(piece1);
				                                	 stack3.add(piece);
			                                  }else if(stack6.size()==1&&stack6.peek()=="__") {
			                                	     stack6.add(piece3);
			                                	     stack6.add(piece2);
				                                	 stack6.add(piece1);
				                                	 stack6.add(piece);
			                                  }else {System.out.println("Invalid move");}
		                             }
			                        }else {System.out.println("Invalid move");}}
			      			 if(Orow==0&&Ocol==2) {int v2=stack3.size();
			      			      if(v2==2) {if(No==1) {piece=stack3.pop();
		                                      if(stack2.size()>=1&&stack2.size()<=4&&stack2.peek()=="__") {				                                	  
		           	                             stack2.add(piece);}
		                                      else if(stack4.size()>=1&&stack4.size()<=4&&stack4.peek()=="__") {
		                        	             stack4.add(piece); }
		                                      else if(stack7.size()>=1&&stack7.size()<=4&&stack7.peek()=="__") {				                                	  
		                            	         stack7.add(piece);
		                          } else {System.out.println("Invalid move");}
		                      }}
		           else if(v2==3) {
		        	   if(No==1) {piece=stack3.pop();
                       if(stack2.size()>=1&&stack2.size()<=4&&stack2.peek()=="__") {				                                	  
                             stack2.add(piece);}
                       else if(stack4.size()>=1&&stack4.size()<=4&&stack4.peek()=="__") {
         	             stack4.add(piece); }
                       else if(stack7.size()>=1&&stack7.size()<=4&&stack7.peek()=="__") {				                                	  
             	         stack7.add(piece);
                      } else {System.out.println("Invalid move");}
                     }
		           if(No==2) {piece=stack3.pop();
		                     piece1=stack3.pop();
		                     if(stack2.size()>=1&&stack2.size()<=3&&stack2.peek()=="__") {
		                    	  stack2.add(piece1);
		                    	  stack2.add(piece);}
		                     else if(stack4.size()>=1&&stack4.size()<=3&&stack4.peek()=="__") {
		                    	  stack4.add(piece1);
		                    	  stack4.add(piece); }
		                     else if(stack7.size()>=1&&stack7.size()<=3&&stack7.peek()=="__") {				                                	  
		                          stack7.add(piece1);
		                          stack7.add(piece);} 
		                     else {System.out.println("Invalid move");}
		             }}
		           else if(v2==4) {
		        	   if(No==1) {piece=stack3.pop();
                       if(stack2.size()>=1&&stack2.size()<=4&&stack2.peek()=="__") {				                                	  
                             stack2.add(piece);}
                       else if(stack4.size()>=1&&stack4.size()<=4&&stack4.peek()=="__") {
         	                 stack4.add(piece); }
                       else if(stack7.size()>=1&&stack7.size()<=4&&stack7.peek()=="__") {				                                	  
             	             stack7.add(piece);
                     } else {System.out.println("Invalid move");}
                   }
		           if(No==2) {piece=stack3.pop();
		                     piece1=stack3.pop();
		                     if(stack2.size()>=1&&stack2.size()<=3&&stack2.peek()=="__") {
		                    	  stack2.add(piece1);
		                    	  stack2.add(piece);}
		                     else if(stack4.size()>=1&&stack4.size()<=3&&stack4.peek()=="__") {
		                    	  stack4.add(piece1);
		                    	  stack4.add(piece); }
		                     else if(stack7.size()>=1&&stack7.size()<=3&&stack7.peek()=="__") {				                                	  
		                          stack7.add(piece1);
		                          stack7.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }
		           if(No==3) {piece=stack3.pop();
		                      piece1=stack3.pop();
		                      piece2=stack3.pop();
		                      if(stack2.size()>=1&&stack2.size()<=2&&stack2.peek()=="__") {
		                        	 stack2.add(piece2);
		                        	 stack2.add(piece1);
		                        	 stack2.add(piece);}
		                      else if(stack4.size()>=1&&stack4.size()<=2&&stack4.peek()=="__") {
		                    	     stack4.add(piece2);
		                        	 stack4.add(piece1);
		                        	 stack4.add(piece);
		                      }else if(stack7.size()>=1&&stack7.size()<=2&&stack7.peek()=="__") {
		                    	     stack7.add(piece2);
		                        	 stack7.add(piece1);
		                        	 stack7.add(piece);
		                      } else {System.out.println("Invalid move");}
		           }}
		           else if(v2==5) {
		        	   if(No==1) {piece=stack3.pop();
                       if(stack2.size()>=1&&stack2.size()<=4&&stack2.peek()=="__") {				                                	  
                             stack2.add(piece);}
                       else if(stack4.size()>=1&&stack4.size()<=4&&stack4.peek()=="__") {
         	                 stack4.add(piece); }
                       else if(stack7.size()>=1&&stack7.size()<=4&&stack7.peek()=="__") {				                                	  
             	             stack7.add(piece);
                     } else {System.out.println("Invalid move");}
                   }
		           if(No==2) {piece=stack3.pop();
		                     piece1=stack3.pop();
		                     if(stack2.size()>=1&&stack2.size()<=3&&stack2.peek()=="__") {
		                    	  stack2.add(piece1);
		                    	  stack2.add(piece);}
		                     else if(stack4.size()>=1&&stack4.size()<=3&&stack4.peek()=="__") {
		                    	  stack4.add(piece1);
		                    	  stack4.add(piece); }
		                     else if(stack7.size()>=1&&stack7.size()<=3&&stack7.peek()=="__") {				                                	  
		                          stack7.add(piece1);
		                          stack7.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }
		           if(No==3) {piece=stack3.pop();
		                      piece1=stack3.pop();
		                      piece2=stack3.pop();
		                      if(stack2.size()>=1&&stack2.size()<=2&&stack2.peek()=="__") {
		                        	 stack2.add(piece2);
		                        	 stack2.add(piece1);
		                        	 stack2.add(piece);}
		                      else if(stack4.size()>=1&&stack4.size()<=2&&stack4.peek()=="__") {
		                    	     stack4.add(piece2);
		                        	 stack4.add(piece1);
		                        	 stack4.add(piece);
		                      }else if(stack7.size()>=1&&stack7.size()<=2&&stack7.peek()=="__") {
		                    	     stack7.add(piece2);
		                        	 stack7.add(piece1);
		                        	 stack7.add(piece);
		                      } else {System.out.println("Invalid move");}
		           }
		           if(No==4) { piece=stack3.pop();
		                       piece1=stack3.pop();
		                       piece2=stack3.pop();
		           		       piece3=stack3.pop();
		           		  if(stack2.size()==1&&stack2.peek()=="__") {
		           			     stack2.add(piece3);
		                        	 stack2.add(piece2);
		                        	 stack2.add(piece1);
		                        	 stack2.add(piece);}
		           		  else if(stack4.size()==1&&stack4.peek()=="__") {
		           			     stack4.add(piece3);
		                    	     stack4.add(piece2);
		                        	 stack4.add(piece1);
		                        	 stack4.add(piece);
		                      }else if(stack7.size()==1&&stack7.peek()=="__") {
		                    	     stack7.add(piece3);
		                    	     stack7.add(piece2);
		                        	 stack7.add(piece1);
		                        	 stack7.add(piece);
		                      }else {System.out.println("Invalid move");}
		            }
		            }else {System.out.println("Invalid move");}}
			      			 if(Orow==0&&Ocol==3) {int v3=stack4.size();
			      			 if(v3==2) {if(No==1) {piece=stack4.pop();
		                      if(stack3.size()>=1&&stack3.size()<=4&&stack3.peek()=="__") {				                                	  
		           	             stack3.add(piece);}
		                      else if(stack5.size()>=1&&stack5.size()<=4&&stack5.peek()=="__") {
		                         stack5.add(piece); }
		                      else if(stack8.size()>=1&&stack8.size()<=4&&stack8.peek()=="__") {				                                	  
		                          stack8.add(piece);
		                      } else {System.out.println("Invalid move");}
		                      }}
		           else if(v3==3) {
		        	   if(No==1) {piece=stack4.pop();
	                      if(stack3.size()>=1&&stack3.size()<=4&&stack3.peek()=="__") {				                                	  
	           	             stack3.add(piece);}
	                      else if(stack5.size()>=1&&stack5.size()<=4&&stack5.peek()=="__") {
	                         stack5.add(piece); }
	                      else if(stack8.size()>=1&&stack8.size()<=4&&stack8.peek()=="__") {				                                	  
	                          stack8.add(piece);
	                      } else {System.out.println("Invalid move");}
	                      }
		           if(No==2) {piece=stack4.pop();
		                     piece1=stack4.pop();
		                     if(stack3.size()>=1&&stack3.size()<=3&&stack3.peek()=="__") {
		                    	  stack3.add(piece1);
		                    	  stack3.add(piece);}
		                     else if(stack5.size()>=1&&stack5.size()<=3&&stack5.peek()=="__") {
		                    	  stack5.add(piece1);
		                    	  stack5.add(piece); }
		                     else if(stack8.size()>=1&&stack8.size()<=3&&stack8.peek()=="__") {				                                	  
		                          stack8.add(piece1);
		                          stack8.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }}
		           else if(v3==4) {
		        	   if(No==1) {piece=stack4.pop();
	                      if(stack3.size()>=1&&stack3.size()<=4&&stack3.peek()=="__") {				                                	  
	           	             stack3.add(piece);}
	                      else if(stack5.size()>=1&&stack5.size()<=4&&stack5.peek()=="__") {
	                         stack5.add(piece); }
	                      else if(stack8.size()>=1&&stack8.size()<=4&&stack8.peek()=="__") {				                                	  
	                          stack8.add(piece);
	                      } else {System.out.println("Invalid move");}
	                      }
		           if(No==2) {piece=stack4.pop();
		                     piece1=stack4.pop();
		                     if(stack3.size()>=1&&stack3.size()<=3&&stack3.peek()=="__") {
		                    	  stack3.add(piece1);
		                    	  stack3.add(piece);}
		                     else if(stack5.size()>=1&&stack5.size()<=3&&stack5.peek()=="__") {
		                    	  stack5.add(piece1);
		                    	  stack5.add(piece); }
		                     else if(stack8.size()>=1&&stack8.size()<=3&&stack8.peek()=="__") {				                                	  
		                          stack8.add(piece1);
		                          stack8.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }
		           if(No==3) {piece=stack4.pop();
		                      piece1=stack4.pop();
		                      piece2=stack4.pop();
		                      if(stack3.size()>=1&&stack3.size()<=2&&stack3.peek()=="__") {
		                        	 stack3.add(piece2);
		                        	 stack3.add(piece1);
		                        	 stack3.add(piece);}
		                      else if(stack5.size()>=1&&stack5.size()<=2&&stack5.peek()=="__") {
		                    	     stack5.add(piece2);
		                        	 stack5.add(piece1);
		                        	 stack5.add(piece);
		                      }else if(stack8.size()>=1&&stack8.size()<=2&&stack8.peek()=="__") {
		                    	     stack8.add(piece2);
		                        	 stack8.add(piece1);
		                        	 stack8.add(piece);
		                      } else {System.out.println("Invalid move");}
		           }}
		           else if(v3==5) {
		        	   if(No==1) {piece=stack4.pop();
	                      if(stack3.size()>=1&&stack3.size()<=4&&stack3.peek()=="__") {				                                	  
	           	             stack3.add(piece);}
	                      else if(stack5.size()>=1&&stack5.size()<=4&&stack5.peek()=="__") {
	                         stack5.add(piece); }
	                      else if(stack8.size()>=1&&stack8.size()<=4&&stack8.peek()=="__") {				                                	  
	                          stack8.add(piece);
	                      } else {System.out.println("Invalid move");}
	                      }
		           if(No==2) {piece=stack4.pop();
		                     piece1=stack4.pop();
		                     if(stack3.size()>=1&&stack3.size()<=3&&stack3.peek()=="__") {
		                    	  stack3.add(piece1);
		                    	  stack3.add(piece);}
		                     else if(stack5.size()>=1&&stack5.size()<=3&&stack5.peek()=="__") {
		                    	  stack5.add(piece1);
		                    	  stack5.add(piece); }
		                     else if(stack8.size()>=1&&stack8.size()<=3&&stack8.peek()=="__") {				                                	  
		                          stack8.add(piece1);
		                          stack8.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }
		           if(No==3) {piece=stack4.pop();
		                      piece1=stack4.pop();
		                      piece2=stack4.pop();
		                      if(stack3.size()>=1&&stack3.size()<=2&&stack3.peek()=="__") {
		                        	 stack3.add(piece2);
		                        	 stack3.add(piece1);
		                        	 stack3.add(piece);}
		                      else if(stack5.size()>=1&&stack5.size()<=2&&stack5.peek()=="__") {
		                    	     stack5.add(piece2);
		                        	 stack5.add(piece1);
		                        	 stack5.add(piece);
		                      }else if(stack8.size()>=1&&stack8.size()<=2&&stack8.peek()=="__") {
		                    	     stack8.add(piece2);
		                        	 stack8.add(piece1);
		                        	 stack8.add(piece);
		                      } else {System.out.println("Invalid move");}
		           }
		           if(No==4) { piece=stack4.pop();
		                       piece1=stack4.pop();
		                       piece2=stack4.pop();
		           		       piece3=stack4.pop();
		           		  if(stack3.size()==1&&stack3.peek()=="__") {
		           			     stack3.add(piece3);
		                        	 stack3.add(piece2);
		                        	 stack3.add(piece1);
		                        	 stack3.add(piece);}
		           		  else if(stack5.size()==1&&stack5.peek()=="__") {
		           			         stack5.add(piece3);
		                    	     stack5.add(piece2);
		                        	 stack5.add(piece1);
		                        	 stack5.add(piece);
		                      }else if(stack8.size()==1&&stack8.peek()=="__") {
		                    	     stack8.add(piece3);
		                    	     stack8.add(piece2);
		                        	 stack8.add(piece1);
		                        	 stack8.add(piece);
		                      }else {System.out.println("Invalid move");}
		            }
		            }else {System.out.println("Invalid move");}}
			      			 if(Orow==1&&Ocol==0) {int v4=stack5.size();
			      			 if(v4==2) {if(No==1) {piece=stack5.pop();
		                      if(stack1.size()>=1&&stack1.size()<=4&&stack1.peek()=="__") {				                                	  
		           	              stack1.add(piece);}
		                      else if(stack6.size()>=1&&stack6.size()<=4&&stack6.peek()=="__") {
		                          stack6.add(piece); }
		                      else if(stack9.size()>=1&&stack9.size()<=4&&stack9.peek()=="__") {				                                	  
		                          stack9.add(piece);
		                    } else {System.out.println("Invalid move");}
		                      }}
		           else if(v4==3) {
		        	   if(No==1) {piece=stack5.pop();
	                      if(stack1.size()>=1&&stack1.size()<=4&&stack1.peek()=="__") {				                                	  
	           	              stack1.add(piece);}
	                      else if(stack6.size()>=1&&stack6.size()<=4&&stack6.peek()=="__") {
	                          stack6.add(piece); }
	                      else if(stack9.size()>=1&&stack9.size()<=4&&stack9.peek()=="__") {				                                	  
	                          stack9.add(piece);
	                    } else {System.out.println("Invalid move");}
	                      }
		           if(No==2) {piece=stack5.pop();
		                     piece1=stack5.pop();
		                     if(stack1.size()>=1&&stack1.size()<=3&&stack1.peek()=="__") {
		                    	 stack1.add(piece1);
		                    	 stack1.add(piece);}
		                     else if(stack6.size()>=1&&stack6.size()<=3&&stack6.peek()=="__") {
		                    	 stack6.add(piece1);
		                    	 stack6.add(piece); }
		                     else if(stack9.size()>=1&&stack9.size()<=3&&stack9.peek()=="__") {				                                	  
		                         stack9.add(piece1);
		                         stack9.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }}
		           else if(v4==4) {
		        	   if(No==1) {piece=stack5.pop();
	                      if(stack1.size()>=1&&stack1.size()<=4&&stack1.peek()=="__") {				                                	  
	           	              stack1.add(piece);}
	                      else if(stack6.size()>=1&&stack6.size()<=4&&stack6.peek()=="__") {
	                          stack6.add(piece); }
	                      else if(stack9.size()>=1&&stack9.size()<=4&&stack9.peek()=="__") {				                                	  
	                          stack9.add(piece);
	                    } else {System.out.println("Invalid move");}
	                      }
		           if(No==2) {piece=stack5.pop();
		                     piece1=stack5.pop();
		                     if(stack1.size()>=1&&stack1.size()<=3&&stack1.peek()=="__") {
		                    	 stack1.add(piece1);
		                    	 stack1.add(piece);}
		                     else if(stack6.size()>=1&&stack6.size()<=3&&stack6.peek()=="__") {
		                    	 stack6.add(piece1);
		                    	 stack6.add(piece); }
		                     else if(stack9.size()>=1&&stack9.size()<=3&&stack9.peek()=="__") {				                                	  
		                         stack9.add(piece1);
		                         stack9.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }
		           if(No==3) {piece=stack5.pop();
		                      piece1=stack5.pop();
		                      piece2=stack5.pop();
		                      if(stack1.size()>=1&&stack1.size()<=2&&stack1.peek()=="__") {
		                        	 stack1.add(piece2);
		                        	 stack1.add(piece1);
		                        	 stack1.add(piece);}
		                      else if(stack6.size()>=1&&stack6.size()<=2&&stack6.peek()=="__") {
		                    	     stack6.add(piece2);
		                        	 stack6.add(piece1);
		                        	 stack6.add(piece);
		                      }else if(stack9.size()>=1&&stack9.size()<=2&&stack9.peek()=="__") {
		                    	     stack9.add(piece2);
		                        	 stack9.add(piece1);
		                        	 stack9.add(piece);
		                      } else {System.out.println("Invalid move");}
		           }}
		           else if(v4==5) {
		        	   if(No==1) {piece=stack5.pop();
	                      if(stack1.size()>=1&&stack1.size()<=4&&stack1.peek()=="__") {				                                	  
	           	              stack1.add(piece);}
	                      else if(stack6.size()>=1&&stack6.size()<=4&&stack6.peek()=="__") {
	                          stack6.add(piece); }
	                      else if(stack9.size()>=1&&stack9.size()<=4&&stack9.peek()=="__") {				                                	  
	                          stack9.add(piece);
	                    } else {System.out.println("Invalid move");}
	                      }
		           if(No==2) {piece=stack5.pop();
		                     piece1=stack5.pop();
		                     if(stack1.size()>=1&&stack1.size()<=3&&stack1.peek()=="__") {
		                    	 stack1.add(piece1);
		                    	 stack1.add(piece);}
		                     else if(stack6.size()>=1&&stack6.size()<=3&&stack6.peek()=="__") {
		                    	 stack6.add(piece1);
		                    	 stack6.add(piece); }
		                     else if(stack9.size()>=1&&stack9.size()<=3&&stack9.peek()=="__") {				                                	  
		                         stack9.add(piece1);
		                         stack9.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }
		           if(No==3) {piece=stack5.pop();
		                      piece1=stack5.pop();
		                      piece2=stack5.pop();
		                      if(stack1.size()>=1&&stack1.size()<=2&&stack1.peek()=="__") {
		                        	 stack1.add(piece2);
		                        	 stack1.add(piece1);
		                        	 stack1.add(piece);}
		                      else if(stack6.size()>=1&&stack6.size()<=2&&stack6.peek()=="__") {
		                    	     stack6.add(piece2);
		                        	 stack6.add(piece1);
		                        	 stack6.add(piece);
		                      }else if(stack9.size()>=1&&stack9.size()<=2&&stack9.peek()=="__") {
		                    	     stack9.add(piece2);
		                        	 stack9.add(piece1);
		                        	 stack9.add(piece);
		                      } else {System.out.println("Invalid move");}
		           }
		           if(No==4) { piece=stack5.pop();
		                       piece1=stack5.pop();
		                       piece2=stack5.pop();
		           		       piece3=stack5.pop();
		           		  if(stack1.size()==1&&stack1.peek()=="__") {
		           			         stack1.add(piece3);
		                        	 stack1.add(piece2);
		                        	 stack1.add(piece1);
		                        	 stack1.add(piece);}
		           		  else if(stack6.size()==1&&stack6.peek()=="__") {
		           			         stack6.add(piece3);
		                    	     stack6.add(piece2);
		                        	 stack6.add(piece1);
		                        	 stack6.add(piece);
		                      }else if(stack9.size()==1&&stack9.peek()=="__") {
		                    	     stack9.add(piece3);
		                    	     stack9.add(piece2);
		                        	 stack9.add(piece1);
		                        	 stack9.add(piece);
		                      }else {System.out.println("Invalid move");}
		            }
		            }else {System.out.println("Invalid move");}}
			      			if(Orow==1&&Ocol==1) {int v5=stack6.size();
			      			 if(v5==2) {if(No==1) {piece=stack6.pop();
		                      if(stack2.size()>=1&&stack2.size()<=4&&stack2.peek()=="__") {				                                	  
		          	               stack2.add(piece);}
		                      else if(stack5.size()>=1&&stack5.size()<=4&&stack5.peek()=="__") {
		                           stack5.add(piece); }
		                      else if(stack7.size()>=1&&stack7.size()<=4&&stack7.peek()=="__") {				                                	  
		                           stack7.add(piece);
		                     } else {System.out.println("Invalid move");}
		                      }}
		           else if(v5==3) {
		        	   if(No==1) {piece=stack6.pop();
	                      if(stack2.size()>=1&&stack2.size()<=4&&stack2.peek()=="__") {				                                	  
	          	               stack2.add(piece);}
	                      else if(stack5.size()>=1&&stack5.size()<=4&&stack5.peek()=="__") {
	                           stack5.add(piece); }
	                      else if(stack7.size()>=1&&stack7.size()<=4&&stack7.peek()=="__") {				                                	  
	                           stack7.add(piece);
	                     } else {System.out.println("Invalid move");}
	                      }
		           if(No==2) {piece=stack6.pop();
		                      piece1=stack6.pop();
		                     if(stack2.size()>=1&&stack2.size()<=3&&stack2.peek()=="__") {
		                    	 stack2.add(piece1);
		                    	 stack2.add(piece);}
		                     else if(stack5.size()>=1&&stack5.size()<=3&&stack5.peek()=="__") {
		                    	 stack5.add(piece1);
		                    	 stack5.add(piece); }
		                     else if(stack7.size()>=1&&stack7.size()<=3&&stack7.peek()=="__") {				                                	  
		                         stack7.add(piece1);
		                         stack7.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }}
		           else if(v5==4) {
		        	   if(No==1) {piece=stack6.pop();
	                      if(stack2.size()>=1&&stack2.size()<=4&&stack2.peek()=="__") {				                                	  
	          	               stack2.add(piece);}
	                      else if(stack5.size()>=1&&stack5.size()<=4&&stack5.peek()=="__") {
	                           stack5.add(piece); }
	                      else if(stack7.size()>=1&&stack7.size()<=4&&stack7.peek()=="__") {				                                	  
	                           stack7.add(piece);
	                     } else {System.out.println("Invalid move");}
	                      }
		           if(No==2) {piece=stack6.pop();
		                      piece1=stack6.pop();
		                     if(stack2.size()>=1&&stack2.size()<=3&&stack2.peek()=="__") {
		                    	 stack2.add(piece1);
		                    	 stack2.add(piece);}
		                     else if(stack5.size()>=1&&stack5.size()<=3&&stack5.peek()=="__") {
		                    	 stack5.add(piece1);
		                    	 stack5.add(piece); }
		                     else if(stack7.size()>=1&&stack7.size()<=3&&stack7.peek()=="__") {				                                	  
		                         stack7.add(piece1);
		                         stack7.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }
		           if(No==3) {piece=stack6.pop();
		                      piece1=stack6.pop();
		                      piece2=stack6.pop();
		                      if(stack2.size()>=1&&stack2.size()<=2&&stack2.peek()=="__") {
		                        	 stack2.add(piece2);
		                        	 stack2.add(piece1);
		                        	 stack2.add(piece);}
		                      else if(stack5.size()>=1&&stack5.size()<=2&&stack5.peek()=="__") {
		                    	     stack5.add(piece2);
		                        	 stack5.add(piece1);
		                        	 stack5.add(piece);
		                      }else if(stack7.size()>=1&&stack7.size()<=2&&stack7.peek()=="__") {
		                    	     stack7.add(piece2);
		                        	 stack7.add(piece1);
		                        	 stack7.add(piece);
		                      } else {System.out.println("Invalid move");}
		           }}
		           else if(v5==5) {
		        	   if(No==1) {piece=stack6.pop();
	                      if(stack2.size()>=1&&stack2.size()<=4&&stack2.peek()=="__") {				                                	  
	          	               stack2.add(piece);}
	                      else if(stack5.size()>=1&&stack5.size()<=4&&stack5.peek()=="__") {
	                           stack5.add(piece); }
	                      else if(stack7.size()>=1&&stack7.size()<=4&&stack7.peek()=="__") {				                                	  
	                           stack7.add(piece);
	                     } else {System.out.println("Invalid move");}
	                      }
		           if(No==2) {piece=stack6.pop();
		                      piece1=stack6.pop();
		                     if(stack2.size()>=1&&stack2.size()<=3&&stack2.peek()=="__") {
		                    	 stack2.add(piece1);
		                    	 stack2.add(piece);}
		                     else if(stack5.size()>=1&&stack5.size()<=3&&stack5.peek()=="__") {
		                    	 stack5.add(piece1);
		                    	 stack5.add(piece); }
		                     else if(stack7.size()>=1&&stack7.size()<=3&&stack7.peek()=="__") {				                                	  
		                         stack7.add(piece1);
		                         stack7.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }
		           if(No==3) {piece=stack6.pop();
		                      piece1=stack6.pop();
		                      piece2=stack6.pop();
		                      if(stack2.size()>=1&&stack2.size()<=2&&stack2.peek()=="__") {
		                        	 stack2.add(piece2);
		                        	 stack2.add(piece1);
		                        	 stack2.add(piece);}
		                      else if(stack5.size()>=1&&stack5.size()<=2&&stack5.peek()=="__") {
		                    	     stack5.add(piece2);
		                        	 stack5.add(piece1);
		                        	 stack5.add(piece);
		                      }else if(stack7.size()>=1&&stack7.size()<=2&&stack7.peek()=="__") {
		                    	     stack7.add(piece2);
		                        	 stack7.add(piece1);
		                        	 stack7.add(piece);
		                      } else {System.out.println("Invalid move");}
		           }
		           if(No==4) { piece=stack6.pop();
		                       piece1=stack6.pop();
		                       piece2=stack6.pop();
		          		       piece3=stack6.pop();
		          		  if(stack2.size()==1&&stack2.peek()=="__") {
		          			         stack2.add(piece3);
		                        	 stack2.add(piece2);
		                        	 stack2.add(piece1);
		                        	 stack2.add(piece);}
		          		  else if(stack5.size()==1&&stack5.peek()=="__") {
		          			         stack5.add(piece3);
		                    	     stack5.add(piece2);
		                        	 stack5.add(piece1);
		                        	 stack5.add(piece);
		                      }else if(stack7.size()==1&&stack7.peek()=="__") {
		                    	     stack7.add(piece3);
		                    	     stack7.add(piece2);
		                        	 stack7.add(piece1);
		                        	 stack7.add(piece);
		                      }else {System.out.println("Invalid move");}
		           }
		            }else {System.out.println("Invalid move");}}					      			
			      			 if(Orow==1&&Ocol==2) {int v6=stack7.size();
			      			 if(v6==2) {if(No==1) {piece=stack7.pop();
		                      if(stack3.size()>=1&&stack3.size()<=4&&stack3.peek()=="__") {				                                	  
		          	             stack3.add(piece);}
		                      else if(stack6.size()>=1&&stack6.size()<=4&&stack6.peek()=="__") {
		                          stack6.add(piece); }
		                       else if(stack8.size()>=1&&stack8.size()<=4&&stack8.peek()=="__") {				                                	  
		                          stack8.add(piece);
		                      } else {System.out.println("Invalid move");}
		                      }}
		           else if(v6==3) {
		        	   if(No==1) {piece=stack7.pop();
	                      if(stack3.size()>=1&&stack3.size()<=4&&stack3.peek()=="__") {				                                	  
	          	             stack3.add(piece);}
	                      else if(stack6.size()>=1&&stack6.size()<=4&&stack6.peek()=="__") {
	                          stack6.add(piece); }
	                       else if(stack8.size()>=1&&stack8.size()<=4&&stack8.peek()=="__") {				                                	  
	                          stack8.add(piece);
	                      } else {System.out.println("Invalid move");}
	                      }
		           if(No==2) {piece=stack7.pop();
		                     piece1=stack7.pop();
		                     if(stack3.size()>=1&&stack3.size()<=3&&stack3.peek()=="__") {
		                    	 stack3.add(piece1);
		                    	 stack3.add(piece);}
		                     else if(stack6.size()>=1&&stack6.size()<=3&&stack6.peek()=="__") {
		                    	 stack6.add(piece1);
		                    	 stack6.add(piece); }
		                     else if(stack8.size()>=1&&stack8.size()<=3&&stack8.peek()=="__") {				                                	  
		                          stack8.add(piece1);
		                          stack8.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }}
		           else if(v6==4) {
		        	   if(No==1) {piece=stack7.pop();
	                      if(stack3.size()>=1&&stack3.size()<=4&&stack3.peek()=="__") {				                                	  
	          	             stack3.add(piece);}
	                      else if(stack6.size()>=1&&stack6.size()<=4&&stack6.peek()=="__") {
	                          stack6.add(piece); }
	                       else if(stack8.size()>=1&&stack8.size()<=4&&stack8.peek()=="__") {				                                	  
	                          stack8.add(piece);
	                      } else {System.out.println("Invalid move");}
	                      }
		           if(No==2) {piece=stack7.pop();
		                     piece1=stack7.pop();
		                     if(stack3.size()>=1&&stack3.size()<=3&&stack3.peek()=="__") {
		                    	 stack3.add(piece1);
		                    	 stack3.add(piece);}
		                     else if(stack6.size()>=1&&stack6.size()<=3&&stack6.peek()=="__") {
		                    	 stack6.add(piece1);
		                    	 stack6.add(piece); }
		                     else if(stack8.size()>=1&&stack8.size()<=3&&stack8.peek()=="__") {				                                	  
		                          stack8.add(piece1);
		                          stack8.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }
		           if(No==3) {piece=stack7.pop();
		                      piece1=stack7.pop();
		                      piece2=stack7.pop();
		                      if(stack3.size()>=1&&stack3.size()<=2&&stack3.peek()=="__") {
		                        	 stack3.add(piece2);
		                        	 stack3.add(piece1);
		                        	 stack3.add(piece);}
		                      else if(stack6.size()>=1&&stack6.size()<=2&&stack6.peek()=="__") {
		                    	     stack6.add(piece2);
		                        	 stack6.add(piece1);
		                        	 stack6.add(piece);
		                      }else if(stack8.size()>=1&&stack8.size()<=2&&stack8.peek()=="__") {
		                    	     stack8.add(piece2);
		                        	 stack8.add(piece1);
		                        	 stack8.add(piece);
		                      } else {System.out.println("Invalid move");}
		           }}
		           else if(v6==5) {
		        	   if(No==1) {piece=stack7.pop();
	                      if(stack3.size()>=1&&stack3.size()<=4&&stack3.peek()=="__") {				                                	  
	          	             stack3.add(piece);}
	                      else if(stack6.size()>=1&&stack6.size()<=4&&stack6.peek()=="__") {
	                          stack6.add(piece); }
	                       else if(stack8.size()>=1&&stack8.size()<=4&&stack8.peek()=="__") {				                                	  
	                          stack8.add(piece);
	                      } else {System.out.println("Invalid move");}
	                      }
		           if(No==2) {piece=stack7.pop();
		                     piece1=stack7.pop();
		                     if(stack3.size()>=1&&stack3.size()<=3&&stack3.peek()=="__") {
		                    	 stack3.add(piece1);
		                    	 stack3.add(piece);}
		                     else if(stack6.size()>=1&&stack6.size()<=3&&stack6.peek()=="__") {
		                    	 stack6.add(piece1);
		                    	 stack6.add(piece); }
		                     else if(stack8.size()>=1&&stack8.size()<=3&&stack8.peek()=="__") {				                                	  
		                          stack8.add(piece1);
		                          stack8.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }
		           if(No==3) {piece=stack7.pop();
		                      piece1=stack7.pop();
		                      piece2=stack7.pop();
		                      if(stack3.size()>=1&&stack3.size()<=2&&stack3.peek()=="__") {
		                        	 stack3.add(piece2);
		                        	 stack3.add(piece1);
		                        	 stack3.add(piece);}
		                      else if(stack6.size()>=1&&stack6.size()<=2&&stack6.peek()=="__") {
		                    	     stack6.add(piece2);
		                        	 stack6.add(piece1);
		                        	 stack6.add(piece);
		                      }else if(stack8.size()>=1&&stack8.size()<=2&&stack8.peek()=="__") {
		                    	     stack8.add(piece2);
		                        	 stack8.add(piece1);
		                        	 stack8.add(piece);
		                      } else {System.out.println("Invalid move");}
		           }
		           if(No==4) { piece=stack7.pop();
		                       piece1=stack7.pop();
		                       piece2=stack7.pop();
		          		       piece3=stack7.pop();
		          		  if(stack3.size()==1&&stack3.peek()=="__") {
		          			         stack3.add(piece3);
		                        	 stack3.add(piece2);
		                        	 stack3.add(piece1);
		                        	 stack3.add(piece);}
		          		  else if(stack6.size()==1&&stack6.peek()=="__") {
		          			         stack6.add(piece3);
		                    	     stack6.add(piece2);
		                        	 stack6.add(piece1);
		                        	 stack6.add(piece);
		                 }else if(stack8.size()==1&&stack8.peek()=="__") {
		                    	     stack8.add(piece3);
		                    	     stack8.add(piece2);
		                        	 stack8.add(piece1);
		                        	 stack8.add(piece);
		                      }else {System.out.println("Invalid move");}
		           }
		            }else {System.out.println("Invalid move");}}
			      			 if(Orow==1&&Ocol==3) {int v7=stack8.size();
			      			if(v7==2) {if(No==1) {piece=stack8.pop();
		                      if(stack4.size()>=1&&stack4.size()<=4&&stack4.peek()=="__") {				                                	  
		        	                stack4.add(piece);}
		                      else if(stack7.size()>=1&&stack7.size()<=4&&stack7.peek()=="__") {
		                            stack7.add(piece); }
		                      else if(stack12.size()>=1&&stack12.size()<=4&&stack12.peek()=="__") {				                                	  
		                            stack12.add(piece);
		                    } else {System.out.println("Invalid move");}
		                      }}
		           else if(v7==3) {
		        	   if(No==1) {piece=stack8.pop();
	                      if(stack4.size()>=1&&stack4.size()<=4&&stack4.peek()=="__") {				                                	  
	        	                stack4.add(piece);}
	                      else if(stack7.size()>=1&&stack7.size()<=4&&stack7.peek()=="__") {
	                            stack7.add(piece); }
	                      else if(stack12.size()>=1&&stack12.size()<=4&&stack12.peek()=="__") {				                                	  
	                            stack12.add(piece);
	                    } else {System.out.println("Invalid move");}
	                      }
		           if(No==2) {piece=stack8.pop();
		                     piece1=stack8.pop();
		                     if(stack4.size()>=1&&stack4.size()<=3&&stack4.peek()=="__") {
		                    	 stack4.add(piece1);
		                    	  stack4.add(piece);}
		                     else if(stack7.size()>=1&&stack7.size()<=3&&stack7.peek()=="__") {
		                    	 stack7.add(piece1);
		                    	  stack7.add(piece); }
		                     else if(stack12.size()>=1&&stack12.size()<=3&&stack12.peek()=="__") {				                                	  
		                        	 stack12.add(piece1);
		                        	  stack12.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }}
		           else if(v7==4) {
		        	   if(No==1) {piece=stack8.pop();
	                      if(stack4.size()>=1&&stack4.size()<=4&&stack4.peek()=="__") {				                                	  
	        	                stack4.add(piece);}
	                      else if(stack7.size()>=1&&stack7.size()<=4&&stack7.peek()=="__") {
	                            stack7.add(piece); }
	                      else if(stack12.size()>=1&&stack12.size()<=4&&stack12.peek()=="__") {				                                	  
	                            stack12.add(piece);
	                    } else {System.out.println("Invalid move");}
	                      }
		           if(No==2) {piece=stack8.pop();
		                     piece1=stack8.pop();
		                     if(stack4.size()>=1&&stack4.size()<=3&&stack4.peek()=="__") {
		                    	 stack4.add(piece1);
		                    	  stack4.add(piece);}
		                     else if(stack7.size()>=1&&stack7.size()<=3&&stack7.peek()=="__") {
		                    	 stack7.add(piece1);
		                    	  stack7.add(piece); }
		                     else if(stack12.size()>=1&&stack12.size()<=3&&stack12.peek()=="__") {				                                	  
		                        	 stack12.add(piece1);
		                        	  stack12.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }
		           if(No==3) {piece=stack8.pop();
		                      piece1=stack8.pop();
		                      piece2=stack8.pop();
		                      if(stack4.size()>=1&&stack4.size()<=2&&stack4.peek()=="__") {
		                        	 stack4.add(piece2);
		                        	 stack4.add(piece1);
		                        	 stack4.add(piece);}
		                      else if(stack7.size()>=1&&stack7.size()<=2&&stack7.peek()=="__") {
		                    	     stack7.add(piece2);
		                        	 stack7.add(piece1);
		                        	 stack7.add(piece);
		                      }else if(stack12.size()>=1&&stack12.size()<=2&&stack12.peek()=="__") {
		                    	     stack12.add(piece2);
		                        	 stack12.add(piece1);
		                        	 stack12.add(piece);
		                      } else {System.out.println("Invalid move");}
		           }}
		           else if(v7==5) {
		        	   if(No==1) {piece=stack8.pop();
	                      if(stack4.size()>=1&&stack4.size()<=4&&stack4.peek()=="__") {				                                	  
	        	                stack4.add(piece);}
	                      else if(stack7.size()>=1&&stack7.size()<=4&&stack7.peek()=="__") {
	                            stack7.add(piece); }
	                      else if(stack12.size()>=1&&stack12.size()<=4&&stack12.peek()=="__") {				                                	  
	                            stack12.add(piece);
	                    } else {System.out.println("Invalid move");}
	                      }
		           if(No==2) {piece=stack8.pop();
		                     piece1=stack8.pop();
		                     if(stack4.size()>=1&&stack4.size()<=3&&stack4.peek()=="__") {
		                    	 stack4.add(piece1);
		                    	  stack4.add(piece);}
		                     else if(stack7.size()>=1&&stack7.size()<=3&&stack7.peek()=="__") {
		                    	 stack7.add(piece1);
		                    	  stack7.add(piece); }
		                     else if(stack12.size()>=1&&stack12.size()<=3&&stack12.peek()=="__") {				                                	  
		                        	 stack12.add(piece1);
		                        	  stack12.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }
		           if(No==3) {piece=stack8.pop();
		                      piece1=stack8.pop();
		                      piece2=stack8.pop();
		                      if(stack4.size()>=1&&stack4.size()<=2&&stack4.peek()=="__") {
		                        	 stack4.add(piece2);
		                        	 stack4.add(piece1);
		                        	 stack4.add(piece);}
		                      else if(stack7.size()>=1&&stack7.size()<=2&&stack7.peek()=="__") {
		                    	     stack7.add(piece2);
		                        	 stack7.add(piece1);
		                        	 stack7.add(piece);
		                      }else if(stack12.size()>=1&&stack12.size()<=2&&stack12.peek()=="__") {
		                    	     stack12.add(piece2);
		                        	 stack12.add(piece1);
		                        	 stack12.add(piece);
		                      } else {System.out.println("Invalid move");}
		           }
		           if(No==4) { piece=stack8.pop();
		                      piece1=stack8.pop();
		                  piece2=stack8.pop();
		        		  piece3=stack8.pop();
		        		  if(stack4.size()==1&&stack4.peek()=="__") {
		        			         stack4.add(piece3);
		                        	 stack4.add(piece2);
		                        	 stack4.add(piece1);
		                        	 stack4.add(piece);}
		        		  else if(stack7.size()==1&&stack7.peek()=="__") {
		        			         stack7.add(piece3);
		                    	     stack7.add(piece2);
		                        	 stack7.add(piece1);
		                        	 stack7.add(piece);
		                      }else if(stack12.size()==1&&stack12.peek()=="__") {
		                    	     stack12.add(piece3);
		                    	     stack12.add(piece2);
		                        	 stack12.add(piece1);
		                        	 stack12.add(piece);
		                      }else {System.out.println("Invalid move");}
		         }
		            }else {System.out.println("Invalid move");}}
			      			 if(Orow==2&&Ocol==0) {int v8=stack9.size();
			      			if(v8==2) {if(No==1) {piece=stack9.pop();
		                      if(stack5.size()>=1&&stack5.size()<=4&&stack5.peek()=="__") {				                                	  
		        	          stack5.add(piece);}
		                      else if(stack10.size()>=1&&stack10.size()<=4&&stack10.peek()=="__") {
		                        	  stack10.add(piece); }
		                         else if(stack15.size()>=1&&stack15.size()<=4&&stack15.peek()=="__") {				                                	  
		                            	  stack15.add(piece);
		                          } else {System.out.println("Invalid move");}
		                      }}
		           else if(v8==3) {
		        	   if(No==1) {piece=stack9.pop();
	                      if(stack5.size()>=1&&stack5.size()<=4&&stack5.peek()=="__") {				                                	  
	        	                 stack5.add(piece);}
	                      else if(stack10.size()>=1&&stack10.size()<=4&&stack10.peek()=="__") {
	                        	  stack10.add(piece); }
	                      else if(stack15.size()>=1&&stack15.size()<=4&&stack15.peek()=="__") {				                                	  
	                                stack15.add(piece);
	                   } else {System.out.println("Invalid move");}}
		           if(No==2) {piece=stack9.pop();
		                     piece1=stack9.pop();
		                     if(stack5.size()>=1&&stack5.size()<=3&&stack5.peek()=="__") {
		                    	 stack5.add(piece1);
		                    	  stack5.add(piece);}
		                     else if(stack10.size()>=1&&stack10.size()<=3&&stack10.peek()=="__") {
		                    	 stack10.add(piece1);
		                    	  stack10.add(piece); }
		                     else if(stack15.size()>=1&&stack15.size()<=3&&stack15.peek()=="__") {				                                	  
		                        	 stack15.add(piece1);
		                        	  stack15.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }}
		           else if(v8==4) {
		        	   if(No==1) {piece=stack9.pop();
	                      if(stack5.size()>=1&&stack5.size()<=4&&stack5.peek()=="__") {				                                	  
	        	          stack5.add(piece);}
	                      else if(stack10.size()>=1&&stack10.size()<=4&&stack10.peek()=="__") {
	                        	  stack10.add(piece); }
	                         else if(stack13.size()>=1&&stack13.size()<=4&&stack13.peek()=="__") {				                                	  
	                            	  stack13.add(piece);
	                          } else {System.out.println("Invalid move");}}
		           if(No==2) {piece=stack9.pop();
		                     piece1=stack9.pop();
		                     if(stack5.size()>=1&&stack5.size()<=3&&stack5.peek()=="__") {
		                    	 stack5.add(piece1);
		                    	  stack5.add(piece);}
		                     else if(stack10.size()>=1&&stack10.size()<=3&&stack10.peek()=="__") {
		                    	 stack10.add(piece1);
		                    	  stack10.add(piece); }
		                     else if(stack13.size()>=1&&stack13.size()<=3&&stack13.peek()=="__") {				                                	  
		                        	 stack13.add(piece1);
		                        	  stack13.add(piece);} 
		                     else {System.out.println("Invalid move");} }
		           if(No==3) {piece=stack9.pop();
		                      piece1=stack9.pop();
		                      piece2=stack9.pop();
		                      if(stack5.size()>=1&&stack5.size()<=2&&stack5.peek()=="__") {
		                        	 stack5.add(piece2);
		                        	 stack5.add(piece1);
		                        	 stack5.add(piece);}
		                      else if(stack10.size()>=1&&stack10.size()<=2&&stack10.peek()=="__") {
		                    	     stack10.add(piece2);
		                        	 stack10.add(piece1);
		                        	 stack10.add(piece);
		                      }else if(stack13.size()>=1&&stack13.size()<=2&&stack13.peek()=="__") {
		                    	     stack13.add(piece2);
		                        	 stack13.add(piece1);
		                        	 stack13.add(piece);
		                      } else {System.out.println("Invalid move");}
		           }}
		           else if(v8==5) {
		        	   if(No==1) {piece=stack9.pop();
	                      if(stack5.size()>=1&&stack5.size()<=4&&stack5.peek()=="__") {				                                	  
	        	          stack5.add(piece);}
	                      else if(stack10.size()>=1&&stack10.size()<=4&&stack10.peek()=="__") {
	                        	  stack10.add(piece); }
	                         else if(stack13.size()>=1&&stack13.size()<=4&&stack13.peek()=="__") {				                                	  
	                            	  stack13.add(piece);
	                          } else {System.out.println("Invalid move");}}
		           if(No==2) {piece=stack9.pop();
		                     piece1=stack9.pop();
		                     if(stack5.size()>=1&&stack5.size()<=3&&stack5.peek()=="__") {
		                    	 stack5.add(piece1);
		                    	  stack5.add(piece);}
		                     else if(stack10.size()>=1&&stack10.size()<=3&&stack10.peek()=="__") {
		                    	 stack10.add(piece1);
		                    	  stack10.add(piece); }
		                     else if(stack13.size()>=1&&stack13.size()<=3&&stack13.peek()=="__") {				                                	  
		                        	 stack13.add(piece1);
		                        	  stack13.add(piece);} 
		                     else {System.out.println("Invalid move");} }
		           if(No==3) {piece=stack9.pop();
		                      piece1=stack9.pop();
		                      piece2=stack9.pop();
		                      if(stack5.size()>=1&&stack5.size()<=2&&stack5.peek()=="__") {
		                        	 stack5.add(piece2);
		                        	 stack5.add(piece1);
		                        	 stack5.add(piece);}
		                      else if(stack10.size()>=1&&stack10.size()<=2&&stack10.peek()=="__") {
		                    	     stack10.add(piece2);
		                        	 stack10.add(piece1);
		                        	 stack10.add(piece);
		                      }else if(stack13.size()>=1&&stack13.size()<=2&&stack13.peek()=="__") {
		                    	     stack13.add(piece2);
		                        	 stack13.add(piece1);
		                        	 stack13.add(piece);
		                      } else {System.out.println("Invalid move");}
		           }
		           if(No==4) { piece=stack9.pop();
		                       piece1=stack9.pop();
		                       piece2=stack9.pop();
		        		       piece3=stack9.pop();
		        		  if(stack5.size()==1&&stack5.peek()=="__") {
		        			         stack5.add(piece3);
		                        	 stack5.add(piece2);
		                        	 stack5.add(piece1);
		                        	 stack5.add(piece);}
		        		  else if(stack10.size()==1&&stack10.peek()=="__") {
		        			         stack10.add(piece3);
		                    	     stack10.add(piece2);
		                        	 stack10.add(piece1);
		                        	 stack10.add(piece);
		                      }else if(stack15.size()==1&&stack15.peek()=="__") {
		                    	     stack15.add(piece3);
		                    	     stack15.add(piece2);
		                        	 stack15.add(piece1);
		                        	 stack15.add(piece);
		                      }else {System.out.println("Invalid move");}
		         }
		            }else {System.out.println("Invalid move");}}
			      			 if(Orow==2&&Ocol==1) {int v9=stack10.size();
			      			if(v9==2) {if(No==1) {piece=stack10.pop();
		                      if(stack6.size()>=1&&stack6.size()<=4&&stack6.peek()=="__") {				                                	  
		      	                    stack6.add(piece);}
		                      else if(stack9.size()>=1&&stack9.size()<=4&&stack9.peek()=="__") {
		                        	  stack9.add(piece); }
		                      else if(stack11.size()>=1&&stack11.size()<=4&&stack11.peek()=="__") {				                                	  
		                            	  stack11.add(piece);
		                    } else {System.out.println("Invalid move");}
		                      }}
		           else if(v9==3) {
		        	   if(No==1) {piece=stack10.pop();
	                      if(stack6.size()>=1&&stack6.size()<=4&&stack6.peek()=="__") {				                                	  
	      	                    stack6.add(piece);}
	                      else if(stack9.size()>=1&&stack9.size()<=4&&stack9.peek()=="__") {
	                        	  stack9.add(piece); }
	                      else if(stack11.size()>=1&&stack11.size()<=4&&stack11.peek()=="__") {				                                	  
	                            	  stack11.add(piece);
	                    } else {System.out.println("Invalid move");}
	                      }
		           if(No==2) {piece=stack10.pop();
		                     piece1=stack10.pop();
		                     if(stack6.size()>=1&&stack6.size()<=3&&stack6.peek()=="__") {
		                    	 stack6.add(piece1);
		                    	  stack6.add(piece);}
		                     else if(stack9.size()>=1&&stack9.size()<=3&&stack9.peek()=="__") {
		                    	 stack9.add(piece1);
		                    	  stack9.add(piece); }
		                     else if(stack11.size()>=1&&stack11.size()<=3&&stack11.peek()=="__") {				                                	  
		                        	 stack11.add(piece1);
		                        	  stack11.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }}
		           else if(v9==4) {
		        	   if(No==1) {piece=stack10.pop();
	                      if(stack6.size()>=1&&stack6.size()<=4&&stack6.peek()=="__") {				                                	  
	      	                    stack6.add(piece);}
	                      else if(stack9.size()>=1&&stack9.size()<=4&&stack9.peek()=="__") {
	                        	  stack9.add(piece); }
	                      else if(stack11.size()>=1&&stack11.size()<=4&&stack11.peek()=="__") {				                                	  
	                            	  stack11.add(piece);
	                    } else {System.out.println("Invalid move");}
	                      }
		           if(No==2) {piece=stack10.pop();
		                     piece1=stack10.pop();
		                     if(stack6.size()>=1&&stack6.size()<=3&&stack6.peek()=="__") {
		                    	 stack6.add(piece1);
		                    	  stack6.add(piece);}
		                     else if(stack9.size()>=1&&stack9.size()<=3&&stack9.peek()=="__") {
		                    	 stack9.add(piece1);
		                    	  stack9.add(piece); }
		                     else if(stack11.size()>=1&&stack11.size()<=3&&stack11.peek()=="__") {				                                	  
		                        	 stack11.add(piece1);
		                        	  stack11.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }
		           if(No==3) {piece=stack10.pop();
		                      piece1=stack10.pop();
		                      piece2=stack10.pop();
		                      if(stack6.size()>=1&&stack6.size()<=2&&stack6.peek()=="__") {
		                        	 stack6.add(piece2);
		                        	 stack6.add(piece1);
		                        	 stack6.add(piece);}
		                      else if(stack9.size()>=1&&stack9.size()<=2&&stack9.peek()=="__") {
		                    	     stack9.add(piece2);
		                        	 stack9.add(piece1);
		                        	 stack9.add(piece);
		                      }else if(stack11.size()>=1&&stack11.size()<=2&&stack11.peek()=="__") {
		                    	     stack11.add(piece2);
		                        	 stack11.add(piece1);
		                        	 stack11.add(piece);
		                      } else {System.out.println("Invalid move");}
		           }}
		           else if(v9==5) {
		        	   if(No==1) {piece=stack10.pop();
	                      if(stack6.size()>=1&&stack6.size()<=4&&stack6.peek()=="__") {				                                	  
	      	                    stack6.add(piece);}
	                      else if(stack9.size()>=1&&stack9.size()<=4&&stack9.peek()=="__") {
	                        	  stack9.add(piece); }
	                      else if(stack11.size()>=1&&stack11.size()<=4&&stack11.peek()=="__") {				                                	  
	                            	  stack11.add(piece);
	                    } else {System.out.println("Invalid move");}
	                      }
		           if(No==2) {piece=stack10.pop();
		                     piece1=stack10.pop();
		                     if(stack6.size()>=1&&stack6.size()<=3&&stack6.peek()=="__") {
		                    	 stack6.add(piece1);
		                    	  stack6.add(piece);}
		                     else if(stack9.size()>=1&&stack9.size()<=3&&stack9.peek()=="__") {
		                    	 stack9.add(piece1);
		                    	  stack9.add(piece); }
		                     else if(stack11.size()>=1&&stack11.size()<=3&&stack11.peek()=="__") {				                                	  
		                        	 stack11.add(piece1);
		                        	  stack11.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }
		           if(No==3) {piece=stack10.pop();
		                      piece1=stack10.pop();
		                      piece2=stack10.pop();
		                      if(stack6.size()>=1&&stack6.size()<=2&&stack6.peek()=="__") {
		                        	 stack6.add(piece2);
		                        	 stack6.add(piece1);
		                        	 stack6.add(piece);}
		                      else if(stack9.size()>=1&&stack9.size()<=2&&stack9.peek()=="__") {
		                    	     stack9.add(piece2);
		                        	 stack9.add(piece1);
		                        	 stack9.add(piece);
		                      }else if(stack11.size()>=1&&stack11.size()<=2&&stack11.peek()=="__") {
		                    	     stack11.add(piece2);
		                        	 stack11.add(piece1);
		                        	 stack11.add(piece);
		                      } else {System.out.println("Invalid move");}
		           }
		           if(No==4) { piece=stack10.pop();
		                       piece1=stack10.pop();
		                       piece2=stack10.pop();
		      		           piece3=stack10.pop();
		      		  if(stack6.size()==1&&stack6.peek()=="__") {
		      			             stack6.add(piece3);
		                        	 stack6.add(piece2);
		                        	 stack6.add(piece1);
		                        	 stack6.add(piece);}
		      		  else if(stack9.size()==1&&stack9.peek()=="__") {
		      			             stack9.add(piece3);
		                    	     stack9.add(piece2);
		                        	 stack9.add(piece1);
		                        	 stack9.add(piece);
		                      }else if(stack11.size()==1&&stack11.peek()=="__") {
		                    	     stack11.add(piece3);
		                    	     stack11.add(piece2);
		                        	 stack11.add(piece1);
		                        	 stack11.add(piece);
		                      }else {System.out.println("Invalid move");}
		       }
		            }else {System.out.println("Invalid move");}}
			      			 if(Orow==2&&Ocol==2) {int v10=stack11.size();
			      			if(v10==2) {if(No==1) {piece=stack11.pop();
		                      if(stack7.size()>=1&&stack7.size()<=4&&stack7.peek()=="__") {				                                	  
		      	          stack7.add(piece);}
		                      else if(stack10.size()>=1&&stack10.size()<=4&&stack10.peek()=="__") {
		                        	  stack10.add(piece); }
		                         else if(stack12.size()>=1&&stack12.size()<=4&&stack12.peek()=="__") {				                                	  
		                            	  stack12.add(piece);
		                          } else {System.out.println("Invalid move");}
		                      }}
		           else if(v10==3) {
		        	   if(No==1) {piece=stack11.pop();
	                      if(stack7.size()>=1&&stack7.size()<=4&&stack7.peek()=="__") {				                                	  
	      	          stack7.add(piece);}
	                      else if(stack10.size()>=1&&stack10.size()<=4&&stack10.peek()=="__") {
	                        	  stack10.add(piece); }
	                         else if(stack12.size()>=1&&stack12.size()<=4&&stack12.peek()=="__") {				                                	  
	                            	  stack12.add(piece);
	                          } else {System.out.println("Invalid move");}
	                      }
		           if(No==2) {piece=stack11.pop();
		                     piece1=stack11.pop();
		                     if(stack7.size()>=1&&stack7.size()<=3&&stack7.peek()=="__") {
		                    	 stack7.add(piece1);
		                    	  stack7.add(piece);}
		                     else if(stack10.size()>=1&&stack10.size()<=3&&stack10.peek()=="__") {
		                    	 stack10.add(piece1);
		                    	  stack10.add(piece); }
		                     else if(stack12.size()>=1&&stack12.size()<=3&&stack12.peek()=="__") {				                                	  
		                        	 stack12.add(piece1);
		                        	  stack12.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }}
		           else if(v10==4) {
		        	   if(No==1) {piece=stack11.pop();
	                      if(stack7.size()>=1&&stack7.size()<=4&&stack7.peek()=="__") {				                                	  
	      	          stack7.add(piece);}
	                      else if(stack10.size()>=1&&stack10.size()<=4&&stack10.peek()=="__") {
	                        	  stack10.add(piece); }
	                         else if(stack12.size()>=1&&stack12.size()<=4&&stack12.peek()=="__") {				                                	  
	                            	  stack12.add(piece);
	                          } else {System.out.println("Invalid move");}
	                      }
		           if(No==2) {piece=stack11.pop();
		                     piece1=stack11.pop();
		                     if(stack7.size()>=1&&stack7.size()<=3&&stack7.peek()=="__") {
		                    	 stack7.add(piece1);
		                    	  stack7.add(piece);}
		                     else if(stack10.size()>=1&&stack10.size()<=3&&stack10.peek()=="__") {
		                    	 stack10.add(piece1);
		                    	  stack10.add(piece); }
		                     else if(stack12.size()>=1&&stack12.size()<=3&&stack12.peek()=="__") {				                                	  
		                        	 stack12.add(piece1);
		                        	  stack12.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }
		           if(No==3) {piece=stack11.pop();
		                      piece1=stack11.pop();
		                      piece2=stack11.pop();
		                      if(stack7.size()>=1&&stack7.size()<=2&&stack7.peek()=="__") {
		                        	 stack7.add(piece2);
		                        	 stack7.add(piece1);
		                        	 stack7.add(piece);}
		                      else if(stack10.size()>=1&&stack10.size()<=2&&stack10.peek()=="__") {
		                    	     stack10.add(piece2);
		                        	 stack10.add(piece1);
		                        	 stack10.add(piece);
		                      }else if(stack12.size()>=1&&stack12.size()<=2&&stack12.peek()=="__") {
		                    	     stack12.add(piece2);
		                        	 stack12.add(piece1);
		                        	 stack12.add(piece);
		                      } else {System.out.println("Invalid move");}
		           }}
		           else if(v10==5) {
		        	   if(No==1) {piece=stack11.pop();
	                      if(stack7.size()>=1&&stack7.size()<=4&&stack7.peek()=="__") {				                                	  
	      	          stack7.add(piece);}
	                      else if(stack10.size()>=1&&stack10.size()<=4&&stack10.peek()=="__") {
	                        	  stack10.add(piece); }
	                         else if(stack12.size()>=1&&stack12.size()<=4&&stack12.peek()=="__") {				                                	  
	                            	  stack12.add(piece);
	                          } else {System.out.println("Invalid move");}
	                      }
		           if(No==2) {piece=stack11.pop();
		                     piece1=stack11.pop();
		                     if(stack7.size()>=1&&stack7.size()<=3&&stack7.peek()=="__") {
		                    	 stack7.add(piece1);
		                    	  stack7.add(piece);}
		                     else if(stack10.size()>=1&&stack10.size()<=3&&stack10.peek()=="__") {
		                    	 stack10.add(piece1);
		                    	  stack10.add(piece); }
		                     else if(stack12.size()>=1&&stack12.size()<=3&&stack12.peek()=="__") {				                                	  
		                        	 stack12.add(piece1);
		                        	  stack12.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }
		           if(No==3) {piece=stack11.pop();
		                      piece1=stack11.pop();
		                      piece2=stack11.pop();
		                      if(stack7.size()>=1&&stack7.size()<=2&&stack7.peek()=="__") {
		                        	 stack7.add(piece2);
		                        	 stack7.add(piece1);
		                        	 stack7.add(piece);}
		                      else if(stack10.size()>=1&&stack10.size()<=2&&stack10.peek()=="__") {
		                    	     stack10.add(piece2);
		                        	 stack10.add(piece1);
		                        	 stack10.add(piece);
		                      }else if(stack12.size()>=1&&stack12.size()<=2&&stack12.peek()=="__") {
		                    	     stack12.add(piece2);
		                        	 stack12.add(piece1);
		                        	 stack12.add(piece);
		                      } else {System.out.println("Invalid move");}
		           }
		           if(No==4) { piece=stack11.pop();
		                       piece1=stack11.pop();
		                       piece2=stack11.pop();
		      		           piece3=stack11.pop();
		      		  if(stack7.size()==1&&stack7.peek()=="__") {
		      			             stack7.add(piece3);
		                        	 stack7.add(piece2);
		                        	 stack7.add(piece1);
		                        	 stack7.add(piece);}
		      		  else if(stack10.size()==1&&stack10.peek()=="__") {
		      			             stack10.add(piece3);
		                    	     stack10.add(piece2);
		                        	 stack10.add(piece1);
		                        	 stack10.add(piece);
		                      }else if(stack12.size()==1&&stack12.peek()=="__") {
		                    	     stack12.add(piece3);
		                    	     stack12.add(piece2);
		                        	 stack12.add(piece1);
		                        	 stack12.add(piece);
		                      }else {System.out.println("Invalid move");}
		       }
		            }else {System.out.println("Invalid move");}}
			      			 if(Orow==2&&Ocol==3) {int v11=stack12.size();
			      			if(v11==2) {if(No==1) {piece=stack12.pop();
		                      if(stack8.size()>=1&&stack8.size()<=4&&stack8.peek()=="__") {				                                	  
		    	          stack8.add(piece);}
		                      else if(stack11.size()>=1&&stack11.size()<=4&&stack11.peek()=="__") {
		                        	  stack11.add(piece); }
		                         else if(stack16.size()>=1&&stack16.size()<=4&&stack16.peek()=="__") {				                                	  
		                            	  stack16.add(piece);
		                          } else {System.out.println("Invalid move");}
		                      }}
		           else if(v11==3) {
		        	   if(No==1) {piece=stack12.pop();
	                      if(stack8.size()>=1&&stack8.size()<=4&&stack8.peek()=="__") {				                                	  
	    	          stack8.add(piece);}
	                      else if(stack11.size()>=1&&stack11.size()<=4&&stack11.peek()=="__") {
	                        	  stack11.add(piece); }
	                         else if(stack16.size()>=1&&stack16.size()<=4&&stack16.peek()=="__") {				                                	  
	                            	  stack16.add(piece);
	                          } else {System.out.println("Invalid move");}
	                      }
		           if(No==2) {piece=stack12.pop();
		                     piece1=stack12.pop()+stack12.pop();
		                     if(stack8.size()>=1&&stack8.size()<=3&&stack8.peek()=="__") {
		                    	 stack8.add(piece1);
		                    	  stack8.add(piece);}
		                     else if(stack11.size()>=1&&stack11.size()<=3&&stack11.peek()=="__") {
		                    	 stack11.add(piece1);
		                    	  stack11.add(piece); }
		                     else if(stack16.size()>=1&&stack16.size()<=3&&stack16.peek()=="__") {				                                	  
		                        	 stack16.add(piece1);
		                        	  stack16.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }}
		           else if(v11==4) {
		        	   if(No==1) {piece=stack12.pop();
	                      if(stack8.size()>=1&&stack8.size()<=4&&stack8.peek()=="__") {				                                	  
	    	          stack8.add(piece);}
	                      else if(stack11.size()>=1&&stack11.size()<=4&&stack11.peek()=="__") {
	                        	  stack11.add(piece); }
	                         else if(stack16.size()>=1&&stack16.size()<=4&&stack16.peek()=="__") {				                                	  
	                            	  stack16.add(piece);
	                          } else {System.out.println("Invalid move");}
	                      }
		           if(No==2) {piece=stack12.pop();
		                     piece1=stack12.pop()+stack12.pop();
		                     if(stack8.size()>=1&&stack8.size()<=3&&stack8.peek()=="__") {
		                    	 stack8.add(piece1);
		                    	  stack8.add(piece);}
		                     else if(stack11.size()>=1&&stack11.size()<=3&&stack11.peek()=="__") {
		                    	 stack11.add(piece1);
		                    	  stack11.add(piece); }
		                     else if(stack16.size()>=1&&stack16.size()<=3&&stack16.peek()=="__") {				                                	  
		                        	 stack16.add(piece1);
		                        	  stack16.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }
		           if(No==3) {piece=stack12.pop();
		                      piece1=stack12.pop();
		                      piece2=stack12.pop();
		                      if(stack8.size()>=1&&stack8.size()<=2&&stack8.peek()=="__") {
		                        	 stack8.add(piece2);
		                        	 stack8.add(piece1);
		                        	 stack8.add(piece);}
		                      else if(stack11.size()>=1&&stack11.size()<=2&&stack11.peek()=="__") {
		                    	     stack11.add(piece2);
		                        	 stack11.add(piece1);
		                        	 stack11.add(piece);
		                      }else if(stack16.size()>=1&&stack16.size()<=2&&stack16.peek()=="__") {
		                    	     stack16.add(piece2);
		                        	 stack16.add(piece1);
		                        	 stack16.add(piece);
		                      } else {System.out.println("Invalid move");}
		           }}
		           else if(v11==5) {
		        	   if(No==1) {piece=stack12.pop();
	                      if(stack8.size()>=1&&stack8.size()<=4&&stack8.peek()=="__") {				                                	  
	    	          stack8.add(piece);}
	                      else if(stack11.size()>=1&&stack11.size()<=4&&stack11.peek()=="__") {
	                        	  stack11.add(piece); }
	                         else if(stack16.size()>=1&&stack16.size()<=4&&stack16.peek()=="__") {				                                	  
	                            	  stack16.add(piece);
	                          } else {System.out.println("Invalid move");}
	                      }
		           if(No==2) {piece=stack12.pop();
		                     piece1=stack12.pop()+stack12.pop();
		                     if(stack8.size()>=1&&stack8.size()<=3&&stack8.peek()=="__") {
		                    	 stack8.add(piece1);
		                    	  stack8.add(piece);}
		                     else if(stack11.size()>=1&&stack11.size()<=3&&stack11.peek()=="__") {
		                    	 stack11.add(piece1);
		                    	  stack11.add(piece); }
		                     else if(stack16.size()>=1&&stack16.size()<=3&&stack16.peek()=="__") {				                                	  
		                        	 stack16.add(piece1);
		                        	  stack16.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }
		           if(No==3) {piece=stack12.pop();
		                      piece1=stack12.pop();
		                      piece2=stack12.pop();
		                      if(stack8.size()>=1&&stack8.size()<=2&&stack8.peek()=="__") {
		                        	 stack8.add(piece2);
		                        	 stack8.add(piece1);
		                        	 stack8.add(piece);}
		                      else if(stack11.size()>=1&&stack11.size()<=2&&stack11.peek()=="__") {
		                    	     stack11.add(piece2);
		                        	 stack11.add(piece1);
		                        	 stack11.add(piece);
		                      }else if(stack16.size()>=1&&stack16.size()<=2&&stack16.peek()=="__") {
		                    	     stack16.add(piece2);
		                        	 stack16.add(piece1);
		                        	 stack16.add(piece);
		                      } else {System.out.println("Invalid move");}
		           }
		           if(No==4) { piece=stack12.pop();
		                       piece1=stack12.pop();
		                       piece2=stack12.pop();
		    		           piece3=stack12.pop();
		    		  if(stack8.size()==1&&stack8.peek()=="__") {
		    			             stack8.add(piece3);
		                        	 stack8.add(piece2);
		                        	 stack8.add(piece1);
		                        	 stack8.add(piece);}
		    		  else if(stack11.size()==1&&stack11.peek()=="__") {
		    			             stack11.add(piece3);
		                    	     stack11.add(piece2);
		                        	 stack11.add(piece1);
		                        	 stack11.add(piece);
		                      }else if(stack16.size()==1&&stack16.peek()=="__") {
		                    	     stack16.add(piece3);
		                    	     stack16.add(piece2);
		                        	 stack16.add(piece1);
		                        	 stack16.add(piece);
		                      }else {System.out.println("Invalid move");}
		     }
		            }else {System.out.println("Invalid move");}}
			      			 if(Orow==3&&Ocol==0) {int v12=stack13.size();
			      			if(v12==2) {if(No==1) {piece=stack13.pop();
		                      if(stack9.size()>=1&&stack9.size()<=4&&stack9.peek()=="__") {				                                	  
		    	                   stack9.add(piece);}
		                      else if(stack14.size()>=1&&stack14.size()<=4&&stack14.peek()=="__") {
		                        	  stack14.add(piece); }
		                         else if(stack10.size()>=1&&stack10.size()<=4&&stack10.peek()=="__") {				                                	  
		                            	  stack10.add(piece);
		                          } else {System.out.println("Invalid move");}
		                      }}
		           else if(v12==3) {
		        	   if(No==1) {piece=stack13.pop();
	                      if(stack9.size()>=1&&stack9.size()<=4&&stack9.peek()=="__") {				                                	  
	    	                   stack9.add(piece);}
	                      else if(stack14.size()>=1&&stack14.size()<=4&&stack14.peek()=="__") {
	                        	  stack14.add(piece); }
	                         else if(stack10.size()>=1&&stack10.size()<=4&&stack10.peek()=="__") {				                                	  
	                            	  stack10.add(piece);
	                          } else {System.out.println("Invalid move");}
	                      }
		           if(No==2) {piece=stack13.pop();
		                     piece1=stack13.pop();
		                     if(stack9.size()>=1&&stack9.size()<=3&&stack9.peek()=="__") {
		                    	 stack9.add(piece1);
		                    	  stack9.add(piece);}
		                     else if(stack14.size()>=1&&stack14.size()<=3&&stack14.peek()=="__") {
		                    	 stack14.add(piece1);
		                    	  stack14.add(piece); }
		                     else if(stack10.size()>=1&&stack10.size()<=3&&stack10.peek()=="__") {				                                	  
		                        	 stack10.add(piece1);
		                        	  stack10.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }}
		           else if(v12==4) {
		        	   if(No==1) {piece=stack13.pop();
	                      if(stack9.size()>=1&&stack9.size()<=4&&stack9.peek()=="__") {				                                	  
	    	                   stack9.add(piece);}
	                      else if(stack14.size()>=1&&stack14.size()<=4&&stack14.peek()=="__") {
	                        	  stack14.add(piece); }
	                         else if(stack10.size()>=1&&stack10.size()<=4&&stack10.peek()=="__") {				                                	  
	                            	  stack10.add(piece);
	                          } else {System.out.println("Invalid move");}
	                      }
		           if(No==2) {piece=stack13.pop();
		                     piece1=stack13.pop();
		                     if(stack9.size()>=1&&stack9.size()<=3&&stack9.peek()=="__") {
		                    	 stack9.add(piece1);
		                    	  stack9.add(piece);}
		                     else if(stack14.size()>=1&&stack14.size()<=3&&stack14.peek()=="__") {
		                    	 stack14.add(piece1);
		                    	  stack14.add(piece); }
		                     else if(stack10.size()>=1&&stack10.size()<=3&&stack10.peek()=="__") {				                                	  
		                        	 stack10.add(piece1);
		                        	  stack10.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }
		           if(No==3) {piece=stack13.pop();
		                      piece1=stack13.pop();
		                      piece2=stack13.pop();
		                      if(stack9.size()>=1&&stack9.size()<=2&&stack9.peek()=="__") {
		                        	 stack9.add(piece2);
		                        	 stack9.add(piece1);
		                        	 stack9.add(piece);}
		                      else if(stack14.size()>=1&&stack14.size()<=2&&stack14.peek()=="__") {
		                    	     stack14.add(piece2);
		                        	 stack14.add(piece1);
		                        	 stack14.add(piece);
		                      }else if(stack10.size()>=1&&stack10.size()<=2&&stack10.peek()=="__") {
		                    	     stack10.add(piece2);
		                        	 stack10.add(piece1);
		                        	 stack10.add(piece);
		                      } else {System.out.println("Invalid move");}
		           }}
		           else if(v12==5) {
		        	   if(No==1) {piece=stack13.pop();
	                      if(stack9.size()>=1&&stack9.size()<=4&&stack9.peek()=="__") {				                                	  
	    	                   stack9.add(piece);}
	                      else if(stack14.size()>=1&&stack14.size()<=4&&stack14.peek()=="__") {
	                        	  stack14.add(piece); }
	                         else if(stack10.size()>=1&&stack10.size()<=4&&stack10.peek()=="__") {				                                	  
	                            	  stack10.add(piece);
	                          } else {System.out.println("Invalid move");}
	                      }
		           if(No==2) {piece=stack13.pop();
		                     piece1=stack13.pop();
		                     if(stack9.size()>=1&&stack9.size()<=3&&stack9.peek()=="__") {
		                    	 stack9.add(piece1);
		                    	  stack9.add(piece);}
		                     else if(stack14.size()>=1&&stack14.size()<=3&&stack14.peek()=="__") {
		                    	 stack14.add(piece1);
		                    	  stack14.add(piece); }
		                     else if(stack10.size()>=1&&stack10.size()<=3&&stack10.peek()=="__") {				                                	  
		                        	 stack10.add(piece1);
		                        	  stack10.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }
		           if(No==3) {piece=stack13.pop();
		                      piece1=stack13.pop();
		                      piece2=stack13.pop();
		                      if(stack9.size()>=1&&stack9.size()<=2&&stack9.peek()=="__") {
		                        	 stack9.add(piece2);
		                        	 stack9.add(piece1);
		                        	 stack9.add(piece);}
		                      else if(stack14.size()>=1&&stack14.size()<=2&&stack14.peek()=="__") {
		                    	     stack14.add(piece2);
		                        	 stack14.add(piece1);
		                        	 stack14.add(piece);
		                      }else if(stack10.size()>=1&&stack10.size()<=2&&stack10.peek()=="__") {
		                    	     stack10.add(piece2);
		                        	 stack10.add(piece1);
		                        	 stack10.add(piece);
		                      } else {System.out.println("Invalid move");}
		           }
		           if(No==4) { piece=stack13.pop();
		                      piece1=stack13.pop();
		              piece2=stack13.pop();
		    		  piece3=stack13.pop();
		    		  if(stack9.size()==1&&stack9.peek()=="__") {
		    			         stack9.add(piece3);
		                        	 stack9.add(piece2);
		                        	 stack9.add(piece1);
		                        	 stack9.add(piece);}
		    		  else if(stack14.size()==1&&stack14.peek()=="__") {
		    			         stack14.add(piece3);
		                    	     stack14.add(piece2);
		                        	 stack14.add(piece1);
		                        	 stack14.add(piece);
		                      }else if(stack10.size()==1&&stack10.peek()=="__") {
		                    	     stack10.add(piece3);
		                    	     stack10.add(piece2);
		                        	 stack10.add(piece1);
		                        	 stack10.add(piece);
		                      }else {System.out.println("Invalid move");}
		     }
		            }else {System.out.println("Invalid move");}}
			      			 if(Orow==3&&Ocol==1) {int v13=stack14.size();
			      			if(v13==2) {if(No==1) {piece=stack14.pop();
		                      if(stack10.size()>=1&&stack10.size()<=4&&stack10.peek()=="__") {				                                	  
		    	          stack10.add(piece);}
		                      else if(stack13.size()>=1&&stack13.size()<=4&&stack13.peek()=="__") {
		                        	  stack13.add(piece); }
		                         else if(stack15.size()>=1&&stack15.size()<=4&&stack15.peek()=="__") {				                                	  
		                            	  stack15.add(piece);
		                          } else {System.out.println("Invalid move");}
		                      }}
		           else if(v13==3) {
		        	   if(No==1) {piece=stack14.pop();
	                      if(stack10.size()>=1&&stack10.size()<=4&&stack10.peek()=="__") {				                                	  
	    	          stack10.add(piece);}
	                      else if(stack13.size()>=1&&stack13.size()<=4&&stack13.peek()=="__") {
	                        	  stack13.add(piece); }
	                         else if(stack15.size()>=1&&stack15.size()<=4&&stack15.peek()=="__") {				                                	  
	                            	  stack15.add(piece);
	                          } else {System.out.println("Invalid move");}
	                      }
		           if(No==2) {piece=stack14.pop();
		                     piece1=stack14.pop();
		                     if(stack10.size()>=1&&stack10.size()<=3&&stack10.peek()=="__") {
		                    	 stack10.add(piece1);
		                    	  stack10.add(piece);}
		                     else if(stack13.size()>=1&&stack13.size()<=3&&stack13.peek()=="__") {
		                    	 stack13.add(piece1);
		                    	  stack13.add(piece); }
		                     else if(stack15.size()>=1&&stack15.size()<=3&&stack15.peek()=="__") {				                                	  
		                        	 stack15.add(piece1);
		                        	  stack15.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }}
		           else if(v13==4) {
		        	   if(No==1) {piece=stack14.pop();
	                      if(stack10.size()>=1&&stack10.size()<=4&&stack10.peek()=="__") {				                                	  
	    	          stack10.add(piece);}
	                      else if(stack13.size()>=1&&stack13.size()<=4&&stack13.peek()=="__") {
	                        	  stack13.add(piece); }
	                         else if(stack15.size()>=1&&stack15.size()<=4&&stack15.peek()=="__") {				                                	  
	                            	  stack15.add(piece);
	                          } else {System.out.println("Invalid move");}
	                      }
		           if(No==2) {piece=stack14.pop();
		                     piece1=stack14.pop();
		                     if(stack10.size()>=1&&stack10.size()<=3&&stack10.peek()=="__") {
		                    	 stack10.add(piece1);
		                    	  stack10.add(piece);}
		                     else if(stack13.size()>=1&&stack13.size()<=3&&stack13.peek()=="__") {
		                    	 stack13.add(piece1);
		                    	  stack13.add(piece); }
		                     else if(stack15.size()>=1&&stack15.size()<=3&&stack15.peek()=="__") {				                                	  
		                        	 stack15.add(piece1);
		                        	  stack15.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }
		           if(No==3) {piece=stack14.pop();
		                      piece1=stack14.pop();
		                      piece2=stack14.pop();
		                      if(stack10.size()>=1&&stack10.size()<=2&&stack10.peek()=="__") {
		                        	 stack10.add(piece2);
		                        	 stack10.add(piece1);
		                        	 stack10.add(piece);}
		                      else if(stack13.size()>=1&&stack13.size()<=2&&stack13.peek()=="__") {
		                    	     stack13.add(piece2);
		                        	 stack13.add(piece1);
		                        	 stack13.add(piece);
		                      }else if(stack15.size()>=1&&stack15.size()<=2&&stack15.peek()=="__") {
		                    	     stack15.add(piece2);
		                        	 stack15.add(piece1);
		                        	 stack15.add(piece);
		                      } else {System.out.println("Invalid move");}
		           }}
		           else if(v13==5) {
		        	   if(No==1) {piece=stack14.pop();
	                      if(stack10.size()>=1&&stack10.size()<=4&&stack10.peek()=="__") {				                                	  
	    	          stack10.add(piece);}
	                      else if(stack13.size()>=1&&stack13.size()<=4&&stack13.peek()=="__") {
	                        	  stack13.add(piece); }
	                         else if(stack15.size()>=1&&stack15.size()<=4&&stack15.peek()=="__") {				                                	  
	                            	  stack15.add(piece);
	                          } else {System.out.println("Invalid move");}
	                      }
		           if(No==2) {piece=stack14.pop();
		                     piece1=stack14.pop();
		                     if(stack10.size()>=1&&stack10.size()<=3&&stack10.peek()=="__") {
		                    	 stack10.add(piece1);
		                    	  stack10.add(piece);}
		                     else if(stack13.size()>=1&&stack13.size()<=3&&stack13.peek()=="__") {
		                    	 stack13.add(piece1);
		                    	  stack13.add(piece); }
		                     else if(stack15.size()>=1&&stack15.size()<=3&&stack15.peek()=="__") {				                                	  
		                        	 stack15.add(piece1);
		                        	  stack15.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }
		           if(No==3) {piece=stack14.pop();
		                      piece1=stack14.pop();
		                      piece2=stack14.pop();
		                      if(stack10.size()>=1&&stack10.size()<=2&&stack10.peek()=="__") {
		                        	 stack10.add(piece2);
		                        	 stack10.add(piece1);
		                        	 stack10.add(piece);}
		                      else if(stack13.size()>=1&&stack13.size()<=2&&stack13.peek()=="__") {
		                    	     stack13.add(piece2);
		                        	 stack13.add(piece1);
		                        	 stack13.add(piece);
		                      }else if(stack15.size()>=1&&stack15.size()<=2&&stack15.peek()=="__") {
		                    	     stack15.add(piece2);
		                        	 stack15.add(piece1);
		                        	 stack15.add(piece);
		                      } else {System.out.println("Invalid move");}
		           }
		           if(No==4) { piece=stack14.pop();
		                       piece1=stack14.pop();
		                       piece2=stack14.pop();
		    		           piece3=stack14.pop();
		    		  if(stack10.size()==1&&stack10.peek()=="__") {
		    			         stack10.add(piece3);
		                        	 stack10.add(piece2);
		                        	 stack10.add(piece1);
		                        	 stack10.add(piece);}
		    		  else if(stack13.size()==1&&stack13.peek()=="__") {
		    			         stack13.add(piece3);
		                    	     stack13.add(piece2);
		                        	 stack13.add(piece1);
		                        	 stack13.add(piece);
		                      }else if(stack15.size()==1&&stack15.peek()=="__") {
		                    	     stack15.add(piece3);
		                    	     stack15.add(piece2);
		                        	 stack15.add(piece1);
		                        	 stack15.add(piece);
		                      }else {System.out.println("Invalid move");}
		     }
		            }else {System.out.println("Invalid move");}}
			      			 if(Orow==3&&Ocol==2) {int v14=stack15.size();
			     			if(v14==2) {if(No==1) {piece=stack15.pop();
		                      if(stack11.size()>=1&&stack11.size()<=4&&stack11.peek()=="__") {				                                	  
		  	          stack11.add(piece);}
		                      else if(stack14.size()>=1&&stack14.size()<=4&&stack14.peek()=="__") {
		                        	  stack14.add(piece); }
		                         else if(stack16.size()>=1&&stack16.size()<=4&&stack16.peek()=="__") {				                                	  
		                            	  stack16.add(piece);
		                          } else {System.out.println("Invalid move");}
		                      }}
		           else if(v14==3) {
		        	   if(No==1) {piece=stack15.pop();
	                      if(stack11.size()>=1&&stack11.size()<=4&&stack11.peek()=="__") {				                                	  
	  	          stack11.add(piece);}
	                      else if(stack14.size()>=1&&stack14.size()<=4&&stack14.peek()=="__") {
	                        	  stack14.add(piece); }
	                         else if(stack16.size()>=1&&stack16.size()<=4&&stack16.peek()=="__") {				                                	  
	                            	  stack16.add(piece);
	                          } else {System.out.println("Invalid move");}
	                      }
		           if(No==2) {piece=stack15.pop();
		                     piece1=stack15.pop();
		                     if(stack11.size()>=1&&stack11.size()<=3&&stack11.peek()=="__") {
		                    	 stack10.add(piece1);
		                    	  stack11.add(piece);}
		                     else if(stack14.size()>=1&&stack14.size()<=3&&stack14.peek()=="__") {
		                    	 stack14.add(piece1);
		                    	  stack14.add(piece); }
		                     else if(stack16.size()>=1&&stack16.size()<=3&&stack16.peek()=="__") {				                                	  
		                        	 stack16.add(piece1);
		                        	  stack16.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }}
		           else if(v14==4) {
		        	   if(No==1) {piece=stack15.pop();
	                      if(stack11.size()>=1&&stack11.size()<=4&&stack11.peek()=="__") {				                                	  
	  	          stack11.add(piece);}
	                      else if(stack14.size()>=1&&stack14.size()<=4&&stack14.peek()=="__") {
	                        	  stack14.add(piece); }
	                         else if(stack16.size()>=1&&stack16.size()<=4&&stack16.peek()=="__") {				                                	  
	                            	  stack16.add(piece);
	                          } else {System.out.println("Invalid move");}
	                      }
		           if(No==2) {piece=stack15.pop();
		                     piece1=stack15.pop();
		                     if(stack11.size()>=1&&stack11.size()<=3&&stack11.peek()=="__") {
		                    	 stack10.add(piece1);
		                    	  stack11.add(piece);}
		                     else if(stack14.size()>=1&&stack14.size()<=3&&stack14.peek()=="__") {
		                    	 stack14.add(piece1);
		                    	  stack14.add(piece); }
		                     else if(stack16.size()>=1&&stack16.size()<=3&&stack16.peek()=="__") {				                                	  
		                        	 stack16.add(piece1);
		                        	  stack16.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }
		           if(No==3) {piece=stack15.pop();
		                      piece1=stack15.pop();
		                      piece2=stack15.pop();
		                      if(stack11.size()>=1&&stack11.size()<=2&&stack11.peek()=="__") {
		                        	 stack11.add(piece2);
		                        	 stack11.add(piece1);
		                        	 stack11.add(piece);}
		                      else if(stack14.size()>=1&&stack14.size()<=2&&stack14.peek()=="__") {
		                    	     stack14.add(piece2);
		                        	 stack14.add(piece1);
		                        	 stack14.add(piece);
		                      }else if(stack16.size()>=1&&stack16.size()<=2&&stack16.peek()=="__") {
		                    	     stack16.add(piece2);
		                        	 stack16.add(piece1);
		                        	 stack16.add(piece);
		                      } else {System.out.println("Invalid move");}
		           }}
		           else if(v14==5) {
		        	    if(v14==4) {
			        	   if(No==1) {piece=stack15.pop();
		                      if(stack11.size()>=1&&stack11.size()<=4&&stack11.peek()=="__") {				                                	  
		  	          stack11.add(piece);}
		                      else if(stack14.size()>=1&&stack14.size()<=4&&stack14.peek()=="__") {
		                        	  stack14.add(piece); }
		                         else if(stack16.size()>=1&&stack16.size()<=4&&stack16.peek()=="__") {				                                	  
		                            	  stack16.add(piece);
		                          } else {System.out.println("Invalid move");}
		                      }
			           if(No==2) {piece=stack15.pop();
			                     piece1=stack15.pop();
			                     if(stack11.size()>=1&&stack11.size()<=3&&stack11.peek()=="__") {
			                    	 stack10.add(piece1);
			                    	  stack11.add(piece);}
			                     else if(stack14.size()>=1&&stack14.size()<=3&&stack14.peek()=="__") {
			                    	 stack14.add(piece1);
			                    	  stack14.add(piece); }
			                     else if(stack16.size()>=1&&stack16.size()<=3&&stack16.peek()=="__") {				                                	  
			                        	 stack16.add(piece1);
			                        	  stack16.add(piece);} 
			                     else {System.out.println("Invalid move");}
			           }
			           if(No==3) {piece=stack15.pop();
			                      piece1=stack15.pop();
			                      piece2=stack15.pop();
			                      if(stack11.size()>=1&&stack11.size()<=2&&stack11.peek()=="__") {
			                        	 stack11.add(piece2);
			                        	 stack11.add(piece1);
			                        	 stack11.add(piece);}
			                      else if(stack14.size()>=1&&stack14.size()<=2&&stack14.peek()=="__") {
			                    	     stack14.add(piece2);
			                        	 stack14.add(piece1);
			                        	 stack14.add(piece);
			                      }else if(stack16.size()>=1&&stack16.size()<=2&&stack16.peek()=="__") {
			                    	     stack16.add(piece2);
			                        	 stack16.add(piece1);
			                        	 stack16.add(piece);
			                      } else {System.out.println("Invalid move");}
			           }
		           if(No==4) { piece=stack15.pop();
		                       piece1=stack15.pop();
		                       piece2=stack15.pop();
		  		               piece3=stack15.pop();
		  		  if(stack11.size()==1&&stack11.peek()=="__") {
		  			                 stack11.add(piece3);
		                        	 stack11.add(piece2);
		                        	 stack11.add(piece1);
		                        	 stack11.add(piece);}
		  		  else if(stack14.size()==1&&stack14.peek()=="__") {
		  			               stack14.add(piece3);
		                    	     stack14.add(piece2);
		                        	 stack14.add(piece1);
		                        	 stack14.add(piece);
		                      }else if(stack16.size()==1&&stack16.peek()=="__") {
		                    	     stack16.add(piece3);
		                    	     stack16.add(piece2);
		                        	 stack16.add(piece1);
		                        	 stack16.add(piece);
		                      }else {System.out.println("Invalid move");}
		   }
		            }else {System.out.println("Invalid move");}}
			      			 if(Orow==3&&Ocol==3) {int v15=stack16.size();
			      			if(v15==2) {if(No==1) {piece=stack16.pop();
		                      if(stack12.size()>=1&&stack12.size()<=4&&stack12.peek()=="__") {				                                	  
			          stack12.add(piece);}
		                      else if(stack15.size()>=1&&stack15.size()<=4&&stack15.peek()=="__") {
		                        	  stack15.add(piece); }
		                         else if(stack11.size()>=1&&stack11.size()<=4&&stack11.peek()=="__") {				                                	  
		                            	  stack11.add(piece);
		                          } else {System.out.println("Invalid move");}
		                      }}
		           else if(v15==3) {
		        	   if(No==1) {piece=stack16.pop();
	                      if(stack12.size()>=1&&stack12.size()<=4&&stack12.peek()=="__") {				                                	  
		          stack12.add(piece);}
	                      else if(stack15.size()>=1&&stack15.size()<=4&&stack15.peek()=="__") {
	                        	  stack15.add(piece); }
	                         else if(stack11.size()>=1&&stack11.size()<=4&&stack11.peek()=="__") {				                                	  
	                            	  stack11.add(piece);
	                          } else {System.out.println("Invalid move");}
	                      }
		           }
		           if(No==2) {piece=stack16.pop();
		                     piece1=stack16.pop();
		                     if(stack12.size()>=1&&stack12.size()<=3&&stack12.peek()=="__") {
		                    	 stack12.add(piece1);
		                    	  stack12.add(piece);}
		                     else if(stack15.size()>=1&&stack15.size()<=3&&stack15.peek()=="__") {
		                    	 stack15.add(piece1);
		                    	  stack15.add(piece); }
		                     else if(stack11.size()>=1&&stack11.size()<=3&&stack11.peek()=="__") {				                                	  
		                        	 stack11.add(piece1);
		                        	  stack11.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }
		           else if(v15==4) {
		        	   if(No==1) {piece=stack16.pop();
	                      if(stack12.size()>=1&&stack12.size()<=4&&stack12.peek()=="__") {				                                	  
		          stack12.add(piece);}
	                      else if(stack15.size()>=1&&stack15.size()<=4&&stack15.peek()=="__") {
	                        	  stack15.add(piece); }
	                         else if(stack11.size()>=1&&stack11.size()<=4&&stack11.peek()=="__") {				                                	  
	                            	  stack11.add(piece);
	                          } else {System.out.println("Invalid move");}
	                      }
		           
		           if(No==2) {piece=stack16.pop();
		                     piece1=stack16.pop();
		                     if(stack12.size()>=1&&stack12.size()<=3&&stack12.peek()=="__") {
		                    	 stack12.add(piece1);
		                    	  stack12.add(piece);}
		                     else if(stack15.size()>=1&&stack15.size()<=3&&stack15.peek()=="__") {
		                    	 stack15.add(piece1);
		                    	  stack15.add(piece); }
		                     else if(stack11.size()>=1&&stack11.size()<=3&&stack11.peek()=="__") {				                                	  
		                        	 stack11.add(piece1);
		                        	  stack11.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }
		           if(No==3) {piece=stack16.pop();
		                      piece1=stack16.pop();
		                      piece2=stack16.pop();
		                      if(stack12.size()>=1&&stack12.size()<=2&&stack12.peek()=="__") {
		                        	 stack12.add(piece2);
		                        	 stack12.add(piece1);
		                        	 stack12.add(piece);}
		                      else if(stack15.size()>=1&&stack15.size()<=2&&stack15.peek()=="__") {
		                    	     stack15.add(piece2);
		                        	 stack15.add(piece1);
		                        	 stack15.add(piece);
		                      }else if(stack11.size()>=1&&stack11.size()<=2&&stack11.peek()=="__") {
		                    	     stack11.add(piece2);
		                        	 stack11.add(piece1);
		                        	 stack11.add(piece);
		                      } else {System.out.println("Invalid move");}
		           }}
		           else if(v15==5) {
		        	   if(No==1) {piece=stack16.pop();
	                      if(stack12.size()>=1&&stack12.size()<=4&&stack12.peek()=="__") {				                                	  
		          stack12.add(piece);}
	                      else if(stack15.size()>=1&&stack15.size()<=4&&stack15.peek()=="__") {
	                        	  stack15.add(piece); }
	                         else if(stack11.size()>=1&&stack11.size()<=4&&stack11.peek()=="__") {				                                	  
	                            	  stack11.add(piece);
	                          } else {System.out.println("Invalid move");}
	                      }
		           if(No==2) {piece=stack16.pop();
		                     piece1=stack16.pop();
		                     if(stack12.size()>=1&&stack12.size()<=3&&stack12.peek()=="__") {
		                    	 stack12.add(piece1);
		                    	  stack12.add(piece);}
		                     else if(stack15.size()>=1&&stack15.size()<=3&&stack15.peek()=="__") {
		                    	 stack15.add(piece1);
		                    	  stack15.add(piece); }
		                     else if(stack11.size()>=1&&stack11.size()<=3&&stack11.peek()=="__") {				                                	  
		                        	 stack11.add(piece1);
		                        	  stack11.add(piece);} 
		                     else {System.out.println("Invalid move");}
		           }
		           if(No==3) {piece=stack16.pop();
		                      piece1=stack16.pop();
		                      piece2=stack16.pop();
		                      if(stack12.size()>=1&&stack12.size()<=2&&stack12.peek()=="__") {
		                        	 stack12.add(piece2);
		                        	 stack12.add(piece1);
		                        	 stack12.add(piece);}
		                      else if(stack15.size()>=1&&stack15.size()<=2&&stack15.peek()=="__") {
		                    	     stack15.add(piece2);
		                        	 stack15.add(piece1);
		                        	 stack15.add(piece);
		                      }else if(stack11.size()>=1&&stack11.size()<=2&&stack11.peek()=="__") {
		                    	     stack11.add(piece2);
		                        	 stack11.add(piece1);
		                        	 stack11.add(piece);
		                      } else {System.out.println("Invalid move");}
		           }
		           }
		           if(No==4) { piece=stack16.pop();
		                      piece1=stack16.pop();
		                      piece2=stack16.pop();
				              piece3=stack16.pop();
				  if(stack12.size()==1&&stack12.peek()=="__") {
					                 stack12.add(piece3);
		                        	 stack12.add(piece2);
		                        	 stack12.add(piece1);
		                        	 stack12.add(piece);}
				  else if(stack15.size()==1&&stack15.peek()=="__") {
					                 stack15.add(piece3);
		                    	     stack15.add(piece2);
		                        	 stack15.add(piece1);
		                        	 stack15.add(piece);
		                      }else if(stack11.size()==1&&stack11.peek()=="__") {
		                    	     stack11.add(piece3);
		                    	     stack11.add(piece2);
		                        	 stack11.add(piece1);
		                        	 stack11.add(piece);
		                      }else {System.out.println("Invalid move");}
		 }
		            }else {System.out.println("Invalid move");}}
	}
	private static void boardlayout(Stack<String> stack1, Stack<String> stack2, Stack<String> stack3,
			Stack<String> stack4, Stack<String> stack5, Stack<String> stack6, Stack<String> stack7,
			Stack<String> stack8, Stack<String> stack9, Stack<String> stack10, Stack<String> stack11,
			Stack<String> stack12, Stack<String> stack13, Stack<String> stack14, Stack<String> stack15,
			Stack<String> stack16, String[][] grid) {
		grid[0][0]=stack1.peek();
		 grid[0][1]=stack2.peek();
		 grid[0][2]=stack3.peek();
		 grid[0][3]=stack4.peek();
		 grid[1][0]=stack5.peek();
		 grid[1][1]=stack6.peek();
		 grid[1][2]=stack7.peek();
		 grid[1][3]=stack8.peek();
		 grid[2][0]=stack9.peek();
		 grid[2][1]=stack10.peek();
		 grid[2][2]=stack11.peek();
		 grid[2][3]=stack12.peek();
		 grid[3][0]=stack13.peek();
		 grid[3][1]=stack14.peek();
		 grid[3][2]=stack15.peek();
		 grid[3][3]=stack16.peek();
	}
	private static void CheckForDraw(Stack<String> stack1, Stack<String> stack2, Stack<String> stack3,
			Stack<String> stack4, Stack<String> stack5, Stack<String> stack6, Stack<String> stack7,
			Stack<String> stack8, Stack<String> stack9, Stack<String> stack10, Stack<String> stack11,
			Stack<String> stack12, Stack<String> stack13, Stack<String> stack14, Stack<String> stack15,
			Stack<String> stack16, String[][] grid, Stack<String> stackB1, Stack<String> stackB2, Stack<String> stackB3,
			Stack<String> stackG1, Stack<String> stackG2, Stack<String> stackG3) {
		while((ColumnsG(grid)&&ColumnsB(grid))||(RowsG(grid)&&RowsB(grid))||(AcrossG(grid)&&AcrossB(grid))) {
				  System.out.println(" ");
				  System.out.println("Draw!");
					Blueplayerexternalstacks(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12,
							stack13, stack14, stack15, stack16,grid,stackB1, stackB2, stackB3);
					Greenplayerexternalstacks(stackG1, stackG2, stackG3);
					  System.exit(0);}
	}
	private static void rearrangingG(Stack<String> stack1, Stack<String> stack2, Stack<String> stack3,
			Stack<String> stack4, Stack<String> stack5, Stack<String> stack6, Stack<String> stack7,
			Stack<String> stack8, Stack<String> stack9, Stack<String> stack10, Stack<String> stack11,
			Stack<String> stack12, Stack<String> stack13, Stack<String> stack14, Stack<String> stack15,
			Stack<String> stack16, String[][] grid, int rowG, int colG, int s, int r) {
		if(s==0&&r==0) {	 poppingG(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
					stack12, stack13, stack14, stack15, stack16, grid, rowG, colG);
			String T=grid[rowG][colG]; stack1.add(T);  grid[s][r]=stack1.peek();
			 whatsleftG(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
					stack12, stack13, stack14, stack15, stack16, grid, rowG, colG);}
		if(s==0&&r==1) {	 poppingG(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, rowG, colG);
		String T=grid[rowG][colG]; stack2.add(T);  grid[s][r]=stack2.peek();
		 whatsleftG(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, rowG, colG);}
		if(s==0&&r==2) {	 poppingG(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, rowG, colG);
		String T=grid[rowG][colG]; stack3.add(T);  grid[s][r]=stack3.peek();
		 whatsleftG(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, rowG, colG);}
		if(s==0&&r==3) {	 poppingG(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, rowG, colG);
		String T=grid[rowG][colG]; stack4.add(T);  grid[s][r]=stack4.peek();
		 whatsleftG(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, rowG, colG);}
		if(s==1&&r==0) {	 poppingG(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, rowG, colG);
		String T=grid[rowG][colG]; stack5.add(T);  grid[s][r]=stack5.peek();
		 whatsleftG(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, rowG, colG);}
		if(s==1&&r==1) {	 poppingG(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, rowG, colG);
		String T=grid[rowG][colG]; stack6.add(T);  grid[s][r]=stack6.peek();
		 whatsleftG(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, rowG, colG);}
		if(s==1&&r==2) {	 poppingG(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, rowG, colG);
		String T=grid[rowG][colG]; stack7.add(T);  grid[s][r]=stack7.peek();
		 whatsleftG(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, rowG, colG);}
		if(s==1&&r==3) {	 poppingG(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, rowG, colG);
		String T=grid[rowG][colG]; stack8.add(T);  grid[s][r]=stack8.peek();
		 whatsleftG(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, rowG, colG);}
		if(s==2&&r==0) {	 poppingG(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, rowG, colG);
		String T=grid[rowG][colG]; stack9.add(T);  grid[s][r]=stack9.peek();
		 whatsleftG(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, rowG, colG);}
		if(s==2&&r==1) {	 poppingG(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, rowG, colG);
		String T=grid[rowG][colG]; stack10.add(T);  grid[s][r]=stack10.peek();
		 whatsleftG(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, rowG, colG);}
		if(s==2&&r==2) {	 poppingG(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, rowG, colG);
		String T=grid[rowG][colG]; stack11.add(T);  grid[s][r]=stack11.peek();
		 whatsleftG(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, rowG, colG);}
		if(s==2&&r==3) {	 poppingG(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, rowG, colG);
		String T=grid[rowG][colG]; stack12.add(T);  grid[s][r]=stack12.peek();
		 whatsleftG(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, rowG, colG);}
		if(s==3&&r==0) {	 poppingG(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, rowG, colG);
		String T=grid[rowG][colG]; stack13.add(T);  grid[s][r]=stack13.peek();
		 whatsleftG(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, rowG, colG);}
		if(s==3&&r==1) {	 poppingG(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, rowG, colG);
		String T=grid[rowG][colG]; stack14.add(T);  grid[s][r]=stack14.peek();
		 whatsleftG(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, rowG, colG);}
		if(s==3&&r==2) {	 poppingG(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, rowG, colG);
		String T=grid[rowG][colG]; stack15.add(T);  grid[s][r]=stack15.peek();
		 whatsleftG(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, rowG, colG);}
		if(s==3&&r==3) {	 poppingG(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, rowG, colG);
		String T=grid[rowG][colG]; stack16.add(T);  grid[s][r]=stack16.peek();
		 whatsleftG(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, rowG, colG);}
	}
	private static void PlayG(Stack<String> stack1, Stack<String> stack2, Stack<String> stack3, Stack<String> stack4,
			Stack<String> stack5, Stack<String> stack6, Stack<String> stack7, Stack<String> stack8,
			Stack<String> stack9, Stack<String> stack10, Stack<String> stack11, Stack<String> stack12,
			Stack<String> stack13, Stack<String> stack14, Stack<String> stack15, Stack<String> stack16, String[][] grid,
			 int rowG, int colG, String m) {
		     if(rowG==0&&colG==0) {stack1.add(m); grid[rowG][colG]=stack1.peek();}
			 if(rowG==0&&colG==1) {stack2.add(m); grid[rowG][colG]=stack2.peek();}
			 if(rowG==0&&colG==2) {stack3.add(m); grid[rowG][colG]=stack3.peek();}
			 if(rowG==0&&colG==3) {stack4.add(m); grid[rowG][colG]=stack4.peek();}
			 if(rowG==1&&colG==0) {stack5.add(m); grid[rowG][colG]=stack5.peek();}
			 if(rowG==1&&colG==1) {stack6.add(m); grid[rowG][colG]=stack6.peek();}
			 if(rowG==1&&colG==2) {stack7.add(m); grid[rowG][colG]=stack7.peek();}
			 if(rowG==1&&colG==3) {stack8.add(m); grid[rowG][colG]=stack8.peek();}
			 if(rowG==2&&colG==0) {stack9.add(m); grid[rowG][colG]=stack9.peek();}
			 if(rowG==2&&colG==1) {stack10.add(m); grid[rowG][colG]=stack10.peek();}
			 if(rowG==2&&colG==2) {stack11.add(m); grid[rowG][colG]=stack11.peek();}
			 if(rowG==2&&colG==3) {stack12.add(m); grid[rowG][colG]=stack12.peek();}
			 if(rowG==3&&colG==0) {stack13.add(m); grid[rowG][colG]=stack13.peek();}
			 if(rowG==3&&colG==1) {stack14.add(m); grid[rowG][colG]=stack14.peek();}
			 if(rowG==3&&colG==2) {stack15.add(m); grid[rowG][colG]=stack15.peek();}
			 if(rowG==3&&colG==3) {stack16.add(m); grid[rowG][colG]=stack16.peek();}
	}
	private static void PlayB(Stack<String> stack1, Stack<String> stack2, Stack<String> stack3, Stack<String> stack4,
			Stack<String> stack5, Stack<String> stack6, Stack<String> stack7, Stack<String> stack8,
			Stack<String> stack9, Stack<String> stack10, Stack<String> stack11, Stack<String> stack12,
			Stack<String> stack13, Stack<String> stack14, Stack<String> stack15, Stack<String> stack16, String[][] grid,
			int row, int col, String n) {
		PlayG(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12,
				stack13, stack14, stack15, stack16, grid, row, col, n);
	}
	private static void rearrangingB(Stack<String> stack1, Stack<String> stack2, Stack<String> stack3,
			Stack<String> stack4, Stack<String> stack5, Stack<String> stack6, Stack<String> stack7,
			Stack<String> stack8, Stack<String> stack9, Stack<String> stack10, Stack<String> stack11,
			Stack<String> stack12, Stack<String> stack13, Stack<String> stack14, Stack<String> stack15,
			Stack<String> stack16, String[][] grid, int row, int col, int s, int r) {
		if(s==0&&r==0) {poppingB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, row, col);
		String O=grid[row][col]; stack1.add(O);  grid[s][r]=stack1.peek();
		whatsleftB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, row, col);}
		if(s==0&&r==1) {poppingB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, row, col);
		String O=grid[row][col]; stack2.add(O);  grid[s][r]=stack2.peek();
		whatsleftB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, row, col);}
		if(s==0&&r==2) {poppingB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, row, col);
		String O=grid[row][col]; stack3.add(O);  grid[s][r]=stack3.peek();
		whatsleftB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, row, col);}
		if(s==0&&r==3) {poppingB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, row, col);
		String O=grid[row][col]; stack4.add(O);  grid[s][r]=stack4.peek();
		whatsleftB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, row, col);}
		if(s==1&&r==0) {poppingB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, row, col);
		String O=grid[row][col]; stack5.add(O);  grid[s][r]=stack5.peek();
		whatsleftB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, row, col);}
		if(s==1&&r==1) {poppingB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, row, col);
		String O=grid[row][col]; stack6.add(O);  grid[s][r]=stack6.peek();
		whatsleftB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, row, col);}
		if(s==1&&r==2) {poppingB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, row, col);
		String O=grid[row][col]; stack7.add(O);  grid[s][r]=stack7.peek();
		whatsleftB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, row, col);}
		if(s==1&&r==3) {poppingB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, row, col);
		String O=grid[row][col]; stack8.add(O);  grid[s][r]=stack8.peek();
		whatsleftB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, row, col);}
		if(s==2&&r==0) {poppingB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, row, col);
		String O=grid[row][col]; stack9.add(O);  grid[s][r]=stack9.peek();
		whatsleftB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, row, col);}
		if(s==2&&r==1) {poppingB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, row, col);
		String O=grid[row][col]; stack10.add(O);  grid[s][r]=stack10.peek();
		whatsleftB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, row, col);}
		if(s==2&&r==2) {poppingB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, row, col);
		String O=grid[row][col]; stack11.add(O);  grid[s][r]=stack11.peek();
		whatsleftB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, row, col);}
		if(s==2&&r==3) {poppingB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, row, col);
		String O=grid[row][col]; stack12.add(O);  grid[s][r]=stack12.peek();
		whatsleftB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, row, col);}
		if(s==3&&r==0) {poppingB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, row, col);
		String O=grid[row][col]; stack13.add(O);  grid[s][r]=stack13.peek();
		whatsleftB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, row, col);}
		if(s==3&&r==1) {poppingB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, row, col);
		String O=grid[row][col]; stack14.add(O);  grid[s][r]=stack14.peek();
		whatsleftB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, row, col);}
		if(s==3&&r==2) {poppingB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, row, col);
		String O=grid[row][col]; stack15.add(O);  grid[s][r]=stack15.peek();
		whatsleftB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, row, col);}
		if(s==3&&r==3) {poppingB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, row, col);
		String O=grid[row][col]; stack16.add(O);  grid[s][r]=stack16.peek();
		whatsleftB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
				stack12, stack13, stack14, stack15, stack16, grid, row, col);}
	}
	private static void whatsleftB(Stack<String> stack1, Stack<String> stack2, Stack<String> stack3,
			Stack<String> stack4, Stack<String> stack5, Stack<String> stack6, Stack<String> stack7,
			Stack<String> stack8, Stack<String> stack9, Stack<String> stack10, Stack<String> stack11,
			Stack<String> stack12, Stack<String> stack13, Stack<String> stack14, Stack<String> stack15,
			Stack<String> stack16, String[][] grid, int row, int col) {
		if(row==0&&col==0) {grid[row][col]=stack1.peek();}
		 if(row==0&&col==1) {grid[row][col]=stack2.peek();}
		 if(row==0&&col==2) {grid[row][col]=stack3.peek();}
		 if(row==0&&col==3) {grid[row][col]=stack4.peek();}
		 if(row==1&&col==0) {grid[row][col]=stack5.peek();}
		 if(row==1&&col==1) {grid[row][col]=stack6.peek();}
		 if(row==1&&col==2) {grid[row][col]=stack7.peek();}
		 if(row==1&&col==3) {grid[row][col]=stack8.peek();}
		 if(row==2&&col==0) {grid[row][col]=stack9.peek();}
		 if(row==2&&col==1) {grid[row][col]=stack10.peek();}
		 if(row==2&&col==2) {grid[row][col]=stack11.peek();}
		 if(row==2&&col==3) {grid[row][col]=stack12.peek();}
		 if(row==3&&col==0) {grid[row][col]=stack13.peek();}
		 if(row==3&&col==1) {grid[row][col]=stack14.peek();}
		 if(row==3&&col==2) {grid[row][col]=stack15.peek();}
		 if(row==3&&col==3) {grid[row][col]=stack16.peek();}
	}
	private static void poppingB(Stack<String> stack1, Stack<String> stack2, Stack<String> stack3, Stack<String> stack4,
			Stack<String> stack5, Stack<String> stack6, Stack<String> stack7, Stack<String> stack8,
			Stack<String> stack9, Stack<String> stack10, Stack<String> stack11, Stack<String> stack12,
			Stack<String> stack13, Stack<String> stack14, Stack<String> stack15, Stack<String> stack16, String[][] grid,
			int row, int col) {
		 if(row==0&&col==0) {grid[row][col]=stack1.pop();}
		 if(row==0&&col==1) {grid[row][col]=stack2.pop();}
		 if(row==0&&col==2) {grid[row][col]=stack3.pop();}
		 if(row==0&&col==3) {grid[row][col]=stack4.pop();}
		 if(row==1&&col==0) {grid[row][col]=stack5.pop();}
		 if(row==1&&col==1) {grid[row][col]=stack6.pop();}
		 if(row==1&&col==2) {grid[row][col]=stack7.pop();}
		 if(row==1&&col==3) {grid[row][col]=stack8.pop();}
		 if(row==2&&col==0) {grid[row][col]=stack9.pop();}
		 if(row==2&&col==1) {grid[row][col]=stack10.pop();}
		 if(row==2&&col==2) {grid[row][col]=stack11.pop();}
		 if(row==2&&col==3) {grid[row][col]=stack12.pop();}
		 if(row==3&&col==0) {grid[row][col]=stack13.pop();}
		 if(row==3&&col==1) {grid[row][col]=stack14.pop();}
		 if(row==3&&col==2) {grid[row][col]=stack15.pop();}
		 if(row==3&&col==3) {grid[row][col]=stack16.pop();}	
	}
	private static void whatsleftG(Stack<String> stack1, Stack<String> stack2, Stack<String> stack3,
			Stack<String> stack4, Stack<String> stack5, Stack<String> stack6, Stack<String> stack7,
			Stack<String> stack8, Stack<String> stack9, Stack<String> stack10, Stack<String> stack11,
			Stack<String> stack12, Stack<String> stack13, Stack<String> stack14, Stack<String> stack15,
			Stack<String> stack16, String[][] grid, int rowG, int colG) {
		whatsleftB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12,
				stack13, stack14, stack15, stack16, grid, rowG, colG);
	}
	private static void poppingG(Stack<String> stack1, Stack<String> stack2, Stack<String> stack3, Stack<String> stack4,
			Stack<String> stack5, Stack<String> stack6, Stack<String> stack7, Stack<String> stack8,
			Stack<String> stack9, Stack<String> stack10, Stack<String> stack11, Stack<String> stack12,
			Stack<String> stack13, Stack<String> stack14, Stack<String> stack15, Stack<String> stack16, String[][] grid,
			int rowG, int colG) {
		poppingB(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12,
				stack13, stack14, stack15, stack16, grid, rowG, colG);
	}
	private static void ChecksForBlueWin(Stack<String> stack1, Stack<String> stack2, Stack<String> stack3,
			Stack<String> stack4, Stack<String> stack5, Stack<String> stack6, Stack<String> stack7,
			Stack<String> stack8, Stack<String> stack9, Stack<String> stack10, Stack<String> stack11,
			Stack<String> stack12, Stack<String> stack13, Stack<String> stack14, Stack<String> stack15,
			Stack<String> stack16,String[][] grid,Stack<String> stackB1, Stack<String> stackB2, Stack<String> stackB3,
			Stack<String> stackG1, Stack<String> stackG2,Stack<String> stackG3) {
		if (ColumnsB(grid)||RowsB(grid)||AcrossB(grid)) {
   		      System.out.println(" ");
				  System.out.println("Blue wins!");
				  Blueplayerexternalstacks(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12,
							stack13, stack14, stack15, stack16,grid,stackB1, stackB2, stackB3);
				  Greenplayerexternalstacks(stackG1, stackG2, stackG3);
				  System.exit(0);}
	}
	private static void ChecksForGreenWin(Stack<String> stack1, Stack<String> stack2, Stack<String> stack3,
			Stack<String> stack4, Stack<String> stack5, Stack<String> stack6, Stack<String> stack7,
			Stack<String> stack8, Stack<String> stack9, Stack<String> stack10, Stack<String> stack11,
			Stack<String> stack12, Stack<String> stack13, Stack<String> stack14, Stack<String> stack15,
			Stack<String> stack16,String[][] grid,Stack<String> stackB1, Stack<String> stackB2, Stack<String> stackB3,
			Stack<String> stackG1, Stack<String> stackG2,Stack<String> stackG3) {
	while(ColumnsG(grid)||RowsG(grid)||AcrossG(grid)) {
 			  System.out.println(" ");
			  System.out.println("Green wins!");
				Blueplayerexternalstacks(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11, stack12,
						stack13, stack14, stack15, stack16,grid,stackB1, stackB2, stackB3);
				Greenplayerexternalstacks(stackG1, stackG2, stackG3);
				  System.exit(0);}
	}
	private static boolean ColumnsG(String[][] grid) {
		return col1G(grid)||col2G(grid)||col3G(grid)||col4G(grid);
	}
	private static boolean AcrossG(String[][] grid) {
		return across1G(grid)||across2G(grid);
	}
	private static boolean across2G(String[][] grid) {
		return (grid[0][3]=="G1"||grid[0][3]=="G2"||grid[0][3]=="G3"||grid[0][3]=="G4")&&(grid[1][2]=="G1"||grid[1][2]=="G2"||grid[1][2]=="G3"||grid[1][2]=="G4")&&
			 (grid[2][1]=="G1"||grid[2][1]=="G2"||grid[2][1]=="G3"||grid[2][1]=="G4")&&(grid[3][0]=="G1"||grid[3][0]=="G2"||grid[3][0]=="G3"||grid[3][0]=="G4");
	}
	private static boolean across1G(String[][] grid) {
		return (grid[0][0]=="G1"||grid[0][0]=="G2"||grid[0][0]=="G3"||grid[0][0]=="G4")&&(grid[1][1]=="G1"||grid[1][1]=="G2"||grid[1][1]=="G3"||grid[1][1]=="G4")&&
			(grid[2][2]=="G1"||grid[2][2]=="G2"||grid[2][2]=="G3"||grid[2][2]=="G4")&&(grid[3][3]=="G1"||grid[3][3]=="G2"||grid[3][3]=="G3"||grid[3][3]=="G4");
	}
	private static boolean col4G(String[][] grid) {
		return (grid[0][3]=="G1"||grid[0][3]=="G2"||grid[0][3]=="G3"||grid[0][3]=="G4")&&(grid[1][3]=="G1"||grid[1][3]=="G2"||grid[1][3]=="G3"||grid[1][3]=="G4")&&
			    	(grid[2][3]=="G1"||grid[2][3]=="G2"||grid[2][3]=="G3"||grid[2][3]=="G4")&&(grid[3][3]=="G1"||grid[3][3]=="G2"||grid[3][3]=="G3"||grid[3][3]=="G4");
	}
	private static boolean col3G(String[][] grid) {
		return (grid[0][2]=="G1"||grid[0][2]=="G2"||grid[0][2]=="G3"||grid[0][2]=="G4")&&(grid[1][2]=="G1"||grid[1][2]=="G2"||grid[1][2]=="G3"||grid[1][2]=="G4")&&
					(grid[2][2]=="G1"||grid[2][2]=="G2"||grid[2][2]=="G3"||grid[2][2]=="G4")&&(grid[3][2]=="G1"||grid[3][2]=="G2"||grid[3][2]=="G3"||grid[3][2]=="G4");
	}
	private static boolean col2G(String[][] grid) {
		return (grid[0][1]=="G1"||grid[0][1]=="G2"||grid[0][1]=="G3"||grid[0][1]=="G4")&&(grid[1][1]=="G1"||grid[1][1]=="G2"||grid[1][1]=="G3"||grid[1][1]=="G4")&&
			    	(grid[2][1]=="G1"||grid[2][1]=="G2"||grid[2][1]=="G3"||grid[2][1]=="G4")&&(grid[3][1]=="G1"||grid[3][1]=="G2"||grid[3][1]=="G3"||grid[3][1]=="G4");
	}
	private static boolean col1G(String[][] grid) {
		return (grid[0][0]=="G1"||grid[0][0]=="G2"||grid[0][0]=="G3"||grid[0][0]=="G4")&&(grid[1][0]=="G1"||grid[1][0]=="G2"||grid[1][0]=="G3"||grid[1][0]=="G4")&&
					(grid[2][0]=="G1"||grid[2][0]=="G2"||grid[2][0]=="G3"||grid[2][0]=="G4")&&(grid[3][0]=="G1"||grid[3][0]=="G2"||grid[3][0]=="G3"||grid[3][0]=="G4");
	}
	private static boolean RowsG(String[][] grid) {
		return row4G(grid)||row3G(grid)||row2G(grid)||row1G(grid);
	}
	private static boolean row1G(String[][] grid) {
		return (grid[0][3]=="G1"||grid[0][3]=="G2"||grid[0][3]=="G3"||grid[0][3]=="G4")&&(grid[0][2]=="G1"||grid[0][2]=="G2"||grid[0][2]=="G3"||grid[0][2]=="G4")&&
				   (grid[0][1]=="G1"||grid[0][1]=="G2"||grid[0][1]=="G3"||grid[0][1]=="G4")&&(grid[0][0]=="G1"||grid[0][0]=="G2"||grid[0][0]=="G3"||grid[0][0]=="G4");
	}
	private static boolean row2G(String[][] grid) {
		return (grid[1][3]=="G1"||grid[1][3]=="G2"||grid[1][3]=="G3"||grid[1][3]=="G4")&&(grid[1][2]=="G1"||grid[1][2]=="G2"||grid[1][2]=="G3"||grid[1][2]=="G4")&&
				   (grid[1][1]=="G1"||grid[1][1]=="G2"||grid[1][1]=="G3"||grid[1][1]=="G4")&&(grid[1][0]=="G1"||grid[1][0]=="G2"||grid[1][0]=="G3"||grid[1][0]=="G4");
	}
	private static boolean row3G(String[][] grid) {
		return (grid[2][3]=="G1"||grid[2][3]=="G2"||grid[2][3]=="G3"||grid[2][3]=="G4")&&(grid[2][2]=="G1"||grid[2][2]=="G2"||grid[2][2]=="G3"||grid[2][2]=="G4")&&
				   (grid[2][1]=="G1"||grid[2][1]=="G2"||grid[2][1]=="G3"||grid[2][1]=="G4")&&(grid[2][0]=="G1"||grid[2][0]=="G2"||grid[2][0]=="G3"||grid[2][0]=="G4");
	}
	private static boolean row4G(String[][] grid) {
		return (grid[3][3]=="G1"||grid[3][3]=="G2"||grid[3][3]=="G3"||grid[3][3]=="G4")&&( grid[3][2]=="G1"||grid[3][2]=="G2"||grid[3][2]=="G3"||grid[3][2]=="G4")&&
		    (grid[3][1]=="G1"||grid[3][1]=="G2"||grid[3][1]=="G3"||grid[3][1]=="G4")&&(grid[3][0]=="G1"||grid[3][0]=="G2"||grid[3][0]=="G3"||grid[3][0]=="G4");
	}
	private static boolean ColumnsB(String[][] grid) {
		return col4B(grid)||col3B(grid)||col2B(grid)||col1B(grid);
	}
	private static boolean AcrossB(String[][] grid) {
		return across2B(grid)||across1B(grid);
	}
	private static boolean across2B(String[][] grid) {
		return (grid[0][3]=="B1"||grid[0][3]=="B2"||grid[0][3]=="B3"||grid[0][3]=="B4")&&(grid[1][2]=="B1"||grid[1][2]=="B2"||grid[1][2]=="B3"||grid[1][2]=="B4")&&
		    	(grid[2][1]=="B1"||grid[2][1]=="B2"||grid[2][1]=="B3"||grid[2][1]=="B4")&&(grid[3][0]=="B1"||grid[3][0]=="B2"||grid[3][0]=="B3"||grid[3][0]=="B4");
	}
	private static boolean across1B(String[][] grid) {
		return (grid[0][0]=="B1"||grid[0][0]=="B2"||grid[0][0]=="B3"||grid[0][0]=="B4")&&(grid[1][1]=="B1"||grid[1][1]=="B2"||grid[1][1]=="B3"||grid[1][1]=="B4")&&
		    	(grid[2][2]=="B1"||grid[2][2]=="B2"||grid[2][2]=="B3"||grid[2][2]=="B4")&&(grid[3][3]=="B1"||grid[3][3]=="B2"||grid[3][3]=="B3"||grid[3][3]=="B4");
	}
	private static boolean col4B(String[][] grid) {
		return (grid[0][3]=="B1"||grid[0][3]=="B2"||grid[0][3]=="B3"||grid[0][3]=="B4")&&(grid[1][3]=="B1"||grid[1][3]=="B2"||grid[1][3]=="B3"||grid[1][3]=="B4")&&
		    	(grid[2][3]=="B1"||grid[2][3]=="B2"||grid[2][3]=="B3"||grid[2][3]=="B4")&&(grid[3][3]=="B1"||grid[3][3]=="B2"||grid[3][3]=="B3"||grid[3][3]=="B4");
	}
	private static boolean col3B(String[][] grid) {
		return (grid[0][2]=="B1"||grid[0][2]=="B2"||grid[0][2]=="B3"||grid[0][2]=="B4")&&(grid[1][2]=="B1"||grid[1][2]=="B2"||grid[1][2]=="B3"||grid[1][2]=="B4")&&
		(grid[2][2]=="B1"||grid[2][2]=="B2"||grid[2][2]=="B3"||grid[2][2]=="B4")&&(grid[3][2]=="B1"||grid[3][2]=="B2"||grid[3][2]=="B3"||grid[3][2]=="B4");
	}
	private static boolean col2B(String[][] grid) {
		return (grid[0][1]=="B1"||grid[0][1]=="B2"||grid[0][1]=="B3"||grid[0][1]=="B4")&&(grid[1][1]=="B1"||grid[1][1]=="B2"||grid[1][1]=="B3"||grid[1][1]=="B4")&&
		    	(grid[2][1]=="B1"||grid[2][1]=="B2"||grid[2][1]=="B3"||grid[2][1]=="B4")&&(grid[3][1]=="B1"||grid[3][1]=="B2"||grid[3][1]=="B3"||grid[3][1]=="B4");
	}
	private static boolean col1B(String[][] grid) {
		return (grid[0][0]=="B1"||grid[0][0]=="B2"||grid[0][0]=="B3"||grid[0][0]=="B4")&&(grid[1][0]=="B1"||grid[1][0]=="B2"||grid[1][0]=="B3"||grid[1][0]=="B4")&&
			(grid[2][0]=="B1"||grid[2][0]=="B2"||grid[2][0]=="B3"||grid[2][0]=="B4")&&(grid[3][0]=="B1"||grid[3][0]=="B2"||grid[3][0]=="B3"||grid[3][0]=="B4");
	}
	private static boolean RowsB(String[][] grid) {
		return row4B(grid)||row2B(grid)||row3B(grid)||row1B(grid);
	}
	private static boolean row1B(String[][] grid) {
		return (grid[0][3]=="B1"||grid[0][3]=="B2"||grid[0][3]=="B3"||grid[0][3]=="B4")&&(grid[0][2]=="B1"||grid[0][2]=="B2"||grid[0][2]=="B3"||grid[0][2]=="B4")&&
				   (grid[0][1]=="B1"||grid[0][1]=="B2"||grid[0][1]=="B3"||grid[0][1]=="B4")&&(grid[0][0]=="B1"||grid[0][0]=="B2"||grid[0][0]=="B3"||grid[0][0]=="B4");
	}
	private static boolean row2B(String[][] grid) {
		return (grid[1][3]=="B1"||grid[1][3]=="B2"||grid[1][3]=="B3"||grid[1][3]=="B4")&&(grid[1][2]=="B1"||grid[1][2]=="B2"||grid[1][2]=="B3"||grid[1][2]=="B4")&&
		   (grid[1][1]=="B1"||grid[1][1]=="B2"||grid[1][1]=="B3"||grid[1][1]=="B4")&&(grid[1][0]=="B1"||grid[1][0]=="B2"||grid[1][0]=="B3"||grid[1][0]=="B4");
	}
	private static boolean row3B(String[][] grid) {
		return (grid[2][3]=="B1"||grid[2][3]=="B2"||grid[2][3]=="B3"||grid[2][3]=="B4")&&(grid[2][2]=="B1"||grid[2][2]=="B2"||grid[2][2]=="B3"||grid[2][2]=="B4")&&
			   (grid[2][1]=="B1"||grid[2][1]=="B2"||grid[2][1]=="B3"||grid[2][1]=="B4")&&(grid[2][0]=="B1"||grid[2][0]=="B2"||grid[2][0]=="B3"||grid[2][0]=="B4");
	}
	private static boolean row4B(String[][] grid) {
		return (grid[3][3]=="B1"||grid[3][3]=="B2"||grid[3][3]=="B3"||grid[3][3]=="B4")&&( grid[3][2]=="B1"||grid[3][2]=="B2"||grid[3][2]=="B3"||grid[3][2]=="B4")&&
			 ( grid[3][1]=="B1"||grid[3][1]=="B2"||grid[3][1]=="B3"||grid[3][1]=="B4")&&(grid[3][0]=="B1"||grid[3][0]=="B2"||grid[3][0]=="B3"||grid[3][0]=="B4");
	}	
	public static void Greenplayerexternalstacks(Stack<String> stackG1, Stack<String> stackG2,
			Stack<String> stackG3) {
		System.out.println(" ");
		System.out.println("Statistics external stacks green player");
		System.out.print("Stack 1: ");
		int  O=stackG1.size();
		if(O==0) { System.out.print(" ");}        	 
		if(O==1) {popstacksB(stackG1);}
		if(O==2) {popstacksB(stackG1);popstacksB(stackG1);} 
		if(O==3) {popstacksB(stackG1);popstacksB(stackG1);popstacksB(stackG1);}
		if(O==4){popstacksB(stackG1);popstacksB(stackG1);popstacksB(stackG1);popstacksB(stackG1);}
		System.out.println("");
		System.out.print("Stack 2: ");
		int  W=stackG2.size();
		if(W==0) { System.out.print(" ");}        	 
		if(W==1) {popstacksB(stackG2);}
		if(W==2) {popstacksB(stackG2);popstacksB(stackG2);} 
		if(W==3) {popstacksB(stackG2);popstacksB(stackG2);popstacksB(stackG2);}
		if(W==4){popstacksB(stackG2);popstacksB(stackG2);popstacksB(stackG2);popstacksB(stackG2);}
		System.out.println("");
		System.out.print("Stack 3: ");
		int  P=stackG3.size();
		if(P==0) { System.out.print(" ");}        	 
		if(P==1) {popstacksB(stackG3);}
		if(P==2) {popstacksB(stackG3);popstacksB(stackG3);} 
		if(P==3) {popstacksB(stackG3);popstacksB(stackG3);popstacksB(stackG3);}
		if(P==4){popstacksB(stackG3);popstacksB(stackG3);popstacksB(stackG3);popstacksB(stackG3);
		System.out.println(" ");}
	}
	public static void Blueplayerexternalstacks(Stack<String> stack1, Stack<String> stack2, Stack<String> stack3,
			Stack<String> stack4, Stack<String> stack5, Stack<String> stack6, Stack<String> stack7,
			Stack<String> stack8, Stack<String> stack9, Stack<String> stack10, Stack<String> stack11,
			Stack<String> stack12, Stack<String> stack13, Stack<String> stack14, Stack<String> stack15,
			Stack<String> stack16,String[][] grid,Stack<String> stackB1, Stack<String> stackB2, Stack<String> stackB3) {
		System.out.println("Statistics for each stack present on the board");
	    if ((grid[0][0]!="__")&&(grid[0][0]!="SH")) {
	    	if(grid[0][0]=="GR") {
	    		int  O=stack1.size();
				if(O==2) {System.out.print("greypiece");;System.out.println(" ");} 
				if(O==3) {popstacksB(stack1);popstacksB(stack1);System.out.println(" ");}
				if(O==4){popstacksB(stack1);popstacksB(stack1);popstacksB(stack1);System.out.println(" ");}
				if(O==5){popstacksB(stack1);popstacksB(stack1);popstacksB(stack1);popstacksB(stack1);System.out.println(" ");}
	    		
	    	}else {
	    	int  O=stack1.size();
			if(O==2) {popstacksB(stack1);System.out.println(" ");} 
			if(O==3) {popstacksB(stack1);popstacksB(stack1);System.out.println(" ");}
			if(O==4){popstacksB(stack1);popstacksB(stack1);popstacksB(stack1);System.out.println(" ");}
			if(O==5){popstacksB(stack1);popstacksB(stack1);popstacksB(stack1);popstacksB(stack1);System.out.println(" ");}}}
	    if ((grid[0][1]!="__")&&(grid[0][1]!="SH")) {
	    	int  O=stack2.size();
			if(O==2) {popstacksB(stack2);System.out.println(" ");} 
			if(O==3) {popstacksB(stack2);popstacksB(stack2);System.out.println(" ");}
			if(O==4){popstacksB(stack2);popstacksB(stack2);popstacksB(stack2);System.out.println(" ");}
			if(O==5){popstacksB(stack2);popstacksB(stack2);popstacksB(stack2);popstacksB(stack2);System.out.println(" ");}}
	    if ((grid[0][2]!="__")&&(grid[0][2]!="SH")) {int  O=stack3.size();
		if(O==2) {popstacksB(stack3);System.out.println(" ");} 
		if(O==3) {popstacksB(stack3);popstacksB(stack3);System.out.println(" ");}
		if(O==4){popstacksB(stack3);popstacksB(stack3);popstacksB(stack3);System.out.println(" ");}
		if(O==5){popstacksB(stack3);popstacksB(stack3);popstacksB(stack3);popstacksB(stack3);System.out.println(" ");}}
	    if ((grid[0][3]!="__")&&(grid[0][3]!="SH")) {int  O=stack4.size();
		if(O==2) {popstacksB(stack4);System.out.println(" ");} 
		if(O==3) {popstacksB(stack4);popstacksB(stack4);System.out.println(" ");}
		if(O==4){popstacksB(stack4);popstacksB(stack4);popstacksB(stack4);System.out.println(" ");}
		if(O==5){popstacksB(stack4);popstacksB(stack4);popstacksB(stack4);popstacksB(stack4);System.out.println(" ");}}
	    if ((grid[1][0]!="__")&&(grid[1][0]!="SH")) {int  O=stack5.size();
		if(O==2) {popstacksB(stack5);System.out.println(" ");} 
		if(O==3) {popstacksB(stack5);popstacksB(stack5);System.out.println(" ");}
		if(O==4){popstacksB(stack5);popstacksB(stack5);popstacksB(stack5);System.out.println(" ");}
		if(O==5){popstacksB(stack5);popstacksB(stack5);popstacksB(stack5);popstacksB(stack5);System.out.println(" ");}}
	    if ((grid[1][1]!="__")&&(grid[1][1]!="SH")) {int  O=stack6.size();
		if(O==2) {popstacksB(stack6);System.out.println(" ");} 
		if(O==3) {popstacksB(stack6);popstacksB(stack6);System.out.println(" ");}
		if(O==4){popstacksB(stack6);popstacksB(stack6);popstacksB(stack6);System.out.println(" ");}
		if(O==5){popstacksB(stack6);popstacksB(stack6);popstacksB(stack6);popstacksB(stack6);System.out.println(" ");}}
	    if ((grid[1][2]!="__")&&(grid[1][2]!="SH")) {int  O=stack7.size();
		if(O==2) {popstacksB(stack7);System.out.println(" ");} 
		if(O==3) {popstacksB(stack7);popstacksB(stack7);System.out.println(" ");}
		if(O==4){popstacksB(stack7);popstacksB(stack7);popstacksB(stack7);System.out.println(" ");}
		if(O==5){popstacksB(stack7);popstacksB(stack7);popstacksB(stack7);popstacksB(stack7);System.out.println(" ");}}
	    if (grid[1][3]!="__") {int  O=stack8.size();
		if(O==2) {popstacksB(stack8);System.out.println(" ");} 
		if(O==3) {popstacksB(stack8);popstacksB(stack8);System.out.println(" ");}
		if(O==4){popstacksB(stack8);popstacksB(stack8);popstacksB(stack8);System.out.println(" ");}
		if(O==5){popstacksB(stack8);popstacksB(stack8);popstacksB(stack8);popstacksB(stack8);System.out.println(" ");}}
	    if ((grid[2][0]!="__")&&(grid[2][0]!="SH")) {int  O=stack9.size();
		if(O==2) {popstacksB(stack9);System.out.println(" ");} 
		if(O==3) {popstacksB(stack9);popstacksB(stack9);System.out.println(" ");}
		if(O==4){popstacksB(stack9);popstacksB(stack9);popstacksB(stack9);System.out.println(" ");}
		if(O==5){popstacksB(stack9);popstacksB(stack9);popstacksB(stack9);popstacksB(stack9);System.out.println(" ");}}
	    if ((grid[2][1]!="__")&&(grid[2][1]!="SH")) {int  O=stack10.size();
		if(O==2) {popstacksB(stack10);System.out.println(" ");} 
		if(O==3) {popstacksB(stack10);popstacksB(stack10);System.out.println(" ");}
		if(O==4){popstacksB(stack10);popstacksB(stack10);popstacksB(stack10);System.out.println(" ");}
		if(O==5){popstacksB(stack10);popstacksB(stack10);popstacksB(stack10);popstacksB(stack10);System.out.println(" ");}}
	    if ((grid[2][2]!="__")&&(grid[2][2]!="SH")) {int  O=stack11.size();
		if(O==2) {popstacksB(stack11);System.out.println(" ");} 
		if(O==3) {popstacksB(stack11);popstacksB(stack11);System.out.println(" ");}
		if(O==4){popstacksB(stack11);popstacksB(stack11);popstacksB(stack11);System.out.println(" ");}
		if(O==5){popstacksB(stack11);popstacksB(stack11);popstacksB(stack11);popstacksB(stack11);System.out.println(" ");}}
	    if ((grid[2][3]!="__")&&(grid[2][3]!="SH")) {int  O=stack12.size();
		if(O==2) {popstacksB(stack12);System.out.println(" ");} 
		if(O==3) {popstacksB(stack12);popstacksB(stack12);System.out.println(" ");}
		if(O==4){popstacksB(stack12);popstacksB(stack12);popstacksB(stack12);System.out.println(" ");}
		if(O==5){popstacksB(stack12);popstacksB(stack12);popstacksB(stack12);popstacksB(stack12);System.out.println(" ");}}
	    if ((grid[3][0]!="__")&&(grid[3][0]!="SH")) {int  O=stack13.size();
			if(O==2) {popstacksB(stack13);System.out.println(" ");} 
			if(O==3) {popstacksB(stack13);popstacksB(stack13);System.out.println(" ");}
			if(O==4){popstacksB(stack13);popstacksB(stack13);popstacksB(stack13);System.out.println(" ");}
			if(O==5){popstacksB(stack13);popstacksB(stack13);popstacksB(stack13);popstacksB(stack13);System.out.println(" ");}}
	    if ((grid[3][1]!="__")&&(grid[3][1]!="SH")) {int  O=stack14.size();
		if(O==2) {popstacksB(stack14);System.out.println(" ");} 
		if(O==3) {popstacksB(stack14);popstacksB(stack14);System.out.println(" ");}
		if(O==4){popstacksB(stack14);popstacksB(stack14);popstacksB(stack14);System.out.println(" ");}
		if(O==5){popstacksB(stack14);popstacksB(stack14);popstacksB(stack14);popstacksB(stack14);System.out.println(" ");}}    
	    if ((grid[3][2]!="__")&&(grid[3][2]!="SH")) {int  O=stack15.size();
		if(O==2) {popstacksB(stack15);System.out.println(" ");} 
		if(O==3) {popstacksB(stack15);popstacksB(stack15);System.out.println(" ");}
		if(O==4){popstacksB(stack15);popstacksB(stack15);popstacksB(stack15);System.out.println(" ");}
		if(O==5){popstacksB(stack15);popstacksB(stack15);popstacksB(stack15);popstacksB(stack15);System.out.println(" ");}}
	    if ((grid[3][3]!="__")&&(grid[3][3]!="SH")) {int  O=stack16.size();
		if(O==2) {popstacksB(stack16);System.out.println(" ");} 
		if(O==3) {popstacksB(stack16);popstacksB(stack16);System.out.println(" ");}
		if(O==4){popstacksB(stack16);popstacksB(stack16);popstacksB(stack16);System.out.println(" ");}
		if(O==5){popstacksB(stack16);popstacksB(stack16);popstacksB(stack16);popstacksB(stack16);System.out.println(" ");}}
		System.out.println("Statistics external stacks blue player");
		System.out.print("Stack 1: ");
		int  j=stackB1.size();
		if(j==0) { System.out.print(" ");}        	                            
		if(j==1) {popstacksB(stackB1);}
		if(j==2) {popstacksB(stackB1);popstacksB(stackB1);} 
		if(j==3) {popstacksB(stackB1);popstacksB(stackB1);popstacksB(stackB1);}
		if(j==4){popstacksB(stackB1);popstacksB(stackB1);popstacksB(stackB1);popstacksB(stackB1);}
		System.out.println(" ");
		System.out.print("Stack 2: "); 
		int  i=stackB2.size();
		if(i==0) { System.out.print(" ");}        	 
		if(i==1) {popstacksB(stackB2);}
		if(i==2) {popstacksB(stackB2);popstacksB(stackB2);} 
		if(i==3) {popstacksB(stackB2);popstacksB(stackB2);popstacksB(stackB2);}
		if(i==4) {popstacksB(stackB2);popstacksB(stackB2);popstacksB(stackB2);popstacksB(stackB2);}
		System.out.println(" ");
		System.out.print("Stack 3: ");
		int  k=stackB3.size();
		if(k==0) { System.out.print(" ");}        	 
		if(k==1) {popstacksB(stackB3);}
		if(k==2) {popstacksB(stackB3);popstacksB(stackB3);} 
		if(k==3) {popstacksB(stackB3);popstacksB(stackB3);popstacksB(stackB3);}
		if(k==4){popstacksB(stackB3);popstacksB(stackB3);popstacksB(stackB3);popstacksB(stackB3);}
	}	
	public static void popstacksB(Stack<String> stackB1) {
		System.out.print(stackB1.pop()+" ");	}
	public static void printboard(String[][] grid) {
		System.out.println("   "+ "c1 "+"c2 "+"c3 "+"c4");
		System.out.println("r1 "+ grid[0][0]+"|"+ grid[0][1]+"|"+ grid[0][2]+"|"+ grid[0][3]+"|");
		System.out.println("r2 "+ grid[1][0]+"|"+ grid[1][1]+"|"+ grid[1][2]+"|"+ grid[1][3]+"|");
		System.out.println("r3 "+ grid[2][0]+"|"+ grid[2][1]+"|"+ grid[2][2]+"|"+ grid[2][3]+"|");
		System.out.println("r4 "+ grid[3][0]+"|"+ grid[3][1]+"|"+ grid[3][2]+"|"+ grid[3][3]+"|");
	}
	public static String firstint(In in,Stack<String> stack1, Stack<String> stack2, Stack<String> stack3,
			Stack<String> stack4, Stack<String> stack5, Stack<String> stack6, Stack<String> stack7,
			Stack<String> stack8, Stack<String> stack9, Stack<String> stack10, Stack<String> stack11,
			Stack<String> stack12, Stack<String> stack13, Stack<String> stack14, Stack<String> stack15,
			Stack<String> stack16, String[][] grid,Stack<String> stackG1, Stack<String> stackG2, Stack<String> stackG3,Stack<String> stackB1, Stack<String> stackB2, Stack<String> stackB3,int rowG,int colG, int ints,
			int  inputInt,String m) {
		
 		if(inputInt==1) {
 			if(stackG1.isEmpty()) {System.out.println(); System.out.println("Invalid move");}else {
 		     m =stackG1.pop();
 		 }}
 	     if(inputInt==2) {
 	    	if(stackG2.isEmpty()) {System.out.println(); System.out.println("Invalid move");}else {
  		 m =stackG2.pop();
  		 }}
       if(inputInt==3) {
    	   if(stackG3.isEmpty()) {System.out.println(); System.out.println("Invalid move");}else {
  		 m =stackG3.pop();
  		  }}
		return m;
	}	
  public static String Blueplayersturn(In in,Stack<String> stack1, Stack<String> stack2, Stack<String> stack3,
			Stack<String> stack4, Stack<String> stack5, Stack<String> stack6, Stack<String> stack7,
			Stack<String> stack8, Stack<String> stack9, Stack<String> stack10, Stack<String> stack11,
			Stack<String> stack12, Stack<String> stack13, Stack<String> stack14, Stack<String> stack15,
			Stack<String> stack16, String[][] grid, Stack<String> stackB1, Stack<String> stackB2,
		Stack<String> stackB3, int ints, int row, int col, String n) {
	 while(ints==1) {
		 if(stackB1.isEmpty()) {System.out.println(); System.out.println("Invalid move");break;}else {
		 n =stackB1.pop();
		 break;}}
	    while(ints==2) {
	    	if(stackB2.isEmpty()) {System.out.println(); System.out.println("Invalid move");break;}else {
		 n =stackB2.pop();
		 break;}}
		while(ints==3) {
		    if(stackB3.isEmpty()) {System.out.println(); System.out.println("Invalid move");break;}else {
		 n =stackB3.pop();        	   		
		 break; }}  		
	   
	return n;
}}
