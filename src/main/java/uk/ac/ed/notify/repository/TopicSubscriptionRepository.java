package uk.ac.ed.notify.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uk.ac.ed.notify.entity.TopicSubscription;

@RepositoryRestResource(exported = false)
public interface TopicSubscriptionRepository extends CrudRepository<TopicSubscription, String> {
	
	List<TopicSubscription> findAll();

}