package second;

public class leetcodedryrun {
        public String mergeAlternately(String word1, String word2) {
            int n=(word1.length()>word2.length())?word1.length():word2.length();
            int k=(word1.length()<word2.length())?word1.length():word2.length();
            int j=0;
            String aks=new String();
            for(int i=0;i<n;i++){
                if(j<k){
                    aks+=word1.charAt(i);
                    aks+=word2.charAt(j);
                    j++;
                }
                else{
                    aks+=word1.charAt(i);

                }
            }
            return aks;
        }

    }

