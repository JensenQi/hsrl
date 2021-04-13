package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EmperorCobra_69874 : Card() {
    override val id = 69874
    override val name = "帝王眼镜蛇"
    override val description = "消灭任何受到该随从伤害的随从。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "索拉查盆地栖息着很多非常恐怖的生物。如果你一定要去那里，带上杀虫剂，还要穿上板甲。"
    override val artist = "Lars Grant-West"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2bd373a6bf7d76b30fc95875bac08776694fb24c5efe7f622dacd0976ea4e375.png"
}
