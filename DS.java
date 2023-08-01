Q. Move all the zeros to the left of an array while maintaining its order.

  int b[] = {1,10,20,0,59,73,0,99,88,0,0}

  Output:
  {0,0,0,0,1,10,20,59,73,99,88}

Solution ->>>>>>>>>>>>>>>>

public void sort(int[] b) {

		int count = 0;

		for (int i = 0; i < b.length; i++) {
			if (b[i] == 0) {
				count++;
			}
		}

		int result[] = new int[b.length];
		int k = 0;

		for (int i = 0; i < count; i++) {
			result[i] = 0;
			k++;
		}

		for (int i = 0; i < b.length; i++) {

			if (b[i] != 0) {
				result[k] = b[i];
				k++;
			}

		}

	}

---------------------------------------------------------------------------
Q. Sort it
Input array   =  [0, 1, 0, 1, 0, 0, 1, 1, 1, 0] 
Output array =  [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
---------------------------------------------------------------------------
Q. Reverse String 

public String reverseString(String s){

String newS = "";

for(int i = s.length()-1; i>=0; i--){
    newS = newS + s.charAt(i);
}
return newS;
	
}
---------------------------------------------------------------------------
Q. String isPalindrome or not

public boolean isPalindrome(String s, int si, int ei){
                                          
	
	if(si==ei){
	return true;
	}
	
	if(si>ei){
	return true;
	}
	
	if(s.charAt(si)==s.charAt(ei)){
	      return isPalindrome(s, si+1, ei-1);
	}
	
	else{
	return false;
	}

}

public boolean isPalindrome(String s){
      
	   if(s.length()==0){
	     return true;
	}
	  
      return isPalindrome(s, 0, s.length()-1);
}
---------------------------------------------------------------------------
