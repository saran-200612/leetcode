class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String arr1[]=startTime.split(":");
        String arr2[]=endTime.split(":");
        int t1=Integer.parseInt(arr1[0]);
        int t2=Integer.parseInt(arr1[1]);
        int t3=Integer.parseInt(arr1[2]);
        int s1=(t1*3600)+(t2*60)+t3;
        int t4=Integer.parseInt(arr2[0]);
        int t5=Integer.parseInt(arr2[1]);
        int t6=Integer.parseInt(arr2[2]);int s2=(t4*3600)+(t5*60)+t6;
        return s2-s1;
    }
}
