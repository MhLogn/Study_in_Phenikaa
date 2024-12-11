package Main.Final.Controller;

import Main.Final.Check.Check;
import Main.Final.Entity.Tu_Nhan;
import Main.Final.Repositories.Tu_NhanRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/prisoner")
public class Tu_NhanController {
    private final Tu_NhanRepositories tuNhanRepositories;

    @Autowired
    public Tu_NhanController(Tu_NhanRepositories tuNhanRepositories) {
        this.tuNhanRepositories = tuNhanRepositories;
    }


    @GetMapping ("")
    List<Tu_Nhan> getAllPrisoner() {
        return tuNhanRepositories.findAll();
    }

    @GetMapping ("/{id}")
    ResponseEntity<Check> findPrisoner(@PathVariable int id) {
        Optional<Tu_Nhan> tuNhan = tuNhanRepositories.findById(id);
        if (tuNhan.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(
                    new Check("OK", "ĐÃ TÌM THẤY TÙ NHÂN CÓ ID: " +id, tuNhan.get() )
            );
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    new Check("ID NOT FOUND", "KHÔNG THỂ TÌM THẤY TÙ NHÂN CÓ ID: " +id, null)
            );
        }
    }

    @PostMapping ("/insert")
    ResponseEntity<Check> createPrisoner(@RequestBody Tu_Nhan newPrisoner) {
        try {
            tuNhanRepositories.save(newPrisoner);
            return ResponseEntity.status(HttpStatus.CREATED).body(
                    new Check("OK", "BẠN ĐÃ TẠO THÀNH CÔNG 1 TỘI PHẠM MỚI", newPrisoner )
            );
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(
                    new Check("ERROR", "KHÔNG THỂ TẠO THÊM THÔNG TIN MỚI DO THÔNG TIN BẠN NHẬP VÀO KHÔNG ĐÚNG", null)
            );
        } finally {
            tuNhanRepositories.flush();
        }
    }

    @PutMapping ("/update")
    ResponseEntity<Check> updatePrisoner(@RequestBody Tu_Nhan updatePrisoner) {
        try {
            tuNhanRepositories.save(updatePrisoner);
            return ResponseEntity.status(HttpStatus.OK).body(
                    new Check("OK", "BẠN ĐÃ CẬP NHẬP THÔNG TIN THÀNH CÔNG", updatePrisoner )
            );
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(
                    new Check("ERROR", "CHÚNG TÔI KHÔNG THỂ CẬP NHẬP CHO BẠN VUI LÒNG KIỂM TRA LẠI THÔNG TIN", null)
            );
        } finally {
            tuNhanRepositories.flush();
        }
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<Check> deletePrisoner(@PathVariable int id) {
        Optional<Tu_Nhan> deleteTuNhan = tuNhanRepositories.findById(id);
        try {
            tuNhanRepositories.delete(deleteTuNhan.get());
            return ResponseEntity.status(HttpStatus.OK).body(
                    new Check("OK", "BẠN ĐÃ XÓA THÔNG TIN THÀNH CÔNG", deleteTuNhan.get() )
            );
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(
                    new Check("ERROR", "KHÔNG TÌM THẤY THÔNG TIN CỦA PHẠM NHÂN CẦN XÓA", null)
            );
        } finally {
            tuNhanRepositories.flush();
        }
    }
}
