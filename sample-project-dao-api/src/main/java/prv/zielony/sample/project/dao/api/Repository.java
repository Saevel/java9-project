package prv.zielony.sample.project.dao.api;

import java.util.Optional;
import java.util.stream.Stream;

public interface Repository<IdType, EntityType extends PersistenceId<IdType>> {

    EntityType save(EntityType entity);

    Stream<EntityType> findAll();

    Optional<EntityType> findOne(IdType id);
}
