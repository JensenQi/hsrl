package tech.cuda.hsrl.common.card.druid.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FeralRage_69688 : Card() {
    override val id = 69688
    override val name = "野性之怒"
    override val description = "<b>抉择：</b>使你的英雄在本回合中获得+4攻击力；或者获得8点护甲值。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Core
    override val background = "老实说，其中一个选择比另一个野性多了。"
    override val artist = "Alex Alexandrov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7b4f07bd0c07d08c4024fc9b69a8aad33d1f41106fc0858b24fd239fe64c0136.png"
}
