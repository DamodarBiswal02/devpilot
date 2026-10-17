package devpilot.backend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.Optional;
import devpilot.backend.entity.User;

public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByGithubId(Long githubId);
}
