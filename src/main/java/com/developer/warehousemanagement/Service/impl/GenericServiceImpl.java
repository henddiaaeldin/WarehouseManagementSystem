package com.developer.warehousemanagement.Service.impl;
import com.developer.warehousemanagement.Entity.BaseEntity;
import com.developer.warehousemanagement.Repository.GenericRepository;
import com.developer.warehousemanagement.Service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class GenericServiceImpl <T extends BaseEntity> implements GenericService<T> {
    @Autowired
    protected GenericRepository<T> genericRepository;

    @Transactional(propagation = Propagation.NEVER, readOnly = true)
    @Override
    public List<T> findAll() throws Exception {
        try{
            return genericRepository.findAll();
        }
        catch (Exception e){
            throw e;
        }
    }
    @Transactional(propagation = Propagation.NEVER, readOnly = true)
    @Override
    public Optional<T> findbyId(Long id) throws Exception {
        try{
            return genericRepository.findById(id);
        }
        catch (Exception e){
            throw e;
        }
    }

    @Override
   // @Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.REPEATABLE_READ, rollbackFor = { SQLException.class })
    public T save(T entity) throws Exception {
        try{
            return genericRepository.save(entity);
        }
        catch (Exception e){
            throw e;
        }
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.REPEATABLE_READ, rollbackFor = { SQLException.class })

    public T update(T entity) throws Exception {
        try{
            return genericRepository.save(entity);
        }
        catch (Exception e){
            throw e;
        }
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.REPEATABLE_READ, rollbackFor = { SQLException.class })
    public ResponseEntity<String> delete(Long id) throws Exception {
        try{
            genericRepository.deleteById(id);
        }
        catch (Exception e){
            throw e;
        }
        return null;
    }
}
