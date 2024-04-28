/**
 * 
 */
package com.gl.tts.entity;

/**
 * 
 */

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tickets")
public class TTS {

	@Getter
	@Setter
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	@Getter
	@Setter
	private String ttsTitle;

	@Getter
	@Setter
	private String ttsDescription;

	@Getter
	@Setter
	private String ttsDate;

	/**
	 * @return the id
	 */
	public Long getId() {
		return Id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		Id = id;
	}

	/**
	 * @return the ttsTitle
	 */
	public String getTtsTitle() {
		return ttsTitle;
	}

	/**
	 * @param ttsTitle the ttsTitle to set
	 */
	public void setTtsTitle(String ttsTitle) {
		this.ttsTitle = ttsTitle;
	}

	/**
	 * @return the ttsDescription
	 */
	public String getTtsDescription() {
		return ttsDescription;
	}

	/**
	 * @param ttsDescription the ttsDescription to set
	 */
	public void setTtsDescription(String ttsDescription) {
		this.ttsDescription = ttsDescription;
	}

	/**
	 * @return the ttsDate
	 */
	public String getTtsDate() {
		return ttsDate;
	}

	/**
	 * @param ttsDate the ttsDate to set
	 */
	public void setTtsDate(String ttsDate) {
		this.ttsDate = ttsDate;
	}

}
