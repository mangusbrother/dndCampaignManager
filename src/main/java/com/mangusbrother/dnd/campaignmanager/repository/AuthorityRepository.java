package com.mangusbrother.dnd.campaignmanager.repository;

import com.mangusbrother.dnd.campaignmanager.domain.Authority;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the Authority entity.
 */
public interface AuthorityRepository extends MongoRepository<Authority, String> {
}
