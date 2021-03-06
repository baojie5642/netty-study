package org.netty.study.decoder.stick;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.LineBasedFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;

/**
 * @author krisjin
 * 
 */
public class TimeClient {
	public void connect(int port, String host) {

		EventLoopGroup group = new NioEventLoopGroup();

		Bootstrap bootstrap = new Bootstrap();

		try {
			bootstrap.group(group).channel(NioSocketChannel.class).option(ChannelOption.TCP_NODELAY, true)
					.handler(new ChannelInitializer<SocketChannel>() {

						protected void initChannel(SocketChannel ch) throws Exception {
							ch.pipeline().addLast(new LineBasedFrameDecoder(1024));
							ch.pipeline().addLast(new StringDecoder());
							ch.pipeline().addLast(new TimeClientHandler());
						}

					});

			ChannelFuture f = bootstrap.connect(host, port).sync();

			f.channel().closeFuture().sync();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {

			group.shutdownGracefully();
		}

	}

	public static void main(String[] args) {
		int port = 8888;
		try {
			if (args.length > 0) {
				port = Integer.valueOf(args[0]);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		new TimeClient().connect(port, "10.0.4.65");
	}
}
