package com.zhang.zhang.api.base;

public class BaseVO<T> {
    // 返回状态
    private int code;
    // 返回说明
    private String message;
    // 返回数据
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /**
     * 创建简单的返回实例
     * 
     * @param code
     *            返回状态
     * @param message
     *            返回信息
     * @return 简单的返回实例
     */
    public static BaseVO<Void> createSimpleResponse(int code, String message) {
    	BaseVO<Void> baseResponse = new BaseVO<Void>();
        baseResponse.setCode(code);
        baseResponse.setMessage(message);
        return baseResponse;
    }

	public BaseVO() {
		super();
	}

	public BaseVO(int code, String message, T data) {
		super();
		this.code = code;
		this.message = message;
		this.data = data;
	}

	public BaseVO(int code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	
    
}
