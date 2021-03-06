/*
 * (C) Copyright IBM Corp. 2013
 *
 * LICENSE: Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.ibm.gaiandb.webservices.caching;

/**
 * The purpose of this class is to cache Strings.
 * 
 * @author remi - IBM Hursley
 *
 */
public class StringCacher extends Cacher<String> {

	// ----------------------------------------------------------------------------------
	// ----------------------------------------------------------------------- ATTRIBUTES

	// =========================================================================== Public
	// --------------------------------------------------------------------------- Static

	// Use PROPRIETARY notice if class contains a main() method, otherwise use
	// COPYRIGHT notice.
	public static final String COPYRIGHT_NOTICE = "(c) Copyright IBM Corp. 2013";

	// -------------------------------------------------------------------------- Dynamic

	// ======================================================================== Protected
	// --------------------------------------------------------------------------- Static
	// -------------------------------------------------------------------------- Dynamic

	// ========================================================================== Private
	// --------------------------------------------------------------------------- Static
	// -------------------------------------------------------------------------- Dynamic
	
	private StringBuilder cachedData;

	// ----------------------------------------------------------------------------------
	// ---------------------------------------------------------------------------- TOOLS

	// ----------------------------------------------------------------------------------
	// -------------------------------------------------------------------------- METHODS

	// ===================================================================== Constructors
	// --------------------------------------------------------------------------- Public

	public StringCacher(StringBuilder dataToCach, long timeOut) {
		super(timeOut);
		this.cachedData = dataToCach;
	}
	
	// -------------------------------------------------------------------------- Private

	// =========================================================================== Public
	// --------------------------------------------------------------------------- Static
	// -------------------------------------------------------------------------- Dynamic
	
	/**
	 * Returns the String which has been cached.
	 * @return the String which has been cached.
	 */
	@Override
	public String getCachedData() {
		return this.cachedData.toString();
	}
	
	
	// ======================================================================== Protected
	// --------------------------------------------------------------------------- Static
	// -------------------------------------------------------------------------- Dynamic

	// ========================================================================== Private
	// --------------------------------------------------------------------------- Static
	// -------------------------------------------------------------------------- Dynamic
}
