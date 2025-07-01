package com.myproduct.order_service.repository;

import com.myproduct.order_service.entity.OrderLineItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderLineItemRepository extends JpaRepository<OrderLineItems,Long> {
}
