import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cc001_CO92JUDG {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int t = Integer.parseInt(str);
		while(t-->0) {
			str = br.readLine();
			int n = Integer.parseInt(str);
			int a[] = new int[n];
			int b[] = new int[n];
			int a_max=0, b_max=0, a_sum=0,b_sum=0;
			str = br.readLine();
			String astr[] = str.split(" ");
			for (int i = 0; i<n ; i++) {
				int x = Integer.parseInt(astr[i]);
				a[i] = x;
				a_max = (x>a_max)?x:a_max;
				a_sum = a_sum + x;
			}
			str = br.readLine();
			String bstr[] = str.split(" ");
			for (int i = 0; i<n ; i++) {
				int x = Integer.parseInt(astr[i]);
				b[i] = x;
				b_max = (x>b_max)?x:b_max;
				b_sum = b_sum + x;
			}
			
			a_sum = a_sum - a_max;
			b_sum = b_sum - b_max;
			
			String out = "";
			
			if(a_sum < b_sum) {
				out = "Alice";
			}else if(b_sum < a_sum){
				out = "Bob";
			}else if(a_sum == b_sum) {
				out = "Draw";
			}
			
			System.out.println(out);
			
		}
	}

}
