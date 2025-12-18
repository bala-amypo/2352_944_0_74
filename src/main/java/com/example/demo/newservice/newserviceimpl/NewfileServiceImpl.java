package com.example.demo.newservice.newserviceimpl;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example. demo.newentity. NewFileEntity;
import com.example.demo.newservice.NewFileService;
@Service
public class NewFileServiceImpl implements NewFileService{
    
    private final NewFileRepo rep;
    @Override

    public NewFileServiceImpl(NewFileRepo){
        this.rep=rep;
    }
    public NewFileEntity savedata(NewFileEntity newfile) {
        return rep.save(newfile);

    }

    @Override
    public NewFileEntity getidval(Long id) {
        return rep.findById(id);
    }
    @Override
    public List<NewFileEntity> getall() {
        return rep.findAll();
    }
 
    @Override
    public NewFileEntity update(Long id, NewFileEntity newfile) {
        NewfileEntity existing = getidval(id);
        existing.setName(newfile.getName());
        existing.setEmail(newfile.getEmail());
        return rep.save(existing);
    }

    @Override
    public void delete(Long id){
        rep.delete(Long id);
    }
}