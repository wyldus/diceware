package edu.cnm.deepdive.diceware.controller;

import edu.cnm.deepdive.diceware.service.PassphraseGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/passphrases")
public class PassphraseController {

  private final PassphraseGenerator generator;

  @Autowired
  public PassphraseController(PassphraseGenerator generator) {
    this.generator = generator;
  }

  public String[] generate(int length) {
    return generator.generate(length);
  }

}
