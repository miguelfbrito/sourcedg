public class Foo {
    
    void escLAB3P1V1(int k, int dummy) {
	for (int i = 1; i <= k; i++) {
	    int currentFact = getFactorial(i);
	    int nextFact = getFactorial(i + 1);

	    if (currentFact <= k && k < nextFact) {
		System.out.print(i);
		break;
	    }

	    if (currentFact > k)
		break;
	}
    }

    int getFactorial(int n) {
	int ret = 1;
	for (int i = 1; i <= n; i++)
	    ret *= i;
	return ret;
    }
    
}