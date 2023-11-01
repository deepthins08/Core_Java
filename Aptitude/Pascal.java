class Pascal{
	
	static int show(int n, int k) {
        if (k > n / 2) {
            k = n - k;
        }

        int result = 1;
        for (int i = 1; i <= k; i++) {
            result *= (n - k + i);
            result /= i;
        }

        return result;
    }
	
	public static void main(String[] traingle) {
		
		int n=4;
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("\n");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(show(i, j) + " ");
            }

            System.out.println();
        }
	}
}