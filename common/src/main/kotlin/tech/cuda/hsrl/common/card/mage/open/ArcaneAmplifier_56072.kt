package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArcaneAmplifier_56072 : Card() {
    override val id = 56072
    override val name = "奥术增幅体"
    override val description = "你的英雄技能会额外造成2点伤害。"
    override var cost: Int? = 3
    override var health: Int? = 5
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.GalakrondsAwakening
    override val background = "和术士的关系不太好。"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8becee229ac0dd9ce9e91fd66810a80480abdf2a1e577fb81d70c1772befd239.png"
}
