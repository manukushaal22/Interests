/**
 * @author Kushaal
 * Calculate simple and compound interests
 */
public class Interests {
	
	/**
	 * returns simple interest
	 * @param p principal amount in Rs
	 * @param t time in years
	 * @param r rate of interest
	 * @return simple interest
	 */
	double simple(int p,int t,double r)
	{
		return (p*t*r)/100;
	}
	

	/**
	 * returns compound interest
	 * @param p principal amount in Rs
	 * @param t time in years
	 * @param r rate of interest
	 * @return compound interest
	 */
	double compound(int p,int t,double r)
	{
		return (p*Math.pow(1+r/100, t)-p);
	}

}
