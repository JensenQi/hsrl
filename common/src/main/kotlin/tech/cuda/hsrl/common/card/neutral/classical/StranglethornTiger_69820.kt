package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StranglethornTiger_69820 : Card() {
    override val id = 69820
    override val name = "荆棘谷猛虎"
    override val description = "<b>潜行</b>"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "这些美丽的大猫是荆棘谷一道亮丽的风景！"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d2de2aea55e796680c789c3e1303366ecc3d472385f9cf27b9c19da3ed84e04d.png"
}
