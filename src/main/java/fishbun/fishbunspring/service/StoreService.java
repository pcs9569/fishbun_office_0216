package fishbun.fishbunspring.service;

import fishbun.fishbunspring.domain.Store;
import fishbun.fishbunspring.repository.StoreRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class StoreService {

    private final StoreRepository storeRepository;


    public StoreService(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    public Store join(Store store){
        storeRepository.save(store);
        return store;
    }

    public Store modify(Store store){
        storeRepository.updateStore(store);
        return store;
    }

    public void delete(Store store){
        storeRepository.deleteStore(store);
    }

    public List<Store> findStore(){
        return storeRepository.findAll();
    }

    public Store findOne(Integer sto_id){
        return storeRepository.findById(sto_id);
    }


}
