package cn.tju.swtest.lab1;

public class Coin {
	public boolean getChange(int total) {
		boolean res = false;
		int [] allChange = {1,2,3,5,6,7,8,10,11,12,13,21,22,23,25,26,27,28,30,
									31,32,33,51,52,53,55,56,57,58,60,61,62,63,71,
									72,73,75,76,77,78,80,81,82,83};
		for(int i = 0;i < allChange.length;i++) {
			if(total == allChange[i]) {
				res = true;
				break;
			}
		}
		return res;
	}
}
