class Solution {

    public String encode(List<String> strs) {
        StringBuilder ss=new StringBuilder();
        for(String s:strs){
            ss.append(s);
            ss.append("_");
        }
        return ss.toString();
    }

    public List<String> decode(String str) {
        int start=0;
        int end=0;
        List<String> ans=new ArrayList<>();
        while(end<str.length()){
            if(str.charAt(end)=='_'){
                ans.add(str.substring(start,end));
                start=end+1;
            }
            end++;
        }
        return ans;
    }
}
