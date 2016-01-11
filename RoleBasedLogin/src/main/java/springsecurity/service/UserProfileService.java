package springsecurity.service;

import java.util.List;

import springsecurity.model.UserProfile;

public interface UserProfileService {

	List<UserProfile> findAll();

	UserProfile findByType(String type);

	UserProfile findById(int id);
}
