





public class Main {
		
		/**
		 * Main
		 */
		
		public static void main(String [] args) {
			Animal miniKenney = new Animal("Kenney", 500);
			Animal kyle = new Animal("Kyle", 210);
			System.out.println(miniKenney.getName());
			kyle.printNameAndWeight();
			miniKenney.printNameAndWeight();
			System.out.print("Is Kyle bigger? ");
			System.out.println("Our combined weight is " + (kyle.getWeight() + miniKenney.getWeight()));
			System.out.print("Is Kyle bigger? ");
			System.out.println(kyle.getWeight() > miniKenney.getWeight());
			kyle.takeTestosteroneEnanthane();
			miniKenney.takeCreatine();
			kyle.printNameAndWeight();
			miniKenney.printNameAndWeight();
			System.out.println(kyle.getName() 
					+ " is bigger than " 
					+ miniKenney.getName() 
					+ " "
					+ (kyle.getWeight() > miniKenney.getWeight()));
			int cycle = 0;
			while(cycle < 3) {
				System.out.println("We are on cycle " + ++cycle);
				kyle.takeTestosteroneEnanthane();
				miniKenney.takeCreatine();
				kyle.printNameAndWeight();
				miniKenney.printNameAndWeight();
			}
			if (cycle >= 3) {
				System.out.println("They both died of heart attacks");
			}
		}
}
