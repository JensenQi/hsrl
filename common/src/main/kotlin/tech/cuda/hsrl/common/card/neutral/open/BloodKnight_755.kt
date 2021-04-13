package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BloodKnight_755 : Card() {
    override val id = 755
    override val name = "血骑士"
    override val description = "<b>战吼：</b>所有随从失去<b>圣盾</b>。每有一个随从失去圣盾，便获得+3/+3。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "血骑士从太阳井中获得他们的神圣能量，所以你别把那里当成是洗太阳浴的地方。"
    override val artist = "Trent Kaniuga"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d6a629136ec7bbc09a765cc4b4aadd66b20a8269f55db29c2cc246f5b9851770.png"
}
