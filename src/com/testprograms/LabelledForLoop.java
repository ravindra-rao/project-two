package com.testprograms;

public class LabelledForLoop {

	public static void main(String[] args) {
		loopOne : for(int i=1;i<=3; i++) {
			loopTwo : for(int j=1; j<=3; j++) {
				if(i==j) continue loopTwo;
				else System.out.println(i+" "+j);
			}
		}

	}

}
