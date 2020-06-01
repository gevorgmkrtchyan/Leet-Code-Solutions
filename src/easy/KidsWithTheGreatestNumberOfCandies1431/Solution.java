package easy.KidsWithTheGreatestNumberOfCandies1431;

import java.util.ArrayList;
import java.util.List;
/**
 *Given the array candies and the integer extraCandies,
 *where candies[i] represents the number of candies that the ith kid has.
 *For each kid check if there is a way to distribute extraCandies among the kids such that he or she
 *can have the greatest number of candies among them.
 *Notice that multiple kids can have the greatest number of candies.
 *
 * @author  Gevorg Mkrtchyan
 */
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        List<Boolean> list = new ArrayList<>();
        for(int i = 0; i < candies.length; i++){
            if(candies[i] >= max){
                max = candies[i];
            }
        }
        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies >= max){
                list.add(true);
            }else{
                list.add(false);
            }
        }

        return list;
    }
}
