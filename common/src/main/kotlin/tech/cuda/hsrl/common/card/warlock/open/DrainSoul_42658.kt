package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DrainSoul_42658 : Card() {
    override val id = 42658
    override val name = "吸取灵魂"
    override val description = "<b>吸血</b> 对一个随从造成 3点伤害。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Kotf
    override val background = "只要轻轻推下开关，就连最顽固的灵魂都能吸得一干二净！"
    override val artist = "Kerem Beyit"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/300f1e332deba2d5396153f6b276bbad4a1477897f01f42bf28564f71cd65e95.png"
}
