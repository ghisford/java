package com.itbullz.nzima;

public enum MessageType {

    A( Priority.valueOf("HIGH")),B( Priority.valueOf("MEDIUM")),C( Priority.valueOf("LOW")),D( Priority.valueOf("LOW")); 
    
    private Priority priority  = Priority.valueOf("HIGH");
    
    private  MessageType(Priority priority ){
        this.priority = priority;
    }
    
    public Priority getPriorityType(){
        return this.priority;
    }
	
}

