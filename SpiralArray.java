package lab0;

/**
 * This is the test class to print 2D square array in Spiral Order
 * 
 * @author Joseph Difilippo
 *
 */
public class SpiralArray
{

	/**
	 * This function is to print a 2D n x n square array in Spiral oder
	 * 
	 * @param arr
	 *            - 2D array
	 * @return String - the spiral order of arr (numbers should be separated by
	 *         single space)
	 */

	public static String printSprialArray(int[][] arr)
	{
		String ret = "";

		for (int n = 0; n < arr.length / 2; n++)
		{

			for (int i = n; i < arr.length - (n + 1); i++)
			{
				ret += (arr[n][i] + " ");
			}
			for (int i = n; i < arr.length - (n + 1); i++)
			{
				ret += (arr[i][arr.length - (n + 1)] + " ");
			}
			for (int i = arr.length - (n + 1); i > n; i--)
			{
				ret += (arr[arr.length - (n + 1)][i] + " ");
			}
			for (int i = arr.length - (n + 1); i > n; i--)
			{
				ret += (arr[i][n] + " ");
			}

		}

		// checks if array dimensions are odd
		if (arr.length % 2 != 0)
		{
			int x = (arr.length - 1) / 2;
			ret += arr[x][x]; // retrieves lone center number
		}

		return ret.trim();
	}

}