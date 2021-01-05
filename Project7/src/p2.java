//백준 15650
//백트래킹
import java.io.*;
import java.util.Scanner;
public class p2 {

	private static int[] arr; //출력할 수 담는 배열
	private static int n,m; 
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nm[] = new String [2];
		nm = br.readLine().split(" ");
		
		n = Integer.parseInt(nm[0]);
		m = Integer.parseInt(nm[1]);
		
		arr = new int [m];
		
		dfs(1,0);
		
		br.close();
	}

	private static void dfs(int at, int depth) {
		if(depth==m) { //depth==m이므로 반복문 종료
			for(int val : arr) {
				System.out.print(val+" ");
			}
			System.out.println();
			return;
		}
		
		//at인덱스부터 배열을 돌고 i+1, depth+1을 해서 증가하도록 한다.
		for(int i=at; i<=n; i++) {
			arr[depth] = i;
			dfs(i+1, depth+1);

		}
		
	}
}
