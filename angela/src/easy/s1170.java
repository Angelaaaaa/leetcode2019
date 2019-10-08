package easy;

public class s1170 {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] i = new int[queries.length];
        int counter = 0;
        for (String q: queries){
            int temp = 0;
            for(String s: words){
                if(f(q) < f(s)){
                    temp++;
                }
            }
            i[counter] = temp;
        }
        return i;
    }

    public int f(String str){
        Character c = 'z';
        for (Character chr :str.toCharArray()){
            if (chr.compareTo(c)<1){
                c = chr;
            }
        }
        int count = 0;
        for (Character chr :str.toCharArray()) {
            if(chr == c) {
                count++;
            }
        }

            return count;
    }
}
