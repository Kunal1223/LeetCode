class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int l = commands.size();
        int i = 0 , j = 0;

        for(int c = 0 ; c < l ; c++){
            String comm = commands.get(c);

            System.out.print(" " + comm);

            if(comm.equals("UP")){
                i--;
            }
            else if(comm.equals("DOWN")){
                i++;
            }
            else if(comm.equals("LEFT")){
                j--;
            }
            else{
                j++;
            }
        }

        return (i*n)+j;
    }
}