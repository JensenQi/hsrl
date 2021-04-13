package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ChillwindYeti_68400 : Card() {
    override val id = 68400
    override val name = "冰风雪人"
    override val description = ""
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "他梦想着有一天能够下山开一间拉面店。但他没有那个勇气。"
    override val artist = "Mauro Cascioli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/395214f10126fe20a6b99472f26eb3921ed5b081d4297b45adc0555c6c4bbb16.png"
}
