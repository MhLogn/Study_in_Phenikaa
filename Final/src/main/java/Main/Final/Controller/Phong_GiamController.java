package Main.Final.Controller;

import Main.Final.Check.Check;
import Main.Final.Entity.Phong_Giam;
import Main.Final.Repositories.Phong_GiamRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.lang.Exception;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cell")
public class Phong_GiamController {
    private final Phong_GiamRepositories phongGiamRepositories;

    @Autowired
    public Phong_GiamController(Phong_GiamRepositories phongGiamRepositories) {
        this.phongGiamRepositories = phongGiamRepositories;
    }

    @GetMapping("")
    List<Phong_Giam> getAllPhong_Giam() {
        return phongGiamRepositories.findAll();
    }

    @GetMapping ("/{id}")
    ResponseEntity<Check> findById(@PathVariable int id) {
        Optional<Phong_Giam> phongGiam = phongGiamRepositories.findById(id);
        if (phongGiam.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(
                    new Check("OK", "ĐÃ TÌM THẤY PHÒNG GIAM CÓ ID: " +id, phongGiam.get())
            );
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    new Check("ID NOT FOUND", "KHÔNG THỂ TÌM THẤY PHÒNG GIAM CÓ ID: " +id, null)
            );
        }
    }

    @PostMapping("/insert")
    ResponseEntity<Check> insertPhong_Giam(@RequestBody Phong_Giam newphong_Giam) {
        try {
            phongGiamRepositories.save(newphong_Giam);
            return ResponseEntity.status(HttpStatus.CREATED).body(
                    new Check("OK", "BẠN ĐÃ TẠO THÊM MỘT PHÒNG GIAM MỚI", newphong_Giam)
            );
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(
                    new Check("ERROR", "KHÔNG THỂ TẠO THÊM PHÒNG GIAM DO THÔNG TIN BẠN NHẬP KHÔNG ĐÚNG", null)
            );
        } finally {
            phongGiamRepositories.flush();
        }
    }

    @PutMapping ("/update")
    ResponseEntity<Check> updatePhong_Giam(@RequestBody Phong_Giam updatephong_Giam) {
        try {
            phongGiamRepositories.save(updatephong_Giam);
            return ResponseEntity.status(HttpStatus.OK).body(
                    new Check("OK", "BẠN ĐÃ CẬP NHẬP LẠI THÔNG TIN PHÒNG GIAM THÀNH CÔNG", updatephong_Giam)
            );
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(
                    new Check("ERROR", "CHÚNG TÔI KHÔNG THỂ CẬP NHẬP CHO BẠN VUI LÒNG KIỂM TRA LẠI THÔNG TIN", null)
            );
        } finally {
            phongGiamRepositories.flush();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Check> deletePhong_Giam(@PathVariable int id) {
        Optional<Phong_Giam> deletePhongGiam = phongGiamRepositories.findById(id);
        try {
            phongGiamRepositories.delete(deletePhongGiam.get());
            return ResponseEntity.status(HttpStatus.OK).body(
                    new Check("OK", "BẠN ĐÃ THÀNH CÔNG XÓA MỘT PHÒNG GIAM CÓ ID: " +id, deletePhongGiam.get())
            );
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(
                    new Check("ERROR", "KHÔNG THỂ TÌM THẤY/XÓA PHÒNG GIAM CÓ ID: " +id, null)
            );
        } finally {
            phongGiamRepositories.flush();
        }
    }
}
