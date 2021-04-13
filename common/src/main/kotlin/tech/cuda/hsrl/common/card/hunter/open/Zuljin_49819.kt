package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Zuljin_49819 : Card() {
    override val id = 49819
    override val name = "祖尔金"
    override val description = "<b>战吼：</b> 施放你在本局对战中使用过的所有法术<i>（目标随机而定）</i>。"
    override var cost: Int? = 10
    override var health: Int? = 30
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Hero
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.RastakhansRumble
    override val background = "你要连斧头都能躲，还躲不过一个球吗？"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d2e968884373eff6c507b71c85985a3c93201659c531b2011742c6bfe754dfaa.png"
}
