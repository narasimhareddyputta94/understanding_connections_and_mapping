package com.example.understanding_connections;

import com.example.understanding_connections.inheritancerelations.tableperclass.Mentor;
import com.example.understanding_connections.inheritancerelations.tableperclass.MentorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UnderstandingConnectionsApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(UnderstandingConnectionsApplication.class);

	private final MentorRepository mentorRepository;

	public UnderstandingConnectionsApplication(@Qualifier("TPC-MentorRepository") MentorRepository mentorRepository) {
		this.mentorRepository = mentorRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(UnderstandingConnectionsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Mentor mentor = new Mentor();
		mentor.setMentor_session("mentor session");
		mentor.setEmail("mentor email");
		mentor.setName("mentor name");

		mentorRepository.save(mentor);

		logger.info("Mentor saved: " + mentor);
	}
}
