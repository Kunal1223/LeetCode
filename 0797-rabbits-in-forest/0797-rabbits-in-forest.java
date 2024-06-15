class Solution {
    public int numRabbits(int[] answers) {
    int result = 0;
    int color[] = new int[1001];
    for(int i = 0; i < answers.length; i++) {
        if( color[answers[i] + 1] == answers[i] + 1 ) {
            result += answers[i] + 1;
            color[answers[i] + 1] = 1;
        }
        else {
            color[answers[i] + 1]++;
        }
    }
    for(int i = 0; i < color.length; i++)
        result += color[i] != 0 ? i : 0;
    return result;
}
}