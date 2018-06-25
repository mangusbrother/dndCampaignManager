package com.mangusbrother.dnd.campaignmanager.repository;

import com.mangusbrother.dnd.campaignmanager.domain.PersistentToken;
import com.mangusbrother.dnd.campaignmanager.domain.User;
import java.time.LocalDate;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Spring Data MongoDB repository for the PersistentToken entity.
 */
public interface PersistentTokenRepository extends MongoRepository<PersistentToken, String> {

    List<PersistentToken> findByUser(User user);

    List<PersistentToken> findByTokenDateBefore(LocalDate localDate);

}
