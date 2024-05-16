package session14.controller;

import session14.entity.Entity;
import session14.model.GenericDAOImpl;
import session14.model.Model;

import java.util.List;

public class Controller <T extends Entity<?>> {
    private Model<T> model;

    public Controller(Model<T> model){
        this.model = model;
    }
    public void addEntityController(T entity){
        model.addEntity(entity);
    }
    public List<T> getAllEntityController(){
        return model.getAllEntities();
    }
    public void removeEntityController(T entity) {
        model.removeEntity(entity);
    }
    GenericDAOImpl genericDAO = new GenericDAOImpl();
}
