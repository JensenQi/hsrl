package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EmperorCobra_1098 : Card() {
    override val id = 1098
    override val name = "帝王眼镜蛇"
    override val description = "<b>剧毒</b>"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "索拉查盆地栖息着很多非常恐怖的生物。如果你一定要去那里，带上杀虫剂，还要穿上板甲。"
    override val artist = "Lars Grant-West"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/58c9a74ee2e045e7db1313511f70f7576eaae17186facfe5d2ef51083b645652.png"
}
