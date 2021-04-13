package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CrazedChemist_49494 : Card() {
    override val id = 49494
    override val name = "疯狂的药剂师"
    override val description = "<b>连击：</b>使一个友方随从获得+4攻击力。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.BoomsdayProject
    override val background = "不疯魔，不成活。"
    override val artist = "Max Grecke"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a9ebe3e4ae5a719be7d2a8bfcdcdc862b11ab396b31c3dd45021533d76358f9c.png"
}
