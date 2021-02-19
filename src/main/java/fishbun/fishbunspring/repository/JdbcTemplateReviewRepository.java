package fishbun.fishbunspring.repository;

import fishbun.fishbunspring.domain.Review;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class JdbcTemplateReviewRepository implements ReviewRepository{

    private final JdbcTemplate jdbcTemplate;
    public JdbcTemplateReviewRepository(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public Review save(Review review, Integer sto_id, String u_email) {

        jdbcTemplate.update("insert into review (sto_id, u_email, rev_content, rev_mod_date) values (?,?,?,NOW())", sto_id, u_email, review.getRev_content());

        return review;
    }

    @Override
    public Review findById(Integer rev_id) {
        return null;
    }

    @Override
    public List<Review> findAll() {
        return null;
    }

    @Override
    public Review updateReview(Review review) {
        return null;
    }

    @Override
    public void deleteReview(Review review) {

    }
}
