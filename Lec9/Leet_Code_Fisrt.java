package Lec9;

public class Leet_Code_Fisrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// https://leetcode.com/problems/first-bad-version/
	}
	 public int firstBadVersion(int n) {
         long lo=1;
        long hi=n;
        long ans =1;
        while(lo<=hi){
            long  mid = (lo+hi)/2;
                if(isBadVersion((int)mid)){
                    ans=mid;
                    hi=mid-1;
                }
            else{
                lo=mid+1;
       }
       
        
    }
         return (int)ans;
    }

}
