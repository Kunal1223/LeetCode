class Solution {

    public int gcd(int a , int b){
         while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public String fractionAddition(String exp) {
        int n = exp.length();
        int nume = 0 , deno = 1 , i = 0;

        while(i < n){
            int newnume = 0 , newdeno = 0;
            boolean isNeg = (exp.charAt(i) == '-');

            if(exp.charAt(i) == '+' || exp.charAt(i) == '-' ) i++;

            while(i < n &&  Character.isDigit(exp.charAt(i))){
                int val = exp.charAt(i) - '0';
                newnume = (newnume*10) + val;
                i++;
            }

            if(isNeg) {
                newnume = newnume*(-1);
            }

            i++; 

            while(i < n &&  Character.isDigit(exp.charAt(i))){
                int val = exp.charAt(i) - '0';
                newdeno = (newdeno*10) + val;
                i++;
            }

            nume = nume*newdeno + newnume*deno;
            deno = deno * newdeno;
        }

        int gcd = Math.abs(gcd(nume , deno));

        nume /= gcd;
        deno /= gcd;

       return nume + "/" + deno;
    }
}