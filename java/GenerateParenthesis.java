/*
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * For example, given n = 3, a solution set is:
 * 
 * [
 * "((()))",
 * "(()())",
 * "(())()",
 * "()(())",
 * "()()()"
 * ]
 */


import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
	
	
	public List<String> generateParenthesis(int n) {
		
        
        List<String> ret = new ArrayList<String>();
        dfs("", ret, n, 0, 0);
        return ret;
        
        
        
    }
    
    private void dfs(String temp, List<String> ret, int n, int left, int right){
        
        //Base case
        if(right==n){
            ret.add(temp);
            return;
        }
        
        //Main code
        if(left<n){
            dfs(temp+"(",ret,n,left+1,right);
        }
        if(right<left){
            dfs(temp+")",ret,n,left,right+1);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenerateParenthesis gp = new GenerateParenthesis();
		System.out.println(gp.generateParenthesis(3));

	}

}
