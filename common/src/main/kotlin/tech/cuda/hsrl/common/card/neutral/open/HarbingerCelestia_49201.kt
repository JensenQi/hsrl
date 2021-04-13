package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HarbingerCelestia_49201 : Card() {
    override val id = 49201
    override val name = "星界使者塞雷西亚"
    override val description = "<b>潜行</b> 在你的对手使用一张随从牌后，变成该随从的复制。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "塞雷西亚常幻化成各种形态游荡于世间。上一次她变成了闪光的骏马。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/84a4b6983e1ced05b62dec6b244ed29f91dccfa6ce676a0a908c398f1f1c7fe2.png"
}
