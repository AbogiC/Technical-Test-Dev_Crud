package v3aplikasi.dao;

import v3aplikasi.model.entity.PositionEntity;

import java.util.Collection;

public interface PositionDAO {
    public Collection<PositionEntity> listPosition() throws Exception;
}
