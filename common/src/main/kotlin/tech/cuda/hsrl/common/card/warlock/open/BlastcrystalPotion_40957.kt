package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BlastcrystalPotion_40957 : Card() {
    override val id = 40957
    override val name = "爆晶药水"
    override val description = "消灭一个随从，和你的一个法力水晶。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Msog
    override val background = "爆炸所产生的晶体碎片，会对十米范围内造成致命伤害。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/779d2daae465e3cb8f215c6f07ae74cf13c71b7bbc0bbd45a7021ec03c906e35.png"
}
