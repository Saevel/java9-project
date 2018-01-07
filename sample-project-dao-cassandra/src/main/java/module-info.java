module sample.project.dao.cassandra {
    requires java.base;
    requires sample.project.dao.api;

    exports prv.zielony.sample.project.dao.cassandra;

    provides prv.zielony.sample.project.dao.api.Repository with prv.zielony.sample.project.dao.cassandra.CassandraRepository;
}