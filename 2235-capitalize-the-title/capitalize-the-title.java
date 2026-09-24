class Solution {
    public String capitalizeTitle(String title) {
        String[] words=title.toLowerCase().split(" ");
        StringBuilder res=new StringBuilder();
        for(String w:words){
            if(w.length()>=3){
                w=Character.toUpperCase(w.charAt(0))+w.substring(1);
            }
            res.append(w).append(" ");
        }
        return res.toString().trim();
    }
}