package kr.co.fos.photo;

public interface PhotoService {
	public byte[] photoInquiry(Photo photo);
	
	public boolean photoInsert(Photo photo);
}
