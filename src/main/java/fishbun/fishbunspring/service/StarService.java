package fishbun.fishbunspring.service;

import fishbun.fishbunspring.domain.Star;
import fishbun.fishbunspring.repository.StarRepository;

import java.util.List;

public class StarService {
    private final StarRepository starRepository;

    public StarService(StarRepository starRepository) {
        this.starRepository = starRepository;
    }

    public Star save(Star star){
        starRepository.insert(star);
        return star;
    }

    public Star modify(Star star){
        starRepository.updateStar(star);
        return star;
    }

    public void remove(Star star){
        starRepository.deleteStar(star);
    }

    public List<Star> findAll(){
        return starRepository.selectAll();
    }

    public Star findById(Integer star_id){
        return starRepository.selectById(star_id);
    }



}
