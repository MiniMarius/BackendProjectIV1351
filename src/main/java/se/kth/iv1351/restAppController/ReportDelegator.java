package se.kth.iv1351.restAppController;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import se.kth.iv1351.dao.ReportMapper;
import se.kth.iv1351.model.LessonData;
import se.kth.iv1351.openapi.EnsemblesnextweekApiDelegate;
import se.kth.iv1351.openapi.model.Lesson;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class ReportDelegator implements EnsemblesnextweekApiDelegate {
    ReportMapper reportMapper;
    @Override
    public ResponseEntity<List<Lesson>> ensemblesnextweekGet() {
        ArrayList<Lesson> reportData = reportMapper.getEnsembleReport();

        return new ResponseEntity<List<Lesson>>(reportData, HttpStatus.OK);
    }
}
