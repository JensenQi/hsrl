package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StoneskinGargoyle_1861 : Card() {
    override val id = 1861
    override val name = "岩肤石像鬼"
    override val description = "在你的回合开始时，为该随从恢复所有生命值。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Naxx
    override val background = "岩肤石像鬼最喜欢玩的游戏就是：“我们都是木头人”。"
    override val artist = "Matt Smith"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/353214693797106c84384ab88604f20ab17f158e109b77b4c0376508849b197f.png"
}
