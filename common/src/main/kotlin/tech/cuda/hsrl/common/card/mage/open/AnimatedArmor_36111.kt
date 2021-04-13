package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AnimatedArmor_36111 : Card() {
    override val id = 36111
    override val name = "复活的铠甲"
    override val description = "你的英雄每次只会受到1点伤害。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Loe
    override val background = "不知道穿上它会有怎样神奇的效果……"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a77e4291e27f5cca741b7b85c071b24d796c139b30038142c783daf54bfcde39.png"
}
