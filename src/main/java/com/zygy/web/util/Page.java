package com.zygy.web.util;

import java.io.Serializable;
import java.util.List;

public class Page<T> implements Serializable {
	private static final long serialVersionUID = 1L;
    private long totalRows = 0;
    private long curPage = 1;
    private long pageSize = 0;
    private List<T> records;
    
    /**
     * 每页多少条
     */
    public long getPageSize() {
        return pageSize;
    }

    /**
     * 总共有多少条
     */
    public long getTotalRows() {
        return totalRows;
    }

    /**
     * 总共有多少页
     */
    public long getTotalPages() {
        if (!hasRows()) {
            return 0;
        }

        return totalRows / pageSize + (totalRows % pageSize > 0 ? 1 : 0);
    }

    /**
     * 当前第几页
     */
    public long getCurPage() {
        return curPage;
    }

    /**
     * 查询开始下标
     */
    public long getBeginIndex() {
        if (pageSize < 1 || curPage < 1) {
            return 1;
        }

        return this.pageSize * (this.curPage - 1);
    }

    /**
     * 鏄惁鏈夎褰曟�绘暟
     */
    public boolean hasRows() {
        return (totalRows != 0 && pageSize != 0);
    }

    /**
     * 是否还有下一页
     */
    public boolean hasNext() {
        return curPage < getTotalPages();
    }

    /**
     * 是否只有一页
     */
    public boolean hasOnePageOnly() {
        return curPage <= 1;
    }

    /**
     * 是否还有前一页
     */
    public boolean hasPrevious() {
        return curPage > 1;
    }

    /**
     * 棣栭〉
     */
    public void first() {
        if (curPage <= 1) {
            return;
        }

        curPage = 1;
    }

    /**
     * 涓婁竴椤�
     */
    public void previous() {
        if (curPage <= 1) {
            return;
        }

        curPage -= 1;
    }

    /**
     * 涓嬩竴椤�
     */
    public void next() {
        if (curPage >= getTotalPages()) {
            return;
        }

        curPage += 1;
    }

    /**
     * 鏈�鍚庝竴椤�
     */
    public void last() {
        long lastIndex = getTotalPages();
        if (curPage >= lastIndex) {
            return;
        }

        curPage = lastIndex;
    }

    /**
     * 鏄惁鏄渶鍚庝竴椤�
     */
    public boolean isLastPage() {
        return curPage == getTotalPages();
    }

    /**
     * 璁剧疆椤甸潰澶у皬
     */
    public void setPageSize(long pageSize) {
        if (pageSize <= 0) {
            return;
        }

        this.pageSize = pageSize;
        //if ((pageSize * (curPage - 1) + 1) > totalRows) {
        if ((pageSize * (curPage - 1) + 1) > totalRows) {
            curPage = getTotalPages();
        }
    }

    /**
     * 璁剧疆鎬昏褰曟暟
     */
    public void setTotalRows(long totalRows) {
        if (totalRows < 0) {
            return;
        }

        this.totalRows = totalRows;
    }

    /**
     * 璁剧疆褰撳墠椤�
     */
    public void setCurPage(long curPage) {
        if (curPage < 1 || (pageSize * (curPage - 1) + 1) > totalRows) {
            return;
        }

        this.curPage = curPage;
    }
    
    /**
     * 鑾峰彇褰撳墠椤佃褰�
     */
    public List<T> getRecords() {
        return this.records;
    }

    /**
     * 璁剧疆褰撳墠椤佃褰�
     */
    public void setRecords(List<T> records) {
        this.records = records;
    }

    /**
     * 閲嶇疆褰撳墠椤垫暟鎹�
     */
    public void reset() {
        totalRows = -1;
        this.curPage = 1;
    }

    @Override
    public String toString() {
        return "Page{" + "totalRows=" + totalRows
                + ", totalPage=" + getTotalPages() + ", curPage=" + curPage
                + ", pageSize=" + pageSize;
    }
}
