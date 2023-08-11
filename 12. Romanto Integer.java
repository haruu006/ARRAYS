class Solution {
    public String intToRoman(int num) {
        StringBuilder ans = new StringBuilder();
        String ones[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String tens[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String hundreds[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String thousands[]={"","M","MM","MMM"};
        ans.append(thousands[num / 1000]);
        ans.append(hundreds[(num % 1000) / 100]);
        ans.append(tens[(num % 100) / 10]);
        ans.append(ones[num % 10]);

        return ans.toString();
    }
}
