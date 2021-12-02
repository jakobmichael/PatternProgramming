package cliXmasTree;

public class TreeTrunk {

	private int width;
	private int height = 3;

	public TreeTrunk(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public TreeTrunk(int width) {
		this.width = width;
	}

	public void printTreeTrunk() {
		for (int i = 1; i <= this.height; i++) {
			for (int k = 1; k <= this.width; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2; j++) {
				System.out.print("| ");
			}
			System.out.println();
		}
	}
}
