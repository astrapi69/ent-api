/**
 * The MIT License
 *
 * Copyright (C) 2018 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.alpharogroup.db.entity.accomplishable;

/**
 * The interface {@link ByAccomplishable} can be implemented from an entity that needs the data of who
 * executed or accomplished an operation on an entity with a field accomplishedBy
 *
 * @param <U>
 *            the generic type of the user or account
 */
public interface ByAccomplishable<U> extends Accomplishable<U>
{

	/** The Constant for the column name 'accomplishedBy'. */
	String COLUMN_NAME_ACCOMPLISHED_BY = "accomplishedBy";

	/**
	 * Gets the user or account that accomplished the operation
	 *
	 * @return the user or account that accomplished the operation
	 */
	U getAccomplishedBy();

	/**
	 * Sets the user or account that accomplished the operation
	 *
	 * @param user
	 *            the user or account that accomplished the operation
	 */
	void setAccomplishedBy(U user);
}
