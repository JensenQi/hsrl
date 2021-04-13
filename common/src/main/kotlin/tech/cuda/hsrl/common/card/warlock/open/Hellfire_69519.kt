package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Hellfire_69519 : Card() {
    override val id = 69519
    override val name = "地狱烈焰"
    override val description = "对所有角色造成 3点伤害。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Core
    override val background = "鸟尽弓藏，兔死狗烹，术士才不需要什么忠心耿耿的随从。"
    override val artist = "Chippy"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1a9f3b777a180329a96e70e6b3e6e8105903bf366f43d3a433434ae3f3d6cf36.png"
}
