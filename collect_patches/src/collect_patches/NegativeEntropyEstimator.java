package collect_patches;

import org.ejml.simple.SimpleMatrix;

public interface NegativeEntropyEstimator {
	
	abstract void estimate(SimpleMatrix x);
	
	abstract SimpleMatrix getGx();
	
	abstract SimpleMatrix getG_x();
	
}
