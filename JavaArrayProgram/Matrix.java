import java.io.*;
import java.util.Scanner;

class Matrix{
public static void main(String args[])
{ int choice = 5;
Scanner read= new Scanner(System.in);

while(choice==5)
{ 
int i , j ,k;
int sum=0;
 int[][] A = new int[10][10];
int[][] B = new int[10][10];
int[][] C = new int[10][10];
int row1,col1,row2,col2;
System.out.println("Enter the number of rows of matrix1");
row1 = read.nextInt();
System.out.println("Enter the number of columns of matrix 1");
col1 = read.nextInt();
System.out.println("Enter the number of rows of matrix 2");
row2 = read.nextInt();
System.out.println("Enter the number of columns of matrix 2");
col2 = read.nextInt();

System.out.println("Enter the matrix 1");
for( i =0 ; i<row1;i++)
{
 for( j=0 ; j<col1;j++)
  {
    A[i][j] = read.nextInt();

  }

}
System.out.println("Enter the matrix 2");
for(i=0;i<row2;i++)
{
  for(j=0;j<col2;j++)
  {
   B[i][j] = read.nextInt();

  }

}


 System.out.println("Enter your choice");
 System.out.println("1.Addition");
 System.out.println("2.Subtraction");
 System.out.println("3.Multiplication");
 System.out.println("4.Transpose");

choice = read.nextInt();
switch(choice){
 
case 1:
  if(row1==row2&&col1==col2)
  {
    for(i=0;i<row1;i++)
    {
        for(j=0;j<col1;j++)
        {
          C[i][j]  = A[i][j] + B[i][j] ;
       }

   }

  System.out.println("The addtion of the matrix is:");
  for(i=0;i<row1;i++)
  {
      for(j=0;j<col1;j++)
      {
       System.out.print(" " +C[i][j] + " ");
     }
   System.out.println(" ");
  }
}
else

{
  System.out.println("Addition is not possible");
  break;
 
}
break;

case 2:
      if(row1==row2&&col1==col2)
  {
    for(i=0;i<row1;i++)
    {
        for(j=0;j<col1;j++)
        {
          C[i][j]  = A[i][j] - B[i][j] ;
       }

   }

  System.out.println("The addtion of the matrix is:");
  for(i=0;i<row1;i++)
  {
      for(j=0;j<col1;j++)
      {
       System.out.print(" " +C[i][j] + " ");
     }
   System.out.println(" ");
  }
}
else

{
  System.out.println("Subtraction is not possible");
  break;
 
}
break;

case 3:
          if(row2==col1)
       {
          for (i = 0; i < row1; i++) {
      for ( j= 0; j< col2; j++) {
        for ( k = 0; k < row2; k++) {
          sum = sum + A[i][k]*B[k][j];
        }
 
        C[i][j] = sum;
        sum = 0;
      }
    }
   for(i=0;i<row1;i++)
{
  for(j=0;j<col2;j++)
  {
     System.out.print(" "+C[i][j] +" ");
  
 }
System.out.println(" ");
}

}
      else{

     System.out.println("Multiplication is not possible");
       break;

       }

break;

case 4:

for(i=0;i<row1;i++){
for(j=0;j<col1;j++){
C[j][i] = A[i][j] ;
}
}
System.out.println("The transpose of the first matrix is:");
for(i=0;i<row1;i++){
for(j=0;j<col1;j++){
System.out.print(" "+C[i][j] +" ");
}
System.out.println(" ");
}

break;






}
choice = 0;
System.out.println("Do you want to Continue then press 5");

choice = read.nextInt();


   


}


}




}