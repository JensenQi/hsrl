package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StargazerLuna_47982 : Card() {
    override val id = 47982
    override val name = "观星者露娜"
    override val description = "在你使用最右边的一张手牌后，抽 一张牌。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.BoomsdayProject
    override val background = "她是砰砰博士的左右手。准确来讲，是右手。"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f9ce528aaba4930d3518f91b9256fbab86ac8ce72a51a73e6c24792fff721fb3.png"
}
