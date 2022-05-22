package com.github.chatroom;

import com.github.chatroom.netty.NettyServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatRoomApplication implements CommandLineRunner {

  @Autowired
  private NettyServer nettyServer;

  public static void main(String[] args) {
    SpringApplication.run(ChatRoomApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    nettyServer.start();
  }
}
