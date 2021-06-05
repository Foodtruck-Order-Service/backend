package kr.co.fos.menu;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/menu")
public class MenuController {
	@Autowired
	private MenuServiceImpl menuService;
	
	@PostMapping
	public ResponseEntity<Object> doMenuRegister(@RequestPart Menu menu, @RequestPart MultipartFile image) {
		String physicalName = UUID.randomUUID().toString() + "_" + image.getOriginalFilename();
		menu.setLogical(image.getOriginalFilename());
		menu.setPhysical(physicalName);
		
		boolean result = menuService.menuRegister(menu);
		try {
			 image.transferTo(new File(System.getProperty("user.home") + File.separator + "fosPhoto/" + physicalName));
        } catch (IllegalStateException | IOException e) {
            e.printStackTrace();
        }
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}
	
	@GetMapping
	public ResponseEntity<Object> doMenuListInquiry(Menu menu) {
		List<Menu> list = menuService.menuInquiry(menu);
		
		return ResponseEntity.status(HttpStatus.OK).body(list);
	}
	
	@GetMapping("/{no}")
	public ResponseEntity<Object> doMenuDetailInquiry(Menu menu) {
		Menu result = menuService.menuDetailInquiry(menu);
		
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}
	
	@PutMapping("/{no}")
	public ResponseEntity<Object> doMenuUpdate(Menu menu) {
		return null;
	}
	
	@DeleteMapping("/{no}")
	public ResponseEntity<Object> doMenuDelete(Menu menu) {
		boolean result = menuService.menuDelete(menu);
		
		if (result) {
			return ResponseEntity.status(HttpStatus.OK).body(result);
		}
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(result);
	}
	// 이미지 출력
		@GetMapping(value = "/photo/{no}", produces = MediaType.IMAGE_JPEG_VALUE)
		public @ResponseBody byte[] photoView(@PathVariable int no) {
			Menu menu = new Menu();
			menu.setNo(no);
			try {
				byte[] byteToFile = menuService.photoView(menu);

				return byteToFile;
			} catch (Exception e) {
				e.printStackTrace();
			}

			return null;
		}
}
