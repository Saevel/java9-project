package prv.zielony.sample.project.console;

import prv.zielony.sample.project.dao.api.PersistenceId;

public class SampleEntity implements PersistenceId<Long>{

    private Long id;

    public SampleEntity(Long id){
        this.id = id;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "SampleEntity[id=" + id + "]";
    }
}
