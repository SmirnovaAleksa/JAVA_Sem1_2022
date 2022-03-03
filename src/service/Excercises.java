package service;

import java.util.Arrays;
import java.util.Random;

/**
 * Seminārs Nr.1, lai praktizētu JAVA
 * @author Aleksandra
 * Dokumentācijas komentārs
 * @result
 * 
 */
public class Excercises {
	//Exercise 1
	/**
	 * Funkcija, kas atgriež bumbinas atrašanās vietu
	 * @param gravity
	 * @param initialVelocity
	 * @param initialPosition
	 * @param fallingTime
	 * @return result
	 */
	public static double positionCalc(double gravity, double initialVelocity, double initialPosition, double fallingTime) {
		double result;
		
		// x(t) = 0.5 × a*t^2 + v_0*t + x_0
		result = 0.5*gravity*Math.pow(fallingTime, 2) + initialVelocity*fallingTime + initialPosition;
		
		return result;
	}

	//Exercise 2
	/**
	 * Faktoriāla aprēķins ar for ciklu
	 * @param N
	 * @return N!
	 */
	public static int factorialForLoop(int N){
		int result = 1;
		if( N > 0) {
			for(int i = 1; i <= N;i++) {
				result = result * i;
			}
		}
		else return 0;
		return result;
	}
	
	/**
	 * Faktoriāla aprēķināšana ar rekursiju
	 * @param N
	 * @return N!
	 */
	public static int factorialRecursive(int N) {
		if(N > 1) {
			return N * factorialRecursive(N-1);
		}
		else return 1;
	}
	
	//Exercise 3
	public static double[] generateArray(int N, double lower​, double upper​) {
		//TODO pārbaudīt lower ir mazaks par upper
		if(N > 0) {
			Random rand = new Random();
			double[] result = new double[N];
			for(int i = 0; i < result.length; i++) {
				double genTemp = 0;
				if(lower​ < upper​) {
					// low up 
					genTemp = rand.nextDouble()*(upper​-lower​)+lower​;
				}
				else {
					genTemp = rand.nextDouble()*(lower​-upper​)+upper​;
				}
				result[i] = genTemp;
			}
			return result;
		}
		return null;
	}
	
