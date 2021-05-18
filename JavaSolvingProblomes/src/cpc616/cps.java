package cpc616;

public class cps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] p= {0,1,2,5,6};
		int[] wt= {0,2,3,4,5};
		int m=15;
		int n=4;
		int[][] k = new int [5][15+1]; 
		int w=0;
		for(int i=0;i<=n;i++)
		{
			for( w=0;w<=m;w++)
			{
				if(i==0||w==0)
				{
					k[i][w]=0;
				}
				else if(wt[i]<=w)
				{
					k[i][w]=Math.max(p[i]+k[i-1][w-wt[i]], k[i-1][w]);
							
				}
				else
				{
					k[i][w]=k[i-1][w];
				}
			}
		}
    System.out.print(k[n][m]);
	}

}
