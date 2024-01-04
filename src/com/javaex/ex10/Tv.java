package com.javaex.ex10;

public class Tv {
	//필드
	private int channel;
	private int volume;
	private boolean power;
	
	//생성자
	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	//메소드 - g/s

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean getPower() {
		return power;
	}
	
	//메소드 - 일반
	
	public void power(boolean on) {
		if(on==true) {
			this.power=true;
			}
		else {
			power=false;
			}
	}
	public void volume(boolean up) {
		if(up==true ) {++this.volume;
			if(this.volume>100) {
				this.volume=100;
			}
		}
		else {--this.volume;
			if(this.volume<=1) {
				this.volume=100;
				}
			}
	}
	public void volume(int volume) {
		if(volume>100) {
			this.volume=100;
			}
		else if(volume<=1) {
			this.volume=1;
		}
	}
	
	public void channel(boolean up) {
		if(up==true) {++this.channel;
			if(channel>=255) {
				this.channel=255;
			}
		}
		else {--this.channel;
			if(channel <=1) {
				this.channel=1;
			}
			
		}
	}
	public void channel(int channel) {
		if(channel<=1) {
			this.channel=1;
			}
		else if(channel>=255) {
			this.channel=255;
			}
		
	}
	public void status() {
		System.out.println(this.channel+","+this.volume+","+this.power);
	}
	
	
	
}
