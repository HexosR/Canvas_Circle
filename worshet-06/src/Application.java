
public class Application {

	/**
	 * This is the starting place for your program.
	 * The JVM will call this method when you run the program from
	 * IntelliJ or from the command line: java Application
	 * We will say more about this method during a later talk,
	 * e.g. what static means.
	 * @param args Is an array that contains all the command line
	 * arguments, e.g. java Application arg1 arg2 arg3
	 */
	public static void main(String[] args) {
		// ADD loopy-circles.txt CODE HERE
		Canvas c = Canvas.getCanvas();
		Circle circle1 = new Circle();
		int width = c.getWidth();
		int height = c.getHeight();
		int randomSize = 0;
		int xPos = 0;
		int currentXPos = 0;
		int yPos = 0;
		int currentYPos = 0;
		java.util.Random rand = new java.util.Random();
		circle1.makeVisible();
		int x = 0;
		boolean random;
		int count = 0;

		while (count < 10){
			if (x != count){
				if (circle1.getColor() == "blue"){
					random = rand.nextBoolean();
					if (random == true){
						circle1.changeColor("red");
					}
					else{
						circle1.changeColor("black");
					}
				}
				else if (circle1.getColor() == "black" || circle1.getColor() == "red"){
					circle1.changeColor("blue");}
			}
			xPos = rand.nextInt(width);
			yPos = rand.nextInt(height);
			currentXPos = circle1.getXCoord();
			currentYPos = circle1.getYCoord();
			circle1.slowMoveHorizontal(xPos - currentXPos);
			circle1.slowMoveVertical(yPos - currentYPos);
			count = count + 1;
			randomSize = rand.nextInt(width / 2);
			circle1.changeSize(randomSize);
		}





	}

}
