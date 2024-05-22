class Solution {
    public boolean canMakeSquare(char[][] grid) {
        
        boolean wrow = false;
        boolean brow = false;
        boolean wcol = false;
        boolean bcol = false;
        
        int count = 0;   
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j< 3 ; j++){

                if(grid[i][j] == 'W'){
                    count++;
                    
                    if(count >= 2) wrow = true;
                }
                
                else{
                    count = 0;
                }
            }
            count = 0;
        }
        
        count = 0;
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j< 3 ; j++){

                if(grid[j][i] == 'W'){
                    count++;
                    
                    if(count >= 2) wcol = true;
                }
                
                else{
                    count = 0;
                }
            }
            count = 0;
        }
        

        count = 0;   
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j< 3 ; j++){

                if(grid[i][j] == 'B'){
                    count++;
                    
                    if(count >= 2) brow = true;
                }
                
                else{
                    count = 0;
                }
            }
            count = 0;
        }

        count = 0;
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j< 3 ; j++){

                if(grid[j][i] == 'B'){
                    count++;
                    
                    if(count >= 2) bcol = true;
                }
                
                else{
                    count = 0;
                }
            }

            count = 0;
        }

        System.out.print(" " + brow +" " + bcol + " " + wrow +" " + wcol );

        return ((bcol && brow)|| (wrow && wcol));
    }
}