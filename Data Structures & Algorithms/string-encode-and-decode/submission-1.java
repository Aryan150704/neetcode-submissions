class Solution {

    public String encode(List<String> strs) {
        StringBuilder ss=new StringBuilder();
        for(String s:strs){
            ss.append(s.length());
            ss.append("#");
            ss.append(s);
        }
        return ss.toString();
    }

    public List<String> decode(String str) {
        int i=0;
        List<String> ans=new ArrayList<>();
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#') j++;
            int len=Integer.parseInt(str.substring(i,j));
            ans.add(str.substring(j+1,j+1+len));
            i=j+1+len;
        }
        return ans;
    }
}
