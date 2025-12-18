package com.example.demo.newservice.newserviceimpl;
import java.util.*;


public class NewserviceImpl implements Newservice {
private final NewfileRepo rep;
public NewserviceImpl(NewfileRepo rep){
    this.rep = rep;
}
@Override
public Newfile savedata (Newfile newww){
    return rep.save(newww)
}
@Override
public Newfile getidval(Long id){
    return rep.findById(id);
}
@Override
public Newfile getidval(Long id){
    return rep.findAll();

}
@Override
public Newfile update(Long id,Newfile newww){
    Newfile existing = getidval(id);
    existing.setName(newww.getName());
    existing.setEmail(newww.getEmail());
    return rep.save(existing);
}
@Override
public void delete(Long id){
    rep.delete(id);
}

}