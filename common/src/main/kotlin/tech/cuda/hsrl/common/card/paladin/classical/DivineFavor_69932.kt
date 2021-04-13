package tech.cuda.hsrl.common.card.paladin.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DivineFavor_69932 : Card() {
    override val id = 69932
    override val name = "神恩术"
    override val description = "抽若干数量的牌，直到你的手牌数量等同于你对手的手牌数量。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ClassicCards
    override val background = "这可是神的恩赐，就好像有人在关键时刻向你伸出援手。"
    override val artist = "Lucas Graciano"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c089a6ddf497ca279a49ab726b62fff8962e5549f6f547f19bb3d19c3c29a037.png"
}
