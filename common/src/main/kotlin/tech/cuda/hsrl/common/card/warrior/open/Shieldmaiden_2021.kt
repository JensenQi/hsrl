package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Shieldmaiden_2021 : Card() {
    override val id = 2021
    override val name = "盾甲侍女"
    override val description = "<b>战吼：</b> 获得5点护甲值。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Gvg
    override val background = "对于侏儒战士来说，一块盾牌可以对其进行全方位的保护。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3e2cc07c70562ef9f114c8adfd39b81ba7b38bedc557231d48aa07e87329f8a3.png"
}
