import java.util.Scanner;
public class ReshapeTheMatris {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        int newArray[][]=new int [r][c];
        int x=0,y=0;
        if(m*n==r*c){
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    newArray[x][y]=mat[i][j];
                    y++;
                    if(y==c){
                        y=0;
                        x++;
                    }
                }
            }
            return newArray;
        }
        return mat;
    }
    public static void main(String[] args) {
        ReshapeTheMatris rtm=new ReshapeTheMatris();
        Scanner sc=new Scanner(System.in);
        int m,n;
        System.out.println("Enter the number of elements in the array:");
        m=sc.nextInt();
        n=sc.nextInt();
        int nums[][]=new int[m][n];
        System.out.println("Enter the number of elements into the array:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                nums[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the shape of new array:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int output[][]=new int[r][c];
        output=rtm.matrixReshape(nums, r, c);
        System.out.println("The array after reshaping is:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(output[i][j]+" ");
            }
            System.out.println();
        }
    }
}
