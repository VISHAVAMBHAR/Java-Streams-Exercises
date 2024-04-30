package com.stream.practice;

public class reverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=764657;
		int re=0;
		while(n!=0)
		{
			re=re*10;
			re=re+n%10;
			n=n/10;
		}
		System.out.println( re);
		//String in="MY love";
		StringBuilder op=new StringBuilder("MY love").reverse();
		System.out.println(op);
	}

}
