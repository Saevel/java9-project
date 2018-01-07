package prv.zielony.sample.project.dao.api;

public interface PersistenceId<IdType> {

    IdType getId();

    void setId(IdType id);
}
