package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TroggGloomeater_45837 : Card() {
    override val id = 45837
    override val name = "穴居人食菌者"
    override val description = "<b>嘲讽</b> <b>剧毒</b>"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "他的呼吸中有着痛苦和绝望的味道。但仍然比大部分穴居人嘴里的气味要好。"
    override val artist = "Chris Seaman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6df5f26cc939219354fc5590fa149a74343eab0786d1dfa9d8460e46890d1e3b.png"
}
