import java.util.Comparator;

public class LetterCopm implements Comparator<Data> {

	@Override
	public int compare(Data a, Data b) {

		if (a.getFreq() > b.getFreq()) {
			return -1;
		} else if (a.getFreq() < b.getFreq()) {
			return 1;
		} else
			return 0;
	}
}
