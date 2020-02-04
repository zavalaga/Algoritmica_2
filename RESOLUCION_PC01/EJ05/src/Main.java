public class Main {
	public static void main (String [ ] args) {	
		 int A[] = {1, 3, 6, 8, 10, 15, 19, 24, 74};
		 int B[] = {2, 3, 7, 20, 24, 54};
		 int temp, m = A.length, n = B.length;
		 int unionAB[]; 
		 unionAB = new int[m+n];	 
		 for(int i=0; i<m; i++) {
			 unionAB[i] = A[i];
		 }
		 for(int j=0; j<n; j++) {
			 unionAB[m+j] = B[j];
		 }
		 for (int e=0; e<unionAB.length; e++) {
			 for(int f=e+1; f<unionAB.length; f++) {
				 if (unionAB[e]==unionAB[f]) {
					 unionAB[f] = -1;
				 }
			 }
		 }
		 for(int h=0; h<unionAB.length; h++) {
			 for(int k=h+1; k<unionAB.length; k++) {
				 if(unionAB[h]>unionAB[k]) {
					 temp = unionAB[h];
					 unionAB[h] = unionAB[k];
					 unionAB[k] = temp;
				 }
			 }
		 }		 
		 System.out.print("R = A U B = {");
		 for(int g=0; g<unionAB.length; g++) {
			 if(unionAB[g]>=0) {
				 System.out.print(unionAB[g]);
				 if(g == unionAB.length - 1) {
					 System.out.print("}");
				 }
				 else { 
					 System.out.print(", ");
				 }
			 }
		 }
}
}
