package org.example.userservice;

import java.util.List;

import org.junit.Test;

public class UserServiceTest {

	@Test
	public void test() {
		UserServiceRequestService userService = new UserServiceRequestService();
		UserServiceRequest requestService = userService
				.getUserServiceRequestSoap11();

		UserRequest userRequest = new UserRequest();
		userRequest.setTargetCompany("银联数据");
		userRequest.setUserCount(5);
		UserResponse response = requestService.user(userRequest);
		List<User> users = response.users;
		System.out.println(users == null);
		// for (User user : users) {
		// System.out.println(user);
		// }
	}

}
