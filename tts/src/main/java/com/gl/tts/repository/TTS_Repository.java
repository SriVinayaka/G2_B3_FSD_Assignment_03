/**
 * 
 */
package com.gl.tts.repository;

/**
 * 
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.tts.entity.TTS;

@Repository
public interface TTS_Repository extends JpaRepository<TTS, Long> {

}
