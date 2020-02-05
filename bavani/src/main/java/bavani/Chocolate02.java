package bavani;

public class Chocolate02 extends NewYearChocolates{
	static int mywt=0;

	@Override

	public int weightOfGift(int wt) {

		totalweight+=wt;

		mywt+=wt;

		return totalweight;

		

	}

}
