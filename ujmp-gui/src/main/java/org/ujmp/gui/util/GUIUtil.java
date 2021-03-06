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

package org.ujmp.gui.util;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import org.ujmp.core.Coordinates;
import org.ujmp.core.util.MathUtil;

public abstract class GUIUtil {

	public static Object getObject(String message, Object... objects) {
		return objects[JOptionPane.showOptionDialog(null, message, message, JOptionPane.OK_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, objects, null)];
	}

	public static double getDouble(String message, double min, double max, Double initialValue) {
		double i = Double.NaN;
		while (MathUtil.isNaNOrInfinite(i)) {
			String s = JOptionPane.showInputDialog(message + " (" + min + " to " + max + ")", initialValue);
			try {
				i = Double.parseDouble(s);
			} catch (Exception e) {
			}
		}
		return i;
	}

	public static int getInt(String message, int min, int max) {
		return getInt(message, min, max, null);
	}

	public static int getInt(String message, int min, int max, Integer initialValue) {
		Integer i = null;
		while (i == null) {
			String s = JOptionPane.showInputDialog(message + " (" + min + " to " + max + ")", initialValue);
			try {
				i = Integer.parseInt(s);
			} catch (Exception e) {
			}
		}
		return i;
	}

	public static double getDouble(String message, double min, double max) {
		return getDouble(message, min, max, null);
	}

	public static String getString(String message) {
		return JOptionPane.showInputDialog(message);
	}

	public static String getPassword(String message) {
		JPasswordField passwordField = new JPasswordField();
		JOptionPane.showConfirmDialog(null, passwordField, message, JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.PLAIN_MESSAGE);
		return new String(passwordField.getPassword());
	}

	public static boolean getBoolean(String message) {
		int i = JOptionPane.showConfirmDialog(null, message, message, JOptionPane.YES_NO_OPTION);
		return JOptionPane.YES_OPTION == i;
	}

	public static long[] getSize(String message) {
		long size[] = null;
		while (size == null) {
			String s = getString(message);
			try {
				size = Coordinates.parseString(s);
			} catch (Exception e) {
			}
		}
		return size;
	}

}
