package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MassHysteria_50071 : Card() {
    override val id = 50071
    override val name = "群体狂乱"
    override val description = "使每个随从随机攻击其他随从。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.RastakhansRumble
    override val background = "每年的购物节战况愈演愈烈。"
    override val artist = "Vladimir Kafanov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cc05da6c729b9eabaec2bac4b450e77bd57d159faf018dc372af85de4e0e1223.png"
}
