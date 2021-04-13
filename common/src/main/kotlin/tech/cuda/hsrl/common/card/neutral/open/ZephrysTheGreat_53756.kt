package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ZephrysTheGreat_53756 : Card() {
    override val id = 53756
    override val name = "了不起的杰弗里斯"
    override val description = "<b>战吼：</b>如果你的牌库里没有相同的牌，则可以许愿获得一张完美的卡牌。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "“这就是完美的卡牌，只是你不会用而已。”"
    override val artist = "Max Grecke"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b6f0490223e8792236e605b24319d68d756c4b54136fae690449ccdfe7a6f005.png"
}
