package lu.jsuper;

import static lu.jsuper.Dlu_slu_util.ABORT;


public class Dlu_memory {

	public static int[] intMalloc(int n) {
		int[] buf = null;
		try {
			buf = new int[n];
		} catch (OutOfMemoryError e) {
			ABORT("SUPERLU_MALLOC fails for buf in intMalloc()", e);
		}
		return (buf);
	}

}