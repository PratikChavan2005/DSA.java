class Program17{
 public static void main(String[]args){
  int n=4;
 

  for(char i=0;i<=n;i++){
 char ch='A';
int Break=(2*i)/2;
	for( int j=0;j<=n-i;j++){
  System.out.print(" ");
	}
 	for(char j=0;j<=2*i;j++){
System.out.print(ch);
if(j<Break)
{ch++;}
else{ch--;}
}
for( int j=0;j<=n-i;j++){
  System.out.print(" ");
}


System.out.println();
}
}
}