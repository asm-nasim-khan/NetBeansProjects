package Assignment2;
import java.util.Scanner; 
public class task8{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int people = sc.nextInt();
                sc.nextLine();
		String str = sc.next();
		int[] arr = new int[people];
		Friday_Fun(arr,str,0,0);
	}
	public static void Friday_Fun(int[] a,String s,int arrIdx,int iter){
		if(len(a)==1){
			for (int index = 0 ; index<a.length ;index++ ) {
				if(a[index]== 0){
					System.out.println(index+1);
					break;
				}
			}
		}
		else{
			if(iter<s.length() && a[arrIdx] == 0){
				char temp = s.charAt(iter);
				if( temp == '2' || temp == '6' ){
					a[arrIdx]++;
				}
				iter = (iter+1)% s.length();
			}
			arrIdx = (arrIdx+1) % a.length;
			Friday_Fun(a,s,arrIdx,iter);
		}

	}
	static int len(int[] a){
		int count = 0;
		for (int item :a ) {
			if(item == 0){
				count++;
			}
		}
		return count;
	}
}
