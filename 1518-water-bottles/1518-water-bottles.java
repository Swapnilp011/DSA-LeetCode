class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
     int ans=numBottles;
        while(numBottles>=numExchange){
            int Newb=numBottles/numExchange;
            int Remb=numBottles%numExchange;

            ans=ans+Newb;

            numBottles=Newb+Remb;
        }
        return ans;
    }
}