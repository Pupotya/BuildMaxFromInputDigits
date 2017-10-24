package maxdigits;

public class App 
{
    public static void main( String[] args )
    {
        int a = 6;
        int b = 7;
        int c = 7;
        int d = 6;
        int maxAb = Math.max(a,b);
        int maxCd = Math.max(c,d);
        int maxFromMax = Math.max(maxAb,maxCd);
        int minFromMax = Math.min(maxAb,maxCd);
        int minAb = Math.min(a,b);
        int minCd = Math.min(c,d);
        int maxFromMin = Math.max(minAb,minCd);
        int minFromMin = Math.min(minAb,minCd);

        String answer = " " + maxFromMax + minFromMax + maxFromMin + minFromMin;
        System.out.println(answer);
    }
}
