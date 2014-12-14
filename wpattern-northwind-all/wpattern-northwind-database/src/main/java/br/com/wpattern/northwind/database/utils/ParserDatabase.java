package br.com.wpattern.northwind.database.utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import br.com.wpattern.northwind.utils.beans.BaseBean;

public class ParserDatabase {

	private static final Mapper dozerMapper = new DozerBeanMapper();

	/////////////////////////////////////////////////////////////////////////////////
	// PUBLIC METHODS (BEAN to ENTITY)
	/////////////////////////////////////////////////////////////////////////////////

	public static <S extends BaseBean, D extends BaseEntity> D parserBeanToEntity(S sourceObject, Class<D> destinationType) {
		return dozerMapper.map(sourceObject, destinationType);
	}

	public static <S extends BaseBean, D extends BaseEntity> List<D> parserListBeansToEntities(List<S> sourceObjects, Class<D> destinationType) {
		List<D> destinationObjects = new ArrayList<D>();

		for (Object obj : sourceObjects) {
			destinationObjects.add(dozerMapper.map(obj, destinationType));
		}

		return destinationObjects;
	}

	/////////////////////////////////////////////////////////////////////////////////
	// PUBLIC METHODS (ENTITY to BEAN)
	/////////////////////////////////////////////////////////////////////////////////

	public static <S extends BaseEntity, D extends BaseBean> D parserEntityToBean(S sourceObject, Class<D> destinationType) {
		return dozerMapper.map(sourceObject, destinationType);
	}

	public static <S extends BaseEntity, D extends BaseBean> List<D> parserListEntitiesToBeans(List<S> sourceObjects, Class<D> destinationType) {
		List<D> destinationObjects = new ArrayList<D>();

		for (Object obj : sourceObjects) {
			destinationObjects.add(dozerMapper.map(obj, destinationType));
		}

		return destinationObjects;
	}

	/////////////////////////////////////////////////////////////////////////////////
	// PUBLIC METHODS (KEY BEAN to KEY ENTITY)
	/////////////////////////////////////////////////////////////////////////////////

	public static <IDB extends Serializable, IDE extends Serializable> IDE parserKeyBeanToKeyEntity(IDB sourceObject, Class<IDE> destinationType) {
		return dozerMapper.map(sourceObject, destinationType);
	}

	/////////////////////////////////////////////////////////////////////////////////
	// PUBLIC METHODS (KEY ENTITY to KEY BEAN)
	/////////////////////////////////////////////////////////////////////////////////

	public static <IDE extends Serializable, IDB extends Serializable> IDB parserKeyEntityToKeyBean(IDE sourceObject, Class<IDB> destinationType) {
		return dozerMapper.map(sourceObject, destinationType);
	}

}
