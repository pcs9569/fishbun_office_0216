package fishbun.fishbunspring.controller;

import fishbun.fishbunspring.domain.Store;
import fishbun.fishbunspring.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/api/store")
public class StoreController {

    private final StoreService storeService;

    @Autowired
    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @PostMapping("/new")
    @ResponseBody
    public Store create(String sto_name, String sto_picture, String sto_detail_option, Double sto_lat, Double sto_lon){
        Store store = new Store();

//        System.out.println("-----------------" + "controller" + "----------------------");
//        System.out.println(sto_name +" "+ sto_picture +" "+ sto_detail_option +" "+ sto_lat +" "+ sto_lon);

        store.setSto_name(sto_name);
        store.setSto_picture(sto_picture);
        store.setSto_detail_option(sto_detail_option);
        store.setSto_lat(sto_lat);
        store.setSto_lon(sto_lon);

        storeService.join(store);

        return store;

    }

    @GetMapping("")
    @ResponseBody
    public List<Store> lists(){
        List<Store> store = storeService.findStore();
//        model.addAttribute("store",store);
        return store;

    }

    @GetMapping("/{sto_id}")
    @ResponseBody
    public Store findStore(@PathVariable String sto_id){
        Store store = storeService.findOne(sto_id);
        return store;
    }


//
//    @GetMapping("/{sto_id}")
//    @ResponseBody
//    public Store modifyStore(@PathVariable @RequestParam(required = true, value = "sto_id") String sto_id,
//                             @RequestParam(required = false, value = "sto")
//
//                             )
//




}
