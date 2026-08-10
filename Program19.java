class Program19{
public static void main(String[]args){
int n=5;

for(int i=n;i>=0;i--){
  for(int j=0;j<=i;j++){

    System.out.print("*");
 }
for(int j=2*n-(2*i+1);j>=0;j--)
{
System.out.print(" ");
}
 for(int j=i;j>=0;j--)
{
System.out.print("*");
}


System.out.println();
}

for(int i=0;i<=n;i++){
  for(int j=0;j<=i;j++){
  System.out.print("*");
}
for(int j=1;j<=2*n-(2*i);j++){System.out.print(" ");}
 for(int j=i;j>=0;j--){
 System.out.print("*");
}
System.out.println();
 }
 
}
}