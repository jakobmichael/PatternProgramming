package cliXmasTree;

import java.util.Scanner;
import cliXmasTree.TreeTop;
import cliXmasTree.TreeTrunk;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Specify Height of Tree:");
		int height = scanner.nextInt();
		int width = height - 1;
		scanner.close();

		TreeTop treeTop = new TreeTop(height, width);
		TreeTrunk treeTrunk = new TreeTrunk(width - 1, height / 4);

		treeTop.printTreeTop();
		treeTrunk.printTreeTrunk();
	}

}
