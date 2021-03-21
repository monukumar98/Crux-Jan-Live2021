package Lec19;

import java.util.Scanner;

public class Rat_Chases_its_cheese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
       char [] [] maze = new char[m][n];
       for(int i=0; i<m; i++) {
    	   String str = sc.next();
    	   for(int j=0; j<str.length(); j++) {
    		   maze[i][j]=str.charAt(j);
    	   }
       }
       int [][] ans = new int [m][n];
       blocked_Maze_path(maze, 0, 0, n-1, m-1,ans );
       
	}
	public static void blocked_Maze_path(char [][] maze ,int cc , int cr,int ec, int er,int [][] ans) {
		if(ec==cc&& er==cr) {
			if(maze[cr][cc]!='X') {
				ans[cr][cc]=1;
			for (int i = 0; i < ans.length; i++) {
				for (int j = 0; j < ans[0].length; j++) {
					System.out.print(ans[i][j]+" ");
				}
				System.out.println();
			}
			ans[cr][cc]=0;
			}
			return;
		}
		
		if((cc<0 || cc>ec || cr<0 || cr>er) || maze[cr][cc]=='X') {
			return;
		}
		int dr[]= {-1,0,1,0};
		int dc[]= {0,1,0,-1};
		for (int i = 0; i < dc.length; i++) {
			maze[cr][cc]='X';
			ans[cr][cc]=1;
			blocked_Maze_path(maze, cc+dc[i], cr+dr[i], ec, er, ans);
			maze[cr][cc]='O';
			ans[cr][cc]=0;
		}
		
		
	}

}
