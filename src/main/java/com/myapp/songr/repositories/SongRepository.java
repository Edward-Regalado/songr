package com.myapp.songr.repositories;

import com.myapp.songr.models.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
