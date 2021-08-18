package facade_Pattern;

public class ShapeMaker {
	   private Shape circle;
	   private Shape rectangle;
	   private Shape Triangle;

	   public ShapeMaker() {
	      circle = new Circle();
	      rectangle = new Rectangle();
	      Triangle = new Triangle();
	   }

	   public void drawCircle(){
	      circle.draw();
	   }
	   public void drawRectangle(){
	      rectangle.draw();
	   }
	   public void drawTriangle(){
	      Triangle.draw();
	   }
	}