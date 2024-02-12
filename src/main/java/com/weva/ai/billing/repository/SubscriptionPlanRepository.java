package com.weva.ai.billing.repository;

import com.weva.ai.billing.document.SubscriptionPlan;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionPlanRepository extends MongoRepository<SubscriptionPlan,String> {

}