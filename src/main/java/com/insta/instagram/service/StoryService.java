package com.insta.instagram.service;

import java.util.List;

import com.insta.instagram.exception.StoryException;
import com.insta.instagram.exception.UserException;
import com.insta.instagram.modal.Story;

public interface StoryService {

	public Story createStory(Story story, Integer userId) throws UserException;
	
	public List<Story> findStoryByUserId(Integer userId) throws UserException, StoryException;
}
