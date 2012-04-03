/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package com.liferay.portal.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.PortalPreferences;
import com.liferay.portal.model.PortalPreferencesModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

/**
 * The base model implementation for the PortalPreferences service. Represents a row in the &quot;PortalPreferences&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.portal.model.PortalPreferencesModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PortalPreferencesImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PortalPreferencesImpl
 * @see com.liferay.portal.model.PortalPreferences
 * @see com.liferay.portal.model.PortalPreferencesModel
 * @generated
 */
public class PortalPreferencesModelImpl extends BaseModelImpl<PortalPreferences>
	implements PortalPreferencesModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a portal preferences model instance should use the {@link com.liferay.portal.model.PortalPreferences} interface instead.
	 */
	public static final String TABLE_NAME = "PortalPreferences";
	public static final Object[][] TABLE_COLUMNS = {
			{ "portalPreferencesId", Types.BIGINT },
			{ "ownerId", Types.BIGINT },
			{ "ownerType", Types.INTEGER },
			{ "preferences", Types.CLOB }
		};
	public static final String TABLE_SQL_CREATE = "create table PortalPreferences (portalPreferencesId LONG not null primary key,ownerId LONG,ownerType INTEGER,preferences TEXT null)";
	public static final String TABLE_SQL_DROP = "drop table PortalPreferences";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.entity.cache.enabled.com.liferay.portal.model.PortalPreferences"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.finder.cache.enabled.com.liferay.portal.model.PortalPreferences"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.column.bitmask.enabled.com.liferay.portal.model.PortalPreferences"),
			true);
	public static long OWNERID_COLUMN_BITMASK = 1L;
	public static long OWNERTYPE_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.portal.util.PropsUtil.get(
				"lock.expiration.time.com.liferay.portal.model.PortalPreferences"));

	public PortalPreferencesModelImpl() {
	}

	public long getPrimaryKey() {
		return _portalPreferencesId;
	}

	public void setPrimaryKey(long primaryKey) {
		setPortalPreferencesId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_portalPreferencesId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return PortalPreferences.class;
	}

	public String getModelClassName() {
		return PortalPreferences.class.getName();
	}

	public long getPortalPreferencesId() {
		return _portalPreferencesId;
	}

	public void setPortalPreferencesId(long portalPreferencesId) {
		_portalPreferencesId = portalPreferencesId;
	}

	public long getOwnerId() {
		return _ownerId;
	}

	public void setOwnerId(long ownerId) {
		_columnBitmask |= OWNERID_COLUMN_BITMASK;

		if (!_setOriginalOwnerId) {
			_setOriginalOwnerId = true;

			_originalOwnerId = _ownerId;
		}

		_ownerId = ownerId;
	}

	public long getOriginalOwnerId() {
		return _originalOwnerId;
	}

	public int getOwnerType() {
		return _ownerType;
	}

	public void setOwnerType(int ownerType) {
		_columnBitmask |= OWNERTYPE_COLUMN_BITMASK;

		if (!_setOriginalOwnerType) {
			_setOriginalOwnerType = true;

			_originalOwnerType = _ownerType;
		}

		_ownerType = ownerType;
	}

	public int getOriginalOwnerType() {
		return _originalOwnerType;
	}

	public String getPreferences() {
		if (_preferences == null) {
			return StringPool.BLANK;
		}
		else {
			return _preferences;
		}
	}

	public void setPreferences(String preferences) {
		_preferences = preferences;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public PortalPreferences toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (PortalPreferences)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					PortalPreferences.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		PortalPreferencesImpl portalPreferencesImpl = new PortalPreferencesImpl();

		portalPreferencesImpl.setPortalPreferencesId(getPortalPreferencesId());
		portalPreferencesImpl.setOwnerId(getOwnerId());
		portalPreferencesImpl.setOwnerType(getOwnerType());
		portalPreferencesImpl.setPreferences(getPreferences());

		portalPreferencesImpl.resetOriginalValues();

		return portalPreferencesImpl;
	}

	public int compareTo(PortalPreferences portalPreferences) {
		long primaryKey = portalPreferences.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		PortalPreferences portalPreferences = null;

		try {
			portalPreferences = (PortalPreferences)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = portalPreferences.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		PortalPreferencesModelImpl portalPreferencesModelImpl = this;

		portalPreferencesModelImpl._originalOwnerId = portalPreferencesModelImpl._ownerId;

		portalPreferencesModelImpl._setOriginalOwnerId = false;

		portalPreferencesModelImpl._originalOwnerType = portalPreferencesModelImpl._ownerType;

		portalPreferencesModelImpl._setOriginalOwnerType = false;

		portalPreferencesModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<PortalPreferences> toCacheModel() {
		PortalPreferencesCacheModel portalPreferencesCacheModel = new PortalPreferencesCacheModel();

		portalPreferencesCacheModel.portalPreferencesId = getPortalPreferencesId();

		portalPreferencesCacheModel.ownerId = getOwnerId();

		portalPreferencesCacheModel.ownerType = getOwnerType();

		portalPreferencesCacheModel.preferences = getPreferences();

		String preferences = portalPreferencesCacheModel.preferences;

		if ((preferences != null) && (preferences.length() == 0)) {
			portalPreferencesCacheModel.preferences = null;
		}

		return portalPreferencesCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{portalPreferencesId=");
		sb.append(getPortalPreferencesId());
		sb.append(", ownerId=");
		sb.append(getOwnerId());
		sb.append(", ownerType=");
		sb.append(getOwnerType());
		sb.append(", preferences=");
		sb.append(getPreferences());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.liferay.portal.model.PortalPreferences");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>portalPreferencesId</column-name><column-value><![CDATA[");
		sb.append(getPortalPreferencesId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ownerId</column-name><column-value><![CDATA[");
		sb.append(getOwnerId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ownerType</column-name><column-value><![CDATA[");
		sb.append(getOwnerType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>preferences</column-name><column-value><![CDATA[");
		sb.append(getPreferences());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = PortalPreferences.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			PortalPreferences.class
		};
	private long _portalPreferencesId;
	private long _ownerId;
	private long _originalOwnerId;
	private boolean _setOriginalOwnerId;
	private int _ownerType;
	private int _originalOwnerType;
	private boolean _setOriginalOwnerType;
	private String _preferences;
	private transient ExpandoBridge _expandoBridge;
	private long _columnBitmask;
	private PortalPreferences _escapedModelProxy;
}