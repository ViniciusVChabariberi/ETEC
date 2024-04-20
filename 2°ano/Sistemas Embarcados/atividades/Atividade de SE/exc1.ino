// C++ code
//


// Leds Primários
const int ledVerde = 13;
const int ledAmarelo = 12;
const int ledVermelho = 11;


const int DELAY_BLINK = 500;

// Leds Secundários
const int leds[] = {6, 5, 4, 3, 2, 1, 0};
const int numLeds = 7;

void setup() {
  
  pinMode(ledVerde, OUTPUT);
  pinMode(ledAmarelo, OUTPUT);
  pinMode(ledVermelho, OUTPUT);
  for (int i = 0; i < numLeds; i++) {
    pinMode(leds[i], OUTPUT);
  }
}



void loop() {
  
  // inicializa o gerador de números aleatórios.
  // um pino analógico desconectado irá retornar um
  // valor aleatório de tensão em analogRead()
randomSeed(analogRead(0));
  
  //for para repetição do led verde
  for (int i = 0; i < 10; i++){ 
    digitalWrite(13, HIGH);
    int led = random(0, numLeds); 
    digitalWrite(leds[led], HIGH); 
    delay(DELAY_BLINK); 
    digitalWrite(leds[led], LOW); 
    delay(DELAY_BLINK); 
}
digitalWrite(13, LOW);
  	
   //for para repetição do led amarelo 
   for (int i = 0; i < 3; i++) {
  
    digitalWrite(12, HIGH);

    for (int j = 0; j < numLeds; j++) {
      digitalWrite(leds[j], HIGH);
      delay(500);
    }

    for (int j = 0; j < numLeds; j++) {
      digitalWrite(leds[j], LOW);     
    }   
     delay(500);
   }
  
  digitalWrite(12, LOW);

    //for para repetição do led vermelho 
  for (int i = 0; i < 1; i++) {
    
    digitalWrite(ledVermelho, HIGH);

    for (int j = 0; j < 3; j++) {
      
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
  digitalWrite(ledVermelho, LOW);
  delay(1000);
}