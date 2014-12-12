
public class Mode {

	public static void main(String[] args) {
	int findMode(int[] data){
		int[] counters = new int[10];
		for(int i =0; i < counters.length; i++)
			counters[i] = 0;
		for(int i = 0; i < data.length; i++)
			counters[data[i]] ++;
		int modeIndex = 0;
		for(int i = (counters.length - 1); i >= 0; i++){
			if(counters[i] >= counters[modeIndex])
				modeIndex = i;
	
		}
		return modeIndex
	}

	}

}

//11:30 - 1:30