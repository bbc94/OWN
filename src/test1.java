class samsung implements Runnable{
	double value=1000000;
	public void run() {
		this.value=value*((Math.random()*Math.random()*Math.random())-0.5);
		System.out.println(value);
	}
}
class lg implements Runnable{
	double value=200000;
	public void run() {
		this.value=value*((Math.random()*Math.random()*Math.random())-0.5);
	}
}
public class test1 {
	public static void main(String args[]) {
		samsung s = new samsung();
		s.run();
	}
}
