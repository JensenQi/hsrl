package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Crystallizer_49018 : Card() {
    override val id = 49018
    override val name = "晶化师"
    override val description = "<b>战吼：</b>对你的英雄造成5点伤害。获得5点护甲值。"
    override var cost: Int? = 1
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "扳手腕时她总是能赢。"
    override val artist = "David Kegg"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/837107471ee4a3088440eeea0b390f8e072e0ebd51cd92a371d8fa6d954a4675.png"
}
