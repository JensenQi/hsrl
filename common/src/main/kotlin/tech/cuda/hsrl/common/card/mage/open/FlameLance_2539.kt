package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FlameLance_2539 : Card() {
    override val id = 2539
    override val name = "炎枪术"
    override val description = "对一个随从造成 8点伤害。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Tgt
    override val background = "炎枪术，冰枪术，酸枪术……招招克敌，枪枪致命。"
    override val artist = "Nutthapon Petchthai"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3e83e5df2942f74fa6a5a50860eff2a7c1b5a7ca3ce19e53c32171cfe2e348c6.png"
}
