package kr.co.fos.menu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl implements MenuService {
	@Autowired
	private MenuMapper menuMapper;

	@Override
	public boolean menuRegister(Menu menu) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Menu> menuInquiry(Menu menu) {
		try {
			
			return menuMapper.list(menu);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public Menu menuDetailInquiry(Menu menu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean menuUpdate(Menu menu) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean menuDelete(Menu menu) {
		// TODO Auto-generated method stub
		return false;
	}

}
