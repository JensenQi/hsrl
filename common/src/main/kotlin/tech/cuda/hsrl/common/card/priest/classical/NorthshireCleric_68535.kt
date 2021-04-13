package tech.cuda.hsrl.common.card.priest.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NorthshireCleric_68535 : Card() {
    override val id = 68535
    override val name = "北郡牧师"
    override val description = "每当一个随从获得治疗时，抽一张牌。"
    override var cost: Int? = 1
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ClassicCards
    override val background = "她们帮助被压迫和沮丧的人们。她们也卖饼干。"
    override val artist = "Terese Nielsen"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/14652cc72ee933ede1b4ba5cd4fd5b15d7c0d70313e67db76bfdcff22ae5f727.png"
}
