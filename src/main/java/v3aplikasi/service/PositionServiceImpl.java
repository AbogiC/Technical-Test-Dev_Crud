package v3aplikasi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import v3aplikasi.dao.PositionDAO;
import v3aplikasi.model.entity.PositionEntity;

import java.util.Collection;

@Service
@Transactional
public class PositionServiceImpl implements PositionService{
    @Autowired
    private PositionDAO positionDAO;
    @Override
    public Collection<PositionEntity> listPosition() throws Exception{
        //TODO Auto-generated method stub
        return positionDAO.listPosition();
    }
}
