//백준 15651
//백트래킹
//중복허용 if문으로 visit했는지 확인할 필요 없음
import java.io.*;
import java.util.*;
public class p3 {

	
		private static StringBuilder sb;
		private static int[] arr; //출력할 수 담는 배열
		
		private static int n,m;
		
		public static void main(String[] args) throws IOException{
			// TODO Auto-generated method stub
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			sb = new StringBuilder();
			String nm[] = new String [2];
			nm = br.readLine().split(" ");
			
			n = Integer.parseInt(nm[0]);
			m = Integer.parseInt(nm[1]);
			arr = new int [m];
			
			dfs(n,m,0);
			
			System.out.print(sb);
			
		}
		
		private static void dfs(int n, int m, int depth) {
			if(depth==m) { //depth==m이므로 반복문 종료
				for(int val : arr) {
					sb.append(val+" ");
				}
				sb.append("\n");
				return;
			}
			
			for(int i=0; i<n; i++) {
				
					
					arr[depth] = i+1; //arr[depth] = 3
					dfs(n,m,depth+1); //dfs 시행한다.
					
				
			}
			
		}

}
