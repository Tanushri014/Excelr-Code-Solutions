package day9assignment;
class Thread1 implements Runnable{
	public void run() {
		for(int i=2;i<500;i+=2) {
			//even
			if(i%2==0) {
				System.out.println(i);
			}}}}
class Thread2 implements Runnable{
	public void run() {
		for(int i=1;i<500;i+=2) {
			//odd
			if(i%2!=0) {
				System.out.println(i);}}}
}
public class TwoThreadsDemo {
	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		Thread t11=new Thread(t1);
		t11.start();
		Thread2 t2=new Thread2();
		Thread t22=new Thread(t2);
		t22.start();

	}

}
