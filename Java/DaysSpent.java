class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] arrAlice = {Integer.parseInt(arriveAlice.substring(0,2)), Integer.parseInt(arriveAlice.substring(3,5))};
        int[] leaAlice = {Integer.parseInt(leaveAlice.substring(0,2)), Integer.parseInt(leaveAlice.substring(3,5))};
        int[] arrBob = {Integer.parseInt(arriveBob.substring(0,2)), Integer.parseInt(arriveBob.substring(3,5))};
        int[] leaBob = {Integer.parseInt(leaveBob.substring(0,2)), Integer.parseInt(leaveBob.substring(3,5))};
        
        int[] days = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
        
        int start = 0;
        int end = 0;
        
        int aAl = days[arrAlice[0]-1]+arrAlice[1];
        int aBo = days[arrBob[0]-1]+arrBob[1];
        int lAl = days[leaAlice[0]-1]+leaAlice[1];
        int lBo = days[leaBob[0]-1]+leaBob[1];
        
        int min = Math.min(Math.min(Math.min(aAl,aBo),lAl),lBo);
        
        if(aBo-lAl > 0 && (min == aAl))
            return 0;
        else if((aAl-lBo) > 0 && (min == aBo))
            return 0;
        
        start = Math.max(aAl, aBo);
        end = Math.min(lAl, lBo);
        
        System.out.println(aAl +" "+aBo +" "+lAl +" "+lBo);
        
        return (end-start)+1;
        
    }
}
