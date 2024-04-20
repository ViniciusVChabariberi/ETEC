// C++ code
//

const int leds[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
const int leds2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
const int leds3[] = {5, 4, 6, 3, 7, 2, 8, 1, 9, 10};
const int numLeds = 10;

void setup()
{
  for (int i = 0; i < numLeds; i++) {
    pinMode(leds[i], OUTPUT);
  }
}

void loop()
{
  
  //for esquerda para direita
  for (int i = 0; i < 2; i++) {
  

    for (int j = 0; j < numLeds; j++) {
      digitalWrite(leds[j], HIGH);
      delay(500);
    }

    for (int j = 0; j < numLeds; j++) {
      digitalWrite(leds[j], LOW);     
    }   
     delay(500);
   }
  
  //for direita para esquerda
  for (int i = 0; i < 2; i++) {
  

    for (int j = 0; j < numLeds; j++) {
      digitalWrite(leds2[j], HIGH);
      delay(500);
    }

    for (int j = 0; j < numLeds; j++) {
      digitalWrite(leds2[j], LOW);     
    }   
     delay(500);
   }
  
  //for meio
  for (int i = 0; i < 2; i++) {
  

    for (int j = 0; j < numLeds; j++) {
      digitalWrite(leds3[j], HIGH);
      delay(500);
    }

    for (int j = 0; j < numLeds; j++) {
      digitalWrite(leds3[j], LOW);     
    }   
     delay(500);
   }
  
  // inicializa o gerador de números aleatórios.
  // um pino analógico desconectado irá retornar um
  // valor aleatório de tensão em analogRead()
	randomSeed(analogRead(0));
  
  //for random
  for (int i = 0; i < 10; i++){ 
    int led = random(0, numLeds); 
    digitalWrite(leds[led], HIGH); 
    delay(500); 
    digitalWrite(leds[led], LOW); 
    delay(500); 
}
  
  //for todos acendem
  for (int i = 0; i < 1; i++) {

    for (int j = 0; j < 1; j++) {
      
      for (int k = 0; k < numLeds; k++) {
        digitalWrite(leds[k], HIGH);
      }
      
      delay(5000);
      
      for (int k = 0; k < numLeds; k++) { 
        digitalWrite(leds[k], LOW);
      }
      delay(10000);
    }
  }
  
}