package forexample;

public class continuetest {

	public static void main(String[] args) {
		// continue�� - ���ǽ����� �̵� 
		for(int i=1; i<=10; i++) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
