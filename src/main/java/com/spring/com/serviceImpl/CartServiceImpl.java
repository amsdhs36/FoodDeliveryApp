package com.spring.com.serviceImpl;

import java.util.List;

import com.spring.com.entity.Cart;
import com.spring.com.repository.CartRepository;
import com.spring.com.service.CartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {
	
	@Autowired
	private CartRepository repo;
	@Override
	public Cart addToCart(Cart cart) {
		return repo.save(cart);
	}

	@Override
	public List<Cart> getAllByUserCart(long id) {
		return repo.findAllByUserId(id);
	}

	@Override
	public void deleteCart(long id) {
		repo.deleteById(id);

	}
	@Override
	public void updateCart(Cart cart, long cid) {
		// TODO Auto-generated method stub
		Cart updated=repo.findById(cid).get();
		updated=cart;
		repo.save(updated);
		
	}


}
