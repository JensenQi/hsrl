package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TombPillager_2884 : Card() {
    override val id = 2884
    override val name = "盗墓匪贼"
    override val description = "<b>亡语：</b>将一个幸运币置入你的手牌。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Loe
    override val background = "自从公会解散后，他只能自己单刷了。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3940130d129f9c476e7941362f814f04d0b3e7c45392da4852ec5e96a2c189d4.png"
}
