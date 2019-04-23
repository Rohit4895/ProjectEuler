package Solutions;

public class Solution_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long c=0;
		for(int i=50; i<=500; i++) {
			for(int j=50; j<=500; j++) {
				if(i<j) {
					c = (i*i)+(j*j);
					double prev = Math.sqrt(c);
					double next = Math.floor(prev);
					if(prev == next) {
						if((i+j+prev)==1000)
							System.out.println((int)(i*j*prev));
					}
				}
			}
		}

	}

}
