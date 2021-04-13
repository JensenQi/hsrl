package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Hellfire_950 : Card() {
    override val id = 950
    override val name = "地狱烈焰"
    override val description = "对所有角色造成 3点伤害。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Legacy1635
    override val background = "鸟尽弓藏，兔死狗烹，术士才不需要什么忠心耿耿的随从。"
    override val artist = "Chippy"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/207e83dd3dbd54d50fa78f907bd313269a5a20e2fbb28279d59769705f54fe1f.png"
}
