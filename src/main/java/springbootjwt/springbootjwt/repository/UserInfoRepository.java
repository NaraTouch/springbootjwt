package springbootjwt.springbootjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springbootjwt.springbootjwt.model.UserInfo;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo,Integer>
{
    Boolean existsByUsername(String username);
    UserInfo findByUsername(String username);
}
