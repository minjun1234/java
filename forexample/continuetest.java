package forexample;

public class continuetest {

	public static void main(String[] args) {
		// continue문 - 조건식으로 이동 
		for(int i=1; i<=10; i++) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
