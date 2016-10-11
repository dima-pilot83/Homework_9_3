
public class Data {

	int freq;
	Character name;

	public Data(int freq, char i) {
		super();
		this.freq = freq;
		this.name = i;
	}

	@Override
	public String toString() {
		return "Data [freq=" + freq + ", name=" + name + "]";
	}

}
