package pl.szymonchowaniec.chat.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.szymonchowaniec.chat.model.LogModel;

@Repository
public interface LogRepository extends CrudRepository<LogModel, Integer> {
}
