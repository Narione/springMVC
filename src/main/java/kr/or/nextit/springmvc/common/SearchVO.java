package kr.or.nextit.springmvc.common;

public class SearchVO {
	private String searchType;
	private String searchWord;
	private int firstRecordIndex;
	private int lastRecordIndex;
	
	public SearchVO() {
	}
	public SearchVO(String searchType, String searchWord) {
		this.searchType = searchType;
		this.searchWord = searchWord;
	}
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getSearchWord() {
		return searchWord;
	}
	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}
	public int getFirstRecordIndex() {
		return firstRecordIndex;
	}
	public void setFirstRecordIndex(int firstRecordIndex) {
		this.firstRecordIndex = firstRecordIndex;
	}
	public int getLastRecordIndex() {
		return lastRecordIndex;
	}
	public void setLastRecordIndex(int lastRecordIndex) {
		this.lastRecordIndex = lastRecordIndex;
	}
	@Override
	public String toString() {
		return "SearchVO [searchType=" + searchType + ", searchWord=" + searchWord + "]";
	}
	
}
