package Thread;

import javax.sound.midi.VoiceStatus;
//1. Write a program that creates two threads, 
//one of which counts up to 100 and the other
//counts down from 100. Print out the values 
//each thread counts to.
public class May9_1 extends Thread {
	
	public Void Run() {
		
		
		System.out.println(":Hii I am Thread");
	
		return null;
		
	}
	public Void input() {
		
		
		System.out.println(":Hii I am Thread Input");
		
		return null;
		
	}
public static void main(String[] args) {
	May9_1 ad=new May9_1();
		ad.Run();
		ad.input();
}
}
