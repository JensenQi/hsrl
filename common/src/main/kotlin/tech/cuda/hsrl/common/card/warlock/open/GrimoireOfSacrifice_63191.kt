package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GrimoireOfSacrifice_63191 : Card() {
    override val id = 63191
    override val name = "牺牲魔典"
    override val description = "消灭一个友方随从。对所有敌方随从造成 2点伤害。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "“这算什么睡前故事？”"
    override val artist = "Evgeniy Dlinnov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/65a78f00067489aa01d9c8a077ae58c125577f391f4d84ac42a6cfc606b41cc7.png"
}
