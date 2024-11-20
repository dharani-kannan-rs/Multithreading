package Interface;

public class Main {

	public static void main(String[] args) {

		Eagle eagle = new Eagle();
		eagle.canFly();
		
		
		Bird bird = new Bird() {

			@Override
			public void canFly() {
				System.out.println("Eagle is flying in anamonynous class");
			}};
			
		bird.canFly();
		
		
		Bird bird1 = () -> System.out.println("Eagle is flying in lambda expression");
		
		bird1.canFly();
		
		
		bird1.canSee();
		
		Bird.display();
		
	}

}
