package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NefersetRitualist_54276 : Card() {
    override val id = 54276
    override val name = "尼斐塞特仪祭师"
    override val description = "<b>战吼：</b>为相邻的随从恢复所有生命值。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "尼斐塞特人暖极了——他们总能照顾身边的朋友，营造绝喵的氛围。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1732c01d9022004c8c8fe9f0754c3e6ef9f5dbd45a1b5dd1643223f9a7c79780.png"
}
