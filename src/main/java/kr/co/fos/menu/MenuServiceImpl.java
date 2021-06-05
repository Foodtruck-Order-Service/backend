package kr.co.fos.menu;

import java.io.File;
import java.nio.file.Files;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.fos.foodtruck.Foodtruck;

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
		boolean result = false;
		
		try {
			menuMapper.insert(menu);
			
			int menuNo = menu.getNo();
			if (menuNo > 0) {
				List<Option> options = menu.getOptions();
				if (options != null && !options.isEmpty()) {
					for (Option option : options) {
						option.setMenuNo(menuNo);
						optionMapper.insert(option);
						
						int optionNo = option.getNo();
						if (optionNo > 0) {
							List<OptionValue> optionValues = option.getOptionValues();
							if (optionValues != null && !optionValues.isEmpty()) {
								for (OptionValue optionValue : optionValues) {
									optionValue.setOptionNo(optionNo);
									optionValueMapper.insert(optionValue);
								}
							}
						}
					}
				}
				
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
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
		try {
			
			return menuMapper.delete(menu);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	// 이미지 출력
	public byte[] photoView(Menu menu) throws Exception {
		String path = System.getProperty("user.home") + File.separator + "fosPhoto";
		String physical = menuMapper.select(menu).getPhysical();
		String imgPath = path + File.separator + physical;

		File file = new File(imgPath);

		if (file != null) {
			byte[] byteToFile = Files.readAllBytes(file.toPath());

			return byteToFile;
		}

		return null;
	}

}
