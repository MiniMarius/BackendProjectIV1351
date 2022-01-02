package se.kth.iv1351;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import se.kth.iv1351.dao.LessonMapper;
import se.kth.iv1351.model.LessonData;
import se.kth.iv1351.openapi.LessonApiDelegate;
import se.kth.iv1351.openapi.model.Lesson;

@AllArgsConstructor
@Service
public class LessonDelegator implements LessonApiDelegate {
    LessonMapper lessonMapper;

    @Override
    public ResponseEntity<Lesson> lessonLessonidGet(Integer lessonid) {
        LessonData lessonData = lessonMapper.selectLesson(lessonid);
        Lesson lesson = new Lesson();
        lesson.setId(lessonData.getId());
        lesson.setDescription(lessonData.getDescription());
        lesson.setLevel(lessonData.getLevel());
        lesson.setGenre(lessonData.getGenre());
        lesson.setName(lessonData.getName());
        lesson.setMinParticipants(lessonData.getMinParticipants());
        lesson.setMaxParticipants(lessonData.getMaxParticipants());
        lesson.setType(lessonData.getType());
        return new ResponseEntity<Lesson>(lesson, HttpStatus.OK);
    }
}