package com.lcwd.mvc.SpringMvcProject.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FeedBackController {

    // @RequestMapping(value="/feedback",method=GET)
    @GetMapping("/feedbacks")
    public List<String> getFeedbacks(){
        List<String> feedbacks = Arrays.asList(
                "Good course",
                "Nice one",
                "valuable thing"
        );
        return feedbacks;
    }

    // @RequestMapping(value="/create-feedback",method=post)
    @PostMapping("/create-feedback")
    public String createFeedback(){
        System.out.println("Feedback created");
        return "Created feedback";
    }
}
