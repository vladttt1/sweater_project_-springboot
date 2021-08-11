package com.example.sweater.repository;
import com.example.sweater.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo  extends CrudRepository<Message,Long> {

    Iterable<Message> findByTag(String filter);

}
