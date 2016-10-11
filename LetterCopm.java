import java.util.Comparator;

public class LetterCopm implements Comparator<Data> {

	@Override
	public int compare(Data a, Data b) {

		if (a.freq > b.freq) {
			return -1;
		} else if (a.freq < b.freq) {
			return 1;
		} else
			return 0;
	}
}
