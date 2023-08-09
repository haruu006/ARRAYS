The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
 

Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"


class Solution {
    public String convert(String s, int numRows) {
        ArrayList<StringBuilder> list=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            list.add(new StringBuilder());
        }
        int c=0;
        while(c<s.length()){
            for(int i=0;i<numRows && c<s.length() ;i++,c++){
                list.get(i).append(s.charAt(c));
            }
            for(int i=numRows-2;i>=1 && c<s.length();i--,c++){
                list.get(i).append(s.charAt(c));
            }
        }
        String ans="";
        for(int i=0;i<numRows;i++){
            String str=new String(list.get(i));
            ans=ans+str;
        }

        return ans;
    }
}  
