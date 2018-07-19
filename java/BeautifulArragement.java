/*
 * 
 * Suppose you have N integers from 1 to N. We define a beautiful arrangement as an array that is constructed by these N numbers 
 * successfully if one of the following is true for the ith position (1 <= i <= N) in this array:
 * The number at the ith position is divisible by i. i is divisible by the number at the ith position. 
 * Now given N, how many beautiful arrangements can you construct?
 * 
 * 
 * 
 */

public class BeautifulArragement {
	
	int count = 0;
    public int countArrangement(int N) {
        boolean[] visited = new boolean[N + 1]; //To keep a track of the visited path in the space 
        dfs(N, 1, visited);
        return count;
    }
    public void dfs(int N, int pos, boolean[] visited) {
    	
    	//Base condition
        if (pos > N) {
            count++;
        	return;
        }
        for (int i = 1; i <= N; i++) {
            if (!visited[i] && (pos % i == 0 || i % pos == 0)) {
                visited[i] = true;
                dfs(N, pos + 1, visited);
                visited[i] = false;
            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BeautifulArragement ba = new BeautifulArragement();
		System.out.println(ba.countArrangement(2));

	}

}
