package Lec6;

public class Array_OPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a;
        a=9;
        // int a =9;
//        int  arr []=null;
//        arr = new int[5];
        int []arr= new int[5];
        
        System.out.println(a);
        System.out.println(arr);
        // get
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        // set
        arr[0]=1;
        arr[1]=3;
        
     // get
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println("arr.len "+arr.length);
        for(int i=0; i<arr.length; i++) {
        	System.out.println(arr[i]);
        }
        for(int i=0; i<arr.length; i++) {
        	arr[i]=10*(i+1);
        }
        for(int i=0; i<arr.length; i++) {
        	System.out.println(arr[i]);
        }
        for(int i=arr.length-1; i>=0; i--) {
        	System.out.println(arr[i]);
        }
        System.out.println("E__R___L");
        for(int a1:arr) {
        	System.out.print(a1+" ");
        	break;
        }
        System.out.println();
        char [] carr= new char [3];
        carr[0]='p';
        carr[1]='u';
        carr[2]='t';
//        carr[3]='m';
        for(char ch:carr) {
        	System.out.println(ch);
        }
       // int [] other = arr;
        int other[] = new int [9];
        arr=other;
        other[2]=-100;
        for(int i=0; i<other.length; i++) {
        	System.out.print(other[i]+" ");
        }
        System.out.println();
        for(int i=0; i<arr.length; i++) {
        	System.out.print(arr[i]+" ");
        }
        
	}

}
