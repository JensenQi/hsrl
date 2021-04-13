package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BugCollector_54411 : Card() {
    override val id = 54411
    override val name = "昆虫收藏家"
    override val description = "<b>战吼：</b>召唤一只1/1并具有<b>突袭</b>的蝗虫。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "只有他喜欢蜂群来袭。"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0ea70eaf01225f51057814955bdac89c98ab331c2be8d135776a596b72afa81b.png"
}
