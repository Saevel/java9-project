module sample.project.dao.sql {
    requires java.base;
    requires java.sql;
    requires sample.project.dao.api;

    provides prv.zielony.sample.project.dao.api.Repository with prv.zielony.sample.project.dao.sql.SqlRepository;
}