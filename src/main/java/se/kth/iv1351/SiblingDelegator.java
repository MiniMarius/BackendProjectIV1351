package se.kth.iv1351;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import se.kth.iv1351.dao.SiblingMapper;
import se.kth.iv1351.model.SiblingData;
import se.kth.iv1351.openapi.SiblingApiDelegate;
import se.kth.iv1351.openapi.model.Sibling;
import se.kth.iv1351.util.IdGenerator;

@AllArgsConstructor
@Service
public class SiblingDelegator implements SiblingApiDelegate {
    SiblingMapper siblingMapper;

    @Override
    public ResponseEntity<Sibling> siblingSiblingidGet(Integer siblingid) {
        SiblingData siblingData = siblingMapper.selectSibling(siblingid);
        Sibling sibling = new Sibling();
        sibling.setStudentIdOne(siblingData.getStudentIdOne());
        sibling.setStudentIdTwo(siblingData.getStudentIdTwo());
        return new ResponseEntity<Sibling>(sibling, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Sibling> siblingPost(Sibling sibling) {
        Integer id = IdGenerator.generate();
        siblingMapper.insertSibling(sibling);
        return siblingSiblingidGet(id);
    }
}
