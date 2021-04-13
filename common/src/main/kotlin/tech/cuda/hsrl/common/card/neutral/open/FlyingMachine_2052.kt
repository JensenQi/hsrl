package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FlyingMachine_2052 : Card() {
    override val id = 2052
    override val name = "飞行器"
    override val description = "<b>风怒</b>"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "这架精致的飞行器需要飞行员在起飞前做好精确的调校。否则，它只能被叫做“降落器”。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/adfe0995c5c250a1c8c43ef322ce5f4d8063afcc9793442da8eabb0078051a01.png"
}
