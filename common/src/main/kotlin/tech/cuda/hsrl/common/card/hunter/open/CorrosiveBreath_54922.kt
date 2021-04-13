package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CorrosiveBreath_54922 : Card() {
    override val id = 54922
    override val name = "腐蚀吐息"
    override val description = "对一个随从造成 3点伤害。如果你的手牌中有龙牌，还会命中敌方英雄。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.DescentOfDragons
    override val background = "来一口新鲜的恐惧！"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fafe0b528bc98f439758f91ee146e732ccbadcf6954f27cceacba1b0ccafe915.png"
}
