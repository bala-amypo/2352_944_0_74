package com.example.demo.newservice.newserviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.newentity.NewFileEntity;
import com.example.demo.newrepo.NewFileRepo;
import com.example.demo.newservice.NewFileService;

@Service
public class NewFileServiceImpl implements NewFileService {

    private final NewFileRepo rep;

    @Autowired
    public NewFileServiceImpl(NewFileRepo rep) {
        this.rep = rep;
    }

    @Override
    public NewFileEntity savedata(NewFileEntity newfile) {
        return rep.save(newfile);
    }

    @Override
    public NewFileEntity getidval(Long id) {
        return rep.findById(id).orElse(null);
    }

    @Override
    public List<NewFileEntity> getall() {
        return rep.findAll();
    }

    @Override
    public NewFileEntity update(Long id, NewFileEntity newfile) {
        NewFileEntity existing = getidval(id);
        if (existing != null) {
            existing.setName(newfile.getName());
            existing.setEmail(newfile.getEmail());
            return rep.save(existing);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        rep.deleteById(id);
    }
}
