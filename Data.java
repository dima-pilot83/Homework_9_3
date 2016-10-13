
public class Data {

	private int freq;
	private Character name;

	public Data(int freq, char i) {
		super();
		this.freq = freq;
		this.name = i;
	}

	
	public int getFreq() {
		return freq;
	}


	public void setFreq(int freq) {
		this.freq = freq;
	}


	public Character getName() {
		return name;
	}


	public void setName(Character name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Data [freq=" + freq + ", name=" + name + "]";
	}

}
