package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BlatantDecoy_54296 : Card() {
    override val id = 54296
    override val name = "显眼的诱饵"
    override val description = "<b>亡语：</b>每个玩家从手牌中召唤法力值消耗最低的随从。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "“哈！你中了我，托瓦格尔的计了！”"
    override val artist = "Ludo Lullabi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4e3fb34c1a3b55a2acc61b8fe46d6ccfd827f193a6c25859dafbe36baa86abe1.png"
}
