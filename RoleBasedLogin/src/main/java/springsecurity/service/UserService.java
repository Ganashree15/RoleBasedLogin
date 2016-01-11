package springsecurity.service;

import springsecurity.model.User;

public interface UserService {

	void save(User user);

	User findById(int id);

	User findBySso(String sso);

}
