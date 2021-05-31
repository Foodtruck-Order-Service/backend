package kr.co.fos.menu;

import java.util.List;

public interface MenuService {
	public boolean menuRegister(Menu menu);
	public List<Menu> menuInquiry(Menu menu);
	public Menu menuDetailInquiry(Menu menu);
	public boolean menuUpdate(Menu menu);
	public boolean menuDelete(Menu menu);
}
