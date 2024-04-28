/**
 * 
 */
package com.gl.tts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.tts.entity.TTS;
import com.gl.tts.repository.TTS_Repository;
import com.gl.tts.service.TTS_Service;

/**
 * 
 */

@Service
public class TTS_Service_Implementation implements TTS_Service {

	@Autowired
	TTS_Repository ttsRepository;

	@Override
	public List<TTS> list() {

		return ttsRepository.findAll();
	}

	@Override
	public void save(TTS tts) {
		ttsRepository.save(tts);
	}

	@Override
	public TTS findById(Long ttsID) {
		return ttsRepository.findById(ttsID).get();
	}

	@Override
	public void deleteById(Long ttsId) {
		ttsRepository.deleteById(ttsId);
	}

}
