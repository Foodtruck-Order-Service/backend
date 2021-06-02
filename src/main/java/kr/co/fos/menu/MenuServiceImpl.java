package kr.co.fos.menu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl implements MenuService {
	@Autowired
	private MenuMapper menuMapper;
	@Autowired
	private OptionMapper optionMapper;
	@Autowired
	private OptionValueMapper optionValueMapper;

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
		try {
			Menu result = menuMapper.select(menu);
			
			// 옵션 객체 생성 후 리스트로 받아옴
			Option option = new Option();
			option.setMenuNo(menu.getNo());
			List<Option> options = optionMapper.list(option);
			
			// 반복문으로 옵션값 객체 생성 후 리스트로 받아온 후 옵셩 객체에 추가
			for (Option item : options) {
				OptionValue optionValue = new OptionValue();
				optionValue.setOptionNo(item.getNo());
				List<OptionValue> optionValues = optionValueMapper.list(optionValue);
				item.setOptionValues(optionValues);
			}
			
			// result 객체에 옵션 리스트 추가
			result.setOptions(options);
			
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
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
