package tech.cuda.hsrl.common.card.warlock.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DrainSoul_69735 : Card() {
    override val id = 69735
    override val name = "吸取灵魂"
    override val description = "<b>吸血</b> 对一个随从造成 3点伤害。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Core
    override val background = "只要轻轻推下开关，就连最顽固的灵魂都能吸得一干二净！"
    override val artist = "Kerem Beyit"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/86ac271173ccc3877741ddd622f015564f1e868099500b04f613d8e4afadd1cd.png"
}
