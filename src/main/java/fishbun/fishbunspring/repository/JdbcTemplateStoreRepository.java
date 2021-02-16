package fishbun.fishbunspring.repository;

import fishbun.fishbunspring.domain.Store;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import javax.sql.DataSource;

import java.util.List;


public class JdbcTemplateStoreRepository implements StoreRepository{

    private final JdbcTemplate jdbcTemplate;
    public JdbcTemplateStoreRepository(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public Store save(Store store) {

        jdbcTemplate.update("insert into store (sto_name, sto_pictre, sto_detail_option, sto_lan, sto_lon) values (?,?,?,?,?)", store.getSto_name(), store.getSto_picture(), store.getSto_detail_option(), store.getSto_lat(), store.getSto_lon());

        return store;

    }

    @Override
    public Store findById(String sto_id) {
        List<Store> result = jdbcTemplate.query("select * from store where sto_id = ?", storeRowMapper(), sto_id);

        return result.get(0);
    }

    @Override
    public List<Store> findAll() {
        return null;
    }

    @Override
    public Store updateStore(Store store) {
        return null;
    }

    @Override
    public void deleteStore(Store store) {

    }

    private RowMapper<Store> storeRowMapper(){
        return (rs, rowNum) -> {
            Store store = new Store();
            store.setSto_id(rs.getInt("sto_id"));
            store.setSto_name(rs.getString("sto_name"));
            store.setSto_detail_option(rs.getString("sto_detail_option"));
            store.setSto_picture(rs.getString("sto_picture"));
            store.setSto_lat(rs.getDouble("sto_lat"));
            store.setSto_lon(rs.getDouble("sto_lon"));

            return store;
        };
    }

}
