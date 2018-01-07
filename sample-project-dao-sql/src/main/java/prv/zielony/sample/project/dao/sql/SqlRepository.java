package prv.zielony.sample.project.dao.sql;

import prv.zielony.sample.project.dao.api.PersistenceId;
import prv.zielony.sample.project.dao.api.Repository;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class SqlRepository<IdType, EntityType extends PersistenceId<IdType>> implements Repository<IdType, EntityType> {

    private List<EntityType> storage = new LinkedList<EntityType>();

    @Override
    public EntityType save(EntityType entity) {
        storage.add(entity);
        return entity;
    }

    @Override
    public Stream<EntityType> findAll() {
        return storage.stream();
    }

    @Override
    public Optional<EntityType> findOne(IdType id) {
        return storage.stream().filter(entity -> entity.getId().equals(id)).findAny();
    }
}
