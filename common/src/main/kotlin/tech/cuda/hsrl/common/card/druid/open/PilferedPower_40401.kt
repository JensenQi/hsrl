package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PilferedPower_40401 : Card() {
    override val id = 40401
    override val name = "妙手空空"
    override val description = "每控制一个友方随从，便获得一个空的法力水晶。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Msog
    override val background = "猢狲对于钱财没有什么概念，因为他们想要任何东西都会直接拿。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/91eaa9b3461e6e2c59abb297de9affb1db58e73a88f1d3539c13d1b9bfe6a067.png"
}
