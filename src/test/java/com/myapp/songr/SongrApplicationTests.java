package com.myapp.songr;

import com.myapp.songr.models.Album;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class SongrApplicationTests {

	@Test
	public void testInstnatiateAlbum() {
		Album album = new Album("Test", "Test2", 20, 3000, "google.com");
		assertEquals("Test", album.getTitle());
		assertEquals("Test2", album.getArtist());
		assertEquals(20, album.getSongCount());
		assertEquals(3000, album.getLength());
		assertEquals("google.com", album.getImageUrl());
		System.out.println(album);
	}

}
