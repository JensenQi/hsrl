package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RatchetPrivateer_62482 : Card() {
    override val id = 62482
    override val name = "棘齿城私掠者"
    override val description = "<b>战吼：</b>使你的武器获得+1攻击力。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "海盗打劫和私掠之间有一条清晰的界线：只要看有没有退税就可以轻松分辨。"
    override val artist = "Eva Widermann"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4dc7c77b7a93546cf5c6c167f15ef1bd316583fcf169e09e68415d0680b7febc.png"
}
