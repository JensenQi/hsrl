package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NagaCorsair_40889 : Card() {
    override val id = 40889
    override val name = "纳迦海盗"
    override val description = "<b>战吼：</b>使你的武器获得+1攻击力。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "自从把铁钩装在尾巴上后，她就开始后悔了。"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/24a2c0ce883f7ef2a9878d2d92128a5ed64a11efcee153c7ebae7ff8ea50bb9e.png"
}
