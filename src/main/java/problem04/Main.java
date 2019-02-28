package problem04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;



/*
 * 랜덤으로 구구단 입력받는것 까지 구현했습니다.
 */

public class Main {
	public static ArrayList[] arr = new ArrayList[10];
	public static ArrayList puzzle = new ArrayList();
	

	public static void gugudan() {
		for(int i=1; i<=9; i++) {
			arr[i] = new ArrayList();
			for(int j=1; j<=9; j++) {
				arr[i].add(new Gugu(i,j));
			}
		}
	
	
	
		
	}
	
	
	public static void rolling(){
		Random random = new Random();
		
		for(int i=1; i<=9; i++) {
			int first =random.nextInt(9);
			int second = random.nextInt(9);
			puzzle.add(arr[i].get(first));
			puzzle.add(arr[i].get(second));
			
		}
		
		
	}
	public static void main(String[] args) {
		gugudan();
		rolling();
		Collections.shuffle(Arrays.asList(puzzle));
		 Scanner sc = new Scanner(System.in);

		
	}


	private static char[] typeof(Object object) {
		// TODO Auto-generated method stub
		return null;
	}
}