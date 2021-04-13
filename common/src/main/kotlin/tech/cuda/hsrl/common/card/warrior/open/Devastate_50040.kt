package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Devastate_50040 : Card() {
    override val id = 50040
    override val name = "毁灭打击"
    override val description = "对一个受伤的随从造成 4点 伤害。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.RastakhansRumble
    override val background = "巨龙口腔内的微生物是导致伤者感染的主要原因。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8cf715f6697299cc8d5ccd6eef73acae0b2d43e01f0487fbfadc514ee8cdaa96.png"
}
