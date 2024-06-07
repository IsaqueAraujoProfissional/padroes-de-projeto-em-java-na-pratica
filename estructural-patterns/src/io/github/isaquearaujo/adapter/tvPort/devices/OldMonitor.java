package io.github.isaquearaujo.adapter.tvPort.devices;


import io.github.isaquearaujo.adapter.tvPort.intefaces.VGA;

public class OldMonitor implements VGA {

	@Override
	public void setImage(String image) {
		System.out.println(">>> This is your video: " + image);
	}
	
}
