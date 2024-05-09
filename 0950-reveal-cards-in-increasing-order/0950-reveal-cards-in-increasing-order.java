// public class Solution {
//     public int[] deckRevealedIncreasing(int[] deck) {
//         int N = deck.length;
//         int[] result = new int[N];

//         Arrays.sort(deck);

//         return everyOther(deck, result, 0, 0, false);
//     }

//     private int[] everyOther(int[] deck, int[] result, int indexInDeck, int indexInResult, boolean skip) {
//         int N = deck.length;

//         if (indexInDeck == N) {
//             return result;
//         }

//         while (indexInResult < N) {
//             if (result[indexInResult] == 0) {
//                 if (!skip) {
//                     result[indexInResult] = deck[indexInDeck];
//                     indexInDeck++;
//                 }
//                 skip = !skip;
//             }
//             indexInResult++;
//         }

//         return everyOther(deck, result, indexInDeck, 0, skip);
//     }
// }


class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);

        Deque<Integer> ind = new ArrayDeque<>();
        for(int i=0;i<deck.length;i++){
            ind.addLast(i);
        }

        int[] ans = new int[deck.length];
        int i=0;
        
        while(!ind.isEmpty()){
            ans[ind.pollFirst()] = deck[i];
            if(!ind.isEmpty()){
                ind.addLast(ind.pollFirst());
            }
            i++;
        }
        return ans;
    }
}