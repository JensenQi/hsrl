package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ColossusOfTheMoon_54495 : Card() {
    override val id = 54495
    override val name = "月亮巨人守护者"
    override val description = "<b>圣盾，复生</b>"
    override var cost: Int? = 10
    override var health: Int? = 10
    override var attack: Int? = 10
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "干掉他，然后你就会迎战新月巨人守护者。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f6579b240850b544189c6a2ea9188a3bb93712bc5d89beacee949cdf9f517bee.png"
}
