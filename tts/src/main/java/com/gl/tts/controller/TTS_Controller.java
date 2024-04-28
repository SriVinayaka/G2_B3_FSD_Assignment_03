/**
 * 
 */
package com.gl.tts.controller;

/**
 * 
 */
/**
 * 
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.tts.entity.TTS;
import com.gl.tts.service.TTS_Service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;

//@RequestMapping("/tts")
@Controller
public class TTS_Controller {

	@Autowired
	TTS_Service ttsService;

	@RequestMapping(value = { "/tts" })
	public String redirectToIndex() {
		return "index";
	}

	@RequestMapping("/tickets/list")
	public String listAllTickets(Model model) {

		List<TTS> tickets = ttsService.list();

		model.addAttribute("tts", tickets);

		return "list-tickets";
	}

	@RequestMapping("/tickets/showTicketForm_Save")
	public String saveTicket_Step1(Model theModel) {

		// create model attribute to bind form data
		TTS tts = new TTS();

		theModel.addAttribute("tts", tts);

		return "tts-form";
	}

	@PostMapping("/tickets/save")
	public String saveTicket(@ModelAttribute("tts") TTS tts) {

		// save the employee
		ttsService.save(tts);

		// use a redirect to prevent duplicate submissions
		return "redirect:/tickets/list";
	}

	@RequestMapping("/tickets/showTicketForm_Update")
	public String updateTicket_Step1(@RequestParam("Id") Long Id, Model theModel) {

		// get the tts from the service
		TTS tts = ttsService.findById(Id);

		// set Employee as a model attribute to pre-populate the form
		theModel.addAttribute("tts", tts);

		// send over to our form
		return "tts-form";
		// return "list-tickets";
	}

	@RequestMapping("/tickets/showTicketForm_View")
	public String updateTicket_Step2(@RequestParam("Id") Long Id, Model theModel) {

		// get the tts from the service
		TTS tts = ttsService.findById(Id);

		// set Employee as a model attribute to pre-populate the form
		theModel.addAttribute("tts", tts);

		// send over to our form
		// return "tts-form";
		//return "list-tickets";
		return "list-all";
	}

	@RequestMapping("/tickets/delete")
	public String delete(@RequestParam("Id") Long Id) {

		// delete the TTS
		ttsService.deleteById(Id);

		// redirect to tts-Listing page
		return "redirect:/tickets/list";
	}

}
