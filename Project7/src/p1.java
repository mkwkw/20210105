//���� 15649
//��Ʈ��ŷ
//����: https://st-lab.tistory.com/114
import java.util.*;
public class p1 {
	
	private static int[] arr; //����� �� ��� �迭
	private static boolean[] visit; //�ε����� ��Ÿ���� ���ڰ� �湮�Ǿ����� ��Ÿ���� �迭
	
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
		if(depth==m) { //depth==m�̹Ƿ� �ݺ��� ����
			for(int val : arr) {
				System.out.print(val+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i=0; i<n; i++) {
			if(!visit[i]) {//���� ��� 3(i=2)�� �湮���� �ʾҴ�. visit[2]==false
				visit[i] = true; //3�� �湮�ϰ� visit[2]==true
				arr[depth] = i+1; //arr[depth] = 3
				dfs(n,m,depth+1); //dfs �����ϰ�
				visit[i] = false; //�ٽ� ���ƿ� ���� visit[2] = false�� �ٲ㼭 ���� �ݺ������� ������ �� �ֵ��� �Ѵ�.
			}
		}
		
	}

}
