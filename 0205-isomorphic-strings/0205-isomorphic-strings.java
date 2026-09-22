class Solution {
    public boolean isIsomorphic(String s, String t) {
            char[] arr1=s.toCharArray();
            char[] arr2=t.toCharArray();

            for(int i=0;i<arr1.length;i++){
    for(int j=i+1;j<arr1.length;j++){

        if(arr1[i]==arr1[j] && arr2[i]!=arr2[j])
            return false;

        if(arr1[i]!=arr1[j] && arr2[i]==arr2[j])
            return false;
    }
}
return true;
          
    }
}