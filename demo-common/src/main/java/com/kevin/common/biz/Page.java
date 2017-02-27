package com.kevin.common.biz;

import java.io.Serializable;

/**
 * @ClassName: Page 
 * @Description: 页面对象 用于列表分页 
 * @author menglei
 * @date Jul 22, 2011 4:29:35 PM 
 */
public class Page implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public static final int TOTAL_PAGE_DEFAULT = 0;    //总页数 ,缺省为0
	public static final int TOTAL_RECORD_DEFAULT = 0;  //总记录数 ,缺省为0
	public static final int START_REC_DEFAULT = 0;     //用于排序起始行,缺省为0(包含0)
	public static final int END_REC_DEFAULT = 15;      //用于排序结束行，缺省为15（不包含10）
	public static final int CURRENT_PAGE_DEFAULT = 1;  //当前页  ,缺省值1
	public static final int PAGE_SIZE_DEFAULT = 15;    //每页显示的条数,缺省值15
	
	/**
	 * 总记录数
	 */
    private int totalRecord;
    
    /**
     * 总页数
     */
    private int totalPage;
    
    /**
     * 起始行
     */
    private int startRec;
    
    /**
     * 结束行
     */
    private int endRec;
    
    /**
     * 当前页
     */
    private int currentPage;
    
    /**
     * 每页显示的条数
     */
	private int pageSize;
    
    public Page(){
    	this.totalPage = TOTAL_PAGE_DEFAULT;    
    	this.totalRecord = TOTAL_RECORD_DEFAULT;  
    	this.startRec = START_REC_DEFAULT;    
		this.endRec = END_REC_DEFAULT;      
		this.currentPage = CURRENT_PAGE_DEFAULT;  
		this.pageSize = PAGE_SIZE_DEFAULT;    
    }
    
	public void setCurrentPage(int currentPage) {
		if (currentPage > totalPage && totalPage != 0) {
			this.currentPage = totalPage;
		} else if (currentPage < 1) {
			this.currentPage = 1;
		} else {
			this.currentPage = currentPage;
		}
	}

    public int getCurrentPage(){
        return currentPage;
    }
    
    public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		if(pageSize <= 0){
			this.pageSize = PAGE_SIZE_DEFAULT;
		}else{
			this.pageSize = pageSize;
		}
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public void setStartRec(int startRec) {
		this.startRec = startRec;
	}

	public void setEndRec(int endRec) {
		this.endRec = endRec;
	}

	public void setTotalRecord(int totalRecord){
        this.totalRecord = totalRecord;
    }

    public int getTotalRecord(){
        return totalRecord;
    }

    public void setTotalPage(){
        if(totalRecord % pageSize != 0){
            totalPage = totalRecord / pageSize + 1;
        }else{
            totalPage = totalRecord / pageSize;
        }
    }

    public int getTotalPage(){
        return totalPage;
    }

    public void setStartRec(){
        if(totalPage == 0){
            startRec = 0;
        }else{
            startRec = (currentPage - 1) * pageSize;
        }
    }

    public int getStartRec(){
        return startRec;
    }

    public void setEndRec(){
        if(totalPage <= 1){
            endRec = totalRecord;
        }else if(currentPage == totalPage){
            endRec = totalRecord;
        }else{
            endRec = (startRec + pageSize);
        }
    }

    public int getEndRec(){
        return endRec;
    }
    
    /**
     * @return 
     * 传入当前页，总记录数，每页显示的条数，计算出起始行和结束行，存放在page对象中
     * 
     * @Title: getPage 
     * @param currentPage 当前页
     * @param totalRecord 总记录数
     * @param pageSize 每页显示的记录数
     * @return Page    返回类型 
     * @throws
     */
    public Page(int currentPage, int totalRecord, int pageSize){
    	
    	/**填充总记录数*/
		setTotalRecord(totalRecord);
		
		/** 填充每页显示的条数*/
		setPageSize(pageSize);
    	
		/** 计算总页数*/
		setTotalPage();
    	
		/** 填充当前页*/
		setCurrentPage(currentPage);
		
		/** 计算起始行*/
		setStartRec();
		
		/** 计算结束行*/
		setEndRec();
    }
}