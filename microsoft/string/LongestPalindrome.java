class LongestPalindrome {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        int start = 0;
        int end = 0;
        for(int i = 0 ; i < s.length() ; i++){
            int temp1 = getLongest (s,i ,i);
            int temp2 = getLongest (s,i ,i+1);
            int length = Math.max(temp1,temp2);
            if(length > end - start){
                start =  i-(length-1) / 2;
                end = i + length / 2;
            }
        }
        return s.substring(start,end+1);
    }

    public int getLongest(String s , int start , int end){
        int left = start ;
        int right = end ;
        while(left >= 0 && right < s.length() && s.charAt(left)==s.charAt(right)){
            --left ;
            ++right ;
        }
        return right - left - 1  ;
    }

    // We loop the every char to check the its has Palindrome or not , and save the start & end index .
}