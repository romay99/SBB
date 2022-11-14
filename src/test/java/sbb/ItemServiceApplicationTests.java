package sbb;

import sbb.Answer.Answer;
import sbb.Answer.AnswerRepository;
import sbb.Question.Question;
import sbb.Question.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ItemServiceApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;

	@Autowired
	private AnswerRepository answerRepository;


	@Test
	void testJpa(){
		Question q1 = new Question();
		q1.setSubject("ㅎㅇㅎㅇㅎㅇ");
		q1.setContent("이거머임 ㅋㅋㅋ 신기하네 ㅋㅋ");
		q1.setCreatDate(LocalDateTime.now());
		this.questionRepository.save(q1);
	}
}
