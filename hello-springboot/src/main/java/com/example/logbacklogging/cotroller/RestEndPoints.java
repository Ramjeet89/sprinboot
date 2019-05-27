package com.example.logbacklogging.cotroller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestEndPoints {

	@Value("${default.course.name}")
	private String cName;

	@Value("${default.course.chapterCount}")
	private int cChapterCount;

	@Autowired
	private CourseConfiguration courseConfiguration;

	@RequestMapping("default/Course")
	public Course getDefaultCourse(
			@RequestParam(value = "name", defaultValue = "Spring Framework", required = false) String name,
			@RequestParam(value = "chapterCount", defaultValue = "2", required = false) int cChapterCount) {
		return new Course(cName, cChapterCount);
	}

	@RequestMapping("getHierarchical")
	public HashMap<String, Object> getConfigAnnotationProperties() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("name", courseConfiguration.getName());
		map.put("chapterCount", courseConfiguration.getChapterCount());
		map.put("rating", courseConfiguration.getRating());
		map.put("author", courseConfiguration.getAuthor());
		return map;
	}

	@RequestMapping("course")
	public Course getEndPoints(
			@RequestParam(value = "name", defaultValue = "Spring Boot", required = false) String name,
			@RequestParam(value = "chapterCount", defaultValue = "7", required = false) int chapterCount) {
		return new Course(name, chapterCount);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/register/course")
	public String saveCourse(@RequestBody Course course) {
		return "Your Course name" + course.getName() + "with " + course.getChapterCount() + "Chapter Saved Succefully";
	}
}
