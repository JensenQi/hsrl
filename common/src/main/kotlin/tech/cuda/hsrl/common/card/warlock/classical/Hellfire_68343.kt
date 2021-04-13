package tech.cuda.hsrl.common.card.warlock.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Hellfire_68343 : Card() {
    override val id = 68343
    override val name = "地狱烈焰"
    override val description = "对所有角色造成 3点伤害。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ClassicCards
    override val background = "鸟尽弓藏，兔死狗烹，术士才不需要什么忠心耿耿的随从。"
    override val artist = "Chippy"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/85d73bed4bf36ff7ab6f65f436a2b749fe59eee1ce1a1e52d4035688f31f1063.png"
}
