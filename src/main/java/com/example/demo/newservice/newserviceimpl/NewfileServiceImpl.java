
package com.example.demo.newservice.newserviceimpl;

import java.util.List;

import com.example.demo.newentity.NewfileEntity;
import com.example.demo.newservice.NewfileService;
@Service
public class NewfileServiceImpl implements NewfileService {

    private final NewfileRepo rep;
    @Override
    public NewfileEntity savedata(NewfileEntity newfile) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'savedata'");
    }

    @Override
    public NewfileEntity getidval(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getidval'");
    }

    @Override
    public List<NewfileEntity> getall() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getall'");
    }

    @Override
    public NewfileEntity update(Long id, NewfileEntity newfile) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
    @Override
public void delete(Long id) {
    
}

}