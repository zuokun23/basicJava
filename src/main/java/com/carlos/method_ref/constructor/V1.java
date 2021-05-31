package com.carlos.method_ref.constructor;

interface Messageable{
    Message getMessage(String msg);
}

class Message{
    public Message(String msg){
        System.out.println(msg);
    }
}
public class V1 {

    public static void main(String[] args) {

        Messageable messageable = Message::new;
        Message message = messageable.getMessage("你好！！！");
        System.out.println(message);
    }
}
//你好！！！
//com.carlos.method_ref.constructor.Message@15aeb7ab
