package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Shieldmaiden_69741 : Card() {
    override val id = 69741
    override val name = "盾甲侍女"
    override val description = "<b>战吼：</b> 获得5点护甲值。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Core
    override val background = "对于侏儒战士来说，一块盾牌可以对其进行全方位的保护。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2ccdadf4522365a785a296f7fd96003c92b16aa4effbf06196ea4698e4407fb1.png"
}
