/*
 * Copyright 2015-Present Entando Inc. (http://www.entando.com) All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package org.entando.entando.aps.system.services.userprofile.model;

import com.agiletec.aps.system.common.entity.model.ApsEntityRecord;

/**
 * A UserProfile Record.
 * @author E.Santoboni
 */
public class UserProfileRecord extends ApsEntityRecord {
	
	public boolean isPublicProfile() {
		return _publicProfile;
	}
	
	public void setPublicProfile(boolean publicProfile) {
		this._publicProfile = publicProfile;
	}
	
	private boolean _publicProfile;
	
}