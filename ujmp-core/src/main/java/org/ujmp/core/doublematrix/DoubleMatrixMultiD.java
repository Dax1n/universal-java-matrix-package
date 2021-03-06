/*
 * Copyright (C) 2008-2015 by Holger Arndt
 *
 * This file is part of the Universal Java Matrix Package (UJMP).
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership and licensing.
 *
 * UJMP is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * UJMP is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with UJMP; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin St, Fifth Floor,
 * Boston, MA  02110-1301  USA
 */

package org.ujmp.core.doublematrix;

import org.ujmp.core.numbermatrix.NumberMatrixMultiD;

public interface DoubleMatrixMultiD extends BaseDoubleMatrix, NumberMatrixMultiD<Double> {

	/**
	 * Returns a double representation of an entry in the matrix. The stored
	 * value will be converted to a double as good as possible.
	 * 
	 * @param coordinates
	 *            location of the entry
	 * @return a double representation of the entry @
	 */
	public double getDouble(long... coordinates);

	/**
	 * Sets an entry in the matrix to a double value. If the matrix cannot store
	 * double values, the value will be represented as good as possible.
	 * 
	 * @param value
	 *            double value
	 * @param coordinates
	 *            location of the entry @
	 */
	public void setDouble(double value, long... coordinates);
}
