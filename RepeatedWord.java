public class RepeatedWord
    {

        public static void main(String[] args)
        {
            String input="Welcome to Java Session Session Session";
            String[] words=input.split(" ");
            int c=1;

            for(int i=0;i<words.length;i++)
            {
                for(int j=i+1;j<words.length;j++)
                {

                    if(words[i].equals(words[j]))
                    {
                        c=c+1;
                        words[j]="0";
                    }
                }
                if(words[i]!="0")
                    System.out.println(words[i]+"->"+c);
                c=1;

            }

        }

    }


