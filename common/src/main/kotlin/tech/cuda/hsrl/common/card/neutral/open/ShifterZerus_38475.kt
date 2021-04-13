package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShifterZerus_38475 : Card() {
    override val id = 38475
    override val name = "百变泽鲁斯"
    override val description = "如果这张牌在你的手牌中，每个回合都会随机变成一张随从牌。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "一个翻脸比翻书还快的家伙，说变就变！"
    override val artist = "Daria Tuzova"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/41c66697ad35217c95e46b3cfb0e9d67fecf26a9dbc2e35a9cf0804b8914bb38.png"
}
