package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HogRancher_62481 : Card() {
    override val id = 62481
    override val name = "放猪牧人"
    override val description = "<b>战吼：</b>召唤一只2/1并具有<b>突袭</b>的小猪。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "恰好住在野猪人村落的附近，这就很可疑了。"
    override val artist = "Sean McNally"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/df36ca4d7dec227f80073b4f8f3edb21cd4e95519cdc62dfe2eaad7c9223769d.png"
}
