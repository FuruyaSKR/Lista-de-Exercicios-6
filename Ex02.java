
public class Ex02 {
	
	private int num1;
	private int num2;
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		if((num1 + 1) < num2)
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		if(num2 > num1)
			this.num2 = num2;
	}
	 public Ex02(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	public int imprimeArray(int[] vetor) {
	        for (int i = 0; num1 < num2;i++) {
	            vetor[i] = num1;
	            num1 = num1 + 1;
	        }
	for(int j = 0; j < vetor.length; j++) {
		System.out.println(vetor[j]);
	}
	return num1;
	 }
	@Override
	public String toString() {
		return "Sequencia: " + num1;
	
	}		   
}


