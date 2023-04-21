package ch06.sec08.exam03;

public class Car {
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean leftGas() {
		if(gas==0) {
			System.out.println("A");		//gas가 없습니다
			return false;
		}
		System.out.println("B");			//gas가 있습니다
		return true;
	}
	
	void run() {
		while (true) {
			if(gas>0) {
				System.out.println(gas);
				gas -= 1;
			} else {
				System.out.println(gas);
				return;
			}
		}
	}
}
