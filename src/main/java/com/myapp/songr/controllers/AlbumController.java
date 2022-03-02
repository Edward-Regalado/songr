package com.myapp.songr.controllers;

import com.myapp.songr.models.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlbumController {

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("album")
    public String albumDisplay(Model m){
        List<Album> albumListDisplay = generateAlbums();
        m.addAttribute("albums", albumListDisplay);
        return "album.html";
    }

    public List<Album> generateAlbums(){
        List<Album> newAlbums = new ArrayList<>();
        newAlbums.add(new Album("Legend", "Bob Marley & The Wailers", 16, 4108, "/images/bobmarley.jpg"));
        newAlbums.add(new Album("The Dark Side Of the Moon", "Pink Floyd", 10, 2580, "/images/pinkfloyd.jpg"));
        newAlbums.add(new Album("Ok Computer / Kid A", "Radiohead", 12, 3192, "/images/radiohead.jpg"));
        return newAlbums;
    }
}
