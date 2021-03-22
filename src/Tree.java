import java.util.Scanner;

public class Tree {
	
	private Scanner sc = new Scanner(System.in);
	private int levels;
	
	private void setLevels() {
		this.levels=sc.nextInt();
	}
	
	private int getLevels() {
		return levels;
	}
	
	private void printTree() {
		
		int l = getLevels();
		
		for (int i=0;i<l;i++) {
			
			for (int j=1;j<l-i;j++) {
				System.out.print(" ");
			}
			
			for (int k=0;k<=i*2;k++) {
				System.out.print("*");
			}
			
			System.out.println("");
			
		}
		
	}

	public static void main(String[] args) {
		
		Tree tree = new Tree();
		tree.setLevels();
		tree.printTree();
		

	}

}
