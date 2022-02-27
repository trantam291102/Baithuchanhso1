public class App11 {
    public static void main(String[] args) {
        int n = 200000, socach = 0, sa, sb, a, b, c;
        for (a = n / 10000; a >= 0; a--)
        {
            sa = n - a * 10000;
            for (b = sa / 20000; b >= 0; b--)
            {
                sb = sa - b * 20000;
                for (c = sb / 50000; c >= 0; c--)
                {
                    if (a * 10000 + b * 20000 + c * 50000 == 200000)
                    {
                        System.out.println(" to 10000, " + b + " to 20000, " + c + " to 50000." +"\n");
                        socach++;
                    }
                }
            }
        }
        System.out.println("Co tat ca " + socach + " Cach chon!\n");
	}
}
