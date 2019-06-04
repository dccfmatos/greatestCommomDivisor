public class greatestCommonDivisor {

            public static int getGreatestCommonDivisor(int first, int second)
            {

                int j = 0;
                int minimum = Math.min(first,second);
                if((first < 10) || (second < 10))
                {
                    return -1;
                }

                else
                {
                    for(int i=minimum; i> 1;i--)
                    {
                        if(((first% i)==0) && ( ( second % i )==0))
                        {
                            j = i;

                            break;
                        }


                    }
                }return j;

            }
}
