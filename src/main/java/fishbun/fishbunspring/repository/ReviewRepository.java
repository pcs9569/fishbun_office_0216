package fishbun.fishbunspring.repository;

import fishbun.fishbunspring.domain.Review;

import java.util.List;

public interface ReviewRepository {
    Review save(Review review, Integer sto_id, String u_email);

    Review findById(Integer rev_id);

    List<Review> findAll();

    Review updateReview(Review review);

    void deleteReview(Review review);
}
