class Solution {
    public String losingPlayer(int x, int y) {
        int count = 0;

        while(x > 0 && y > 3){
            x--;
            y -= 4;
            count++;
        }

        if(count % 2 == 0){
            return "Bob";
        }else{
            return "Alice";
        }
    }
}