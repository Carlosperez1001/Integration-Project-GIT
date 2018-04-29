
/**
 * Class "Calculator" will handle all complex calculation. Currently the method
 * STASetup is capable of sorting a list, finding the average of said list,
 * determine the range, variance and standard deviation.
 * 
 * @author Carlos Perez
 */
public class Calculator {
	// --(1)STA 2023
	String dataString; // Input
	double average = 0;
	double range = 0;
	double variance = 0;
	double deviation = 0;

	/**
	 * After selection 1 in the main, the program will take in a list of numbers
	 * [double or int] as a string. This string is split at every [“Space“] and
	 * will create array with the value. The list is then sorted and perform simple
	 * calculations.
	 */
	public void STASetup() {
		System.out.println("Enter a your data list");
		ScannerTool.sc.nextLine();
		dataString = ScannerTool.sc.nextLine();
		String dataStringSplit[] = dataString.split(" ");
		try {
			double data[] = new double[dataStringSplit.length];
			for (int i = 0; i < dataStringSplit.length; i++) {
				data[i] = Double.valueOf(dataStringSplit[i]);
			}
			for (int v = 0; v < data.length - 1; v++) { // Sort
				for (int x = 0; x < data.length - 1; x++) {
					if ((data[x]) > (data[x + 1])) {
						double temp = data[x];
						data[x] = data[x + 1];
						data[x + 1] = temp;
					}
				}
			}

			// Step 1 of Calculations
			for (int i = 0; i < data.length; i++) {
				System.out.print(data[i] + " ");
				average += data[i];
				range = data[data.length - 1] - data[0];

				if (i == data.length - 1) {
					average = average / data.length;
					System.out.println();
					System.out.println("# of Items: " + data.length);
					System.out.println("Average: " + average);
					System.out.println("Range: " + range);
				}
			}
			// Step 2 of Calculations
			for (int i = 0; i < data.length; i++) {
				variance += Math.pow((data[i] - average), 2);
				if (i == data.length - 1) {
					variance = variance / (data.length - 1);
					deviation = Math.sqrt(variance);
					System.out.println("(Sample)Variance: " + variance);
					System.out.println("(Sample)Standand DEV.: " + deviation);
				}
			}
		} catch (NumberFormatException e) {
		System.out.println("error");
			{
			}

		}

	}

}
