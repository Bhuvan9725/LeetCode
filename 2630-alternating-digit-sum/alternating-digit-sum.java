class Solution {
    public int alternateDigitSum(int n) {
     int sum=0;
     List<Integer> list=new ArrayList<>();
     while(n>0){
        list.add(0,n%10);
        n/=10;
     }   
     for(int i=0;i<list.size();i++){
        if(i%2==0){
            sum+=list.get(i);
        }else{
            sum-=list.get(i);
        }
     }
     return sum;
    }
}