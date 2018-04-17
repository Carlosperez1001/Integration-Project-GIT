//Carlos Perez
//Profs. Vanselow COP 2006
//Integration Project (RGNDataList)
/*The RNGDataList class is a program that creates
 *  an integer array  when each element is a number 
 *  between 1- 99. The size of the array is determine by 
 *  the users input. The array will print out the sum of 
 *  the array, the minimum value, and the maximum value.*/

public class RNGDataList {
	public void RNGDataListSetup() {
		int dataSize;
		int sum = 0;
		int min = 0;
		int max = 0;
		int minPos = 0;
		int maxPos = 0;
		System.out.println("How many items would like?");
		dataSize = ScannerTool.sc.nextInt();
		int dataList[] = new int[dataSize];

		for (int i = 0; i < dataList.length; i++) {
			dataList[i] = (int) (Math.random() * 99) + 1;
			if (i == 0) {
				min = (dataList[0]);
				max = (dataList[0]);
			}
			sum += dataList[i];

			if (dataList[i] < min) {
				min = dataList[i];
				minPos = i;
			}
			if (dataList[i] > max) {
				max = dataList[i];
				maxPos = i;
			}

			System.out.print(dataList[i] + " ");

		}
		System.out.println();
		System.out.println("Sum: " + sum);
		System.out.println("Min: " + min + " at index [" + (minPos + 1) + "]");
		System.out.println("Max: " + max + " at index [" + (maxPos + 1) + "]");

	}

}
