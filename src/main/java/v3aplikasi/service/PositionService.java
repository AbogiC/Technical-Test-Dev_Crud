package v3aplikasi.service;

import v3aplikasi.model.entity.PositionEntity;

import java.util.Collection;

public interface PositionService {
    public Collection<PositionEntity> listPosition() throws Exception;
}
