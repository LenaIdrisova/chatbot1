require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.
    
    state: Hello
        intent!: /привет
        a: Привет привет
        
    state: Bye
        intent!: /пока
        a: Пока пока
            
    state: marko
        q!: марко
        go!: /polo
            
    state: polo
        a: polo
                
    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$requests.query}}