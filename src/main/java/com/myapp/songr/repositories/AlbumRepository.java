package com.myapp.songr.repositories;

import com.myapp.songr.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository <Album, Long> {
    Album findByTitle(String title);
}
