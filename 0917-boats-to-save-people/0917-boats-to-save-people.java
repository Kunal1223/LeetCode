class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int n = people.length;
        int i = 0 , j = n-1;
        int ans = 0;

        while(i <= j){
            
            if(people[j] <= limit){
                if((people[i] + people[j]) <= limit){
                    i++;
                    j--;
                }
                else{
                    j--;
                }

                ans++;
            }

            else if(people[i] <= limit){

                if((people[i] + people[i+1] ) <= limit){
                    i = i+2;
                }else{
                    i++;
                }

                ans++;
            }
            else
                break;
        }

            return ans;
    }
}