package kr.co.fos.menu;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public interface MenuService {
	public boolean menuRegister(Menu menu, MultipartFile attach);
	public List<Menu> menuInquiry(Menu menu);
	public Menu menuDetailInquiry(Menu menu);
	public boolean menuUpdate(Menu menu, MultipartFile attach);
	public boolean menuDelete(Menu menu);
}
