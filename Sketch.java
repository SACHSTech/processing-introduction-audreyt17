import processing.core.PApplet;

public class Sketch extends PApplet {
	
	/**
  * Description: 
  * Write a program that creates a drawing using processing.
  * @author: Tao A
  */
  
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(161, 185, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    float flowerX = 300;
    float flowerY = 270;
    float petalSize = 50;
    float petalDistance = petalSize / 2;

    fill(195, 149, 199);

// upper-left petal
    ellipse(flowerX - petalDistance, flowerY - petalDistance,
        petalSize, petalSize);

// upper-right petal
    ellipse(flowerX + petalDistance, flowerY - petalDistance,
        petalSize, petalSize);

// lower-left petal
    ellipse(flowerX - petalDistance, flowerY + petalDistance,
        petalSize, petalSize);

// lower-right petal
    ellipse(flowerX + petalDistance, flowerY + petalDistance,
        petalSize, petalSize);

// center petal
    fill(248, 252, 131);
    ellipse(flowerX, flowerY,
        petalSize, petalSize);

// flower stem
    stroke(128);
    strokeWeight(3/2);
    line(300, 400, 300, 305);

// rectangle of the house
    fill(189, 154, 102);
    rect(50, 149, 180, 250);
    
// door of the house
    fill(135, 108, 68);
    rect(95, 270, 90, 125);
    
// roof of the house
    fill(135, 108, 68);
    triangle(50, 150, 135, 60, 230, 150);
    
// grass
    fill(97, 173, 97);
    rect(0, 370, 400, 30);
    
  }
  
  // define other methods down here.
}