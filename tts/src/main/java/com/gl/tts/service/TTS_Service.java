/**
 * 
 */
package com.gl.tts.service;

/**
 * 
 */
/**
 * 
 */
import java.util.List;

import com.gl.tts.entity.TTS;

public interface TTS_Service {

	List<TTS> list();

	public void save(TTS tts);

	public TTS findById(Long Id);

	public void deleteById(Long Id);
}
