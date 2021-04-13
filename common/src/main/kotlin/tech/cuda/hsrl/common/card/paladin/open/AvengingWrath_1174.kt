package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AvengingWrath_1174 : Card() {
    override val id = 1174
    override val name = "复仇之怒"
    override val description = "造成 8点伤害，随机分配到所有敌人身上。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Legacy3
    override val background = "打！打！打！打！打！打！打！打！"
    override val artist = "Alex Garner"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b192dd1a81c3202bf14aa044b3fa2081522f670aba6ba9ffafd5c9b289dfb3bb.png"
}
