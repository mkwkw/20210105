//백준 15649
//백트래킹
//참고: https://st-lab.tistory.com/114
import java.util.*;
public class p1 {
	
	private static int[] arr; //출력할 수 담는 배열
	private static boolean[] visit; //인덱스가 나타내는 숫자가 방문되었는지 나타내는 배열
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		arr = new int [m];
		visit = new boolean [n];
		dfs(n,m,0);
		
	}
	
	private static void dfs(int n, int m, int depth) {
		if(depth==m) { //depth==m이므로 반복문 종료
			for(int val : arr) {
				System.out.print(val+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i=0; i<n; i++) {
			if(!visit[i]) {//예를 들어 3(i=2)이 방문되지 않았다. visit[2]==false
				visit[i] = true; //3을 방문하고 visit[2]==true
				arr[depth] = i+1; //arr[depth] = 3
				dfs(n,m,depth+1); //dfs 시행하고
				visit[i] = false; //다시 돌아올 때는 visit[2] = false로 바꿔서 다음 반복문에서 접근할 수 있도록 한다.
			}
		}
		
	}

}
