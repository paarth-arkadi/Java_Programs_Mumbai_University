
// A Hello World Applet 
// Save file as HelloWorld.java 
  
import java.applet.Applet; 
import java.awt.Graphics; 
  
/* 
<applet code="HelloWorld" width=200 height=60> 
</applet> 
*/
  
// HelloWorld class extends Applet 
public class myapp extends Applet  
{ 
    // Overriding paint() method 
   
    public void paint(Graphics g)  
    { 
   g.drawOval(150,150, 100, 100);
   int n1=200;               
       int d1=200;
       double n2,d2;
  double line=0.0;	   
		    double angle= 0.0;    //for angle determination
			             int r=50;
             for(int i=1;i<=24;i++)
                {
                         angle=(double)line*(3.14/180);

                          n2=n1+(double)r*Math.cos(angle);

                          d2=d1+(double)r*Math.sin(angle);

                         g.drawLine(n1,d1,(int)n2,(int)d2);   //drawing line between (n1,d1) and (n2,d2)

                        line=line+(360/24);
               }
    } 
      
} 