package springsecurity.dao;

import java.util.List;

import springsecurity.model.UserProfile;

public interface UserProfileDao {

	List<UserProfile> findAll();

	UserProfile findByType(String type);

	UserProfile findById(int id);

}
