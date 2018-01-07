module sample.project.console {
    requires java.base;
    requires sample.project.dao.api;
    requires sample.project.dao.cassandra;

    uses prv.zielony.sample.project.dao.api.Repository;
}