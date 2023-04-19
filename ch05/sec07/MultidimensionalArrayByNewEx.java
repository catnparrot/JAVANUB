package ch05.sec07;

public class MultidimensionalArrayByNewEx {
	public static void main(String[] args) {
		int[][] mathScores = new int[2][3];
		
		for(int i = 0 ; i < mathScores.length ; i++) {
			for(int k = 0 ; k < mathScores[i].length ; k++) {
				System.out.println("mathScores{"+i+"]["+k+"]: "+mathScores[i][k]);
			}
		}
		System.out.println();
		//
		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;
		
		int totalStudent = 0;
		int totalMathSum = 0;

		for(int i = 0; i < mathScores.length; i++) {
			totalStudent += mathScores[i].length;
			for(int k = 0; k< mathScores[i].length; k++) {
				
				totalMathSum += mathScores[i][k];
				
			}
		}
		double totalMathAvg = (double) totalMathSum / totalStudent;
		System.out.println("전체 학생의 수학 평균 점수: " + totalMathAvg);
		System.out.println();
		
//---------------------------------------------------------------------------
		System.out.println("----------------------------------------------------------------");
		System.out.println();
		
		int[][] engScores = new int[2][];
		engScores[0] = new int[2];
		engScores[1] = new int[3];
		
		for(int i = 0; i < engScores.length; i++) {
			for (int k = 0; k < engScores[i].length; k++) {
				
				System.out.println("engScores[" + i + "]["+k+"]: "+engScores[i][k]);
			}
		}
		System.out.println();
		
		engScores[0][0]=90;
		engScores[0][1]=91;
		engScores[1][0]=92;
		engScores[1][1]=93;
		engScores[1][2]=94;
		
		totalStudent = 0;
		int totalEngSum = 0;
		for (int i = 0;i < engScores.length; i++) {
			totalStudent += engScores[i].length;
			for(int k = 0; k < engScores[i].length; k++) {
				
				totalEngSum += engScores[i][k];
			}
		}
		double totalEngAvg = (double) totalEngSum / totalStudent;
		System.out.println("전체 학생의 영어 평균 점수: "+totalEngAvg);
	}
}
