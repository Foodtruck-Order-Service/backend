package kr.co.fos.photo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhotoServiceImpl implements PhotoService {
	@Autowired
	private PhotoMapper photoMapper;

	public byte[] photoInquiry(Photo photo) {
		try {
			photoMapper.select(photo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public boolean photoInsert(Photo photo) {
		try {
			photoMapper.insert(photo);
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	};
}
