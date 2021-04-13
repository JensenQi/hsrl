package tech.cuda.hsrl.common.card.rogue.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TombPillager_69738 : Card() {
    override val id = 69738
    override val name = "盗墓匪贼"
    override val description = "<b>亡语：</b>将一个幸运币置入你的手牌。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Core
    override val background = "自从公会解散后，他只能自己单刷了。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f7f369da7d15c93b685a8cf5ba1e3607643a376be06bdf7fc2682f5d12bd0807.png"
}
