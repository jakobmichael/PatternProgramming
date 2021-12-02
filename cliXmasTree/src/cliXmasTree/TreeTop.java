package cliXmasTree;

public class TreeTop {

	private int height;
	private int width;

	public TreeTop(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}

	public void printTreeTop() {
		for (int i = 1; i <= this.height; i++) {
			for (int k = 1; k <= this.width - i + 1; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
