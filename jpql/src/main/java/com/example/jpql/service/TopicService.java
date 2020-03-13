package com.example.jpql.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
 private List<Topic> Topics = Arrays.asList(
		 new Topic("mohammed","mohammed-desc"),
		 new Topic("hussain","hussain-desc"),
		 new Topic("shariff","shariff-desc")
		 ) ;
 
 public List<Topic> getAllTopics()
 {
	 return Topics ;
 }
	
}
 