	public static double getMean(double[] array) {
		double mean = 0;
		for(int i =0; i<array.length; i++) {
			mean = mean + array[i];
		}
		return mean/array.length;
	}
	public static double getMin(double[] array) {
		double min = array[0];
		for(int i = 1; i< array.length; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
	
	public static double getMax(double[] array) {
		double max = array[0];
		for(int i = 1; i< array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	
	public static double[] arraySort(double[] array) {
		if(array!=null) {
			for( int  i = 0; i< array.length; i++) {
				for(int j = 0; j< array.length; j++) {
					if(array[i] < array[j]) {
						double temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}
		}
		return array;
	}
	
	//Exercise 4
	
	public static double[][] generateMatrix(int N){
		if(N > 0) {
			Random rand = new Random();
			double[][] result = new double[N][N];
			for(int i = 0; i < result.length; i++) {
				for(int j = 0; j < result.length; j++) {
					
					result[i][j] = rand.nextDouble()* 99 +1;
				}
			}
			return result;
		}
		return null;
	}
	
	public static double getProduct(double[][] matrix, int i, int j) {
		if(matrix != null && i >= 0 && j >= 0) {
			if(i < matrix.length && j < matrix[0].length) {
				double result = 0;
				for (int j2 = 0; j2 < matrix.length; j2++) {
					for (int k = 0; k < matrix.length; k++) {
						result += matrix[i][j2]*matrix[k][j];
					}
				}
				return result;
			}
		}
		return 0;
	}
	
	//Exercise 5
	//Part1
	public static double[] coinFlip(int N) {
		double[] result = new double[3];
		if(N>0) {
			Random rand = new Random();
			for(int i = 0; i<N; i++) {
				int getTemp = rand.nextInt(2);
				result[getTemp]++;
			}
			result[2] = result[0]/result[1];
			return result;
		}
		return null;
	}

	//Part2
	public static int[] rollDice(int N) {
		if(N>0) {
			int[] result = new int[6];
			Random rand = new Random();
			for(int i = 0; i<N; i++) {
				int getTemp = rand.nextInt(6);
				result[getTemp] ++;
			}
			
			return result;
		}
		return null;
	}
	
	//Part3
	public static int roll2Dices(){
		int result = 0;
		int dice1 = 0;
		int dice2 = 0;
		
		Random rand = new Random();
		
		while(dice1!=5 | dice2!=5) {
			int getTemp = rand.nextInt(6);
			dice1 = getTemp;
			getTemp = rand.nextInt(6);
			dice2 = getTemp;
			result++;
		}
		
		return result;
	}
	
	//Exercise 6
	public static String getTextFromBytes(byte[] array) {
		String result = "";
		
		for(int i = 0; i< array.length; i++) {
			result += (char)array[i];
		}
		
		return result;
	}

	//Exercise 7
	public static String pascalsTriangle(int level) {
		int result[] = new int[(level+1)];
		for(int i = 0; i<(level+1); i++) {
			result[i] = factorialRecursive(level)/(factorialRecursive(i)*factorialRecursive(level-i));
		}
		
		return Arrays.toString(result);
	}
	
	//Exercise 8*
	public static double executeStringEquation(String inputEquation) {
		double result = 0;
		
		
		
		return result;
	}

	
	public static void main(String[] args) {
		
		//Exercise 0
		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt",
				"Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron",
				"Kate" };
		int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393,
				299, 343, 317, 265 };
		
		//int[] test = new int[5];
		
		if (names.length == times.length) {
			for(int i = 0; i < names.length; i++) {
				System.out.println("[" + names[i] + "," + times[i] + "]"); //syso
			}
		}
		else System.out.println("Masīvi nav vienāda garuma!");
		
		//Exercise 1
		double gravity = -9.81; // Earth's gravity in m/s^2
		double initialVelocity = 0.0;
		double fallingTime = 10.0;
		double initialPosition = 0.0;
		double finalPosition = 0.0;
		finalPosition= positionCalc(gravity, initialVelocity, initialPosition, fallingTime);
		System.out.println("Pos in "+fallingTime+"sec :"+finalPosition);
		
		//Exercise 2
		//For loop
		int forFactorial = 0;
		forFactorial = factorialForLoop(5);
		System.out.println(forFactorial);
		forFactorial = factorialForLoop(-7);
		System.out.println(forFactorial);
		
		//recursive function
		int recursionFactorial = 0;
		recursionFactorial = factorialRecursive(5);
		System.out.println(recursionFactorial);
		recursionFactorial = factorialRecursive(4);
		System.out.println(recursionFactorial);
		recursionFactorial = factorialRecursive(-8);
		System.out.println(recursionFactorial);
		
		//Exercise 3
		int N = 7;
		double myArray1[] = generateArray(N, 1, 10);
		System.out.println(Arrays.toString(myArray1));
		System.out.println(getMean(myArray1));
		System.out.println(getMin(myArray1));
		System.out.println(getMax(myArray1));
		System.out.println(Arrays.toString(arraySort(myArray1)));
		
		//Exercise 4
		int M = 3;
		double myArray2[][] = generateMatrix(M);
		System.out.println(Arrays.deepToString(myArray2));
		System.out.println(getProduct(myArray2, 1, 2));
		
		//Exercise 5
		//Part1
		double coins[] = coinFlip(10);
		System.out.println("__10__");
		System.out.println("0: " + coins[0] + "\n1: " + coins[1] + "\nratio:" + coins[2]);
		double coins1[] = coinFlip(100);
		System.out.println("__100__");
		System.out.println("0: " + coins1[0] + "\n1: " + coins1[1] + "\nratio:" + coins1[2]);
		double coins2[] = coinFlip(1000);
		System.out.println("__1000__");
		System.out.println("0: " + coins2[0] + "\n1: " + coins2[1] + "\nratio:" + coins2[2]);
		double coins3[] = coinFlip(10000);
		System.out.println("__10000__");
		System.out.println("0: " + coins3[0] + "\n1: " + coins3[1] + "\nratio:" + coins3[2]);
		
		//Part2
		int dice[] = rollDice(100);
		System.out.println("Dice:" + Arrays.toString(dice));
		
		//Part3
		System.out.println(roll2Dices());
		
		//Exercise 6
		byte[] array6 = {72, 101, 108, 108, 111, 33, 32, 77, 121, 32, 115, 107, 105, 108, 108, 115, 32, 97, 114, 101,
				32, 103, 114, 101, 97, 116, 32, 97, 108, 114, 101, 97, 100, 121, 33};
		
		System.out.println(getTextFromBytes(array6));
		
		//Exercise 7
		System.out.println(pascalsTriangle(6));
		System.out.println(pascalsTriangle(0));
		System.out.println(pascalsTriangle(1));
		System.out.println(pascalsTriangle(12));
		
		//Exercise 8*
		String inputEquation = "1 - 3 * 18 / 4 + 2";
		System.out.println(executeStringEquation(inputEquation));
		System.out.println(inputEquation.length());
		//TODO pabeigt 8* uzdevumu
	}
}

/*
for(int i = 0; i < names.length; i++) {
	System.out.printf("%s \n", names[i]); //syso
}
for(String temp : names) {
	System.out.printf("%s \n", temp); 
}
System.out.println(Arrays.toString(names));
*/
/* Parasts komentārs
float cena = 9.99f;
System.out.println("Sveiki! Cena ir:");
System.out.println(cena);
System.out.printf("Cena ir %.2f", cena);
*/