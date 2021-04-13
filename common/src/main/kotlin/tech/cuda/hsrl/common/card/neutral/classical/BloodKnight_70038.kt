package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BloodKnight_70038 : Card() {
    override val id = 70038
    override val name = "血骑士"
    override val description = "<b>战吼：</b>所有随从失去<b>圣盾</b>。每有一个随从失去圣盾，便获得+3/+3。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "血骑士从太阳井中获得他们的神圣能量，所以你别把那里当成是洗太阳浴的地方。"
    override val artist = "Trent Kaniuga"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8c5c0dc9163cac6f0b59bdc81c22b2206f732e625daadb457b8e744d0270ca27.png"
}
