class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int k=arrivalTime+delayedTime;
        if(k>=24){
            k%=24;
        }
        return k;
    }
}
