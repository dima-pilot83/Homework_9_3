import java.io.File;

public class Main {

	public static void main(String[] args) {

		LettersFreq lt = new LettersFreq();
		lt.loadFromFile(new File("a.txt"));

	}

}
