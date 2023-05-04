package ch16.sec02.exam02;

public class ButtonEx {
	public static void main(String[] args) {
		Button btnOk = new Button();
		
		btnOk.setClickListener(() -> {
			System.out.println("Ok 버튼을 클릭했습니다.");
		});
		
		btnOk.click();
		
		Button btnCancle = new Button();
		
		btnCancle.setClickListener(() -> {
			System.out.println("Cancle 버튼을 클릭했습니다.");
		});
		
		btnCancle.click();
	}
}
