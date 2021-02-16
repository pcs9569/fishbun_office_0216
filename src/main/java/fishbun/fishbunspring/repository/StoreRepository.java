package fishbun.fishbunspring.repository;

import fishbun.fishbunspring.domain.Store;

import java.util.List;

public interface StoreRepository {
    Store save(Store store);

    Store findById(String sto_id);

    List<Store> findAll();
    Store updateStore(Store store);

    void deleteStore(Store store);
}
