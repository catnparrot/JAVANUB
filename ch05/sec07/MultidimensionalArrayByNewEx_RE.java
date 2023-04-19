package ch05.sec07;

public class MultidimensionalArrayByNewEx_RE {
	public static void main(String[] args) {

		
		
		
		
		//각 반의 학생 수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열 생성
		int[][] mSt = new int[2][3];		//배열 갯수 선언: 2->0,1 / 3->0,1,2
		
			//배열 항목 초기화 출력
		for(int i=0 ; i<mSt.length ; i++)				//반의 수만큼 반복
		{		for(int k=0 ; k<mSt[i].length ; k++) {/*mSt[i][k] print*/}		} 
	
		
		
		//배열 항목 값 변경
		mSt[0][0] = 80;
		mSt[0][1] = 83;
		mSt[0][2] = 85;
		mSt[1][0] = 86;
		mSt[1][1] = 90;
		mSt[1][2] = 92;
		
		
		
		//전체 학생의 수학 평균 구하기
		int tSt = 0;
		int tMS = 0;

		for(int i=0; i<mSt.length; i++)
		{
			tSt += mSt[i].length;
			for(int k=0; k<mSt[i].length; k++) { tMS += mSt[i][k]; }
																			}
		double tMA = (double) tMS/tSt;
		/*tMA print*/
		
//---------------------------------------------------------------------------
		
		//각 반의 학생 수가 다를 경우 점수 저장을 위한 2차원 배열 생성
		int[][] eS = new int[2][];
		eS[0] = new int[2];
		eS[1] = new int[3];
		
		for(int i = 0; i < eS.length; i++)
		{		for (int k = 0; k < eS[i].length; k++) {/*print*/}		}
		
		
		eS[0][0]=90;
		eS[0][1]=91;
		eS[1][0]=92;
		eS[1][1]=93;
		eS[1][2]=94;
		
		tSt = 0;
		int tES = 0;
		for (int i = 0;i < eS.length; i++)
		{
			tSt += eS[i].length;
			for(int k = 0; k < eS[i].length; k++) {		tES += eS[i][k];	}
																					}

		
		
		double tEA = (double) tES / tSt;
		/*print*/

	
	
	
	
	
	}
}