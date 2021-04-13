package tech.cuda.hsrl.common.card.druid.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MarkOfTheWild_69511 : Card() {
    override val id = 69511
    override val name = "野性印记"
    override val description = "使一个随从获得<b>嘲讽</b>和+2/+3。<i>（+2攻击力/+3生命值）</i>"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Core
    override val background = "这种爪子形状的印记如果纹在身上，人们一定知道你是德鲁伊玩家。"
    override val artist = "Brad Vancata"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5910831c2311c5581db9cd4c5ff8b5bfd0fa2dc4cb080655122852b7aee376f3.png"
}
