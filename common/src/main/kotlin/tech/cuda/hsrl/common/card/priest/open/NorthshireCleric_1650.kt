package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NorthshireCleric_1650 : Card() {
    override val id = 1650
    override val name = "北郡牧师"
    override val description = "每当一个随从获得治疗时，抽一张牌。"
    override var cost: Int? = 1
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Legacy4
    override val background = "她们帮助被压迫和沮丧的人们。她们也卖饼干。"
    override val artist = "Terese Nielsen"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3b0d49667d823f8bcda106a129c1441c7373d069694c4c113c34fda07770b16b.png"
}
