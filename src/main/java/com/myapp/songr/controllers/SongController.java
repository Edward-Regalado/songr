package com.myapp.songr.controllers;


import com.myapp.songr.models.Album;
import com.myapp.songr.models.Song;
import com.myapp.songr.repositories.AlbumRepository;
import com.myapp.songr.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongController {
    @Autowired
    SongRepository songRepository;
    @Autowired
    AlbumRepository albumRepository;

    @PostMapping("/addSong")
    RedirectView addSong(String title, int length, int trackNUmber, String albumTitle){
        Album album = albumRepository.findByTitle(albumTitle);
        Song newSong = new Song(title, length, trackNUmber, album);
        songRepository.save(newSong);
        return new RedirectView("/album");
    }
}
