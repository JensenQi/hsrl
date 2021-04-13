package tech.cuda.hsrl.common.card.paladin.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AvengingWrath_69943 : Card() {
    override val id = 69943
    override val name = "复仇之怒"
    override val description = "造成 8点伤害，随机分配到所有敌方角色身上。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ClassicCards
    override val background = "打！打！打！打！打！打！打！打！"
    override val artist = "Alex Garner"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fce7faf797651295d9e10e99d1b8e30ccd7968d7f2592eb83964f7992bb8e0ed.png"
}
