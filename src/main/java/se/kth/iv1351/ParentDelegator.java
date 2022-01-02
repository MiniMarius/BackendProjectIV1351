package se.kth.iv1351;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import se.kth.iv1351.dao.ParentMapper;
import se.kth.iv1351.model.ParentData;
import se.kth.iv1351.openapi.ParentApiDelegate;
import se.kth.iv1351.openapi.model.Parent;

@AllArgsConstructor
@Service
public class ParentDelegator implements ParentApiDelegate {
    ParentMapper parentMapper;

    @Override
    public ResponseEntity<Parent> parentParentidGet(Integer parentid) {
        ParentData parentData = parentMapper.selectParent(parentid);
        Parent parent = new Parent();
        parent.setParentId(parentData.getParentId());
        parent.setStudentId(parentData.getStudentId());
        return new ResponseEntity<Parent>(parent, HttpStatus.OK);
    }
}
