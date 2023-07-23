Q. Move all the zeros to the left of an array while maintaining its order.

  int b[] = {1,10,20,0,59,73,0,99,88,0,0}

  Output:
  {0,0,0,0,1,10,20,59,73,99,88}

Solution ->>>>>>>>>>>>>>>>

public void sort(int[] b) {

		int count = 0;

		for (int i = 0; i < b.length; i++) {
			if (b[i] == 0) {
				count++;
			}
		}

		int result[] = new int[b.length];
		int k = 0;

		for (int i = 0; i < count; i++) {
			result[i] = 0;
			k++;
		}

		for (int i = 0; i < b.length; i++) {

			if (b[i] != 0) {
				result[k] = b[i];
				k++;
			}

		}

	}

---------------------------------------------------------------------------
Q. Sort it
Input array   =  [0, 1, 0, 1, 0, 0, 1, 1, 1, 0] 
Output array =  [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
---------------------------------------------------------------------------

