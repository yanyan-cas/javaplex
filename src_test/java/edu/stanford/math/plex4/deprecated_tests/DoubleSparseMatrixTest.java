package edu.stanford.math.plex4.deprecated_tests;

import edu.stanford.math.plex4.math.matrix.impl.sparse.DoubleSparseMatrix;
import edu.stanford.math.plex4.math.matrix.interfaces.DoubleAbstractMatrix;

public class DoubleSparseMatrixTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 100;
		DoubleAbstractMatrix matrix = new DoubleSparseMatrix(n, n);
		matrix.set(1, 4, 3);
		matrix.set(5, 78, 9);
		System.out.println(matrix);
		System.out.println(matrix.transpose());
	}

}